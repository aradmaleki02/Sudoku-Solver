module Sudoko.Solver {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    requires com.google.gson;


    opens graphic to javafx.fxml;
    exports graphic;
}