module com.example.stickheroap {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires junit;


    opens com.example.stickheroap to javafx.fxml;
    exports com.example.stickheroap;
}