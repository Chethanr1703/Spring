package com.xworkz.dependency.block;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Data
@Scope("prototype")
public class CompanyBlock {
    private int id;
    private String companyName;
}
