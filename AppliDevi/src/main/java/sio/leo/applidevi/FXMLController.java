/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package sio.leo.applidevi;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import sio.leo.applidevi.modele.*;


/**
 * FXML Controller class
 *
 * @author FOUGERAS
 */
public class FXMLController {
@FXML
        private Label DateDevis;
@FXML
private Label DateDevis30;
@FXML
private Label DEV_NUMERO;
@FXML
private TextField Recherche;
@FXML
private GridPane Devis;
@FXML
private Label PosteArticle;
@FXML
private Label Qté;
@FXML
private Label Unité;
@FXML
private Label PUHT;
@FXML
private Label TxTVA;
@FXML
private Label TTC;
 private void showPersonDetails(Devis ledevis){
            if(ledevis!=null){
                PosteArticle.setText(ledevis.getPosteArticleProperty());
                Qté.setText(ledevis.getQteProperty().toString());
                Unité.setText(ledevis.getUniteProperty().toString());
                PUHT.setText(ledevis.getPUHTProperty().toString());
                TxTVA.setText(ledevis.getTxTVAProperty().toString());
                TTC.setText(ledevis.getTTCProperty().toString());
            }else{
                PosteArticle.setText("");
                Qté.setText("");
                Unité.setText("");
                PUHT.setText("");
                TxTVA.setText("");
                TTC.setText("");
                

    /**
     * Initializes the controller class.
     */

        // TODO
        
         
    } 
 }

}
