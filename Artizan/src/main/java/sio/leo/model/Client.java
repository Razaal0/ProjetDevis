/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sio.leo.model;

/**
 *
 * @author varela tavares
 */
public class Client {

    private int Client_cli_ref;
    private String Client_cli_adRue;
    private String Client_cli_adBatiment;
    private String Client_cli_CP;
    private String Client_cli_Ville;
    private String Client_cli_mail;

    public Client(int Client_cli_ref, String Client_cli_adRue, String Client_cli_adBatiment, String Client_cli_CP, String Client_cli_Ville, String Client_cli_mail) {
        this.Client_cli_ref = Client_cli_ref;
        this.Client_cli_adRue = Client_cli_adRue;
        this.Client_cli_adBatiment = Client_cli_adBatiment;
        this.Client_cli_CP = Client_cli_CP;
        this.Client_cli_Ville = Client_cli_Ville;
        this.Client_cli_mail = Client_cli_mail;
    }

    
    public int getClient_cli_ref() {
        return Client_cli_ref;
    }

    public void setClient_cli_ref(int Client_cli_ref) {
        this.Client_cli_ref = Client_cli_ref;
    }

    public String getClient_cli_adRue() {
        return Client_cli_adRue;
    }

    public void setClient_cli_adRue(String Client_cli_adRue) {
        this.Client_cli_adRue = Client_cli_adRue;
    }

    public String getClient_cli_adBatiment() {
        return Client_cli_adBatiment;
    }

    public void setClient_cli_adBatiment(String Client_cli_adBatiment) {
        this.Client_cli_adBatiment = Client_cli_adBatiment;
    }

    public String getClient_cli_CP() {
        return Client_cli_CP;
    }

    public void setClient_cli_CP(String Client_cli_CP) {
        this.Client_cli_CP = Client_cli_CP;
    }

    public String getClient_cli_Ville() {
        return Client_cli_Ville;
    }

    public void setClient_cli_Ville(String Client_cli_Ville) {
        this.Client_cli_Ville = Client_cli_Ville;
    }

    public String getClient_cli_mail() {
        return Client_cli_mail;
    }

    public void setClient_cli_mail(String Client_cli_mail) {
        this.Client_cli_mail = Client_cli_mail;
    }
    
    
}
