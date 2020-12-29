package mathmedics.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import mathmedics.model.DynamicViews;
import mathmedics.model.MC_Table;
import mathmedics.repository.memoryStudentRepository;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MC_Lota_Controller implements Initializable {

    @FXML
    private BorderPane bp;

    @FXML
    private TextField tf_search;

    @FXML
    private ImageView search;

    @FXML
    private TableView<MC_Table> table;

    @FXML
    private TableColumn<MC_Table, String> grade;

    @FXML
    private TableColumn<MC_Table, String> MClass;

    @FXML
    private TableColumn<MC_Table, String> name;

    @FXML
    private TableColumn<MC_Table, Integer> ch1;

    @FXML
    private TableColumn<MC_Table, Integer> ch2;

    @FXML
    private TableColumn<MC_Table, Integer> ch3;

    @FXML
    private TableColumn<MC_Table, Integer> ch4;

    @FXML
    private TableColumn<MC_Table, Integer> ch5;

    @FXML
    private TableColumn<MC_Table, Integer> ch6;

    @FXML
    private TableColumn<MC_Table, Integer> ch7;

    @FXML
    private TableColumn<MC_Table, Integer> ch8;

    @FXML
    private TableColumn<MC_Table, Integer> ch9;


    memoryStudentRepository memoryrepository = new memoryStudentRepository();
    ObservableList<MC_Table>  list = memoryrepository.findByclass("where Student_Class.className = 'Lota'");



    @Override
    public void initialize(URL url, ResourceBundle rb) {

        ch1.setCellValueFactory(new PropertyValueFactory<MC_Table, Integer>("ch1"));
        ch2.setCellValueFactory(new PropertyValueFactory<MC_Table, Integer>("ch2"));
        ch3.setCellValueFactory(new PropertyValueFactory<MC_Table, Integer>("ch3"));
        ch4.setCellValueFactory(new PropertyValueFactory<MC_Table, Integer>("ch4"));
        ch5.setCellValueFactory(new PropertyValueFactory<MC_Table, Integer>("ch5"));
        ch6.setCellValueFactory(new PropertyValueFactory<MC_Table, Integer>("ch6"));
        ch7.setCellValueFactory(new PropertyValueFactory<MC_Table, Integer>("ch7"));
        ch8.setCellValueFactory(new PropertyValueFactory<MC_Table, Integer>("ch8"));
        ch9.setCellValueFactory(new PropertyValueFactory<MC_Table, Integer>("ch9"));
        grade.setCellValueFactory(new PropertyValueFactory<MC_Table, String>("grade"));
        MClass.setCellValueFactory(new PropertyValueFactory<MC_Table, String>("MClass"));
        name.setCellValueFactory(new PropertyValueFactory<MC_Table, String>("name"));


        table.setItems(list);
    }

    @FXML
    void find_data(MouseEvent event) {

    }

    @FXML
    void delete_row(MouseEvent event) {

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

