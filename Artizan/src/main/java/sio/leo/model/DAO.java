/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sio.leo.model;

/**
 *
 * @author varela tavares
 */
public class DAO {

    private static String url = "jdbc:mysql://readergen.synology.me:3307/ProjetDevis";
    private static String user = "AdminDevis";
    private static String passwd = "bB4/kti-rA";
    static java.sql.Connection connect = getInstance();

    public static java.sql.Connection getInstance() {
        if (connect == null) {
            try {
                connect = java.sql.DriverManager.getConnection(url, user, passwd);
                System.out.println("connecté");
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
