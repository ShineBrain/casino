package Controllerss;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MLose {

    @FXML
    private Button OkButtonMes;

    @FXML
    void initialize() {
        OkButtonMes.setOnAction(event -> {
            Stage stg = (Stage)OkButtonMes.getScene().getWindow();
            stg.close();
        });
    }
}
