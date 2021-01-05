package mathmedics.controller;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.util.Duration;
import mathmedics.model.DynamicViews;

public class Sidebar_Controller implements Initializable {

    @FXML
    public BorderPane bp;

    @FXML
    public AnchorPane ap;

    @FXML
    public Label label_clock;
    Label clock = new Label();


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        initClock();
    }


    @FXML
    public void class_management(MouseEvent event) throws IOException {
        DynamicViews.loadBorderCenter(bp, "page_class_management");
    }

    @FXML
    public void class_list(MouseEvent event) throws IOException {
        DynamicViews.loadBorderCenter(bp, "page_class_list");
    }

    @FXML
    public void setting(MouseEvent event) throws IOException {
        DynamicViews.loadBorderCenter(bp, "page_setting");
    }

    @FXML
    public void dashboard(MouseEvent event) throws IOException {
        DynamicViews.loadBorderCenter(bp, "page_dashboard");
    }

    @FXML
    public void student_management(MouseEvent event) throws IOException {
        DynamicViews.loadBorderCenter(bp, "page_student_management");
    }

    @FXML
    public void student_list(MouseEvent event) throws IOException {
        DynamicViews.loadBorderCenter(bp, "page_student_list");
    }

    @FXML
    public void support(MouseEvent event) throws IOException {
        DynamicViews.loadBorderCenter(bp, "page_support");
    }

    private void initClock() {

        Timeline clock = new Timeline(new KeyFrame(Duration.ZERO, e -> {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("  yyyy-MM-dd - HH:mm:ss a  ");
            label_clock.setText(LocalDateTime.now().format(formatter));
        }), new KeyFrame(Duration.seconds(1)));
        clock.setCycleCount(Animation.INDEFINITE);
        clock.play();
    }

}

