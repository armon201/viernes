module org.example.semanasanta {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.semanasanta to javafx.fxml;
    exports org.example.semanasanta;
}