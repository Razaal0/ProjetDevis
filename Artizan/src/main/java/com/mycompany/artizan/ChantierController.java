/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.artizan;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author AZZEDDINE
 */
public class ChantierController {

    @FXML
    private Button button01;
    
    @FXML
    public void ButtonAddChantier() throws IOException {
        App.setRoot("NouveauChantier");
        // Gestion de l'événement du clic sur le bouton
        button01.setOnAction(e -> {
            // Chargement de la seconde scène depuis le fichier FXML
            Parent scene2Parent = null;
            try {
                scene2Parent = FXMLLoader.load(getClass().getResource("NouveauChantier.fxml"));
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
    }
     @FXML

// BOUTON SAUVEGARDER     
//     public void save(ActionEvent event) throws SQLException {
//        String refb_String = refb.getText();
//        String refc_String = refc.getText();
//        String denom_String = Denomination.getText();
//        String desc_String = Description.getText();
//        String adresse_String = Adresse.getText();
//        String bat_String = Batiment.getText();
//        String cp_String = CodePostal.getText();
//        String ville_String = Ville.getText();
//        Bien b= new Bien(refb_String, refc_String, denom_String, desc_String, adresse_String, bat_String, cp_String, ville_String);
//        BienDAO bd = new BienDAO();
//        bd.save(b);
        
    }
}
