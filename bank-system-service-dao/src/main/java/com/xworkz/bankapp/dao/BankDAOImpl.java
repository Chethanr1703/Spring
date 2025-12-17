package com.xworkz.bankapp.dao;

import com.xworkz.bankapp.constant.DBConstant;
import com.xworkz.bankapp.dto.BankDTO;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
@Component
public class BankDAOImpl implements BankDAO{
    @SneakyThrows
    @Override
    public void save(BankDTO bankDTO) {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String insert = "insert into bank_info (bank_id,bank_name,ifsc_code,location,no_Of_Customer) values(?,?,?,?,?)";

        try(Connection connection = DriverManager.getConnection(DBConstant.URL.getProperties(),DBConstant.USERNAME.getProperties(), DBConstant.PASSWORD.getProperties());
                PreparedStatement preparedStatement =connection.prepareStatement(insert) ){
            preparedStatement.setInt(1,bankDTO.getBankId());
            preparedStatement.setString(2,bankDTO.getBankName());

            preparedStatement.setString(3,bankDTO.getIfscCode());
            preparedStatement.setString(4,bankDTO.getLocation());
            preparedStatement.setInt(5,bankDTO.getNoOfCustomer());

            int row= preparedStatement.executeUpdate();
            System.out.println("rows effected are  "+row);
        }
    }
}
