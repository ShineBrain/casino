package Controllerss;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ErrorNum {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button OkButtonMes;

    @FXML
    void initialize() {
        OkButtonMes.setOnAction(event -> {
            Stage stg = (Stage)OkButtonMes.getScene().getWindow();//скрыть прошлое окно
            stg.close();
        });
    }
}
