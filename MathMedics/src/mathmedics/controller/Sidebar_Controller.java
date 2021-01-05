package mathmedics.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import mathmedics.model.DynamicViews;

public class Sidebar_Controller implements Initializable {

    @FXML
    public BorderPane bp;

    @FXML
    public AnchorPane ap;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
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


}

