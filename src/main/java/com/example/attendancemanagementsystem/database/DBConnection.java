package com.example.attendancemanagementsystem.database;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    public static Connection getConnection() {
        Connection mConnection = null;
        String databaseName = "attendance";
        String databaseUser = "root";
        String databasePassword = "";
        String url = "jdbc:mysql://localhost:3306/" + databaseName;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            mConnection = DriverManager.getConnection(url, databaseUser, databasePassword);
            System.out.println("Database connection successful");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mConnection;
    }
}
