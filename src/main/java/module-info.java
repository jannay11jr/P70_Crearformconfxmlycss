module casellesrodriguez.jannay.p70_crearformulario_css_fxml {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires javafx.graphics;

    opens casellesrodriguez.jannay.p70_crearformulario_css_fxml to javafx.fxml;
    exports casellesrodriguez.jannay.p70_crearformulario_css_fxml;
}