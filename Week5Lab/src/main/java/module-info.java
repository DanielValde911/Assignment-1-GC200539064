module com.example.week5lab {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.week5lab to javafx.fxml;
    exports com.example.week5lab;
}