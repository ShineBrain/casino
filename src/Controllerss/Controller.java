package Controllerss;

import BackEnd.Account;
import BackEnd.OtherInterf;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller extends Account implements OtherInterf {

    @FXML
    private Button RegistrationButton;

    @FXML
    private Button EnterButton;

    @FXML
    private TextField LoginField;

    @FXML
    private PasswordField PasswordField;

    @FXML
    void initialize() {

        EnterButton.setOnAction(event -> {
            if (CheckAccount(LoginField.getText(), PasswordField.getText())){
                Stage stg = (Stage)EnterButton.getScene().getWindow();
                stg.close();

                OtherInterf.Transition("/FileFXML/app.fxml");
            } else {
                OtherInterf.FXNotification("There is no such account, check your password and/or login");
            }
        });

        RegistrationButton.setOnAction(event -> {
            Stage stg = (Stage)EnterButton.getScene().getWindow();
            stg.close();

            OtherInterf.Transition("/FileFXML/RegistrationUser.fxml");
        });
    }
}
