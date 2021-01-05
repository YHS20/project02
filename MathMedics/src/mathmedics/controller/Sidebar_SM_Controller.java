package mathmedics.controller;

import com.jfoenix.controls.JFXComboBox;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import mathmedics.member.Student;
import mathmedics.repository.memoryStudentRepository;
import mathmedics.service.MemberService;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.Locale;
import java.util.ResourceBundle;

public class Sidebar_SM_Controller implements Initializable {

    @FXML
    private JFXComboBox<String> combo_grade;

    @FXML
    private JFXComboBox<String> combo_gender;

    @FXML
    private JFXComboBox<String> combo_year;

    @FXML
    private JFXComboBox<String> combo_month;

    @FXML
    private JFXComboBox<String> combo_day;

    @FXML
    private TextField tf_name;

    @FXML
    private TextField tf_birthday;

    @FXML
    private TextField tf_mobile;

    @FXML
    private TextField tf_address;

    @FXML
    private Label print_info;

    @FXML
    void select_grade(ActionEvent event) {
    }

    @FXML
    void select_gender(ActionEvent event) {
    }

    @FXML
    void select_year(ActionEvent event) {
    }

    @FXML
    void select_month(ActionEvent event) {
    }

    @FXML
    void select_day(ActionEvent event) {
    }



    @FXML
    void save_btn(MouseEvent event) throws IOException, SQLException, ClassNotFoundException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/page_class_management.fxml"));

        int birthday = 0;
        String gender = "X";
        String mobile = "X";
        String save_result = "오류입니다. \n 이미 가입된 회원정보 이거나 맞지 않는 정보를 입력하였습니다.";

        String year = combo_year.getSelectionModel().getSelectedItem();
        String month = combo_month.getSelectionModel().getSelectedItem();
        String day = combo_day.getSelectionModel().getSelectedItem();
        String birthDay = year + month + day;

        String grade = combo_grade.getSelectionModel().getSelectedItem().toLowerCase();
        gender = combo_gender.getSelectionModel().getSelectedItem().toLowerCase();
        birthday = Integer.parseInt(birthDay);
        String name = tf_name.getText().replaceAll(" ", "");
        mobile = tf_mobile.getText().replaceAll("-", "").replaceAll(" ", "");
        String address = tf_address.getText();


        Student student = new Student(grade, name, birthday, gender, mobile, address);
        memoryStudentRepository memoryStudentRepository = new memoryStudentRepository();
        MemberService memberService = new MemberService(memoryStudentRepository);
        save_result = memberService.join(student);
//        ResultSet srs = memoryStudentRepository.findAll();

        print_info.setText(save_result);

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        // grade list
        ObservableList<String> grade_list = FXCollections.observableArrayList("First", "Second", "Third");
        combo_grade.setItems(grade_list);

        // gender list
        ObservableList<String> gender_list = FXCollections.observableArrayList("Female", "Male");
        combo_gender.setItems(gender_list);

        // year list
        ObservableList<String> year_list = FXCollections.observableArrayList("2005", "2006", "2007"
                , "2008", "2009", "2010");
        combo_year.setItems(year_list);

        // month list
        ObservableList<String> month_list = FXCollections.observableArrayList("01", "02", "03", "04"
                , "05", "06", "07", "08", "09", "10", "11", "12");
        combo_month.setItems(month_list);

        // day list
        ObservableList<String> day_list = FXCollections.observableArrayList("01", "02", "03", "04"
                , "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19"
                , "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31");
        combo_day.setItems(day_list);

    }
}
