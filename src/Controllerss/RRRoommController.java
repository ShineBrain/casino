package Controllerss;

import BackEnd.OtherInterf;
import BackEnd.RRbet;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class RRRoommController extends RRbet implements OtherInterf {

    @FXML
    private TextField PlayersField1;

    @FXML
    private TextField PlayersField2;

    @FXML
    private TextField PlayersField3;

    @FXML
    private TextField PlayersField4;

    @FXML
    private TextField PlayersField5;

    @FXML
    private TextField PlayersField6;

    @FXML
    private Button ParticipateButton1;

    @FXML
    private Button ParticipateButton2;

    @FXML
    private Button ParticipateButton3;

    @FXML
    private Button ParticipateButton4;

    @FXML
    private Button ParticipateButton5;

    @FXML
    private Button ParticipateButton6;

    @FXML
    private Button BackButton;

    @FXML
    void initialize() {

        PlayersField1.setText(Conversion(Room0.size()));
        PlayersField2.setText(Conversion(Room1.size()));
        PlayersField3.setText(Conversion(Room2.size()));
        PlayersField4.setText(Conversion(Room3.size()));
        PlayersField5.setText(Conversion(Room4.size()));
        PlayersField6.setText(Conversion(Room5.size()));

        ParticipateButton1.setOnAction(event -> {
            int bet = 1000;
            double coefficient = 6;
            int percent = 2;

            RRGame(Room0, bet, coefficient, percent);

            PlayersField1.setText(Conversion(Room0.size()));
        });

        ParticipateButton2.setOnAction(event -> {
            int bet = 5000;
            double coefficient = 6;
            int percent = 2;

            RRGame(Room1, bet, coefficient, percent);

            PlayersField2.setText(Conversion(Room1.size()));
        });

        ParticipateButton3.setOnAction(event -> {
            int bet = 15000;
            double coefficient = 6;
            int percent = 2;

            RRGame(Room2, bet, coefficient, percent);

            PlayersField3.setText(Conversion(Room2.size()));
        });

        ParticipateButton4.setOnAction(event -> {
            int bet = 25000;
            double coefficient = 6;
            int percent = 2;

            RRGame(Room3, bet, coefficient, percent);

            PlayersField4.setText(Conversion(Room3.size()));
        });

        ParticipateButton5.setOnAction(event -> {
            int bet = 50000;
            double coefficient = 6;
            int percent = 2;

            RRGame(Room4, bet, coefficient, percent);

            PlayersField5.setText(Conversion(Room4.size()));
        });

        ParticipateButton6.setOnAction(event -> {
            int bet = 100000;
            double coefficient = 6;
            int percent = 2;

            RRGame(Room5, bet, coefficient, percent);

            PlayersField6.setText(Conversion(Room5.size()));
        });

        BackButton.setOnAction(event -> {
            Stage stg = (Stage)BackButton.getScene().getWindow();
            stg.close();

            OtherInterf.Transition("/FileFXML/app.fxml");
        });
    }
}