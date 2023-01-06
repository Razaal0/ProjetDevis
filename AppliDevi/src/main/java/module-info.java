module sio.leo.applidevi {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires java.sql;
    opens sio.leo.applidevi to javafx.fxml;
    exports sio.leo.applidevi;
}
