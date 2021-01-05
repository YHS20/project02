package mathmedics;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("view/sidebar.fxml"));
        primaryStage.setTitle("Math Medics");
//        primaryStage.setScene(new Scene(root, 900, 600));
        Scene scene = new Scene(root, 900, 600);
        scene.getStylesheets().addAll(this.getClass().getResource("css/custom-theme.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}

