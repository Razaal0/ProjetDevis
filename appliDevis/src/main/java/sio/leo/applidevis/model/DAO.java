package sio.leo.applidevis.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DAO {
    private static Connection cnx = null;
    private static Statement smt = null;

    /**
     * Méthode permettant la connexion à la BDD
     * @return cnx
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
}
