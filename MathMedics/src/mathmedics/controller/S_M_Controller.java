package mathmedics.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class S_M_Controller {

    @FXML
    private TextField tf_id;

    @FXML
    private TextField tf_grade;

    @FXML
    private TextField tf_class;

    @FXML
    private TextField tf_name;

    @FXML
    private TextField tf_birthday;

    @FXML
    private TextField tf_gender;

    @FXML
    private TextField tf_mobile;

    @FXML
    private TextField tf_address;



    @FXML
    void save_btn(MouseEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/page_cl_management.fxml"));

        String id = tf_id.getText();
        String grade = tf_grade.getText();
        String mClass = tf_class.getText();
        String name = tf_name.getText();
        String birthday = tf_birthday.getText();
        String gender = tf_gender.getText();
        String mobile = tf_mobile.getText();
        String address = tf_address.getText();

        System.out.println("아이디: " + id);
        System.out.println("학년: " + grade);
        System.out.println("보충수업반: " + mClass);
        System.out.println("이름: " + name);
        System.out.println("생일: " + birthday);
        System.out.println("성별: " + gender);
        System.out.println("전화: " + mobile);
        System.out.println("주소: " + address);

    }

}
