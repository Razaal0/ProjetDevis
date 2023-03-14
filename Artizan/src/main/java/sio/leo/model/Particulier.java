/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sio.leo.model;

/**
 *
 * @author varela tavares
 */
public class Particulier extends Client {

    private String Particulier_par_civilite;
    private String Particulier_par_nom;

    public Particulier(String Particulier_par_civilite, String Particulier_par_nom, String Client_cli_ref, String Client_cli_adRue, String Client_cli_adBatiment, String Client_cli_CP, String Client_cli_Ville, String Client_cli_mail) {
        super(Client_cli_ref, Client_cli_adRue, Client_cli_adBatiment, Client_cli_CP, Client_cli_Ville, Client_cli_mail);
        this.Particulier_par_civilite = Particulier_par_civilite;
        this.Particulier_par_nom = Particulier_par_nom;
    }

    public String getParticulier_par_civilite() {
        return Particulier_par_civilite;
    }

    public void setParticulier_par_civilite(String Particulier_par_civilite) {
        this.Particulier_par_civilite = Particulier_par_civilite;
    }

    public String getParticulier_par_nom() {
        return Particulier_par_nom;
    }

    public void setParticulier_par_nom(String Particulier_par_nom) {
        this.Particulier_par_nom = Particulier_par_nom;
    }
    
    
}
