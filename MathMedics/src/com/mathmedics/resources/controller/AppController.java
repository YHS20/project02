/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mathmedics.resources.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author Studio
 */
public class AppController implements Initializable {

    @FXML
    private BorderPane border_pane;



    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void show_dashboard(MouseEvent event) throws IOException {
        Parent dashboard = FXMLLoader.load(getClass().getResources("/com/mathmedics/resources/views/dashboard.fxml"));
        
        
        border_pane.setCenter(dashboard);
    }

   
}
