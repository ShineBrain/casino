package Controllerss;

import java.net.URL;
import java.util.ResourceBundle;

import BackEnd.Bet;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import static BackEnd.OtherInterf.Transition;

public class BetRoomController extends Bet {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField VoteField1;

    @FXML
    private TextField VoteField2;

    @FXML
    private TextField VoteField3;

    @FXML
    private TextField VoteField4;

    @FXML
    private TextField VoteField5;

    @FXML
    private TextField VoteField6;

    @FXML
    private TextField VoteField7;

    @FXML
    private TextField VoteField8;

    @FXML
    private Button Vote1;

    @FXML
    private Button Vote2;

    @FXML
    private Button Vote3;

    @FXML
    private Button Vote4;

    @FXML
    private Button Vote5;

    @FXML
    private Button Vote6;

    @FXML
    private Button Vote7;

    @FXML
    private Button Vote8;

    @FXML
    private Button BackButton;

    @FXML
    void initialize() {
        VoteField3.getText();
        VoteField4.getText();
        VoteField5.getText();
        VoteField6.getText();
        VoteField7.getText();
        VoteField8.getText();

        Vote1.setOnAction(event -> {
            int bet = 500;
            double coefficient = 2;
            int percent = 1;

            if (CheckNum(VoteField1.getText())) {
                if (CheckBalance(bet)) {
                    if (Game(VoteField1.getText(), bet, coefficient, percent)) { Transition("/FileFXML/MessageInSlotMachinesWIN.fxml"); }
                    else { Transition("/FileFXML/MSlotMachinesLose.fxml"); }
                }
                else { Transition("/FileFXML/NotBalance.fxml"); }
            }
            else { Transition("/FileFXML/ErrorNum.fxml"); }
        });

        Vote2.setOnAction(event -> {
            int bet = 1000;
            double coefficient = 2.1;
            int percent = 2;

            if (CheckNum(VoteField2.getText())) {
                if (CheckBalance(bet)) {
                    if (Game(VoteField2.getText(), bet, coefficient, percent)) { Transition("/FileFXML/MessageInSlotMachinesWIN.fxml"); }
                    else { Transition("/FileFXML/MSlotMachinesLose.fxml"); }
                }
                else { Transition("/FileFXML/NotBalance.fxml"); }
            }
            else { Transition("/FileFXML/ErrorNum.fxml"); }
        });

        Vote3.setOnAction(event -> {
            int bet = 2500;
            double coefficient = 2.2;
            int percent = 2;

            if (CheckNum(VoteField3.getText())) {
                if (CheckBalance(bet)) {
                    if (Game(VoteField3.getText(), bet, coefficient, percent)) { Transition("/FileFXML/MessageInSlotMachinesWIN.fxml"); }
                    else { Transition("/FileFXML/MSlotMachinesLose.fxml"); }
                }
                else { Transition("/FileFXML/NotBalance.fxml"); }
            }
            else { Transition("/FileFXML/ErrorNum.fxml"); }
        });

        Vote4.setOnAction(event -> {
            int bet = 5000;
            double coefficient = 2.4;
            int percent = 2;

            if (CheckNum(VoteField4.getText())) {
                if (CheckBalance(bet)) {
                    if (Game(VoteField4.getText(), bet, coefficient, percent)) { Transition("/FileFXML/MessageInSlotMachinesWIN.fxml"); }
                    else { Transition("/FileFXML/MSlotMachinesLose.fxml"); }
                }
                else { Transition("/FileFXML/NotBalance.fxml"); }
            }
            else { Transition("/FileFXML/ErrorNum.fxml"); }
        });

        Vote5.setOnAction(event -> {
            int bet = 10000;
            double coefficient = 2.45;
            int percent = 2;

            if (CheckNum(VoteField5.getText())) {
                if (CheckBalance(bet)) {
                    if (Game(VoteField5.getText(), bet, coefficient, percent)) { Transition("/FileFXML/MessageInSlotMachinesWIN.fxml"); }
                    else { Transition("/FileFXML/MSlotMachinesLose.fxml"); }
                }
                else { Transition("/FileFXML/NotBalance.fxml"); }
            }
            else { Transition("/FileFXML/ErrorNum.fxml"); }
        });

        Vote6.setOnAction(event -> {
            int bet = 15000;
            double coefficient = 2.5;
            int percent = 2;

            if (CheckNum(VoteField6.getText())) {
                if (CheckBalance(bet)) {
                    if (Game(VoteField6.getText(), bet, coefficient, percent)) { Transition("/FileFXML/MessageInSlotMachinesWIN.fxml"); }
                    else { Transition("/FileFXML/MSlotMachinesLose.fxml"); }
                }
                else { Transition("/FileFXML/NotBalance.fxml"); }
            }
            else { Transition("/FileFXML/ErrorNum.fxml"); }
        });

        Vote7.setOnAction(event -> {
            int bet = 25000;
            double coefficient = 2.7;
            int percent = 1;

            if (CheckNum(VoteField7.getText())) {
                if (CheckBalance(bet)) {
                    if (Game(VoteField7.getText(), bet, coefficient, percent)) { Transition("/FileFXML/MessageInSlotMachinesWIN.fxml"); }
                    else { Transition("/FileFXML/MSlotMachinesLose.fxml"); }
                }
                else { Transition("/FileFXML/NotBalance.fxml"); }
            }
            else { Transition("/FileFXML/ErrorNum.fxml"); }
        });

        Vote8.setOnAction(event -> {
            int bet = 50000;
            double coefficient = 2.8;
            int percent = 1;

            if (CheckNum(VoteField8.getText())) {
                if (CheckBalance(bet)) {
                    if (Game(VoteField8.getText(), bet, coefficient, percent)) { Transition("/FileFXML/MessageInSlotMachinesWIN.fxml"); }
                    else { Transition("/FileFXML/MSlotMachinesLose.fxml"); }
                }
                else { Transition("/FileFXML/NotBalance.fxml"); }
            }
            else { Transition("/FileFXML/ErrorNum.fxml"); }
        });

        BackButton.setOnAction(event -> {
            Stage stg = (Stage)BackButton.getScene().getWindow();
            stg.close();

            Transition("/FileFXML/app.fxml");
        });
    }
}
