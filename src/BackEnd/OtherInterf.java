package BackEnd;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.image.Image;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public interface OtherInterf {
    static void Transition(String path){
        FXMLLoader loader = new FXMLLoader(OtherInterf.class.getResource(path));

        Parent root = null;
        try { root = (Parent)loader.load(); }
        catch (IOException e) { e.printStackTrace(); }

        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setTitle("Casino");
        stage.getIcons().add(new Image("file:ImgK.png"));
        stage.setResizable(false);
        stage.setScene(new Scene(root));
        stage.show();
    }

    static void FXNotification(String text){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Notification");
        alert.setHeaderText(null);
        alert.setContentText(text);
        alert.showAndWait();
    }
}
