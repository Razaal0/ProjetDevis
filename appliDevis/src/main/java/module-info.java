module sio.leo.applidevis {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.base;
    opens sio.leo.applidevis to javafx.fxml;
    exports sio.leo.applidevis;
}
