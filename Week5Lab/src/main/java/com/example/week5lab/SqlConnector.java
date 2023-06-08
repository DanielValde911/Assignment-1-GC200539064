package com.example.week5lab;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlConnector {
    private static final String url = "jdbc:mysql://localhost/week5";
    private static final String user = "root";

    private static final String password = "sava0315";

    public Connection connect(){
        try {
            return DriverManager.getConnection(url,user,password);
        }catch (SQLException e){
            throw new RuntimeException("Error connecting to database", e);
        }
    }
}
