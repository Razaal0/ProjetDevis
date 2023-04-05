module sio.leo.artizan {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.base;
    opens sio.leo.artizan to javafx.fxml;
    exports sio.leo.artizan;
}
