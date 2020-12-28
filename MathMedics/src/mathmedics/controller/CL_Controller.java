package mathmedics.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class CL_Controller extends SidebarController implements Initializable {


    @FXML
    private HBox Alpha;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    void into_Alpha(MouseEvent event) throws IOException{

        Stage newStage = new Stage();
        Stage stage = (Stage) Alpha.getScene().getWindow();
        try {
            Parent second = FXMLLoader.load(getClass().getResource("/mathmedics/view/mc_alpha.fxml"));

            Scene sc = new Scene(second);
            stage.setScene(sc);
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}