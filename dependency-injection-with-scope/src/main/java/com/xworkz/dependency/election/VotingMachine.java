package com.xworkz.dependency.election;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
public class VotingMachine {

    public VotingMachine() {
        System.out.println("VotingMachine default cons invoked");
    }

    @Value("5")
    private int machineId;

    @Value("EVM")
    private String type;
}
