module com.example.uselayoutpanes {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.uselayoutpanes to javafx.fxml;
    exports com.example.uselayoutpanes;
}