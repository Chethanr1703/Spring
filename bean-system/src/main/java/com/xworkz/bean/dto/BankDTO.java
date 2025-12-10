package com.xworkz.bean.dto;

import lombok.*;
import org.springframework.stereotype.Component;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component

public class BankDTO {
    private int id;
    private String name;
    private String branch;
    private String ifsc;
    private String location;
    private long contactNo;
    private boolean atmAvailable;
    private boolean active;
}
