module com.example.attendancemanagementsystem {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;

    opens com.example.attendancemanagementsystem to javafx.fxml;
    exports com.example.attendancemanagementsystem;
    exports com.example.attendancemanagementsystem.controller;
    opens com.example.attendancemanagementsystem.controller to javafx.fxml;
}