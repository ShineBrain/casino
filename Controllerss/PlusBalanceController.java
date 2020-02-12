package Controllerss;

import java.net.URL;
import java.util.ResourceBundle;

import BackEnd.Account;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import static BackEnd.OtherInterf.*;

public class PlusBalanceController extends Account {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField PlusBalanceField;

    @FXML
    private Button PlusBalanceButton;

    @FXML
    private Button BackButton;

    @FXML
    void initialize() {
        PlusBalanceButton.setOnAction(event -> {
            try {
                Double doub = Double.valueOf(PlusBalanceField.getText());
                if (doub > 0){
                    accounts.get(NumberUser).Balance += doub;

                    Stage stg = (Stage)PlusBalanceButton.getScene().getWindow();//скрыть прошлое окно
                    stg.close();

                    Transition("/FileFXML/PayData.fxml");
                }
                else {
                    Stage stg = (Stage)PlusBalanceButton.getScene().getWindow();//скрыть прошлое окно
                    stg.close();

                    Transition("/FileFXML/PayData.fxml");
                }
            }
            catch (NumberFormatException nfe){ System.err.println("x > 0"); }
        });

        BackButton.setOnAction(event1 -> {
            Stage stg = (Stage)BackButton.getScene().getWindow();//скрыть прошлое окно
            stg.close();

            Transition("/FileFXML/PayData.fxml");
        });
    }
}
