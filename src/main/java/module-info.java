module com.example.claculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.claculator to javafx.fxml;
    exports com.example.claculator;
}