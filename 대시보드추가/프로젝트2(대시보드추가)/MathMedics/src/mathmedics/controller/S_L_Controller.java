package mathmedics.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class S_L_Controller extends SidebarController implements Initializable {


    @FXML
    private VBox first;

    @FXML
    private VBox second;

    @FXML
    private VBox third;

    @FXML
    private HBox all;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }


    @FXML
    void into_FirstGrade(MouseEvent event) throws IOException {
        Stage newStage = new Stage();
        Stage stage = (Stage)first.getScene().getWindow();
        try {
            Parent second = FXMLLoader.load(getClass().getResource("/mathmedics/view/board_first_grade.fxml"));

            Scene sc = new Scene(second);
            stage.setScene(sc);
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

//        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/board_first_grade.fxml"));
//        DynamicViews.loadBorderCenter(bp, "board_first_grade");

    @FXML
    void into_SecondGrade(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/mathmedics/view/board_second_grade.fxml"));
//        DynamicViews.loadBorderCenter(bp, "board_second_grade");
    }

    @FXML
    void into_ThirdGrade(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/board_third_grade.fxml"));
//        DynamicViews.loadBorderCenter(bp, "board_third_grade");

    }

    @FXML
    void into_allGrades(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/board_all_grade.fxml"));
//        DynamicViews.loadBorderCenter(bp, "board_all_grades");

    }

    public void movePage() {
        // 새 스테이지 추가
        Stage newStage = new Stage();
        Stage stage = (Stage)first.getScene().getWindow();

        try {
            /*
            // 1. 새 스테이지 + 새 레이아웃
            // 새 스테이지 생성 -> 새레이아웃 추가 -> 기존 스테이지 닫기

            // 새 레이아웃 추가
            Parent second = FXMLLoader.load(getClass().getResource("second.fxml"));

            // 씬에 레이아웃 추가
            Scene sc = new Scene(second);

            // 씬을 스테이지에서 상영
            newStage.setScene(sc);
            newStage.show();

            // 기존 페이지 삭제
            stage.close();
//          stage.hide(); // 닫지 않고 잠시 숨김, .show()를 통해 다시 볼 수 있음
             */


            // 2. 기존 스테이지 + 새 레이아웃
            /* 새로만든 레이아웃을 기존 스테이지에 띄움 */
            Parent second = FXMLLoader.load(getClass().getResource("mathmedics/view/board_first_grade.fxml"));

            // 씬에 레이아웃 추가
            Scene sc = new Scene(second);
            stage.setScene(sc);
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}