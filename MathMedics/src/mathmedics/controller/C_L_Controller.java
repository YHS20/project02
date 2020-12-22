package mathmedics.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class C_L_Controller implements Initializable {

    @FXML
    public BorderPane bp;

    @FXML
    public AnchorPane ap;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }


    @FXML
    public void class_list(MouseEvent event) throws IOException {
        DynamicViews.loadBorderCenter(bp, "page_class_list");
    }
}