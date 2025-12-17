package com.xworkz.bankapp.constant;

public enum DBConstant {
    URL("jdbc:mysql://localhost:3306/jdbc"),
    USERNAME("root"),
    PASSWORD("Chethan17@08");

    private String  properties;

    private DBConstant(String properties){
        this.properties = properties;
    }

    public String getProperties() {
        return properties;
    }
}
