
package sio.leo.applidevis.model;


import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Devis {
    private int id;
    private String article;
    private int quantite;
    private String unite;
    private int PUHT;
    private int TxTVA;
    private int TTC;
    private String numDevis;
    private IntegerProperty idProperty;
    private StringProperty articleProperty;
    private IntegerProperty quantiteProperty;
    private StringProperty uniteProperty;
    private IntegerProperty PUHTProperty;
    private IntegerProperty TxTVAProperty;
    private IntegerProperty TTCProperty;
    private StringProperty numDevisProperty;
    
    
    public Devis (int id, String article, int quantite, String unite, int PUHT, int TxTVA, int TTC, String numDevis) {
        this.id = id;
        this.article = article;
        this.quantite = quantite;
        this.unite = unite;
        this.PUHT = PUHT;
        this.TxTVA = TxTVA;
        this.TTC = TTC;  
        this.numDevis = numDevis;
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

    public String getUnite() {
        return unite;
    }

    public void setUnite(String unite) {
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

    public String getNumDevis() {
        return numDevis;
    }

    public void setNumDevis(String numDevis) {
        this.numDevis = numDevis;
    }


    public Devis(Integer idProperty, String articleProperty, Integer quantiteProperty, String uniteProperty, Integer PUHTProperty, Integer TxTVAProperty, Integer TTCProperty, String numDevisProperty) {
        this.idProperty = new SimpleIntegerProperty(idProperty);
        this.articleProperty =new SimpleStringProperty (articleProperty);
        this.quantiteProperty = new SimpleIntegerProperty (quantiteProperty);
        this.uniteProperty = new SimpleStringProperty (uniteProperty);
        this.PUHTProperty = new SimpleIntegerProperty (PUHTProperty);
        this.TxTVAProperty = new SimpleIntegerProperty (TxTVAProperty);
        this.TTCProperty = new SimpleIntegerProperty(TTCProperty);
        this.numDevisProperty = new SimpleStringProperty(numDevisProperty);
    }
    
    public IntegerProperty getIdProperty() {
        return idProperty;
    }
      
    public StringProperty articleProperty() {
        return articleProperty;
    }
       
    public IntegerProperty quantiteProperty() {
        return quantiteProperty;
    }
       
    public StringProperty uniteProperty() {
        return uniteProperty;
    }
       
    public IntegerProperty PUHTProperty() {
        return PUHTProperty;
    }
       
    public IntegerProperty TxTVAProperty() {
        return TxTVAProperty;
    }
       
    public IntegerProperty TTCProperty() {
        return TTCProperty;
    }
       
    public StringProperty numDevisProperty() {
        return numDevisProperty;
    }

    @Override
    public String toString() {
        return "Devis{" + "id=" + id + ", article=" + article + ", quantite=" + quantite + ", unite=" + unite + ", PUHT=" + PUHT + ", TxTVA=" + TxTVA + ", TTC=" + TTC + ", numDevis=" + numDevis + ", idProperty=" + idProperty + ", articleProperty=" + articleProperty + ", quantiteProperty=" + quantiteProperty + ", uniteProperty=" + uniteProperty + ", PUHTProperty=" + PUHTProperty + ", TxTVAProperty=" + TxTVAProperty + ", TTCProperty=" + TTCProperty + ", numDevisProperty=" + numDevisProperty + '}';
    } 
}
