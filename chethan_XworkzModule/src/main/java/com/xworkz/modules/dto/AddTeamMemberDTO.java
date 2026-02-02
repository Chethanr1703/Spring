package com.xworkz.modules.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddTeamMemberDTO {

    private int id;
    @Size(min = 3,max = 25,message = "name is not valid")
    private String name;
    @NotNull(message =" Email is required")
    @Pattern(regexp = "^[a-zA-Z0-9._%+-]+@gmail\\.com$",message = "email is not valid")
    private String email;
    @NotNull(message = "phone number is required")
    @Pattern(
            regexp = "^[6-9][0-9]{9}$",
            message = "phone number must start with 6–9 and contain 10 digits"
    )
    private String phone;
    @Size(min = 3,max = 25,message = "Team name is not valid")
    private String teamName;
    @Pattern(regexp = "^[a-zA-Z0-9._%+-]+@gmail\\.com$",message = "email is not valid")
    private String teamHeadEmail;

}
