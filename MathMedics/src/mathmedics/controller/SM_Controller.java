package mathmedics.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import mathmedics.member.Student;
import mathmedics.repository.memoryStudentRepository;
import mathmedics.service.MemberService;

import java.io.IOException;
import java.sql.SQLException;

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
    void save_btn(MouseEvent event) throws IOException, SQLException, ClassNotFoundException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/page_cl_management.fxml"));

        int birthday = 0;
        String gender = "X";
        String mobile = "X";
        String save_result = "오류입니다. \n 이미 가입된 회원정보 이거나 맞지 않는 정보를 입력하였습니다.";

        String grade = tf_grade.getText().replaceAll(" ","").toLowerCase();
        String name = tf_name.getText().replaceAll(" ","");
        birthday = Integer.parseInt(tf_birthday.getText().replaceAll(" ",""));
        gender = tf_gender.getText().replaceAll(" ","");
        mobile = tf_mobile.getText().replaceAll("-","").replaceAll(" ","");
        String address = tf_address.getText();


        Student student = new Student(grade,name,birthday,gender,mobile,address);
        memoryStudentRepository memoryStudentRepository = new memoryStudentRepository();
        MemberService memberService = new MemberService(memoryStudentRepository);
        save_result = memberService.join(student);
//        ResultSet srs = memoryStudentRepository.findAll();

        print_info.setText(save_result);

    }

}
