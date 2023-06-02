module com.employee.manage.ui {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.employee.manage.ui to javafx.fxml;
    exports com.employee.manage.ui;
}