package mathmedics.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;


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

    @FXML private TextField Atime_text;
    @FXML private TextField Adate_text;
    @FXML private TextField Aroom_text;
    @FXML private TextField Btime_text;
    @FXML private TextField Bdate_text;
    @FXML private TextField Broom_text;
    @FXML private TextField Ctime_text;
    @FXML private TextField Cdate_text;
    @FXML private TextField Croom_text;
    @FXML private TextField Dtime_text;
    @FXML private TextField Ddate_text;
    @FXML private TextField Droom_text;
    @FXML private TextField Etime_text;
    @FXML private TextField Edate_text;
    @FXML private TextField Eroom_text;
    @FXML private TextField Ftime_text;
    @FXML private TextField Fdate_text;
    @FXML private TextField Froom_text;
    @FXML private TextField Gtime_text;
    @FXML private TextField Gdate_text;
    @FXML private TextField Groom_text;
    @FXML private TextField Htime_text;
    @FXML private TextField Hdate_text;
    @FXML private TextField Hroom_text;
    @FXML private TextField Itime_text;
    @FXML private TextField Idate_text;
    @FXML private TextField Iroom_text;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void handleBtnRegActionA(ActionEvent e) {
        String content1 = Atime_text.getText();
        System.out.println("Class A");
        System.out.println("시간: " + content1);
        String content2 = Adate_text.getText();
        System.out.println("날짜: " + content2);
        String content3 = Aroom_text.getText();
        System.out.println("강의실: " + content3);
    }

    public void handleBtnRegActionB(ActionEvent e) {
        String content1 = Btime_text.getText();
        System.out.println("Class B");
        System.out.println("시간: " + content1);
        String content2 = Bdate_text.getText();
        System.out.println("날짜: " + content2);
        String content3 = Broom_text.getText();
        System.out.println("강의실: " + content3);
    }

    public void handleBtnRegActionC(ActionEvent e) {
        String content1 = Ctime_text.getText();
        System.out.println("Class C");
        System.out.println("시간: " + content1);
        String content2 = Cdate_text.getText();
        System.out.println("날짜: " + content2);
        String content3 = Croom_text.getText();
        System.out.println("강의실: " + content3);
    }

    public void handleBtnRegActionD(ActionEvent e) {
        String content1 = Dtime_text.getText();
        System.out.println("Class D");
        System.out.println("시간: " + content1);
        String content2 = Ddate_text.getText();
        System.out.println("날짜: " + content2);
        String content3 = Droom_text.getText();
        System.out.println("강의실: " + content3);
    }

    public void handleBtnRegActionE(ActionEvent e) {
        String content1 = Etime_text.getText();
        System.out.println("Class E");
        System.out.println("시간: " + content1);
        String content2 = Edate_text.getText();
        System.out.println("날짜: " + content2);
        String content3 = Eroom_text.getText();
        System.out.println("강의실: " + content3);
    }

    public void handleBtnRegActionF(ActionEvent e) {
        String content1 = Ftime_text.getText();
        System.out.println("Class F");
        System.out.println("시간: " + content1);
        String content2 = Fdate_text.getText();
        System.out.println("날짜: " + content2);
        String content3 = Froom_text.getText();
        System.out.println("강의실: " + content3);
    }

    public void handleBtnRegActionG(ActionEvent e) {
        String content1 = Gtime_text.getText();
        System.out.println("Class G");
        System.out.println("시간: " + content1);
        String content2 = Gdate_text.getText();
        System.out.println("날짜: " + content2);
        String content3 = Groom_text.getText();
        System.out.println("강의실: " + content3);
    }

    public void handleBtnRegActionH(ActionEvent e) {
        String content1 = Htime_text.getText();
        System.out.println("Class H");
        System.out.println("시간: " + content1);
        String content2 = Hdate_text.getText();
        System.out.println("날짜: " + content2);
        String content3 = Hroom_text.getText();
        System.out.println("강의실: " + content3);
    }

    public void handleBtnRegActionI(ActionEvent e) {
        String content1 = Itime_text.getText();
        System.out.println("Class I");
        System.out.println("시간: " + content1);
        String content2 = Idate_text.getText();
        System.out.println("날짜: " + content2);
        String content3 = Iroom_text.getText();
        System.out.println("강의실: " + content3);
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