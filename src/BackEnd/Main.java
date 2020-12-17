package BackEnd;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/FileFXML/sampleee.fxml"));
        primaryStage.setTitle("Casino");
        primaryStage.getIcons().add(new Image("file:src/ImgK.png"));
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.setResizable(false);
        //primaryStage.initStyle(StageStyle.UTILITY);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Account account = new Account();
        account.TestCreateAccount();

        AccountsDataManager adm = new AccountsDataManager();

        adm.init();
        Account.accounts = adm.getAll();

        launch(args);

        adm.setData(Account.accounts);
        adm.free();
    }
}