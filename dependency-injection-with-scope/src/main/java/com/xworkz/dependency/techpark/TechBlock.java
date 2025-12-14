package com.xworkz.dependency.techpark;
import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Data
@Scope("prototype")
public class TechBlock {
    private int id;
    private String blockName;


}
