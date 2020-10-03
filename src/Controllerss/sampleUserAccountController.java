package Controllerss;

import BackEnd.OtherInterf;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class sampleUserAccountController implements OtherInterf {

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
            Stage stg = (Stage)Payment_data_button.getScene().getWindow();
            stg.close();

            OtherInterf.Transition("/FileFXML/PayData.fxml");
        });

        BetButton.setOnAction(event -> {
            Stage stg = (Stage)BetButton.getScene().getWindow();
            stg.close();

            OtherInterf.Transition("/FileFXML/BetRoom.fxml");
        });

        RussianRouletteButton.setOnAction(event -> {
            Stage stg = (Stage)Payment_data_button.getScene().getWindow();
            stg.close();

            OtherInterf.Transition("/FileFXML/RRRoomm.fxml");
        });

        DrumButton.setOnAction(event -> {
            Stage stg = (Stage)DrumButton.getScene().getWindow();
            stg.close();

            OtherInterf.Transition("/FileFXML/Drum.fxml");
        });

        BackButton.setOnAction(event -> {
            Stage stg = (Stage)BackButton.getScene().getWindow();
            stg.close();

            OtherInterf.Transition("/FileFXML/sampleee.fxml");
        });

        ExitButton.setOnAction(event -> {
            System.exit(0);
        });
    }
}
