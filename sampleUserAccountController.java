package sample;

import java.net.URL;
import java.util.ResourceBundle;

import BackEnd.OtherInterf;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import static BackEnd.OtherInterf.Transition;

public class sampleUserAccountController implements OtherInterf {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button Payment_data_button;

    @FXML
    private Button BetButton;

    @FXML
    private Button RussianRouletteButton;

    @FXML
    private Button BackButton;

    @FXML
    private Button ExitButton;

    @FXML
    private Button DrumButton;

    @FXML
    void initialize() {
        Payment_data_button.setOnAction(event -> {
            Stage stg = (Stage)Payment_data_button.getScene().getWindow();//скрыть прошлое окно
            stg.close();

            Transition("/sample/PayData.fxml");
        });

        BetButton.setOnAction(event -> {
            Stage stg = (Stage)BetButton.getScene().getWindow();//скрыть прошлое окно
            stg.close();

            Transition("/sample/BetRoom.fxml");
        });

        BackButton.setOnAction(event -> {
            Stage stg = (Stage)BackButton.getScene().getWindow();//скрыть прошлое окно
            stg.close();

            Transition("/sample/sampleee.fxml");
        });
    }
}
