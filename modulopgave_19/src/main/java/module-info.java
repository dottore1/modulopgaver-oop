module com.mycompany.modulopgave_19 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.modulopgave_19 to javafx.fxml;
    exports com.mycompany.modulopgave_19;
}