package com.xworkz.modules.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;


import javax.validation.constraints.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddTeamDTO {
    private  int id;
    @Size(min = 3,max = 25,message = "name is not valid")
    private String teamName;

    @Size(min = 3,max = 25,message = "Team head name is not valid")
    private String teamHeadName;


    @NotNull(message =" Email is required")
    @Pattern(regexp = "^[a-zA-Z0-9._%+-]+@gmail\\.com$",message = "email is not valid")
    private String email;

    @NotNull(message = "phone number is required")
    @Pattern(
            regexp = "^[6-9][0-9]{9}$",
            message = "phone number must start with 6–9 and contain 10 digits"
    )
    private String phone;
    @Min(value = 10,message = "No of team Member atleast 10 member")
    private Integer noOfTeamMember;

    private MultipartFile image;
}
