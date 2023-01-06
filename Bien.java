/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modele;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author AIT
 */
public class Bien {
    private StringProperty REF;
    private StringProperty CLIREF;
    private StringProperty DENOMINATION;
    private StringProperty DESCRIPTION;
    private StringProperty ADRESSE;
    private StringProperty BATIMENT;
    private StringProperty CP;
    private StringProperty VILLE;
    
    private String ref;
    private String cliref;
    private String denomination;
    private String description;
    private String adresse;
    private String batiment;
    private String cp;
    private String ville;
   
    
        public Bien(String ref, String cliref, String denomination, String description, String adresse, String batiment, String cp, String ville){
        this.ref = ref;
        this.cliref = cliref;
        this.denomination = denomination; 
        this.description = description;
        this.adresse = adresse;
        this.batiment = batiment;
        this.cp = cp;
        this.ville = ville;
        
    }

    public void setCliref(String cliref) {
        this.cliref = cliref;
    }
    public void setPropertyCLIREF(String ref) {
        this.REF.set(ref);
    }
    public StringProperty getPropertyCLIREF() {
        return CLIREF;
    }

    public String getCLIREF() {
        return cliref;
    }

    public StringProperty getPropertyREF() {
        return REF;
    }
    public String getREF() {
        return ref;
    }
    public void setPropertyREF(String ref) {
        this.REF.set(ref);
    }
     public void setREF(String ref) {
        this.ref =ref;
    }
    public StringProperty getPropertyDENOMINATION() {
        return DENOMINATION;
    }
    public String getDENOMINATION() {
        return denomination;
    }
    public void setPropertyDENOMINATION(String denomination) {
        this.DENOMINATION.set(denomination);
    }
    public void setDENOMINATION(String denomination) {
        this.denomination=denomination;
    }
    public StringProperty getPropertyDESCRIPTION() {
        return DESCRIPTION;
    }
    public String getDESCRIPTION() {
        return description;
    }
    public void setPropertyDESCRIPTION(String description) {
        this.DESCRIPTION.set(description);
    }
    public void setDESCRIPTION(String description) {
        this.description=description;
    }
    public StringProperty getPropertyADRESSE() {
        return ADRESSE;
    }
    public String getADRESSE() {
        return adresse;
    }
    public void setPropertyADRESSE(String adresse) {
        this.ADRESSE.set(adresse);
    }
    public void setADRESSE(String adresse) {
        this.adresse=adresse;
    }
    public StringProperty getPropertyBATIMENT() {
        return BATIMENT;
    }
    public String getBATIMENT() {
        return batiment;
    }
    public void setPropertyBATIMENT(String batiment) {
        this.BATIMENT.set(batiment);
    }
    public void setBATIMENT(String batiment) {
        this.batiment=batiment;
    }
    public StringProperty getPropertyCP() {
        return CP;
    }
    public String getCP() {
        return cp;
    }
    public void setPropertyCP(String cp) {
        this.CP.set(cp);
    }
    public void setCP(String cp) {
        this.cp=cp;
    }
    public StringProperty getPropertyVILLE() {
        return VILLE;
    }
    public String getVILLE() {
        return ville;
    }
    public void setVILLE(String ville) {
        this.VILLE.set(ville);
    }
    public void setPropertyVILLE(String ville) {
        this.ville=ville;
    }

    @Override
    public String toString() {
        return "Bien{" + "REF=" + REF + ", CLIREF=" + CLIREF + ", DENOMINATION=" + DENOMINATION + ", DESCRIPTION=" + DESCRIPTION + ", ADRESSE=" + ADRESSE + ", BATIMENT=" + BATIMENT + ", CP=" + CP + ", VILLE=" + VILLE + ", ref=" + ref + ", cliref=" + cliref + ", denomination=" + denomination + ", description=" + description + ", adresse=" + adresse + ", batiment=" + batiment + ", cp=" + cp + ", ville=" + ville + '}';
    }

    
    
    
}
