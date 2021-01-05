package mathmedics.controller;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.util.Duration;
import mathmedics.model.DynamicViews;
import mathmedics.model.Grade;
import mathmedics.repository.memoryStudentRepository;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

import static java.sql.DriverManager.getConnection;

public class Grade_Controller_of_First implements Initializable {

    @FXML
    public BorderPane bp;

    @FXML
    public AnchorPane ap;

    @FXML
    public Label label_clock;
    Label clock = new Label();

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
    ObservableList<Grade> list = memoryrepository.findAll("where grade = 'first'");



    @Override
    public void initialize(URL url, ResourceBundle rb) {

        initClock();
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

    private void initClock() {

        Timeline clock = new Timeline(new KeyFrame(Duration.ZERO, e -> {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("  yyyy-MM-dd - HH:mm:ss a  ");
            label_clock.setText(LocalDateTime.now().format(formatter));
        }), new KeyFrame(Duration.seconds(1)));
        clock.setCycleCount(Animation.INDEFINITE);
        clock.play();
    }

}

