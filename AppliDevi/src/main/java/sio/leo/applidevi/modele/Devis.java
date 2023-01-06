/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sio.leo.applidevi.modele;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Devis {
    private int id;
    private String PosteArticle;
    private int Qte;
    private int unité;
    private int PUHT;
    private int TxTVA;
    private int TTC;
    private IntegerProperty idProperty;
    private StringProperty PosteArticleProperty;
    private IntegerProperty QteProperty;
    private IntegerProperty unitéProperty;
    private IntegerProperty PUHTProperty;
    private IntegerProperty TxTVAProperty;
    private IntegerProperty TTCProperty;
    public Devis(int id, String PosteArticle, int Qté, int unité, int PUHT, int TxTVA, int TTC){
        this.id=id;
        this.PosteArticle=PosteArticle;
        this.Qte=Qte;
        this.unité=unité;
        this.PUHT=PUHT;
        this.TxTVA=TxTVA;
        this.TTC=TTC;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPosteArticleProperty() {
        return PosteArticleProperty.get();
    }

    public void setPosteArticle(String PosteArticleProperty) {
        this.PosteArticleProperty.set(PosteArticleProperty);
    }



    @Override
    public String toString() {
        return "Devis{" + "id=" + id + ", PosteArticle=" + PosteArticle + ", Qt\u00e9=" + Qte + ", unit\u00e9=" + unité + ", PUHT=" + PUHT + ", TxTVA=" + TxTVA + ", TTC=" + TTC + ", idProperty=" + idProperty + ", PosteArticleProperty=" + PosteArticleProperty + ", Qt\u00e9Property=" + QteProperty + ", unit\u00e9Property=" + unitéProperty + ", PUHTProperty=" + PUHTProperty + ", TxTVAProperty=" + TxTVAProperty + ", TTCProperty=" + TTCProperty + '}';
    }

 

    public int getUnité() {
        return unitéProperty.get();
    }

    public void setUnité(int unitéProperty) {
        this.unitéProperty.set(unitéProperty);
    }

    public IntegerProperty getUniteProperty(){
        return unitéProperty;
    }
     public int getQte() {
        return QteProperty.get();
    }

    public void setQte(int QteProperty) {
        this.QteProperty.set(QteProperty);
    }

    public IntegerProperty getQteProperty(){
        return QteProperty;
    }
    
     public int getPUHT() {
        return PUHTProperty.get();
    }

    public void setPUHT(int PUHTProperty) {
        this.PUHTProperty.set(PUHTProperty);
    }

    public IntegerProperty getPUHTProperty(){
        return PUHTProperty;
    }
     public int getTxTVA() {
        return TxTVAProperty.get();
    }

    public void setTxTVA(int TxTVAProperty) {
        this.TxTVAProperty.set(TxTVAProperty);
    }

    public IntegerProperty getTxTVAProperty(){
        return TxTVAProperty;
    }
    
     public int getTTC() {
        return TTCProperty.get();
    }

    public void setTTC(int TTCProperty) {
        this.TTCProperty.set(TTCProperty);
    }

    public IntegerProperty getTTCProperty(){
        return TTCProperty;
    }



  
     public Devis (Integer idProperty, String PosteArticleProperty, Integer QtéProperty, Integer unitéProperty, Integer PUHTProperty, Integer TxTVAProperty, Integer TTCProperty){
        this.idProperty= new SimpleIntegerProperty(idProperty);
        this.PosteArticleProperty= new SimpleStringProperty(PosteArticleProperty);
        this.QteProperty=new SimpleIntegerProperty(QtéProperty);
        this.unitéProperty=new SimpleIntegerProperty(unitéProperty);
        this.PUHTProperty=new SimpleIntegerProperty(PUHTProperty);
        this.TxTVAProperty=new SimpleIntegerProperty(TxTVAProperty);
        this.TTCProperty=new SimpleIntegerProperty(TTCProperty);
        
    }
}
