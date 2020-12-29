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

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class FirstGrade_Controller implements Initializable {

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

    ObservableList<Grade> list = FXCollections.observableArrayList(


            new Grade("First", "Alpha", "2000.05.01", "Male","01034882241", "서울특별시 강남구"),
            new Grade("First", "Brown", "2000.02.01", "Male", "01087834626", "서울특별시 용산구"),
            new Grade("First", "Charlotte", "2000.03.24", "Female","01077265391", "서울특별시 서초구"),
            new Grade("First", "Drake", "2000.06.11", "Male","01033261519", "서울특별시 강서구"),
            new Grade("First", "Elizabeth", "2000.09.06", "Female","01029746565", "서울특별시 금천구"),
            new Grade("First", "Frank", "2000.01.02", "Male","01098371612", "서울특별시 양천구"),
            new Grade("First", "Gloria", "2000.12.22", "Female","01066251856", "셔울특별시 중량구"),
            new Grade("First", "Hayden", "2000.11.03", "Male","01038762511", "서울특별시 마포구"),
            new Grade("First", "Ivan", "2000.08.25", "Female","01033271693", "서울특별시 서대문구")
    );


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
    public void cl_management(MouseEvent event) throws IOException {
        DynamicViews.loadBorderCenter(bp, "page_cl_management");
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
    public void stu_management(MouseEvent event) throws IOException {
        DynamicViews.loadBorderCenter(bp, "page_stu_management");
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

