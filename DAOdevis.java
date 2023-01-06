/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.leo.artizan;

import static com.leo.artizan.DAOdevis.getConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ghezelani
 */
public class DAOdevis {

    private static Connection cnx = getConnection();
    private static Statement smt = null;
//    private static ResultSet = null;
    //Pour exécuter des requêtes
    
    /**
     * Méthode servant à la connexion à la base de données
     * @return 
     */
     public static Connection getConnection(){
        try {
          cnx = (Connection) DriverManager.getConnection()
            "jdbc:mysql://localhost:3307/ProjetDevis",
            "root",
            "");
          // "mysql" après jdbc: et non "mariadb" pour établir la connexion
            System.out.println(" connx dans DAO " + cnx.getMetaData());
        }
        catch (SQLException e) {
            System.out.println("SQL Exception :  "+ e.toString());
        }
        return cnx;
    }
     public void getDeconnexion() throws SQLException{
         cnx.close();
     }
//     public ResultSet getTousLesDevis() throws Exception{
//         rs = cnx.createStatement().executeQuery("SELECT * FROM devis");
//         return rs;
//     }
}


