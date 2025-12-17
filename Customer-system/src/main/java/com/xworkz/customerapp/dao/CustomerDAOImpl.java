package com.xworkz.customerapp.dao;

import com.xworkz.customerapp.DBConstant;
import com.xworkz.customerapp.dto.CustomerInfoDTO;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
@Component
public class CustomerDAOImpl implements CustomerDAO{
    @SneakyThrows
    @Override
    public void save(CustomerInfoDTO customerInfoDTO) {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String insert = "insert into customerinfo (fullName, phoneNo, email,address) values(?,?,?,?);";
        try(Connection connection = DriverManager.getConnection(DBConstant.URL.getProperties(),DBConstant.USERNAME.getProperties(), DBConstant.PASSWORD.getProperties());
            PreparedStatement preparedStatement = connection.prepareStatement(insert)){
            preparedStatement.setString(1, customerInfoDTO.getName());
            preparedStatement.setLong(2, customerInfoDTO.getPhoneNo());

            preparedStatement.setString(3, customerInfoDTO.getEmail());

            preparedStatement.setString(4, customerInfoDTO.getAddress());
            int row=preparedStatement.executeUpdate();

            System.out.println(row +"Row effected");
        }
    }
}
