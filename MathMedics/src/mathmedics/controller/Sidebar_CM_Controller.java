package mathmedics.controller;


import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import com.sun.javafx.collections.MappingChange;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import mathmedics.model.MC_Table;
import mathmedics.repository.memoryStudentRepository;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class Sidebar_CM_Controller implements Initializable {

    @FXML
    private MenuItem menu_alpha;

    @FXML
    private MenuItem menu_beta;

    @FXML
    private MenuItem menu_delta;

    @FXML
    private MenuItem menu_epsilon;

    @FXML
    private MenuItem menu_eta;

    @FXML
    private MenuItem menu_gamma;

    @FXML
    private MenuItem menu_lota;

    @FXML
    private MenuItem menu_theata;

    @FXML
    private MenuItem menu_zeta;


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

    @FXML
    private JFXTextField enter_name;

    @FXML
    private JFXComboBox<String> combo_grade;

    @FXML
    private JFXComboBox<String> combo_class;

    @FXML
    private JFXTextField enter_ch01;

    @FXML
    private JFXTextField enter_ch02;

    @FXML
    private JFXTextField enter_ch03;

    @FXML
    private JFXTextField enter_ch04;

    @FXML
    private JFXTextField enter_ch05;

    @FXML
    private JFXTextField enter_ch06;

    @FXML
    private JFXTextField enter_ch07;

    @FXML
    private JFXTextField enter_ch08;

    @FXML
    private JFXTextField enter_ch09;

    @FXML
    private Button btn_delete;

    @FXML
    private Button btn_add_new;

    @FXML
    private Button btn_edit;

    @FXML
    private Button btn_save;

    private FXMLLoader loader;
    private boolean EDIT=false, ADD=true;
    private MappingChange.Map<String, Object> map;


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

        ObservableList<String> grade_list = FXCollections.observableArrayList("First", "Second", "Third");
        combo_grade.setItems(grade_list);

        ObservableList<String> class_list = FXCollections.observableArrayList("alpha", "beta", "delta"
        , "epsilon", "eta", "gamma", "lota", "theta", "zeta");
        combo_class.setItems(class_list);

        menu_alpha.setOnAction(e->{
            replaceTableAlpha();
        });

        menu_beta.setOnAction(e->{
            replaceTableBeta();
        });

        menu_delta.setOnAction(e->{
            replaceTableDelta();
        });

        menu_epsilon.setOnAction(e->{
            replaceTableEpsilon();
        });

        menu_eta.setOnAction(e->{
            replaceTableEta();
        });

        menu_gamma.setOnAction(e->{
            replaceTableGamma();
        });

        menu_lota.setOnAction(e->{
            replaceTableLota();
        });

        menu_theata.setOnAction(e->{
            replaceTableTheta();
        });

        menu_zeta.setOnAction(e->{
            replaceTableZeta();
        });

//        btn_save.setOnAction(e->{
//            saveAccount();
//        });
//        btn_print_preview.setOnAction(e->{
//            printReport();
//        });
        btn_edit.setOnAction(e->{
            ADD = false;
            EDIT = true;
            editStudentAttribute();
        });

//        btn_add_new.setOnAction(e->{
//            EDIT = false;
//            ADD = true;
//            insertNewAccount();
//        });
//        btn_delete.setOnAction(e->{
//            deleteAccount();
//        });

    }

    // Table 불러오기 위한 메모리 스튜던트 레포지토리 오브젝트 생성
    memoryStudentRepository memoryrepository = new memoryStudentRepository();

    private void replaceTableAlpha() {
        ObservableList<MC_Table>  list = memoryrepository.findByclass("where Student_Class.className = 'Alpha'");
        table.setItems(list);
    }

    private void replaceTableBeta() {
        ObservableList<MC_Table>  list = memoryrepository.findByclass("where Student_Class.className = 'Beta'");
        table.setItems(list);
    }

    private void replaceTableDelta() {
        ObservableList<MC_Table>  list = memoryrepository.findByclass("where Student_Class.className = 'Delta'");
        table.setItems(list);
    }

    private void replaceTableEpsilon() {
        ObservableList<MC_Table>  list = memoryrepository.findByclass("where Student_Class.className = 'Epsilon'");
        table.setItems(list);
    }

    private void replaceTableEta() {
        ObservableList<MC_Table>  list = memoryrepository.findByclass("where Student_Class.className = 'Eta'");
        table.setItems(list);
    }

    private void replaceTableGamma() {
        ObservableList<MC_Table>  list = memoryrepository.findByclass("where Student_Class.className = 'Gamma'");
        table.setItems(list);
    }

    private void replaceTableLota() {
        ObservableList<MC_Table>  list = memoryrepository.findByclass("where Student_Class.className = 'Lota'");
        table.setItems(list);
    }

    private void replaceTableTheta() {
        ObservableList<MC_Table>  list = memoryrepository.findByclass("where Student_Class.className = 'Theta'");
        table.setItems(list);
    }

    private void replaceTableZeta() {
        ObservableList<MC_Table>  list = memoryrepository.findByclass("where Student_Class.className = 'Zeta'");
        table.setItems(list);
    }


    private void editStudentAttribute() { // for updating existing StudentAttribute
        MC_Table selected = table.getSelectionModel().getSelectedItem();
        combo_grade.getSelectionModel().select(selected.getGrade());
        combo_class.getSelectionModel().select(selected.getMClass());
        enter_name.setText(selected.getName());
        enter_ch01.setText(String.valueOf(selected.getCh1()));
        enter_ch02.setText(String.valueOf(selected.getCh2()));
        enter_ch03.setText(String.valueOf(selected.getCh3()));
        enter_ch04.setText(String.valueOf(selected.getCh4()));
        enter_ch05.setText(String.valueOf(selected.getCh5()));
        enter_ch06.setText(String.valueOf(selected.getCh6()));
        enter_ch07.setText(String.valueOf(selected.getCh7()));
        enter_ch08.setText(String.valueOf(selected.getCh8()));
        enter_ch09.setText(String.valueOf(selected.getCh9()));

    }


}