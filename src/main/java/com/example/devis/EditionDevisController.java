package com.example.devis;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

import java.sql.SQLException;
import java.util.List;

import static com.example.devis.DAO.GetDevisByNum;

public class EditionDevisController {

    @FXML
    TextField cherche_devis_num;
    @FXML
    Label Result_False;
    @FXML
    TextField cherche_devis_client;
    @FXML
    TextField cherche_devis_bien;
    @FXML
    TextField cherche_devis_date;
    @FXML
    TextField cherche_devis_objet;

    @FXML
    VBox ListeDevis_num;
    @FXML
    VBox ListeDevis_client;
    @FXML
    VBox ListeDevis_bien;
    @FXML
    VBox ListeDevis_date;
    @FXML
    VBox ListeDevis_objet;
    ListView<VBox> ListeDevis = new ListView<>();
    @FXML
    private ListView<Devis> searchResults = new ListView<>();

    public void initialize() {
        ObservableList<Devis> devis = FXCollections.observableArrayList();
        searchResults.setItems(devis);

        ListeDevis.getItems().add(ListeDevis_num);
        ListeDevis.getItems().add(ListeDevis_client);
        ListeDevis.getItems().add(ListeDevis_bien);
        ListeDevis.getItems().add(ListeDevis_date);
        ListeDevis.getItems().add(ListeDevis_objet);
    }

    @FXML
    public void ChercherDevis() throws SQLException {
        String NumeroDevis = cherche_devis_num.getText();
        String ClientDevis = cherche_devis_client.getText();
        String BienDevis = cherche_devis_bien.getText();
        String DateDevis = cherche_devis_date.getText();
        String ObjetDevis = cherche_devis_objet.getText();
//        si NumeroDevis est vide, on cache le vbox
        if (NumeroDevis.isEmpty() && ClientDevis.isEmpty() && BienDevis.isEmpty() && DateDevis.isEmpty() && ObjetDevis.isEmpty()) {
            for (VBox ld : ListeDevis.getItems()) {
                ld.setVisible(false);
            }
        } else {
            for (VBox ld : ListeDevis.getItems()) {
                ld.setVisible(true);
            }
            List<Devis> devis = GetDevisByNum(cherche_devis_num.getText(), cherche_devis_client.getText(), cherche_devis_bien.getText(), cherche_devis_date.getText(), cherche_devis_objet.getText());
//            si devis est vide, on affiche dans le vbox "Aucun devis trouvé"
            if (devis.isEmpty()) {
                clearListeDevis();
                Result_False.setVisible(true);
                Result_False.setText("Aucun devis trouvé");
                Result_False.setStyle("-fx-font-size: 20px;");
            } else {
            Result_False.setVisible(false);
            clearListeDevis();
            ObservableList<Devis> devisObservable = FXCollections.observableArrayList(devis);
            searchResults.setItems(devisObservable);

            for (Devis d : devis) {
                Label num = new Label(d.getDEV_NUMERO());
                Label client = new Label(d.getCLI_REF());
                Label bien = new Label(d.getBIE_REF());
                Label date = new Label(d.getDEV_DATE());
                Label objet = new Label(d.getDEV_OBJET());
                ListeDevis_num.getChildren().add(num);
                ListeDevis_client.getChildren().add(client);
                ListeDevis_bien.getChildren().add(bien);
                ListeDevis_date.getChildren().add(date);
                ListeDevis_objet.getChildren().add(objet);
            }
//            adapter la taille du vbox en fonction du nombre de devis, mettre une limite de 10 devis
            if (devis.size() == 1) {
                ListeDevis.setPrefHeight(30);
            } else if (devis.size() > 10) {
                ListeDevis.setPrefHeight(200);
            } else {
                ListeDevis.setPrefHeight(devis.size() * 28);
            }
            }
        }
    }

    private void clearListeDevis() {
        for (VBox ld : ListeDevis.getItems()) {
            ld.getChildren().clear();
        }
    }
}