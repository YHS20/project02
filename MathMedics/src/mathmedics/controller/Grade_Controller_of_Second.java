package mathmedics.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import mathmedics.model.DynamicViews;
import mathmedics.model.Grade;
import mathmedics.repository.memoryStudentRepository;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Grade_Controller_of_Second implements Initializable {

    @FXML
    public BorderPane bp;

    @FXML
    public AnchorPane ap;

    @FXML
    private TableView<Grade> table;

    @FXML
    private TableColumn<Grade, String> grade;

    @FXML
    private TableColumn<Grade, String> name;

    @FXML
    private TableColumn<Grade, String> birthday;

    @FXML
    private TableColumn<Grade, String> gender;

    @FXML
    private TableColumn<Grade, String> mobile;

    @FXML
    private TableColumn<Grade, String> address;

    memoryStudentRepository memoryrepository = new memoryStudentRepository();
    ObservableList<Grade> list = memoryrepository.findAll("where grade = 'second'");


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        grade.setCellValueFactory(new PropertyValueFactory<Grade, String>("grade"));
        name.setCellValueFactory(new PropertyValueFactory<Grade, String>("name"));
        birthday.setCellValueFactory(new PropertyValueFactory<Grade, String>("birthday"));
        gender.setCellValueFactory(new PropertyValueFactory<Grade, String>("gender"));
        mobile.setCellValueFactory(new PropertyValueFactory<Grade, String>("mobile"));
        address.setCellValueFactory(new PropertyValueFactory<Grade, String>("address"));

        table.setItems(list);
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

