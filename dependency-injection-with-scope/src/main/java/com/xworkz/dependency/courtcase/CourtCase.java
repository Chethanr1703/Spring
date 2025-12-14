package com.xworkz.dependency.courtcase;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
public class CourtCase {

    public CourtCase() {
        System.out.println("CourtCase default cons invoked");
    }

    @Value("4")
    private int caseId;

    @Value("Fraud Case")
    private String type;

    @Autowired
    private Lawyer lawyer;
}
