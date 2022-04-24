module sample.itraund {
    requires javafx.controls;
    requires javafx.fxml;


    opens sample.itraund to javafx.fxml;
    exports sample.itraund;
}