/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package sio.leo.artizan;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import sio.leo.model.Client;

/**
 * FXML Controller class
 *
 * @author catia
 */
public class AccueilController implements Initializable {

    private App App;
    @FXML
    private Button Client;
    @FXML
    private Button Articles;

    public AccueilController() {
    }
         /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 
    
    public void setApp(App mainApp) {
        this.App = mainApp;
    }
    
    @FXML
    private void handleClient() throws SQLException{
        App.showClient();
    }
      
    @FXML
    private void handlePoste() throws SQLException, IOException{
        App.showPoste();
    }
}
