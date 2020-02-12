package Sample;

import java.net.URL;
import java.util.ResourceBundle;

import BackEnd.Bet;
import BackEnd.OtherInterf;
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

            if (CheckNum(VoteField1.getText()) && CheckBalance(500)){ Game(VoteField1.getText(), bet, coefficient, percent); }
            else { OtherInterf.Transition(""); }///////////////////////////////////// сделать смс
        });

        Vote2.setOnAction(event -> {
            int bet = 1000;
            double coefficient = 2;
            int percent = 2;

            if (CheckNum(VoteField2.getText()) && CheckBalance(1000)){ Game(VoteField2.getText(), bet, coefficient, percent); }
            else { OtherInterf.Transition(""); }
        });

        Vote3.setOnAction(event -> {
            int bet = 2500;
            double coefficient = 2.2;
            int percent = 2;

            if (CheckNum(VoteField3.getText()) && CheckBalance(2500)){ Game(VoteField3.getText(), bet, coefficient, percent); }
            else { OtherInterf.Transition(""); }
        });

        Vote4.setOnAction(event -> {
            int bet = 5000;
            double coefficient = 2.4;
            int percent = 2;

            if (CheckNum(VoteField4.getText()) && CheckBalance(5000)){ Game(VoteField4.getText(), bet, coefficient, percent); }
            else { OtherInterf.Transition(""); }
        });

        Vote5.setOnAction(event -> {
            int bet = 10000;
            double coefficient = 2.45;
            int percent = 2;

            if (CheckNum(VoteField5.getText()) && CheckBalance(10000)){ Game(VoteField5.getText(), bet, coefficient, percent); }
            else { OtherInterf.Transition(""); }
        });

        Vote6.setOnAction(event -> {
            int bet = 15000;
            double coefficient = 2.5;
            int percent = 2;

            if (CheckNum(VoteField6.getText()) && CheckBalance(15000)){ Game(VoteField6.getText(), bet, coefficient, percent); }
            else { OtherInterf.Transition(""); }
        });

        Vote7.setOnAction(event -> {
            int bet = 25000;
            double coefficient = 2.6;
            int percent = 1;

            if (CheckNum(VoteField7.getText()) && CheckBalance(25000)){ Game(VoteField7.getText(), bet, coefficient, percent); }
            else { OtherInterf.Transition(""); }
        });

        Vote8.setOnAction(event -> {
            int bet = 50000;
            double coefficient = 2.8;
            int percent = 1;

            if (CheckNum(VoteField8.getText()) && CheckBalance(50000)){ Game(VoteField8.getText(), bet, coefficient, percent); }
            else { OtherInterf.Transition(""); }
        });

        BackButton.setOnAction(event -> {
            Stage stg = (Stage)BackButton.getScene().getWindow();//скрыть прошлое окно
            stg.close();

            Transition("/sample/app.fxml");
        });
    }
}
