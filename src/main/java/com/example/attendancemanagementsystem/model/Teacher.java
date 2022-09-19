package com.example.attendancemanagementsystem.model;

public class Teacher {
    private int ID;
    private String name;
    private String password;

    public Teacher(){}

    public Teacher(int ID, String name, String password) {
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
