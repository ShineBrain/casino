package Controllerss;

import BackEnd.Account;
import BackEnd.OtherInterf;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class PaymentDataController extends Account implements OtherInterf {

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
            Stage stg = (Stage)BackButton.getScene().getWindow();
            stg.close();

            OtherInterf.Transition("/FileFXML/EditingData.fxml");
        });

        ReplenishButton.setOnAction(event -> {
            Stage stg = (Stage)BackButton.getScene().getWindow();
            stg.close();

            OtherInterf.Transition("/FileFXML/BalanceInp.fxml");
        });

        BackButton.setOnAction(event -> {
            Stage stg = (Stage)BackButton.getScene().getWindow();
            stg.close();

            OtherInterf.Transition("/FileFXML/app.fxml");
        });

    }
}
