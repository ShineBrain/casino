package sample;

import java.net.URL;
import java.util.ResourceBundle;

import BackEnd.Account;
import BackEnd.OtherInterf;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class PaymentDataController extends Account {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField LoginField;

    @FXML
    private TextField PasswordField;

    @FXML
    private TextField CardNumberField;

    @FXML
    private TextField FullNameField;

    @FXML
    private TextField DataExperationCardField;

    @FXML
    private TextField CVVField;

    @FXML
    private TextField BalanceField;

    @FXML
    private Button ToChangeButton;

    @FXML
    private Button ReplenishButton;

    @FXML
    private Button BackButton;

    @FXML
    void initialize() {
        LoginField.setText(accounts.get(NumberUser).Login);
        PasswordField.setText(accounts.get(NumberUser).Password);
        CardNumberField.setText(accounts.get(NumberUser).CardNumber);
        FullNameField.setText(accounts.get(NumberUser).FullName);
        DataExperationCardField.setText(accounts.get(NumberUser).DateExpirationCard);
        CVVField.setText(accounts.get(NumberUser).CVV);
        BalanceField.setText(Double.toString(accounts.get(NumberUser).Balance));

        ToChangeButton.setOnAction(event -> {
            Stage stg = (Stage)BackButton.getScene().getWindow();//скрыть прошлое окно
            stg.close();

            OtherInterf.Transition("/sample/EditingData.fxml");
        });

        ReplenishButton.setOnAction(event -> {
            Stage stg = (Stage)BackButton.getScene().getWindow();//скрыть прошлое окно
            stg.close();

            OtherInterf.Transition("/sample/BalanceInp.fxml");
        });

        BackButton.setOnAction(event -> {
            Stage stg = (Stage)BackButton.getScene().getWindow();//скрыть прошлое окно
            stg.close();

            OtherInterf.Transition("/sample/app.fxml");
        });

    }
}
