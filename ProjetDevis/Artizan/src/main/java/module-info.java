module sio.leo.Artizan {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires java.sql;

    opens sio.leo.Artizan to javafx.fxml;
    exports sio.leo.Artizan;
}
