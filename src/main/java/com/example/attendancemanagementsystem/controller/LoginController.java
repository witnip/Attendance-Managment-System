package com.example.attendancemanagementsystem.controller;


import com.example.attendancemanagementsystem.database.DBUtil;
import com.example.attendancemanagementsystem.model.Admin;
import com.example.attendancemanagementsystem.util.MoveScene;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    @FXML
    TextField txtPersonID;
    @FXML
    PasswordField txtPassword;
    @FXML
    Button btnLogin;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        btnLogin.setOnAction(event -> {

            if(!txtPersonID.getText().trim().isEmpty() && !txtPassword.getText().trim().isEmpty()){
                int ID = Integer.parseInt(txtPersonID.getText().trim());
                String password = txtPassword.getText().trim();
                DBUtil.loginUser(event,ID,password);
            }

        });
    }
}