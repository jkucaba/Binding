module com.jakubku.readonlyprops {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.jakubku.readonlyprops to javafx.fxml;
    exports com.jakubku.readonlyprops;
}