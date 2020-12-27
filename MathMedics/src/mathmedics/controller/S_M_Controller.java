package mathmedics.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import mathmedics.member.Student;
import mathmedics.repository.memoryStudentRepository;

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


        String id = tf_id.getText().replaceAll(" ", "");
        String grade = tf_grade.getText().replaceAll(" ", "");
        String mClass = tf_class.getText().replaceAll(" ", "");
        String name = tf_name.getText().replaceAll(" ", "");
        String birthday = tf_birthday.getText().replaceAll(" ", "");
        String gender = tf_gender.getText().replaceAll(" ", "");
        String mobile = tf_mobile.getText().replaceAll(" ", "");
        String address = tf_address.getText().replaceAll(" ", "");

        Student student = new Student(grade,mClass,name,birthday,gender,mobile,address);
        memoryStudentRepository memoryStudentRepository = new memoryStudentRepository();
        memoryStudentRepository.save(student);
        
    }

}
