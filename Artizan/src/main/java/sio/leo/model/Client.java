/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sio.leo.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author varela tavares
 */
public class Client {

    private final StringProperty Client_cli_ref;
    private final StringProperty Client_cli_adRue;
    private final StringProperty Client_cli_adBatiment;
    private final StringProperty Client_cli_CP;
    private final StringProperty Client_cli_Ville;
    private final StringProperty Client_cli_mail;

    public Client(String Client_cli_ref, String Client_cli_adRue, String Client_cli_adBatiment, String Client_cli_CP, String Client_cli_Ville, String Client_cli_mail) {
        this.Client_cli_ref = new SimpleStringProperty(Client_cli_ref);
        this.Client_cli_adRue = new SimpleStringProperty(Client_cli_adRue);
        this.Client_cli_adBatiment = new SimpleStringProperty(Client_cli_adBatiment);
        this.Client_cli_CP = new SimpleStringProperty(Client_cli_CP);
        this.Client_cli_Ville = new SimpleStringProperty(Client_cli_Ville);
        this.Client_cli_mail = new SimpleStringProperty(Client_cli_mail);
    }

    public Client() {
        this.Client_cli_ref = null;
        this.Client_cli_adRue = null;
        this.Client_cli_adBatiment = null;
        this.Client_cli_CP = null;
        this.Client_cli_Ville = null;
        this.Client_cli_mail = null;
    }

    public String getClient_cli_ref() {
        return Client_cli_ref.get();
    }

    public StringProperty getcli_refProperty() {
        return Client_cli_ref;
    }

    public void setClient_cli_ref(String Client_cli_ref) {
        this.Client_cli_ref.set(Client_cli_ref);
    }

    public String getClient_cli_adRue() {
        return Client_cli_adRue.get();
    }

    public StringProperty getcli_adRueProperty() {
        return Client_cli_adRue;
    }

    public void setClient_cli_adRue(String Client_cli_adRue) {
        this.Client_cli_adRue.set(Client_cli_adRue);
    }

    public String getClient_cli_adBatiment() {
        return Client_cli_adBatiment.get();
    }

    public StringProperty getcli_adBatimentProperty() {
        return Client_cli_adRue;
    }

    public void setClient_cli_adBatiment(String Client_cli_adBatiment) {
        this.Client_cli_adBatiment.set(Client_cli_adBatiment);
    }

    public String getClient_cli_CP() {
        return Client_cli_CP.get();
    }

    public StringProperty getcli_CProperty() {
        return Client_cli_CP;
    }

    public void setClient_cli_CP(String Client_cli_CP) {
        this.Client_cli_CP.set(Client_cli_CP);
    }

    public String getClient_cli_Ville() {
        return Client_cli_Ville.get();
    }

    public StringProperty getcli_VilleProperty() {
        return Client_cli_CP;
    }

    public void setClient_cli_Ville(String Client_cli_Ville) {
        this.Client_cli_Ville.set(Client_cli_Ville);
    }

    public String getClient_cli_mail() {
        return Client_cli_mail.get();
    }

    public StringProperty getcli_mailProperty() {
        return Client_cli_CP;
    }

    public void setClient_cli_mail(String Client_cli_mail) {
        this.Client_cli_mail.set(Client_cli_mail);
    }

}
