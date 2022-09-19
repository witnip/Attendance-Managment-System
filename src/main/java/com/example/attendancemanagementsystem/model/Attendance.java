package com.example.attendancemanagementsystem.model;

import java.util.Date;

public class Attendance {
    private int ID;
    private int teacherID;
    private int studentID;
    private boolean attendanceMark = false;
    private Date attendanceMarkDate;
    private Date getAttendanceModifiedDate = null;

    public Attendance(){}

    public Attendance(int ID, int teacherID, int studentID, boolean attendanceMark, Date attendanceMarkDate, Date getAttendanceModifiedDate) {
        this.ID = ID;
        this.teacherID = teacherID;
        this.studentID = studentID;
        this.attendanceMark = attendanceMark;
        this.attendanceMarkDate = attendanceMarkDate;
        this.getAttendanceModifiedDate = getAttendanceModifiedDate;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(int teacherID) {
        this.teacherID = teacherID;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public boolean isAttendanceMark() {
        return attendanceMark;
    }

    public void setAttendanceMark(boolean attendanceMark) {
        this.attendanceMark = attendanceMark;
    }

    public Date getAttendanceMarkDate() {
        return attendanceMarkDate;
    }

    public void setAttendanceMarkDate(Date attendanceMarkDate) {
        this.attendanceMarkDate = attendanceMarkDate;
    }

    public Date getGetAttendanceModifiedDate() {
        return getAttendanceModifiedDate;
    }

    public void setGetAttendanceModifiedDate(Date getAttendanceModifiedDate) {
        this.getAttendanceModifiedDate = getAttendanceModifiedDate;
    }
}
