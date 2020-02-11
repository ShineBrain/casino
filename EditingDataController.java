package sample;

import java.net.URL;
import java.util.ResourceBundle;

import BackEnd.Account;
import BackEnd.OtherInterf;
import javafx.fxml.FXML;
import javafx.scene.AccessibleAction;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class EditingDataController extends Account {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField NewCVVField;

    @FXML
    private TextField NewCardNumberField;

    @FXML
    private TextField NewFullNameField;

    @FXML
    private TextField NewDataExpirationField;

    @FXML
    private Button ToChangeButton;

    @FXML
    private Button NotChangeButton;

    @FXML
    void initialize() {
        ToChangeButton.setOnAction(event -> {
            if (!NewCardNumberField.getText().equals("") && NewCardNumberField.getText().length() < 17 && NewCardNumberField.getText().length() > 0){
                if (!NewFullNameField.getText().equals("")){
                    if (NewDataExpirationField.getText().length() > 0 && NewDataExpirationField.getText().length() < 6){
                        if (NewCVVField.getText().length() > 0 && NewCVVField.getText().length() < 4){
                            String str = TransformationFullName(NewFullNameField.getText());

                            accounts.get(NumberUser).CardNumber = NewCardNumberField.getText();
                            accounts.get(NumberUser).FullName = NewFullNameField.getText();
                            accounts.get(NumberUser).DateExpirationCard = NewDataExpirationField.getText();
                            accounts.get(NumberUser).CVV = NewCVVField.getText();

                            Alert alert = new Alert(Alert.AlertType.INFORMATION);

                            alert.setTitle("Notification");
                            alert.setHeaderText(null);
                            alert.setContentText("The account is editing");

                            alert.showAndWait();

                            Stage stg = (Stage)NotChangeButton.getScene().getWindow();//скрыть прошлое окно
                            stg.close();

                            OtherInterf.Transition("/sample/PayData.fxml");
                        }
                    }
                }
            }
        });

        NotChangeButton.setOnAction(event -> {
            Stage stg = (Stage)NotChangeButton.getScene().getWindow();//скрыть прошлое окно
            stg.close();

            OtherInterf.Transition("/sample/PayData.fxml");
        });

    }
}
