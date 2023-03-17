module com.opp.opp {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.opp.opp to javafx.fxml;
    exports com.opp.opp;
}