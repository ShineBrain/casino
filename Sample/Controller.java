package Sample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import BackEnd.Account;
import BackEnd.OtherInterf;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller extends Account  {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

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
            if (CheckAccount(LoginField.getText(), PasswordField.getText()) == true){
                Stage stg = (Stage)EnterButton.getScene().getWindow();//скрыть прошлое окно
                stg.close();

                OtherInterf.Transition("/sample/app.fxml");
            }
        });

        RegistrationButton.setOnAction(event -> {
            Stage stg = (Stage)EnterButton.getScene().getWindow();//скрыть прошлое окно
            stg.close();

            OtherInterf.Transition("/sample/RegistrationUser.fxml");
        });
    }
}
