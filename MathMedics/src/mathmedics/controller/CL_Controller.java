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

    @FXML
    private HBox Beta;

    @FXML
    private HBox Gamma;

    @FXML
    private HBox Delta;

    @FXML
    private HBox Epsilon;

    @FXML
    private HBox Zeta;

    @FXML
    private HBox Eta;

    @FXML
    private HBox Theta;

    @FXML
    private HBox Lota;



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

    @FXML
    void into_Beta(MouseEvent event) {

        Stage newStage = new Stage();
        Stage stage = (Stage) Alpha.getScene().getWindow();
        try {
            Parent second = FXMLLoader.load(getClass().getResource("/mathmedics/view/mc_beta.fxml"));

            Scene sc = new Scene(second);
            stage.setScene(sc);
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void into_Delta(MouseEvent event) {

        Stage newStage = new Stage();
        Stage stage = (Stage) Alpha.getScene().getWindow();
        try {
            Parent second = FXMLLoader.load(getClass().getResource("/mathmedics/view/mc_delta.fxml"));

            Scene sc = new Scene(second);
            stage.setScene(sc);
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void into_Epsilon(MouseEvent event) {

        Stage newStage = new Stage();
        Stage stage = (Stage) Alpha.getScene().getWindow();
        try {
            Parent second = FXMLLoader.load(getClass().getResource("/mathmedics/view/mc_epsilon.fxml"));

            Scene sc = new Scene(second);
            stage.setScene(sc);
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void into_Eta(MouseEvent event) {

        Stage newStage = new Stage();
        Stage stage = (Stage) Alpha.getScene().getWindow();
        try {
            Parent second = FXMLLoader.load(getClass().getResource("/mathmedics/view/mc_eta.fxml"));

            Scene sc = new Scene(second);
            stage.setScene(sc);
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void into_Gamma(MouseEvent event) {

        Stage newStage = new Stage();
        Stage stage = (Stage) Alpha.getScene().getWindow();
        try {
            Parent second = FXMLLoader.load(getClass().getResource("/mathmedics/view/mc_gamma.fxml"));

            Scene sc = new Scene(second);
            stage.setScene(sc);
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void into_Lota(MouseEvent event) {

        Stage newStage = new Stage();
        Stage stage = (Stage) Alpha.getScene().getWindow();
        try {
            Parent second = FXMLLoader.load(getClass().getResource("/mathmedics/view/mc_lota.fxml"));

            Scene sc = new Scene(second);
            stage.setScene(sc);
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void into_Theta(MouseEvent event) {

        Stage newStage = new Stage();
        Stage stage = (Stage) Alpha.getScene().getWindow();
        try {
            Parent second = FXMLLoader.load(getClass().getResource("/mathmedics/view/mc_theta.fxml"));

            Scene sc = new Scene(second);
            stage.setScene(sc);
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void into_Zeta(MouseEvent event) {

        Stage newStage = new Stage();
        Stage stage = (Stage) Alpha.getScene().getWindow();
        try {
            Parent second = FXMLLoader.load(getClass().getResource("/mathmedics/view/mc_zeta.fxml"));

            Scene sc = new Scene(second);
            stage.setScene(sc);
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}