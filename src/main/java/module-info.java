module com.example.validate{
    requires javafx.controls;
    requires javafx.fxml;

    exports com.example.validate;
    opens com.example.validate to javafx.fxml;
}