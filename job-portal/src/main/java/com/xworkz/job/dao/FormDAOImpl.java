package com.xworkz.job.dao;

import com.xworkz.job.constant.DBConstant;
import com.xworkz.job.dto.ApplicationFormDTO;
import lombok.SneakyThrows;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@Repository

public class FormDAOImpl implements FormDAO{
    @SneakyThrows
    @Override
    public boolean saveApplicationForm(ApplicationFormDTO applicationFormDTO) {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String insert = "insert into jobApplication (firstName," +
                "lastName,email,phoneNo,dob,gender,currentLocation,qualification,specialization," +
                "collegeName,yearOfPassing,cgpa,experience,currentCompany,currentRole,skills,currentSalary,technicalSummary)" +
                " values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try (Connection connection = DriverManager.getConnection(DBConstant.URL.getProperties(), DBConstant.USERNAME.getProperties(), DBConstant.PASSWORD.getProperties());
             PreparedStatement preparedStatement = connection.prepareStatement(insert)) {
            preparedStatement.setString(1, applicationFormDTO.getFirstName());
            preparedStatement.setString(2, applicationFormDTO.getLastName());
            preparedStatement.setString(3, applicationFormDTO.getEmail());
            preparedStatement.setLong(4, applicationFormDTO.getPhoneNo());
            preparedStatement.setString(5, applicationFormDTO.getDob());
            preparedStatement.setString(6, applicationFormDTO.getGender());
            preparedStatement.setString(7, applicationFormDTO.getCurrentLocation());
            preparedStatement.setString(8, applicationFormDTO.getQualification());
            preparedStatement.setString(9, applicationFormDTO.getSpecialization());
            preparedStatement.setString(10, applicationFormDTO.getCollegeName());
            preparedStatement.setString(11, applicationFormDTO.getYearOfPassing());
            preparedStatement.setString(12, applicationFormDTO.getCgpa());
            preparedStatement.setString(13, applicationFormDTO.getExperience());
            preparedStatement.setString(14, applicationFormDTO.getCurrentCompany());
            preparedStatement.setString(15, applicationFormDTO.getCurrentRole());
            preparedStatement.setString(17, applicationFormDTO.getCurrentSalary());
            preparedStatement.setString(16, applicationFormDTO.getSkills());
            preparedStatement.setString(18, applicationFormDTO.getTechnicalSummary());


            int rowEffected = preparedStatement.executeUpdate();

            if (rowEffected < 0) {
                return false;
            } else return true;

        }
    }
    @SneakyThrows
    @Override
    public boolean checkEmail(ApplicationFormDTO applicationFormDTO) {

        boolean isAvaiable = false;

        Class.forName("com.mysql.cj.jdbc.Driver");
        String check = "Select 1 from jobApplication  where email = ?";
        try (Connection connection = DriverManager.getConnection(DBConstant.URL.getProperties(), DBConstant.USERNAME.getProperties(), DBConstant.PASSWORD.getProperties());
             PreparedStatement preparedStatement = connection.prepareStatement(check)) {

            preparedStatement.setString(1, applicationFormDTO.getEmail());
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                isAvaiable = true;
            }

        }
        System.out.println(isAvaiable);
        return isAvaiable;
    }


    @SneakyThrows
    @Override
    public ApplicationFormDTO getApplicationFromDAO(String  email) {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String getProfile = "SELECT * from jobApplication where email =?";
        try (Connection connection = DriverManager.getConnection(DBConstant.URL.getProperties(), DBConstant.USERNAME.getProperties(), DBConstant.PASSWORD.getProperties());
             PreparedStatement preparedStatement = connection.prepareStatement(getProfile)) {
            preparedStatement.setString(1, email);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                int id = resultSet.getInt(1);
                String firstName = resultSet.getString(2);
                String lastName = resultSet.getString(3);
                String emailid = resultSet.getString(4);
                long phoneNo = resultSet.getLong(5);
                String dob = resultSet.getString(6);
                String gender = resultSet.getString(7);
                String currentLocation = resultSet.getString(8);
                String qualification = resultSet.getString(9);
                String specialization = resultSet.getString(10);
                String collegeName = resultSet.getString(11);
                String yearOfPassing = resultSet.getString(12);
                String cgpa = resultSet.getString(13);
                String experience = resultSet.getString(14);
                String currentCompany = resultSet.getString(15);
                String currentRole = resultSet.getString(16);
                String skills = resultSet.getString(17);
                String currentSalary = resultSet.getString(18);
                String technicalSummary = resultSet.getString(19);

                ApplicationFormDTO applicationFormDTO = new ApplicationFormDTO(id, firstName, lastName,
                        emailid, phoneNo, dob, gender, currentLocation, qualification,
                        specialization, collegeName, yearOfPassing, cgpa, experience, currentCompany,
                        currentRole, skills, currentSalary, technicalSummary
                );

                return applicationFormDTO;
            }
        }

        return null;
    }
    @SneakyThrows
    @Override
    public boolean updateApplicationForm(ApplicationFormDTO applicationFormDTO) {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String updateProfile = "Update jobApplication set firstName=?, lastName=?,email=?,phoneNo=?,dob=?,gender=?,currentLocation=?,qualification=?,specialization=?,collegeName=?,yearOfPassing=?,cgpa=?,experience=?,currentCompany=?,currentRole=?,skills=?,currentSalary=?,technicalSummary=?";
        try (Connection connection = DriverManager.getConnection(DBConstant.URL.getProperties(), DBConstant.USERNAME.getProperties(), DBConstant.PASSWORD.getProperties());
             PreparedStatement preparedStatement = connection.prepareStatement(updateProfile)) {

            preparedStatement.setString(1, applicationFormDTO.getFirstName());
            preparedStatement.setString(2, applicationFormDTO.getLastName());
            preparedStatement.setString(3, applicationFormDTO.getEmail());
            preparedStatement.setLong(4, applicationFormDTO.getPhoneNo());
            preparedStatement.setString(5, applicationFormDTO.getDob());
            preparedStatement.setString(6, applicationFormDTO.getGender());
            preparedStatement.setString(7, applicationFormDTO.getCurrentLocation());
            preparedStatement.setString(8, applicationFormDTO.getQualification());
            preparedStatement.setString(9, applicationFormDTO.getSpecialization());
            preparedStatement.setString(10, applicationFormDTO.getCollegeName());
            preparedStatement.setString(11, applicationFormDTO.getYearOfPassing());
            preparedStatement.setString(12, applicationFormDTO.getCgpa());
            preparedStatement.setString(13, applicationFormDTO.getExperience());
            preparedStatement.setString(14, applicationFormDTO.getCurrentCompany());
            preparedStatement.setString(15, applicationFormDTO.getCurrentRole());
            preparedStatement.setString(17, applicationFormDTO.getCurrentSalary());
            preparedStatement.setString(16, applicationFormDTO.getSkills());
            preparedStatement.setString(18, applicationFormDTO.getTechnicalSummary());


            int rowEffected = preparedStatement.executeUpdate();

            if (rowEffected < 0) {
                return false;
            } else return true;

        }
    }
@SneakyThrows
    @Override
    public boolean deleteForm(String email) {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String deleteProfile = "Delete from jobApplication where email=?";
        try (Connection connection = DriverManager.getConnection(DBConstant.URL.getProperties(), DBConstant.USERNAME.getProperties(), DBConstant.PASSWORD.getProperties());
             PreparedStatement preparedStatement = connection.prepareStatement(deleteProfile)) {
            preparedStatement.setString(1, email);
            int rowEffect = preparedStatement.executeUpdate();
            if(rowEffect<0){
                return false;
            }return true;
        }

    }

}
