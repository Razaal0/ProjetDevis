package com.example.devis;

public class Devis {
    private Integer DEV_NUMERO;
    private String CLI_REF;
    private String BIE_REF;
    private String DEV_DATE;
    private String DEV_OBJET;
    public Devis(Integer DEV_NUMERO, String CLI_REF, String BIE_REF, String DEV_DATE, String DEV_OBJET) {
        this.DEV_NUMERO = DEV_NUMERO;
        this.CLI_REF = CLI_REF;
        this.BIE_REF = BIE_REF;
        this.DEV_DATE = DEV_DATE;
        this.DEV_OBJET = DEV_OBJET;
    }

    public String getDEV_NUMERO() {
        return String.valueOf(this.DEV_NUMERO);
    }

    public String getCLI_REF() {
        return CLI_REF;
    }

    public String getBIE_REF() {
        return BIE_REF;
    }

    public String getDEV_DATE() {
        return DEV_DATE;
    }

    public String getDEV_OBJET() {
        return DEV_OBJET;
    }

    public void setDEV_NUMERO(Integer DEV_NUMERO) {
        this.DEV_NUMERO = DEV_NUMERO;
    }

    public void setCLI_REF(String CLI_REF) {
        this.CLI_REF = CLI_REF;
    }

    public void setBIE_REF(String BIE_REF) {
        this.BIE_REF = BIE_REF;
    }

    public void setDEV_DATE(String DEV_DATE) {
        this.DEV_DATE = DEV_DATE;
    }

    public void setDEV_OBJET(String DEV_OBJET) {
        this.DEV_OBJET = DEV_OBJET;
    }
}