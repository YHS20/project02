package mathmedics.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import mathmedics.model.Grade;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class CM_Controller implements Initializable {
    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

    @FXML private ListView<String> listview;

    @FXML
    private MenuItem one;

    @FXML
    private MenuItem two;

    @FXML
    private MenuItem three;

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

    @FXML
    void save_score(MouseEvent event) {

        String ch1 = ch01.getText();
        String ch2 = ch02.getText();
        String ch3 = ch03.getText();
        String ch4 = ch04.getText();
        String ch5 = ch05.getText();
        String ch6 = ch06.getText();
        String ch7 = ch07.getText();
        String ch8 = ch08.getText();
        String ch9 = ch09.getText();

        System.out.println("Chapter01 성적: " + ch1);
        System.out.println("Chapter02 성적: " + ch2);
        System.out.println("Chapter03 성적: " + ch3);
        System.out.println("Chapter04 성적: " + ch4);
        System.out.println("Chapter05 성적: " + ch5);
        System.out.println("Chapter06 성적: " + ch6);
        System.out.println("Chapter07 성적: " + ch7);
        System.out.println("Chapter08 성적: " + ch8);
        System.out.println("Chapter09 성적: " + ch9);

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
        listview.getItems().addAll("one");


    }

    @FXML
    void show_second(ActionEvent event) {
        listview.getItems().addAll("two");

    }

    @FXML
    void show_third(ActionEvent event) {
        listview.getItems().addAll("three");

    }



}