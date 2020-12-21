package mathmedics.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

public class SidebarController implements Initializable {

    @FXML
    private BorderPane bp;
    @FXML
    private AnchorPane ap;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void welcome(MouseEvent event) {
        bp.setCenter(ap);
    }

    @FXML
    private void dashboard(MouseEvent event) {
        loadPage("page_dashboard");
    }

    @FXML
    private void student_list(MouseEvent event) {
        loadPage("page_student_list");
    }

    @FXML
    private void stu_management(MouseEvent event) {
        loadPage("page_stu_management");
    }

    @FXML
    private void class_list(MouseEvent event) {
        loadPage("page_class_list");
    }

    @FXML
    private void cl_management(MouseEvent event) {
        loadPage("page_cl_management");
    }

    @FXML
    private void support(MouseEvent event) {
        loadPage("page_support");
    }

    @FXML
    private void setting(MouseEvent event) {
        loadPage("page_setting");
    }

    private void loadPage (String page) {
        Parent root = null;

        try {
            root = FXMLLoader.load(getClass().getResource("/mathmedics/view/" + page + ".fxml"));
        } catch (IOException ex) {
            Logger.getLogger(SidebarController.class.getName()).log(Level.SEVERE, null, ex);
        }

        bp.setCenter(root);
    }

}
