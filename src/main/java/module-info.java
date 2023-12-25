module helha.test5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens helha.test5 to javafx.fxml;
    exports helha.test5;
}