package Controllerss;

import BackEnd.Account;
import BackEnd.OtherInterf;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class PlusBalanceController extends Account implements OtherInterf {

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
                double doub = Double.parseDouble(PlusBalanceField.getText());
                if (doub > 0){
                    accounts.get(NumberUser).Balance += doub;

                    Stage stg = (Stage)PlusBalanceButton.getScene().getWindow();
                    stg.close();

                    OtherInterf.Transition("/FileFXML/PayData.fxml");
                }
                else {
                    OtherInterf.FXNotification("Number should be more than 0, with separating \".\", if needed");
                    /*
                    Stage stg = (Stage)PlusBalanceButton.getScene().getWindow();
                    stg.close();

                    OtherInterf.Transition("/FileFXML/PayData.fxml");
                     */
                }
            }
            catch (NumberFormatException nfe){ OtherInterf.FXNotification("Number should be more than 0, with separating \".\", if needed"); }
        });

        BackButton.setOnAction(event1 -> {
            Stage stg = (Stage)BackButton.getScene().getWindow();
            stg.close();

            OtherInterf.Transition("/FileFXML/PayData.fxml");
        });
    }
}
