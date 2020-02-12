package Controllerss;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MessageWinSlotMachines {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane WinMessege;

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
