module com.example.homework1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.homework1 to javafx.fxml;
    exports com.example.homework1;
}