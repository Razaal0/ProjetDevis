package sio.leo.Artizan.Modele;

/**
 * ************************************************************************
 * Source File	: Poste.java Author : CN Project name : Accueil WinDesign V17*
 * Created : 29/11/2022 Modified : 30/11/2022 Description	: Definition of the
 * class Poste
 * ************************************************************************
 */
import java.util.*;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Poste {
    //Inners Classifiers

    //Attributes
    private final IntegerProperty Poste_pos_id;
    private final StringProperty Poste_pos_libelle;
    private final IntegerProperty Poste_pos_total;
    private final IntegerProperty Poste_pos_PUHT;

    public Poste(Integer Poste_pos_id, String Poste_pos_libelle, Integer Poste_pos_total, Integer Poste_pos_puHT) {
        this.Poste_pos_id = new SimpleIntegerProperty(Poste_pos_id);
        this.Poste_pos_libelle = new SimpleStringProperty(Poste_pos_libelle);
        this.Poste_pos_total = new SimpleIntegerProperty(Poste_pos_total);
        this.Poste_pos_PUHT =new SimpleIntegerProperty(Poste_pos_puHT);
    }

    //Attributes Association
    //Operations
    public int getPoste_pos_id() {
        return Poste_pos_id.get();
    }

    public IntegerProperty getPosteID_Property() {
        return Poste_pos_id;
    }

    public String getPoste_pos_libelle() {
        return Poste_pos_libelle.get();
    }
    public StringProperty getPosteLibelle_Property(){
        return Poste_pos_libelle;
    }

    public IntegerProperty getPosteTotal_Property() {
        return Poste_pos_total;
    }
    public int getPosteTotal(){
        return Poste_pos_total.get();
    }

    public IntegerProperty getPostePUHT_Property() {
        return Poste_pos_PUHT;
    }
    public int getPostePUHT(){
        return Poste_pos_PUHT.get();
    }
    @Override
    public String toString() {
        return "Poste{" + "Poste_pos_id=" + Poste_pos_id + ", Poste_pos_libelle=" + Poste_pos_libelle + ", Poste_pos_total=" + Poste_pos_total + ", Poste_pos_puHT=" + Poste_pos_PUHT + '}';
    }

} //End Class Poste

