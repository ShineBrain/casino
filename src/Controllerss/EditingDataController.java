package Controllerss;

import BackEnd.Account;
import BackEnd.OtherInterf;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class EditingDataController extends Account implements OtherInterf {

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
            if (NewCardNumberField.getText().length() == 16 && NewCardNumberField.getText().matches("\\d+")){
                if (CheckDuplicateAccount("", NewCardNumberField.getText())) {
                    if (!NewFullNameField.getText().equals("")) {
                        if (NewDataExpirationField.getText().length() == 5 && CheckDate(NewDataExpirationField.getText())) {
                            if (NewCVVField.getText().length() == 3 && NewCVVField.getText().matches("\\d+")) {

                                accounts.get(NumberUser).CardNumber = NewCardNumberField.getText();
                                accounts.get(NumberUser).FullName = NewFullNameField.getText();
                                accounts.get(NumberUser).DateExpirationCard = NewDataExpirationField.getText();
                                accounts.get(NumberUser).CVV = NewCVVField.getText();

                                Alert alert = new Alert(Alert.AlertType.INFORMATION);

                                alert.setTitle("Notification");
                                alert.setHeaderText(null);
                                alert.setContentText("The account info had been edited");

                                alert.showAndWait();

                                Stage stg = (Stage) NotChangeButton.getScene().getWindow();
                                stg.close();

                                OtherInterf.Transition("/FileFXML/PayData.fxml");
                            } else OtherInterf.FXNotification("CVV entered incorrectly");
                        } else OtherInterf.FXNotification("Date entered incorrectly");
                    } else OtherInterf.FXNotification("Full name entered incorrectly");
                } else OtherInterf.FXNotification("There is already an account with this card number");
            } else OtherInterf.FXNotification("Card number entered incorrectly");
        });

        NotChangeButton.setOnAction(event -> {
            Stage stg = (Stage)NotChangeButton.getScene().getWindow();
            stg.close();

            OtherInterf.Transition("/FileFXML/PayData.fxml");
        });
    }
}
