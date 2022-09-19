package com.example.attendancemanagementsystem.database;

import com.example.attendancemanagementsystem.model.Admin;
import com.example.attendancemanagementsystem.model.Student;
import com.example.attendancemanagementsystem.model.Teacher;
import com.example.attendancemanagementsystem.util.MoveScene;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static com.example.attendancemanagementsystem.database.DBConnection.getConnection;

public class DBUtil {
    public static void loginUser(ActionEvent event,int ID,String password){
        Connection mConnection = getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        String query = "SELECT * FROM `login` WHERE `login`.`ID` = ?";
        try{
            preparedStatement = mConnection.prepareStatement(query);
            preparedStatement.setInt(1,ID);
            resultSet = preparedStatement.executeQuery();
            if(!resultSet.isBeforeFirst()){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("Wrong username and password");
                alert.show();
            }else {
                while (resultSet.next()){
                    String role = resultSet.getString("Role");
                    String actualPassword = resultSet.getString("Password");
                    String name = resultSet.getString("Name");
                    if(password.equals(actualPassword)){
                        switch (role) {
                            case "admin" -> {
                                Admin admin = new Admin();
                                admin.setID(ID);
                                admin.setName(name);
                                admin.setPassword(password);
                                MoveScene.gotoAdminHome(event, "AdminHome.fxml", "Admin Home", admin);
                                System.out.println("Login successful");
                            }
                            case "student" -> {
                                Student student = new Student();
                                student.setID(ID);
                                student.setName(name);
                                student.setPassword(password);
                                MoveScene.gotoStudentHome(event, "StudentHome.fxml", "Student Home", student);
                                System.out.println("Login successful");
                            }
                            case "teacher" -> {
                                Teacher teacher = new Teacher();
                                teacher.setID(ID);
                                teacher.setName(name);
                                teacher.setPassword(password);
                                MoveScene.gotoTeacherHome(event, "TeacherHome.fxml", "Teacher Home", teacher);
                                System.out.println("Login successful");
                            }
                        }
                    }else {
                        Alert alert = new Alert(Alert.AlertType.ERROR);
                        alert.setContentText("Wrong username and password");
                        alert.show();
                    }

                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
