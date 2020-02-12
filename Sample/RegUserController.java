package Sample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import BackEnd.Account;
import BackEnd.OtherInterf;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class RegUserController extends Account{

@FXML
private ResourceBundle resources;

@FXML
private URL location;

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
                        if (CardNumberRegField.getText().length() == 16 /*&& account.CheckStr(CardNumberRegField.getText()) == true*/){
                            String str = TransformationFullName(CardHolderRegField.getText());
                            if (ExpirationDataRegField.getText().length() == 5){
                                if (CVVGegField.getText().length() == 3){
                                    Account account = new Account(LoginRegField.getText(), PasswordRegField.getText(), CardNumberRegField.getText(),
                                                                  str, ExpirationDataRegField.getText(), CVVGegField.getText());
                                    accounts.add(account);

                                    Alert alert = new Alert(Alert.AlertType.INFORMATION);

                                    alert.setTitle("Notification");
                                    alert.setHeaderText(null);
                                    alert.setContentText("The account is registered");

                                    alert.showAndWait();

                                    Stage stg = (Stage)BackGerField.getScene().getWindow();//скрыть прошлое окно
                                    stg.close();

                                    OtherInterf.Transition("/sample/sampleee.fxml");
                                }
                                else{ System.out.println("ERROR! CVV entered incorrectly"); }
                            }
                            else{ System.out.println("ERROR! Date entered incorrectly(xx.xx.xxxx)"); }
                        }
                        else{ System.out.println("ERROR! CardNumber != 16 symbol or not a number"); }
                    }
                    else{ System.out.println("ERROR! : Password < 1 symbol or Password > 16 symbol"); }
                }
                else { System.out.println("ERROR! : Login < 1 symbol or Login > 16 symbol"); }
        });

        BackGerField.setOnAction(event -> {
            Stage stg = (Stage)BackGerField.getScene().getWindow();//скрыть прошлое окно
            stg.close();

            OtherInterf.Transition("/sample/sampleee.fxml");
        });
    }
}