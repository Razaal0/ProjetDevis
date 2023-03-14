/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package sio.leo.artizan;

import java.sql.SQLException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import sio.leo.model.*;

/**
 * FXML Controller class
 *
 * @author varela tavares
 */
public class ClientController {

    @FXML
    private AnchorPane Anchorpane;
    @FXML
    private TextField nom;
    @FXML
    private TextField prenom;
    @FXML
    private Button ok;
    @FXML
    private Label mail;
    @FXML
    private Label telephone;
    @FXML
    private Label Rue;
    @FXML
    private Label batiment;
    @FXML
    private Label codepostal;
    @FXML
    private Label ville;
    @FXML
    private TableView<Client> personTable;
    @FXML
    private TableColumn<Client, String> Refcolumn;
    @FXML
    private TableColumn<Client, String> RueColumn;

    private App App;
    private DAO_Client cdao = new DAO_Client();

    public ClientController() {
    }

    public void initialize() {
        Refcolumn.setCellValueFactory(cellData -> cellData.getValue().getcli_refProperty());
        RueColumn.setCellValueFactory(cellData -> cellData.getValue().getcli_adRueProperty());
        personTable.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> showPersonDetails(newValue));

    }

    public void setApp(App mainApp) {
        this.App = mainApp;
        personTable.setItems(mainApp.getPersonData());
    }
    
    private void showPersonDetails(Client client) {
        if (client != null) {
            mail.setText(client.getClient_cli_mail());
            Rue.setText(client.getClient_cli_adRue());
            codepostal.setText(client.getClient_cli_CP());
            batiment.setText(client.getClient_cli_adBatiment());
        } else {
            mail.setText("");
            Rue.setText("");
            codepostal.setText("");
            batiment.setText("");
        }
    }
}
