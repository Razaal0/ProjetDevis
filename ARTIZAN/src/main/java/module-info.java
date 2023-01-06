module com.mycompany.artizan {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.artizan to javafx.fxml;
    exports com.mycompany.artizan;
}
