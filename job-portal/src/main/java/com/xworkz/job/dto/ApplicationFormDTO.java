package com.xworkz.job.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ApplicationFormDTO {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private long phoneNo;
    private String dob;
    private String gender;
    private String currentLocation;
    private String qualification;
    private String specialization;
    private String collegeName;
    private String yearOfPassing;
    private String cgpa;
    private String experience;
    private String currentCompany;
    private String currentRole;
    private String skills;
    private String currentSalary;
    private String technicalSummary;

    public ApplicationFormDTO(String firstName, String lastName, String email, long phoneNo, String dob, String gender, String currentLocation, String qualification, String specialization, String collegeName, String yearOfPassing, String cgpa, String experience, String currentCompany, String currentRole, String skills, String currentSalary, String technicalSummary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNo = phoneNo;
        this.dob = dob;
        this.gender = gender;
        this.currentLocation = currentLocation;
        this.qualification = qualification;
        this.specialization = specialization;
        this.collegeName = collegeName;
        this.yearOfPassing = yearOfPassing;
        this.cgpa = cgpa;
        this.experience = experience;
        this.currentCompany = currentCompany;
        this.currentRole = currentRole;
        this.skills = skills;
        this.currentSalary = currentSalary;
        this.technicalSummary = technicalSummary;

    }
}
