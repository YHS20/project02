package mathmedics.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import mathmedics.model.DynamicViews;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class CM_Controller implements Initializable {

    @FXML
    public BorderPane bp;

    @FXML
    public AnchorPane ap;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }


    @FXML
    public void cl_management(MouseEvent event) throws IOException {
        DynamicViews.loadBorderCenter(bp, "page_cl_management");
    }
}