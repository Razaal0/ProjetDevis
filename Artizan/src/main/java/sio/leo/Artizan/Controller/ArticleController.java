/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package sio.leo.Artizan.Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import sio.leo.Artizan.App;
import sio.leo.Artizan.Modele.Poste;

/**
 * FXML Controller class
 *
 * @author draperi
 */
public class ArticleController implements Initializable {
    
    @FXML
    private TableView<Poste> TablePoste;
    @FXML
    private TableColumn<Poste, Integer> PosteIdColonne;
    @FXML
    private TableColumn<Poste, String> PosteLibelleColonne;
    @FXML   
    private TableColumn<Poste, Integer> PostePUHTColonne;
    @FXML
    private TableColumn<Poste, Integer> PosteTotalColonne;
    
    private App app;

    public ArticleController(){
    }
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        PosteIdColonne.setCellValueFactory(cellData -> cellData.getValue().getPosteID_Property().asObject());
        PosteLibelleColonne.setCellValueFactory(cellData -> cellData.getValue().getPosteLibelle_Property());
        PostePUHTColonne.setCellValueFactory(cellData -> cellData.getValue().getPosteTotal_Property().asObject());
        PosteTotalColonne.setCellValueFactory(cellData -> cellData.getValue().getPostePUHT_Property().asObject());
        // TODO
        showPoste(null);
        TablePoste.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> showPoste(newValue));
    }   
    public void setApp(App app){
       this.app = app;
       TablePoste.setItems(app.getTabledata());
    }
    private void showPoste(Poste leposte) {
        if (leposte != null){
            PosteIdColonne.setText(Integer.toString(leposte.getPoste_pos_id()));
            PosteLibelleColonne.setText(leposte.getPoste_pos_libelle());
            PosteTotalColonne.setText(Integer.toString(leposte.getPostePUHT()));
            PostePUHTColonne.setText(Integer.toString(leposte.getPosteTotal()));          
        }else{
            PosteIdColonne.setText("");
            PosteLibelleColonne.setText("");
            PostePUHTColonne.setText("");
            PosteTotalColonne.setText("");
        }   
    }
  
}
