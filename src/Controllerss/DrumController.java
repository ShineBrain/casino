package Controllerss;

import BackEnd.DrumBet;
import BackEnd.OtherInterf;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class DrumController extends DrumBet implements OtherInterf {

    @FXML
    private Button VoteButtonFrom1to12;

    @FXML
    private Button VoteButtonFrom13to24;

    @FXML
    private Button VoteButtonFrom25to36;

    @FXML
    private Button VoteButtonFrom1to18;

    @FXML
    private Button VoteButtonFrom19to36;

    @FXML
    private Button VoteButtonBlack;

    @FXML
    private Button VoteButtonRed;

    @FXML
    private Button VoteButtonColumn1;

    @FXML
    private Button VoteButtonColumn2;

    @FXML
    private Button VoteButtonColumn3;

    @FXML
    private TextField WinField;

    @FXML
    private TextField EnterBetField;

    @FXML
    private Button VoteButton0;

    @FXML
    private Button BackButton;

    @FXML
    void initialize() {
        WinField.setText(Conversion(DropNum));

        VoteButtonBlack.setOnAction(event -> {
            try {
                String color = "Black";
                int bet = Integer.parseInt(EnterBetField.getText());
                int percent = 2;
                double coefficient = 2;

                VoteColor(color, bet, percent, coefficient);

                WinField.setText(Conversion(DropNum));
            }
            catch (Exception ex){
                OtherInterf.FXNotification("Missing bid");
            }
        });

        VoteButtonRed.setOnAction(event -> {
            try {
                String color = "Red";
                int bet = Integer.parseInt(EnterBetField.getText());
                int percent = 2;
                double coefficient = 2;

                VoteColor(color, bet, percent, coefficient);

                WinField.setText(Conversion(DropNum));
            }
            catch (Exception ex){
                OtherInterf.FXNotification("Missing bid");
            }
        });

        VoteButtonColumn1.setOnAction(event -> {
            try {
                int column = 1;
                int bet = Integer.parseInt(EnterBetField.getText());
                int percent = 3;
                double coefficient = 3;

                VoteColumn(column, bet, percent, coefficient);

                WinField.setText(Conversion(DropNum));
            }
            catch (Exception ex){
                OtherInterf.FXNotification("Missing bid");
            }
        });

        VoteButtonColumn2.setOnAction(event -> {
            try {
                int column = 2;
                int bet = Integer.parseInt(EnterBetField.getText());
                int percent = 3;
                double coefficient = 3;

                VoteColumn(column, bet, percent, coefficient);

                WinField.setText(Conversion(DropNum));
            }
            catch (Exception ex){
                OtherInterf.FXNotification("Missing bid");
            }
        });

        VoteButtonColumn3.setOnAction(event -> {
            try {
                int column = 3;
                int bet = Integer.parseInt(EnterBetField.getText());
                int percent = 3;
                double coefficient = 3;

                VoteColumn(column, bet, percent, coefficient);

                WinField.setText(Conversion(DropNum));
            }
            catch (Exception ex){
                OtherInterf.FXNotification("Missing bid");
            }
        });

        VoteButtonFrom1to12.setOnAction(event -> {
            try {
                int bet = Integer.parseInt(EnterBetField.getText());
                int percent = 3;
                double coefficient = 3;

                FromTo(1, 12, bet, percent, coefficient);

                WinField.setText(Conversion(DropNum));
            }
            catch (Exception ex){
                OtherInterf.FXNotification("Missing bid");
            }
        });

        VoteButtonFrom13to24.setOnAction(event -> {
            try {
                int bet = Integer.parseInt(EnterBetField.getText());
                int percent = 3;
                double coefficient = 3;

                FromTo(13, 24, bet, percent, coefficient);

                WinField.setText(Conversion(DropNum));
            }
            catch (Exception ex){
                OtherInterf.FXNotification("Missing bid");
            }
        });

        VoteButtonFrom25to36.setOnAction(event -> {
            try{
                int bet = Integer.parseInt(EnterBetField.getText());
                int percent = 3;
                double coefficient = 3;

                FromTo(25, 36, bet, percent, coefficient);

                WinField.setText(Conversion(DropNum));
            }
            catch (Exception ex){
                OtherInterf.FXNotification("Missing bid");
            }
        });

        VoteButtonFrom1to18.setOnAction(event -> {
            try {
                int bet = Integer.parseInt(EnterBetField.getText());
                int percent = 2;
                double coefficient = 2;

                FromTo(1, 18, bet, percent, coefficient);

                WinField.setText(Conversion(DropNum));
            }
            catch (Exception ex){
                OtherInterf.FXNotification("Missing bid");
            }
        });

        VoteButtonFrom19to36.setOnAction(event -> {
            try {
                int bet = Integer.parseInt(EnterBetField.getText());
                int percent = 2;
                double coefficient = 2;

                FromTo(19, 36, bet, percent, coefficient);

                WinField.setText(Conversion(DropNum));
            }
            catch (Exception ex){
                OtherInterf.FXNotification("Missing bid");
            }
        });

        VoteButton0.setOnAction(event -> {
            try {
                int bet = Integer.parseInt(EnterBetField.getText());
                int percent = 5;
                double coefficient = 5;

                FromTo(0, 0, bet, percent, coefficient);

                WinField.setText(Conversion(DropNum));
            }
            catch (Exception ex){
                OtherInterf.FXNotification("Missing bid");
            }
        });

        BackButton.setOnAction(event -> {
            Stage stg = (Stage)BackButton.getScene().getWindow();
            stg.close();

            OtherInterf.Transition("/FileFXML/app.fxml");
        });
    }
}