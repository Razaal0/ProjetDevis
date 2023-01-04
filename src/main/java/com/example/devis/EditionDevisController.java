package com.example.devis;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
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
    ScrollPane Scroll;
    @FXML
    GridPane ListeDevis;

    @FXML
    private ListView<Devis> searchResults = new ListView<>();

    public void initialize() {
        ObservableList<Devis> devis = FXCollections.observableArrayList();
        searchResults.setItems(devis);
    }

    @FXML
    public void ChercherDevis() throws SQLException {
        Scroll.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        String NumeroDevis = cherche_devis_num.getText();
        String ClientDevis = cherche_devis_client.getText();
        String BienDevis = cherche_devis_bien.getText();
        String DateDevis = cherche_devis_date.getText();
        String ObjetDevis = cherche_devis_objet.getText();
//        si NumeroDevis est vide, on cache le vbox
        if (NumeroDevis.isEmpty() && ClientDevis.isEmpty() && BienDevis.isEmpty() && DateDevis.isEmpty() && ObjetDevis.isEmpty()) {
                ListeDevis.setVisible(false);
                Scroll.setVisible(false);
        } else {
            ListeDevis.setVisible(true);
            Scroll.setVisible(true);
            List<Devis> devis = GetDevisByNum(NumeroDevis, ClientDevis, BienDevis, DateDevis, ObjetDevis);
//            si devis est vide, on affiche dans le vbox "Aucun devis trouvé"
            if (devis.isEmpty()) {
                Scroll.setVisible(false);
                ListeDevis.getChildren().clear();
                Result_False.setVisible(true);
                Result_False.setText("Aucun devis trouvé");
                Result_False.setStyle("-fx-font-size: 20px;");
            } else {
            Result_False.setVisible(false);
            ListeDevis.getChildren().clear();
            ObservableList<Devis> devisObservable = FXCollections.observableArrayList(devis);
            searchResults.setItems(devisObservable);
            Integer count = 0;
            for (Devis d : devis) {
                ListeDevis.add(createLabel(d.getDEV_NUMERO(), d.getDEV_NUMERO()), 0, count);
                ListeDevis.add(createLabel(d.getCLI_REF(), d.getDEV_NUMERO()), 1, count);
                ListeDevis.add(createLabel(d.getBIE_REF(), d.getDEV_NUMERO()), 2, count);
                ListeDevis.add(createLabel(d.getDEV_DATE(), d.getDEV_NUMERO()), 3, count);
                ListeDevis.add(createLabel(d.getDEV_OBJET(), d.getDEV_NUMERO()), 4, count);
                count++;
            }
            }
        }
    }

    private Label createLabel(String text, String id) {
        Label label = new Label(text);
        label.setStyle("-fx-font-size: 15px;-fx-background-color: #ffffff;");
        label.setMinWidth(179);
        label.setPrefWidth(179);
        label.setAlignment(javafx.geometry.Pos.CENTER);
        label.setId(id);
//        quand on passe la souris sur le label, on change la couleur de tous les label qui on cette id
        label.setOnMouseEntered(event -> {
            for (javafx.scene.Node node : ListeDevis.getChildren()) {
                if (node.getId() != null && node.getId().equals(id)) {
                    node.setStyle("-fx-background-color: #e6e6e6;-fx-font-size: 16px;");
//                    mettre le curseur en forme de main
                    node.setCursor(javafx.scene.Cursor.HAND);
                }
            }
        });
//        quand on sort la souris du label, on change la couleur de tous les label qui on cette id
        label.setOnMouseExited(event -> {
            for (javafx.scene.Node node : ListeDevis.getChildren()) {
                if (node.getId() != null && node.getId().equals(id)) {
                node.setStyle("-fx-font-size: 15px;-fx-background-color: #ffffff;");
//                mettre le curseur en forme normal
                node.setCursor(javafx.scene.Cursor.DEFAULT);
                }
            }
        });
//        mettre en place un listener sur le label
        label.setOnMouseClicked(event -> {
            System.out.println("Label clicked: " + label.getId());
        });
        return label;
    }
}