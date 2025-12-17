package com.xworkz.matrimonyapp.dao.impl;

import com.xworkz.matrimonyapp.constant.DBConstant;
import com.xworkz.matrimonyapp.dao.MatrimonyDAO;
import com.xworkz.matrimonyapp.dto.MatrimonyDTO;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
@Component
public class MatrimonyDAOImpl implements MatrimonyDAO {
    @SneakyThrows
    @Override
    public void save(MatrimonyDTO matrimonyDTO) {
//        Class.forName("com.mysql.cj.jdbc.Driver");
        String insert ="insert into matrimony (email,forwhom,gender,dob,motherTongue,Religion,martialStatus,height) values (?,?,?,?,?,?,?,?)";
        try(Connection connection = DriverManager.getConnection(DBConstant.URL.getProperties(),DBConstant.USERNAME.getProperties(), DBConstant.PASSWORD.getProperties());
            PreparedStatement preparedStatement = connection.prepareStatement(insert)){
            preparedStatement.setString(1, matrimonyDTO.getEmail());
            preparedStatement.setString(2, matrimonyDTO.getForWhom());
            preparedStatement.setString(3, String.valueOf(matrimonyDTO.getGender()));
            preparedStatement.setString(4, matrimonyDTO.getDob());
            preparedStatement.setString(5, matrimonyDTO.getMotherTongue());
            preparedStatement.setString(6, matrimonyDTO.getReligion());
            preparedStatement.setString(7, matrimonyDTO.getMartialStatus());
            preparedStatement.setInt(8,matrimonyDTO.getHeight());

            int row =preparedStatement.executeUpdate();
            System.out.println("row effected are +"+row);
        }
    }
}
