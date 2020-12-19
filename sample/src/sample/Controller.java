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
	
	
	// sidebar(home페이지)에서 버튼을 클릭할때 페이지 전환할때 필요한 fxml
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
	
	// sidebar(home페이지)에서 버튼 클릭할때 페이지 전환하는 코드
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

	// page02(학생관리페이지)에서 등록버튼에 대한 이벤트 처리 코드
	public void handleBtnRegAction1(ActionEvent e) {
		String content = txtTitle1.getText();
		System.out.println("이름: " + content);
		
	}
	public void handleBtnRegAction2(ActionEvent e) {
		String content = txtContent.getText();
		System.out.println("메모: " + content);
		
	}
	public void handleBtnRegAction3(ActionEvent e) {
		String content = txtTitle2.getText();
		System.out.println("1학년 1학기: " + content);
		
	}
	public void handleBtnRegAction4(ActionEvent e) {
		String content = txtTitle3.getText();
		System.out.println("1학년 2학기: " + content);
		
	}
	public void handleBtnRegAction5(ActionEvent e) {
		String content = txtTitle4.getText();
		System.out.println("2학년 1학기: " + content);
		
	}
	public void handleBtnRegAction6(ActionEvent e) {
		String content = txtTitle5.getText();
		System.out.println("2학년 2학기: " + content);
		
	}
	public void handleBtnRegAction7(ActionEvent e) {
		String content = txtTitle6.getText();
		System.out.println("3학년 1학기: " + content);
		
	}
	public void handleBtnRegAction8(ActionEvent e) {
		String content = txtTitle7.getText();
		System.out.println("3학년 2학기: " + content);
		
	}

	
	// page02(학생관리페이지)에서 저장버튼에 대한 이벤트 처리 코드
	public void handleBtnRegAction9(ActionEvent e) {
		String content1 = txtTitle1.getText();
		System.out.println("이름: " + content1);
		
		String content2 = txtContent.getText();
		System.out.println("메모: " + content2);
		
		String content3 = txtTitle2.getText();
		System.out.println("1학년 1학기: " + content3);
		
		String content4 = txtTitle3.getText();
		System.out.println("1학년 2학기: " + content4);
		
		String content5 = txtTitle4.getText();
		System.out.println("2학년 1학기: " + content5);
		
		String content6 = txtTitle5.getText();
		System.out.println("2학년 2학기: " + content6);
		
		String content7 = txtTitle6.getText();
		System.out.println("3학년 1학기: " + content7);
		
		String content8 = txtTitle7.getText();
		System.out.println("3학년 2학기: " + content8);
	}

	
	// page04(공지사항페이지)에서 등록버튼에 대한 이벤트 처리 코드
	public void handleBtnRegAction10(ActionEvent e) {
		String content = txtContent2.getText();
		System.out.println("공지사항 내용: " + content);
	}
	

}
