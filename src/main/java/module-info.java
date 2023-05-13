module com.example.plantt1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.plantt1 to javafx.fxml;
    exports com.example.plantt1;
}