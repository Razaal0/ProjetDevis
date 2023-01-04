package model;

import javafx.scene.control.Label;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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

    public static List<Label> GetDevisByNum(String num, String id_client, String bien, String date, String objet) throws SQLException {
        PreparedStatement ps = connect.prepareStatement("SELECT * FROM DEVIS WHERE DEV_NUMERO LIKE ? AND CLI_REF LIKE ? AND BIE_REF LIKE ? AND DEV_DATE LIKE ? AND DEV_OBJET LIKE ? ORDER BY DEV_NUMERO ASC");
        ps.setString(1, "%"+num+"%");
        System.out.println(ps);
        ResultSet rs = ps.executeQuery();
        List<Label> devis = new ArrayList<>();
        while (rs.next()) {
            Label devisLabel = new Label();
            devisLabel.setText(rs.getString("DEV_NUMERO"));
            devisLabel.setStyle("-fx-font-size: 15px;");
            devisLabel.setPrefHeight(20);
            devis.add(devisLabel);
        }
        return devis;
    }
}
