module dev.projetdevis {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires java.sql;
    opens dev.projetdevis to javafx.fxml;
    exports dev.projetdevis;
}
