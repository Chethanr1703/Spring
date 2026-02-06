package com.xworkz.modules.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;


import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SignupDTO {

    private  int id;
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
    @NotNull(message = "Age is required")
    @Min(value = 18,message = "age should be more than 18") @Max(value = 45, message = "age should be less than 45")
    private Integer age;
    @NotNull(message = "Gender is required")
    private String gender;
    @NotNull(message = "Address is required")
    @Size(min=15,max = 80,message = "address is not valid")
    private String address;

    @NotNull(message = "password is required")
    @Pattern(
            regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$",
            message = "password must contain uppercase, lowercase, number and special character"
    )
    private String password;

    @NotNull(message = "confirm password is required")
    private String confirmPassword;

    private MultipartFile image;



}
