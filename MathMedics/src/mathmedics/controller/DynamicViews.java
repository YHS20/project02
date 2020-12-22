package mathmedics.controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class DynamicViews {

    private DynamicViews() {

    }

    public static void loadBorderCenter(BorderPane borderPane, String resource) {
        try {
            Parent sidebar = FXMLLoader.load(new DynamicViews().getClass().getResource("/mathmedics/view/" + resource + ".fxml"));
            borderPane.setCenter(sidebar);
        } catch (IOException ex) {

        }

    }
}