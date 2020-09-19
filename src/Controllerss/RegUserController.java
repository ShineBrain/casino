package Controllerss;

import BackEnd.Account;
import BackEnd.OtherInterf;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class RegUserController extends Account implements OtherInterf {

@FXML
private TextField CardNumberRegField;

@FXML
private TextField CardHolderRegField;

@FXML
private TextField ExpirationDataRegField;

@FXML
private TextField CVVGegField;

@FXML
private TextField PasswordRegField;

@FXML
private TextField LoginRegField;

@FXML
private Button RegButton;

@FXML
private Button BackGerField;

@FXML
void initialize() {
    RegButton.setOnAction(event -> {
            if (LoginRegField.getText().length() > 0 && LoginRegField.getText().length() < 17){
                if (PasswordRegField.getText().length() > 0 && PasswordRegField.getText().length() < 17){
                    if (CardNumberRegField.getText().length() == 16 && CardNumberRegField.getText().matches("\\d+")){
                        if (CheckDuplicateAccount(LoginRegField.getText(), CardNumberRegField.getText())) {
                            if (ExpirationDataRegField.getText().length() == 5 && CheckDate(ExpirationDataRegField.getText())) {
                                if (CVVGegField.getText().length() == 3 && CVVGegField.getText().matches("\\d+")) {
                                    String str = TransformationFullName(CardHolderRegField.getText());

                                    Account account = new Account(LoginRegField.getText(), PasswordRegField.getText(), CardNumberRegField.getText(), str, ExpirationDataRegField.getText(), CVVGegField.getText());
                                    accounts.add(account);

                                    OtherInterf.FXNotification("The account is registered");

                                    Stage stg = (Stage) BackGerField.getScene().getWindow();
                                    stg.close();

                                    OtherInterf.Transition("/FileFXML/sampleee.fxml");
                                } else OtherInterf.FXNotification("CVV entered incorrectly");
                            } else OtherInterf.FXNotification("Date entered incorrectly");
                        } else OtherInterf.FXNotification("There is already an account with this login and/or card number");
                    } else OtherInterf.FXNotification("Card number entered incorrectly");
                }
                else OtherInterf.FXNotification("Password entered incorrectly");
            }
            else OtherInterf.FXNotification("Login entered incorrectly");
    });

        BackGerField.setOnAction(event -> {
            Stage stg = (Stage)BackGerField.getScene().getWindow();
            stg.close();

            OtherInterf.Transition("/FileFXML/sampleee.fxml");
        });
    }
}