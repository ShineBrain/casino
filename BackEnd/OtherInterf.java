package BackEnd;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public interface OtherInterf {
    static void Transition(String path){
        FXMLLoader loader = new FXMLLoader(OtherInterf.class.getResource(path));

        Parent root = null; //полный путь к файлу который необходимо загрузить
        try { root = (Parent)loader.load(); }
        catch (IOException e) { e.printStackTrace(); }

        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setTitle("Russian Roulette");
        stage.setScene(new Scene(root));
        stage.show();
    }
}
