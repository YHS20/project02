package sample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.*;
import javafx.scene.layout.*;
import javafx.stage.Popup;

public class Controller implements Initializable {
	
	@FXML private BorderPane bp;
	@FXML private AnchorPane ap;
	@FXML Popup popup;
	@FXML private ImageView checkImageView;
	@FXML private TextField txtTitle1;
	@FXML private TextField txtTitle2;
	@FXML private TextField txtTitle3;
	@FXML private TextField txtTitle4;
	@FXML private TextField txtTitle5;
	@FXML private TextField txtTitle6;
	@FXML private TextField txtTitle7;
	@FXML private TextArea txtContent;
	@FXML private TextArea txtContent2;
	
	
	// sidebar(home������)���� ��ư�� Ŭ���Ҷ� ������ ��ȯ�Ҷ� �ʿ��� fxml
	@FXML private void homeClick(MouseEvent event) {
		bp.setCenter(ap);
	}
	@FXML private void page01Click(MouseEvent event) {
		loadPage("page01");
	}
	@FXML private void page02Click(MouseEvent event) {
		loadPage("page02");
	}
	@FXML private void page03Click(MouseEvent event) {
		loadPage("page03");
	}
	@FXML private void page04Click(MouseEvent event) {
		loadPage("page04");
	}
	
	// sidebar(home������)���� ��ư Ŭ���Ҷ� ������ ��ȯ�ϴ� �ڵ�
	private void loadPage(String page) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource(page + ".fxml"));
			bp.setCenter(root);
		} catch(IOException ex) {
			Logger.getLogger(Controller.class.getName()).log(Level.SEVERE,null,ex);
		}
	}
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
	}

	// page02(�л�����������)���� ��Ϲ�ư�� ���� �̺�Ʈ ó�� �ڵ�
	public void handleBtnRegAction1(ActionEvent e) {
		String content = txtTitle1.getText();
		System.out.println("�̸�: " + content);
		
	}
	public void handleBtnRegAction2(ActionEvent e) {
		String content = txtContent.getText();
		System.out.println("�޸�: " + content);
		
	}
	public void handleBtnRegAction3(ActionEvent e) {
		String content = txtTitle2.getText();
		System.out.println("1�г� 1�б�: " + content);
		
	}
	public void handleBtnRegAction4(ActionEvent e) {
		String content = txtTitle3.getText();
		System.out.println("1�г� 2�б�: " + content);
		
	}
	public void handleBtnRegAction5(ActionEvent e) {
		String content = txtTitle4.getText();
		System.out.println("2�г� 1�б�: " + content);
		
	}
	public void handleBtnRegAction6(ActionEvent e) {
		String content = txtTitle5.getText();
		System.out.println("2�г� 2�б�: " + content);
		
	}
	public void handleBtnRegAction7(ActionEvent e) {
		String content = txtTitle6.getText();
		System.out.println("3�г� 1�б�: " + content);
		
	}
	public void handleBtnRegAction8(ActionEvent e) {
		String content = txtTitle7.getText();
		System.out.println("3�г� 2�б�: " + content);
		
	}

	
	// page02(�л�����������)���� �����ư�� ���� �̺�Ʈ ó�� �ڵ�
	public void handleBtnRegAction9(ActionEvent e) {
		String content1 = txtTitle1.getText();
		System.out.println("�̸�: " + content1);
		
		String content2 = txtContent.getText();
		System.out.println("�޸�: " + content2);
		
		String content3 = txtTitle2.getText();
		System.out.println("1�г� 1�б�: " + content3);
		
		String content4 = txtTitle3.getText();
		System.out.println("1�г� 2�б�: " + content4);
		
		String content5 = txtTitle4.getText();
		System.out.println("2�г� 1�б�: " + content5);
		
		String content6 = txtTitle5.getText();
		System.out.println("2�г� 2�б�: " + content6);
		
		String content7 = txtTitle6.getText();
		System.out.println("3�г� 1�б�: " + content7);
		
		String content8 = txtTitle7.getText();
		System.out.println("3�г� 2�б�: " + content8);
	}

	
	// page04(��������������)���� ��Ϲ�ư�� ���� �̺�Ʈ ó�� �ڵ�
	public void handleBtnRegAction10(ActionEvent e) {
		String content = txtContent2.getText();
		System.out.println("�������� ����: " + content);
	}
	

}
