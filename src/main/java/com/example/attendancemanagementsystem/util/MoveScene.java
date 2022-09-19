package com.example.attendancemanagementsystem.util;

import com.example.attendancemanagementsystem.MainApplication;
import com.example.attendancemanagementsystem.controller.AdminHomeController;
import com.example.attendancemanagementsystem.controller.StudentHomeController;
import com.example.attendancemanagementsystem.controller.TeacherHomeController;
import com.example.attendancemanagementsystem.database.DBUtil;
import com.example.attendancemanagementsystem.model.Admin;
import com.example.attendancemanagementsystem.model.Student;
import com.example.attendancemanagementsystem.model.Teacher;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MoveScene {
    public static void gotoStudentHome(ActionEvent event, String fxmlFile, String title, Student student) {
        Parent root = null;
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource(fxmlFile));
            root = fxmlLoader.load();
            StudentHomeController homeController = fxmlLoader.getController();
            homeController.setStudent(student);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle(title);
        assert root != null;
        stage.setScene(new Scene(root));
        stage.show();
    }

    public static void gotoTeacherHome(ActionEvent event, String fxmlFile, String title, Teacher teacher) {
        Parent root = null;
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource(fxmlFile));
            root = fxmlLoader.load();
            TeacherHomeController homeController = fxmlLoader.getController();
            homeController.setTeacher(teacher);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle(title);
        assert root != null;
        stage.setScene(new Scene(root));
        stage.show();
    }

    public static void gotoAdminHome(ActionEvent event, String fxmlFile, String title, Admin admin) {
        Parent root = null;
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource(fxmlFile));
            root = fxmlLoader.load();
            AdminHomeController homeController = fxmlLoader.getController();
            homeController.setAdmin(admin);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle(title);
        assert root != null;
        stage.setScene(new Scene(root));
        stage.show();
    }
}
