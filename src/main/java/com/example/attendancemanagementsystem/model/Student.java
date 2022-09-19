package com.example.attendancemanagementsystem.model;

import java.util.Date;

public class Student {
    private int ID;
    private String name;
    private String password;

    public Student() {
    }

    public Student(int ID, String name, String password) {
        this.ID = ID;
        this.name = name;
        this.password = password;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
