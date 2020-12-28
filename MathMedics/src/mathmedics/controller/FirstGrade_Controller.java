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
import mathmedics.model.FirstGrade;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class FirstGrade_Controller implements Initializable {

    @FXML
    public BorderPane bp;

    @FXML
    public AnchorPane ap;

    @FXML
    private TableView<FirstGrade> table;

    @FXML
    private TableColumn<FirstGrade, Integer> id;

    @FXML
    private TableColumn<FirstGrade, String> grade;

    @FXML
    private TableColumn<FirstGrade, String> MClass;

    @FXML
    private TableColumn<FirstGrade, String> name;

    @FXML
    private TableColumn<FirstGrade, String> birthday;

    @FXML
    private TableColumn<FirstGrade, String> gender;

    @FXML
    private TableColumn<FirstGrade, String> mobile;

    @FXML
    private TableColumn<FirstGrade, String> address;

    ObservableList<FirstGrade> list = FXCollections.observableArrayList(

            new FirstGrade(1, "First", "Alpha", "Adam", "2000.05.01", "Male",
                    "01034882241", "서울특별시 강남구"),
            new FirstGrade(2, "First", "Beta", "Brown", "2000.02.01", "Male",
                    "01087834626", "서울특별시 용산구"),
            new FirstGrade(3, "First", "Gamma", "Charlotte", "2000.03.24", "Female",
                    "01077265391", "서울특별시 서초구"),
            new FirstGrade(4, "First", "Delta", "Drake", "2000.06.11", "Male",
                    "01033261519", "서울특별시 강서구"),
            new FirstGrade(5, "First", "Epsilon", "Elizabeth", "2000.09.06", "Female",
                    "01029746565", "서울특별시 금천구"),
            new FirstGrade(6, "First", "Zeta", "Frank", "2000.01.02", "Male",
                    "01098371612", "서울특별시 양천구"),
            new FirstGrade(1, "First", "Eta", "Gloria", "2000.12.22", "Female",
                    "01066251856", "셔울특별시 중량구"),
            new FirstGrade(1, "First", "Theta", "Hayden", "2000.11.03", "Male",
                    "01038762511", "서울특별시 마포구"),
            new FirstGrade(1, "First", "Iota", "Isabel", "2000.08.25", "Female",
                    "01033271693", "서울특별시 서대문구")
    );


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        id.setCellValueFactory(new PropertyValueFactory<FirstGrade, Integer>("id"));
        grade.setCellValueFactory(new PropertyValueFactory<FirstGrade, String>("grade"));
        MClass.setCellValueFactory(new PropertyValueFactory<FirstGrade, String>("MClass"));
        name.setCellValueFactory(new PropertyValueFactory<FirstGrade, String>("name"));
        birthday.setCellValueFactory(new PropertyValueFactory<FirstGrade, String>("birthday"));
        gender.setCellValueFactory(new PropertyValueFactory<FirstGrade, String>("gender"));
        mobile.setCellValueFactory(new PropertyValueFactory<FirstGrade, String>("mobile"));
        address.setCellValueFactory(new PropertyValueFactory<FirstGrade, String>("address"));

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

