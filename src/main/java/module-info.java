module com.example.devis {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.devis to javafx.fxml;
    exports com.example.devis;
}