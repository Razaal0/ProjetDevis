package com.example.devis;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {
    // connexion à la base de données
    // Page de connexion https://readergen.synology.me/phpmyadmin
    private static String url = "jdbc:mysql://readergen.synology.me:3307/ProjetDevis";
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
}
