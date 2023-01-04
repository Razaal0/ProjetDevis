package com.example.devis;

import javafx.scene.control.Label;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DAO {
    // connexion à la base de données
    // Page de connexion https://readergen.synology.me/phpmyadmin
    private static String url = "jdbc:mysql://2.15.160.55:3307/ProjetDevis";
    private static String user = "AdminDevis";
    private static String passwd = "bB4/kti-rA";
    static java.sql.Connection connect = getInstance();


    public static java.sql.Connection getInstance() {
        if (connect == null) {
            try {
                connect = java.sql.DriverManager.getConnection(url, user, passwd);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return connect;
    }

    public static void close() {
        if (connect != null) {
            try {
                connect.close();
            } catch (java.sql.SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<Devis> GetDevisByNum(String num, String id_client, String bien, String date, String objet) throws SQLException {
        PreparedStatement ps = connect.prepareStatement("SELECT * FROM `DEVIS` WHERE `DEV_NUMERO` LIKE ? AND `CLI_REF` LIKE ? AND `BIE_REF` LIKE ? AND `DEV_DATE` LIKE ? AND `DEV_OBJET` LIKE ? ORDER BY `DEV_NUMERO` ASC");
        ps.setString(1, "%"+num+"%");
        ps.setString(2, "%"+id_client+"%");
        ps.setString(3, "%"+bien+"%");
        ps.setString(4, "%"+date+"%");
        ps.setString(5, "%"+objet+"%");
        ResultSet rs = ps.executeQuery();

        List<Devis> devis = new ArrayList<>();
        while (rs.next()) {
            Integer DEV_NUMERO = rs.getInt("DEV_NUMERO");
            String CLI_REF = rs.getString("CLI_REF");
            String BIE_REF = rs.getString("BIE_REF");
            String DEV_DATE = rs.getString("DEV_DATE");
            String DEV_OBJET = rs.getString("DEV_OBJET");
            devis.add(new Devis(DEV_NUMERO, CLI_REF, BIE_REF, DEV_DATE, DEV_OBJET));
        }
        return devis;
    }
}