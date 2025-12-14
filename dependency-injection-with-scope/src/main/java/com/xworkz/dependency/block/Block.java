package com.xworkz.dependency.block;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Data
@Scope("prototype")
public class Block {
    private int id;
    private String blockName;

    @Autowired
    private CompanyBlock company;
}
