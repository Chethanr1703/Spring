package com.xworkz.dependency.election;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
public class Election {

    public Election() {
        System.out.println("Election default cons invoked");
    }

    @Value("6")
    private int electionId;

    @Value("General Election")
    private String name;

    @Autowired
    private VotingMachine votingMachine;
}
