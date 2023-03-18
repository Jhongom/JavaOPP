module com.opp.opp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.opp.opp to javafx.fxml;
    exports com.opp.opp;
    exports com.opp.cuentas;
    opens com.opp.cuentas to javafx.fxml;
}