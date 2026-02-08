package com.xworkz.modules.service;

import com.xworkz.modules.dao.ModuleDAO;
import com.xworkz.modules.dao.fileDAO.FileDAO;
import com.xworkz.modules.dto.AddTeamDTO;
import com.xworkz.modules.dto.AddTeamMemberDTO;
import com.xworkz.modules.dto.SignupDTO;
import com.xworkz.modules.entity.AddTeamEntity;
import com.xworkz.modules.entity.AddTeamMemberEntity;
import com.xworkz.modules.entity.SignupEntity;
import com.xworkz.modules.entity.file.FileEntity;
import com.xworkz.modules.exception.UserNotFounException;
import com.xworkz.modules.utils.OTP;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

@Service
public class ModuleServiceImpl implements ModuleService {

    @Autowired
    ModuleDAO moduleDAO;

    @Autowired
    OTP otp;
    @Autowired
    FileDAO fileDAO;

    private static final String SECRET = "xworkzSecretKey1";

    private SecretKey getKey() {
        byte[] keyBytes = SECRET.getBytes();
        return new SecretKeySpec(keyBytes, "AES");
    }

    private String encrypt(String plainText) {

        try {
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, getKey());
            byte[] encrypted = cipher.doFinal(plainText.getBytes());
            return Base64.getEncoder().encodeToString(encrypted);
        } catch (Exception e) {
            throw new RuntimeException("Error encrypting password", e);
        }
    }

    private String decrypt(String cipherText) {
        try {
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.DECRYPT_MODE, getKey());
            byte[] decoded = Base64.getDecoder().decode(cipherText);
            byte[] original = cipher.doFinal(decoded);
            return new String(original);
        } catch (Exception e) {
            throw new RuntimeException("Error decrypting password", e);
        }
    }


    @Override
    public boolean validateAndSave(SignupDTO signupDTO) throws IOException {
        boolean isValid = true;
        if (signupDTO == null) {
            isValid = false;
        }

        if (signupDTO.getName() == null || signupDTO.getName().trim().isEmpty()) {
            isValid = false;
        }

        if (signupDTO.getEmail() == null || !signupDTO.getEmail().contains("@")) {
            isValid = false;
        }

        // Phone must start with 6–9 and be 10 digits
        if (signupDTO.getPhone() == null || !signupDTO.getPhone().matches("[6-9][0-9]{9}")) {
            isValid = false;
        }

        // Age must be 18+
        if (signupDTO.getAge() < 18 || signupDTO.getAge() > 100) {
            isValid = false;
        }

        if (signupDTO.getGender() == null || signupDTO.getGender().trim().isEmpty()) {
            isValid = false;
        }

        if (signupDTO.getAddress() == null || signupDTO.getAddress().trim().isEmpty()) {
            isValid = false;
        }

        if (signupDTO.getPassword() == null || signupDTO.getPassword().length() < 8) {
            isValid = false;
        }

        // confirm password check (not stored)
        if (signupDTO.getConfirmPassword() == null ||
                !signupDTO.getPassword().equals(signupDTO.getConfirmPassword())) {
            isValid = false;
        }


        // encrypt password before saving
        String encryptedPwd = encrypt(signupDTO.getPassword());
        signupDTO.setPassword(encryptedPwd);
        signupDTO.setConfirmPassword(null);   // do NOT store confirm password

        SignupEntity signupEntity = new SignupEntity();
        signupEntity.setName(signupDTO.getName());
        signupEntity.setEmail(signupDTO.getEmail());
        signupEntity.setPhone(signupDTO.getPhone());
        signupEntity.setAge(signupDTO.getAge());
        signupEntity.setGender(signupDTO.getGender());
        signupEntity.setAddress(signupDTO.getAddress());
        signupEntity.setPassword(signupDTO.getPassword());   // encrypted password


        if (isValid) {
            boolean isAvailable = moduleDAO.checkEmail(signupDTO.getEmail());
            if (isAvailable) {
                return false;
            } else {

                BeanUtils.copyProperties(signupDTO, signupEntity);
                MultipartFile image = signupDTO.getImage();

                if (image != null && !image.isEmpty()) {

                    String uploadDir = "D:/filefolder";   // folder only
                    String fileName = System.currentTimeMillis() + "_" + image.getOriginalFilename();

                    // 1️ Create directory path
                    Path directoryPath = Paths.get(uploadDir);

                    // 2️ Create directory if not exists
                    if (!Files.exists(directoryPath)) {
                        Files.createDirectories(directoryPath);
                    }

                    // 3️ Create full file path
                    Path filePath = directoryPath.resolve(fileName);

                    // 4️ Write file
                    Files.write(filePath, image.getBytes());

                    // 5 Save file metadata
                    FileEntity fileEntity = new FileEntity();
                    fileEntity.setOriginalFileName(image.getOriginalFilename());
                    fileEntity.setStoredFilePath(filePath.toString());
                    fileEntity.setFileSize(image.getSize());
                    fileEntity.setContentType(image.getContentType());

                    int imageId = fileDAO.saveFile(fileEntity);
                    fileEntity.setId(imageId);

                    signupEntity.setProfileImage(fileEntity);
                }


                isValid = moduleDAO.save(signupEntity);
            }
        }
        return isValid;
    }

    @Override
    public SignupDTO validateLogin(String email, String password) throws UserNotFounException {
        if (email == null || !email.contains("@")) {
            throw new UserNotFounException("Invalid email");
        }
        if (password == null || password.length() < 8) {
            throw new UserNotFounException("Invalid password");
        }
        SignupEntity signupEntity = moduleDAO.loginByEmail(email);
        String deCrypte = decrypt(signupEntity.getPassword());
        if (deCrypte.equals(password)) {
            SignupDTO dto = new SignupDTO();
            BeanUtils.copyProperties(signupEntity, dto);
            return dto;
        }

        return null;
    }


    @Override
    public void setCountToZero(String email) {
        moduleDAO.setCountToZero(email);
    }

    @Override
    public int getCount(String email) {
        return moduleDAO.getCount(email);
    }

    @Override
    public void updateCount(String email) {
        moduleDAO.updateCount(email);
    }

    //    @Override
//    public boolean sendOtp(String email) {
//        String otp1 = otp.generateOtp();
//        boolean isSaved = moduleDAO.saveOtp(email, otp1);
//        if (isSaved) {
//            otp.sendSimpleMessage("chethanbabu1708@gmail.com", "OTP ", otp1+"  This OTP is Valid for 60 seconds Only");
//            return isSaved;
//        } else {
//            return false;
//        }
//    }
//
    @Override
    public boolean sendOtp(String email) {

//        SignupEntity entity = moduleDAO.loginByEmail(email);


//        if (entity != null && entity.getOtp() != null && entity.getOtpTime() != null) {
//
//            long diff = ChronoUnit.SECONDS.between(
//                    entity.getOtpTime(),
//                    LocalDateTime.now()
//            );
//            if (diff < 60) {
//                return true;   // OTP already active
//            }
//        }


        String newOtp = otp.generateOtp();
        boolean isSaved = moduleDAO.saveOtp(email, newOtp);

        if (isSaved) {
            otp.sendSimpleMessage(
                    email,
                    "OTP Verification",
                    newOtp + " (Valid for 60 seconds)"
            );
            return true;
        }

        return false;
    }


    @Override
    public boolean checkOptLogin(String email, String otp) {
        boolean isOtpMatch = moduleDAO.checkOtpMatch(email, otp);
        if (isOtpMatch) {
            return true;
        }
        return false;
    }

    @Override
    public boolean validateNewPassword(String email, String newPassword, String confirmPassword) {
        if (newPassword.equals(confirmPassword)) {
            String encryptedPassword = encrypt(newPassword);
            SignupEntity signupEntity = new SignupEntity();
            signupEntity.setPassword(encryptedPassword);
            boolean updateNewPassword = moduleDAO.updateNewPassword(email, encryptedPassword);
            if (updateNewPassword) {
                return true;
            }

            return false;
        }

        return false;
    }


//------------------Team Details
    @Override
    public boolean saveTeam(AddTeamDTO addTeamDTO) throws IOException {
        AddTeamEntity addTeamEntity = new AddTeamEntity();
        BeanUtils.copyProperties(addTeamDTO, addTeamEntity);

        boolean checkEmail = moduleDAO.checkEmail(addTeamEntity.getEmail());
        if (!checkEmail) {
            MultipartFile image = addTeamDTO.getImage();

            if (image != null && !image.isEmpty()) {

                String uploadDir = "D:/filefolder";   // folder only
                String fileName = System.currentTimeMillis() + "_" + image.getOriginalFilename();

                // 1️ Create directory path
                Path directoryPath = Paths.get(uploadDir);

                // 2️ Create directory if not exists
                if (!Files.exists(directoryPath)) {
                    Files.createDirectories(directoryPath);
                }

                // 3️ Create full file path
                Path filePath = directoryPath.resolve(fileName);

                // 4️ Write file
                Files.write(filePath, image.getBytes());

                // 5 Save file metadata
                FileEntity fileEntity = new FileEntity();
                fileEntity.setOriginalFileName(image.getOriginalFilename());
                fileEntity.setStoredFilePath(filePath.toString());
                fileEntity.setFileSize(image.getSize());
                fileEntity.setContentType(image.getContentType());

                int imageId = fileDAO.saveFile(fileEntity);
                fileEntity.setId(imageId);

                addTeamEntity.setImage(fileEntity);
                boolean isAdded = moduleDAO.saveTeam(addTeamEntity);

                return isAdded;
            } else {
                return false;
            }
        }
        return checkEmail;
    }

    @Override
    public boolean addTeamMember(AddTeamMemberDTO addTeamMemberDTO) {

        AddTeamEntity team = moduleDAO.findByTeamHeadEmail(addTeamMemberDTO.getTeamHeadEmail());
        if (team == null) {
            return false;
        }

        AddTeamMemberEntity entity = new AddTeamMemberEntity();
        entity.setName(addTeamMemberDTO.getName());
        entity.setEmail(addTeamMemberDTO.getEmail());
        entity.setPhone(addTeamMemberDTO.getPhone());
        entity.setTeamName(team.getTeamName());
        entity.setTeamHeadEmail(team.getEmail());

        return moduleDAO.saveTeamMember(entity);
    }

    @Override
    public List<AddTeamDTO> getTeam() {

        List<AddTeamEntity> getTeams = moduleDAO.getTeamByTeamHeadEmail();
        List<AddTeamDTO> teamDTOS = new ArrayList<>();

        for (AddTeamEntity entity : getTeams) {

            AddTeamDTO dto = new AddTeamDTO();
            BeanUtils.copyProperties(entity, dto);

            // 🔥 SET IMAGE ID MANUALLY
            if (entity.getImage() != null) {
                dto.setId(entity.getImage().getId());
            }

            int noOfTeamMember = moduleDAO.countTeamMembers(
                    entity.getTeamName(),
                    entity.getEmail()
            );

            dto.setNoOfTeamMember(noOfTeamMember);
            teamDTOS.add(dto);
        }

        return teamDTOS;
    }

    @Override
    public List<AddTeamMemberDTO> getTeamMemberByTeamName(String teamName) {

        List<AddTeamMemberDTO> teamMemberDTOS = new ArrayList<>();

        if (teamName != null) {
            List<AddTeamMemberEntity> memberByTeamName = moduleDAO.getTeamMemberByTeamName(teamName);
            if (memberByTeamName != null) {
                for (AddTeamMemberEntity addTeamMember : memberByTeamName) {
                    AddTeamMemberDTO addTeamMemberDTO = new AddTeamMemberDTO();
                    BeanUtils.copyProperties(addTeamMember, addTeamMemberDTO);
                    teamMemberDTOS.add(addTeamMemberDTO);

                }
                return teamMemberDTOS;
            }
        } else {
            return null;
        }


        return null;
    }


}
