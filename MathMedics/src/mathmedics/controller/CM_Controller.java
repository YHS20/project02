package mathmedics.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import mathmedics.member.class_info;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class CM_Controller implements Initializable {

    @FXML
    private TextField ch01;

    @FXML
    private TextField ch02;

    @FXML
    private TextField ch03;

    @FXML
    private TextField ch04;

    @FXML
    private TextField ch05;

    @FXML
    private TextField ch06;

    @FXML
    private TextField ch07;

    @FXML
    private TextField ch08;

    @FXML
    private TextField ch09;

    @FXML
    private Button save;

    @FXML
    private Label print_info;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    void save_score(MouseEvent event) {



        int ch1 = Integer.parseInt(ch01.getText());
        int ch2 = Integer.parseInt(ch02.getText());
        int ch3 = Integer.parseInt(ch03.getText());
        int ch4 = Integer.parseInt(ch04.getText());
        int ch5 = Integer.parseInt(ch05.getText());
        int ch6 = Integer.parseInt(ch06.getText());
        int ch7 = Integer.parseInt(ch07.getText());
        int ch8 = Integer.parseInt(ch08.getText());
        int ch9 = Integer.parseInt(ch09.getText());

//        class_info cinfo = new class_info(ch1,ch2,ch3,ch4,ch5,ch6,ch7,ch8,ch9);


        print_info.setText("입력하신 성적은 데이터베이스에 성공적으로 저장 되었습니다.\r" +
                "성적정보 확인은 'Class List' 페이지에서 확인해 주세요.\r\r" +
                "\n[ Chapter01: " + ch1 + " ]" +
                "\n[ Chapter02: " + ch2 + " ]" +
                "\n[ Chapter03: " + ch3 + " ]" +
                "\n[ Chapter04: " + ch4 + " ]" +
                "\n[ Chapter05: " + ch5 + " ]" +
                "\n[ Chapter06: " + ch6 + " ]" +
                "\n[ Chapter07: " + ch7 + " ]" +
                "\n[ Chapter08: " + ch8 + " ]" +
                "\n[ Chapter09: " + ch9 + " ]");

    }

    @FXML
    void show_first(ActionEvent event) {

    }

    @FXML
    void show_second(ActionEvent event) {

    }

    @FXML
    void show_third(ActionEvent event) {

    }



}