module com.lab6.threadcontroldeadlocks {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.lab6.threadcontroldeadlocks to javafx.fxml;
    exports com.lab6.threadcontroldeadlocks;
}