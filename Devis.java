
package sio.leo.applidevis.controller;


import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Devis {
    private int id;
    private String article;
    private int quantite;
    private int unite;
    private int PUHT;
    private int TxTVA;
    private int TTC;
    
    
    public Devis (int id, String article, int quantite, int unite, int PUHT, int TxTVA, int TTC) {
        this.id = id;
        this.article = article;
        this.quantite = quantite;
        this.unite = unite;
        this.PUHT = PUHT;
        this.TxTVA = TxTVA;
        this.TTC = TTC;      
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public int getUnite() {
        return unite;
    }

    public void setUnite(int unite) {
        this.unite = unite;
    }

    public int getPUHT() {
        return PUHT;
    }

    public void setPUHT(int PUHT) {
        this.PUHT = PUHT;
    }

    public int getTxTVA() {
        return TxTVA;
    }

    public void setTxTVA(int TxTVA) {
        this.TxTVA = TxTVA;
    }

    public int getTTC() {
        return TTC;
    }

    public void setTTC(int TTC) {
        this.TTC = TTC;
    }
    
    
    
    private IntegerProperty idProperty;
    private StringProperty articleProperty;
    private IntegerProperty quantiteProperty;
    private IntegerProperty uniteProperty;
    private IntegerProperty PUHTProperty;
    private IntegerProperty TxTVAProperty;
    private IntegerProperty TTCProperty;

    public Devis(Integer idProperty, String articleProperty, Integer quantiteProperty, Integer uniteProperty, Integer PUHTProperty, Integer TxTVAProperty, Integer TTCProperty) {
        this.idProperty = new SimpleIntegerProperty(idProperty);
        this.articleProperty =new SimpleStringProperty (articleProperty);
        this.quantiteProperty = new SimpleIntegerProperty (quantiteProperty);
        this.uniteProperty = new SimpleIntegerProperty (uniteProperty);
        this.PUHTProperty = new SimpleIntegerProperty (PUHTProperty);
        this.TxTVAProperty = new SimpleIntegerProperty (TxTVAProperty);
        this.TTCProperty = new SimpleIntegerProperty(TTCProperty);
    }
    
    public Integer getIdProperty() {
        return idProperty.get();
    }
    public void setIdProperty(Integer id) {
        this.idProperty.set(id);
    } 
    
    public void setArticleproperty(String articleProperty) {
        this.articleProperty.set(articleProperty);
    }    
    public String getArticleProperty() {
        return articleProperty.get();
    }    
    public StringProperty articleProperty() {
        return articleProperty;
    }
    
    public int getQuantiteProperty() {
        return quantiteProperty.get();
    }    
    public void setQuantiteproperty(int quantiteProperty) {
        this.quantiteProperty.set(quantiteProperty);
    }    
    public IntegerProperty quantiteProperty() {
        return quantiteProperty;
    }
    
    public int getUniteProperty() {
        return uniteProperty.get();
    }    
    public void setUniteProperty(int uniteProperty) {
        this.uniteProperty.set(uniteProperty);
    }    
    public IntegerProperty uniteProperty() {
        return uniteProperty;
    }
    
    public int getPUHTProperty() {
        return PUHTProperty.get();
    }    
    public void setPUHTProperty(int PUHTProperty) {
        this.PUHTProperty.set(PUHTProperty);
    }    
    public IntegerProperty PUHTProperty() {
        return PUHTProperty;
    }
    
    public int getTxTVAProperty() {
        return TxTVAProperty.get();
    }    
    public void setTxTVAProperty(int TxTVAProperty) {
        this.TxTVAProperty.set(TxTVAProperty);
    }    
    public IntegerProperty TxTVAProperty() {
        return TxTVAProperty;
    }
    
    public int getTTCProperty() {
        return TTCProperty.get();
    }    
    public void setTTCProperty(int TTCProperty) {
        this.TTCProperty.set(TTCProperty);
    }    
    public IntegerProperty TTCProperty() {
        return TTCProperty;
    }
}
