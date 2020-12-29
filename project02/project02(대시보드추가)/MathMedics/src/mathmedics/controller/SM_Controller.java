package mathmedics.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class SM_Controller {

    @FXML
    private TextField tf_grade;

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
    private Label print_info;



    @FXML
    void save_btn(MouseEvent event) throws IOException {

        String grade = tf_grade.getText();
        String name = tf_name.getText();
        String birthday = tf_birthday.getText();
        String gender = tf_gender.getText();
        String mobile = tf_mobile.getText();
        String address = tf_address.getText();

        System.out.println("학년: " + grade);
        System.out.println("이름: " + name);
        System.out.println("생일: " + birthday);
        System.out.println("성별: " + gender);
        System.out.println("전화: " + mobile);
        System.out.println("주소: " + address);

        print_info.setText("입력하신 정보는 데이터베이스에 성공적으로 저장 되었습니다.\r" +
                "학생정보 확인은 'Student List' 페이지에서 확인해 주세요.\r\r" +
                "\n[ 학년: " + grade + " ]" +
                "\n[ 이름: " + name + " ]" +
                "\n[ 생일: " + birthday + " ]" +
                "\n[ 성별: " + gender + " ]" +
                "\n[ 전화: " + mobile + " ]" +
                "\n[ 주소: " + address + " ]");

//        int ind_id = Integer.parseInt(id);
//        System.out.println(int_id);

    }

}
