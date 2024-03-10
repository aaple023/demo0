module com.example.demo0 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demo0 to javafx.fxml;
    exports com.example.demo0;
}