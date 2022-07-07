module com.jbiancaniello.ideapicker {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.jbiancaniello.ideapicker to javafx.fxml;
    exports com.jbiancaniello.ideapicker;
}