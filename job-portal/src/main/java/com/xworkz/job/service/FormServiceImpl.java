package com.xworkz.job.service;

import com.xworkz.job.dao.FormDAO;
import com.xworkz.job.dto.ApplicationFormDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FormServiceImpl implements FormService {
    @Autowired
    FormDAO formDAO;

    @Override
    public boolean validateForm(ApplicationFormDTO applicationFormDTO) {
        boolean isValidForm = true;

        if (applicationFormDTO.getFirstName() == null || applicationFormDTO.getFirstName().equals("")) {
            isValidForm = false;
        } else if (applicationFormDTO.getLastName() == null || applicationFormDTO.getLastName().equals("")) {
            isValidForm = false;
        } else if (applicationFormDTO.getEmail() == null || applicationFormDTO.getEmail().equals("")) {
            isValidForm = false;
        } else if (String.valueOf(applicationFormDTO.getPhoneNo()).length() != 10) {
            isValidForm = false;
        } else if (applicationFormDTO.getDob() == null || applicationFormDTO.getDob().equals("")) {
            isValidForm = false;
        } else if (applicationFormDTO.getGender() == null || applicationFormDTO.getGender().equals("")) {
            isValidForm = false;
        } else if (applicationFormDTO.getCurrentLocation() == null || applicationFormDTO.getCurrentLocation().equals("")) {
            isValidForm = false;
        } else if (applicationFormDTO.getQualification() == null || applicationFormDTO.getQualification().equals("")) {
            isValidForm = false;
        } else if (applicationFormDTO.getSpecialization() == null || applicationFormDTO.getSpecialization().equals("")) {
            isValidForm = false;
        } else if (applicationFormDTO.getCollegeName() == null || applicationFormDTO.getCollegeName().equals("")) {
            isValidForm = false;
        } else if (applicationFormDTO.getYearOfPassing() == null || applicationFormDTO.getYearOfPassing().equals("")) {
            isValidForm = false;
        } else if (applicationFormDTO.getCgpa() == null || applicationFormDTO.getCgpa().equals("")) {
            isValidForm = false;
        } else if (applicationFormDTO.getExperience() == null || applicationFormDTO.getExperience().equals("")) {
            isValidForm = false;
        } else if (applicationFormDTO.getCurrentCompany() == null || applicationFormDTO.getCurrentCompany().equals("")) {
            isValidForm = false;
        } else if (applicationFormDTO.getCurrentRole() == null || applicationFormDTO.getCurrentRole().equals("")) {
            isValidForm = false;
        } else if (applicationFormDTO.getSkills() == null || applicationFormDTO.getSkills().equals("")) {
            isValidForm = false;
        } else if (applicationFormDTO.getCurrentSalary() == null || applicationFormDTO.getCurrentSalary().equals("")) {
            isValidForm = false;
        } else if (applicationFormDTO.getTechnicalSummary() == null || applicationFormDTO.getTechnicalSummary().equals("")) {
            isValidForm = false;
        }


        if (isValidForm) {
            System.out.println("all validated");
            if (!formDAO.checkEmail(applicationFormDTO)) {
                boolean isSaved = formDAO.saveApplicationForm(applicationFormDTO);
                return isSaved;
            } else {
                return isValidForm;
            }
        }
        return isValidForm;
    }


    @Override
    public ApplicationFormDTO getApplication( String email) {
        ApplicationFormDTO applicationFormDTO=formDAO.getApplicationFromDAO(email);
        return applicationFormDTO;
    }


    @Override
    public boolean formUpdate(ApplicationFormDTO applicationFormDTO) {
        boolean isValidForm = true;

        if(applicationFormDTO.getFirstName()==null || applicationFormDTO.getFirstName().equals("")){
            isValidForm=false;
        } else if (applicationFormDTO.getLastName() == null || applicationFormDTO.getLastName().equals("")) {
            isValidForm = false;
        } else if  (applicationFormDTO.getEmail() == null || applicationFormDTO.getEmail().equals("")) {
            isValidForm = false;
        } else if  (String.valueOf(applicationFormDTO.getPhoneNo()).length()!=10) {
            isValidForm = false;
        } else if  (applicationFormDTO.getDob() == null || applicationFormDTO.getDob().equals("")) {
            isValidForm = false;
        } else if  (applicationFormDTO.getGender() == null || applicationFormDTO.getGender().equals("")) {
            isValidForm = false;
        } else if  (applicationFormDTO.getCurrentLocation() == null || applicationFormDTO.getCurrentLocation().equals("")) {
            isValidForm = false;
        } else if  (applicationFormDTO.getQualification() == null || applicationFormDTO.getQualification().equals("")) {
            isValidForm = false;
        } else if  (applicationFormDTO.getSpecialization() == null || applicationFormDTO.getSpecialization().equals("")) {
            isValidForm = false;
        } else if  (applicationFormDTO.getCollegeName() == null || applicationFormDTO.getCollegeName().equals("")) {
            isValidForm = false;
        } else if  (applicationFormDTO.getYearOfPassing() == null || applicationFormDTO.getYearOfPassing().equals("")) {
            isValidForm = false;
        } else if  (applicationFormDTO.getCgpa() == null || applicationFormDTO.getCgpa().equals("")) {
            isValidForm = false;
        } else if  (applicationFormDTO.getExperience() == null || applicationFormDTO.getExperience().equals("")) {
            isValidForm = false;
        } else if  (applicationFormDTO.getCurrentCompany() == null || applicationFormDTO.getCurrentCompany().equals("")) {
            isValidForm = false;
        } else if  (applicationFormDTO.getCurrentRole() == null || applicationFormDTO.getCurrentRole().equals("")) {
            isValidForm = false;
        } else if  (applicationFormDTO.getSkills() == null || applicationFormDTO.getSkills().equals("")) {
            isValidForm = false;
        } else if  (applicationFormDTO.getCurrentSalary() == null || applicationFormDTO.getCurrentSalary().equals("")) {
            isValidForm = false;
        } else if  (applicationFormDTO.getTechnicalSummary() == null || applicationFormDTO.getTechnicalSummary().equals("")) {
            isValidForm = false;
        }
        if(isValidForm){
            boolean isUpdated = formDAO.updateApplicationForm(applicationFormDTO);
            return isUpdated;
        }

        return false;

    }

    @Override
    public boolean isDelete(String email) {
        boolean isDelete=formDAO.deleteForm(email);

        return isDelete;
    }


}
