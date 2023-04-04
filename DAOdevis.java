/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sio.leo.applidevi.modele;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author FOUGERAS
 */
public class DAOdevis {
        private static Connection cnx = getConnection();
    private static Statement smt = null;
    private static ResultSet rs = null;

    /**
     * Méthode permettant la connexion à la BDD
     * @return cnxGsb
     */
    public static Connection getConnection(){
        String url ="jdbc:mysql://localhost:3307/devistest";
        String loginBd = "root";
        String passwd="";
        try {
            cnx = (Connection) DriverManager.getConnection(url, loginBd, passwd);
            System.out.println("Connexion réussi");
        }    
        catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Connexion échoué");
        }
        return cnx;
    }
    public void getDeconnection() throws SQLException{
        cnx.close();
    }
}