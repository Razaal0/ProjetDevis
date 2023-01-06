/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package dev.projetdevis;

import java.net.URL;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import modele.Bien;
import modele.BienDAO;
import modele.DAO;
import java.lang.String;


/**
 * FXML Controller class
 *
 * @author AIT
 */
public class SaveExitController {

    /**
     * Initializes the controller class.
     */
    
    public void initialize() {
        // TODO
    }
   
    @FXML
    private Button logoutButton;
    @FXML
    private AnchorPane scenePane;
    @FXML 
    private TextField Denomination;
    @FXML
    private TextField Batiment;
    @FXML
    private TextField Description;
    @FXML
    private TextField CodePostal;
    @FXML
    private TextField Adresse;
    @FXML
    private TextField Ville;
    @FXML
    private Button saveButton;
    @FXML
    private TextField refb;
    @FXML
    private TextField refc;
    Stage stage;
    
    @FXML
//    public void save(){
//        System.out.println("save data");
//        Bien.add(
//                new Bien(
//                txtChantier.getText(),
//                txtDescription.getText(),
//                txtAdresse.getAdresse())
//        
//        );
//        annuler();
//    }
    
    public void logout(ActionEvent event) {
        
        stage = (Stage) scenePane.getScene().getWindow();
        System.out.println("You successfully logged out!");
        
   
    } 
// //créer un bouton avec le texte "Enregistrer"
//    Button saveButton=new Button("Enregistrer");
//    //créer un événement de clic sur le bouton qui sauvegarde les données dans la base de données
//    saveButton.setOnAction(new EventHandler<ActionEvent>() {
//   {
//        @Override
//        public void handle(ActionEvent event) {
//        //connectez-vous à la base de données et enregistrez les données ici
//    }
//        return null;
//    });
//   
//    
//}
    @FXML
    public void save(ActionEvent event) throws SQLException {
        String refb_String = refb.getText();
        String refc_String = refc.getText();
        String denom_String = Denomination.getText();
        String desc_String = Description.getText();
        String adresse_String = Adresse.getText();
        String bat_String = Batiment.getText();
        String cp_String = CodePostal.getText();
        String ville_String = Ville.getText();
        Bien b= new Bien(refb_String, refc_String, denom_String, desc_String, adresse_String, bat_String, cp_String, ville_String);
        BienDAO bd = new BienDAO();
        bd.save(b);
        
    }
    
}
