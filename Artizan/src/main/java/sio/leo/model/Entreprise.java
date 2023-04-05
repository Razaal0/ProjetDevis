/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sio.leo.model;

/**
 *
 * @author varela tavares
 */
public class Entreprise extends Client {

    private String Entreprise_ent_raisonSociale;
    private String Entreprise_ent_NomContact;
    private String Entreprise_ent_telContact;
    private String Entreprise_ent_mailContact;

    public Entreprise(String Entreprise_ent_raisonSociale, String Entreprise_ent_NomContact, String Entreprise_ent_telContact, String Entreprise_ent_mailContact, String Client_cli_ref, String Client_cli_adRue, String Client_cli_adBatiment, String Client_cli_CP, String Client_cli_Ville, String Client_cli_mail) {
        super(Client_cli_ref, Client_cli_adRue, Client_cli_adBatiment, Client_cli_CP, Client_cli_Ville, Client_cli_mail);
        this.Entreprise_ent_raisonSociale = Entreprise_ent_raisonSociale;
        this.Entreprise_ent_NomContact = Entreprise_ent_NomContact;
        this.Entreprise_ent_telContact = Entreprise_ent_telContact;
        this.Entreprise_ent_mailContact = Entreprise_ent_mailContact;
    }

    public String getEntreprise_ent_raisonSociale() {
        return Entreprise_ent_raisonSociale;
    }

    public void setEntreprise_ent_raisonSociale(String Entreprise_ent_raisonSociale) {
        this.Entreprise_ent_raisonSociale = Entreprise_ent_raisonSociale;
    }

    public String getEntreprise_ent_NomContact() {
        return Entreprise_ent_NomContact;
    }

    public void setEntreprise_ent_NomContact(String Entreprise_ent_NomContact) {
        this.Entreprise_ent_NomContact = Entreprise_ent_NomContact;
    }

    public String getEntreprise_ent_telContact() {
        return Entreprise_ent_telContact;
    }

    public void setEntreprise_ent_telContact(String Entreprise_ent_telContact) {
        this.Entreprise_ent_telContact = Entreprise_ent_telContact;
    }

    public String getEntreprise_ent_mailContact() {
        return Entreprise_ent_mailContact;
    }

    public void setEntreprise_ent_mailContact(String Entreprise_ent_mailContact) {
        this.Entreprise_ent_mailContact = Entreprise_ent_mailContact;
    }
    
}