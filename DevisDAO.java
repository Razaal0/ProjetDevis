
package sio.leo.applidevis.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import sio.leo.applidevis.model.*;



public class DevisDAO {
    private Connection cnx;
    
    public DevisDAO() {
        cnx = DAO.getConnection();
    }
    
    /**
     * Méthode permettant l'insertion des données de la création d'un devis dans la bdd 
     * à l'aide d'une procédure stockée
     * @return smt
     * @throws SQLException 
     */
//    public PreparedStatement getCreateDevis(String article,int quantite,int PUHT,int TTC) throws SQLException {
//        String req = "{call getInsertDevis(?, ?, ?, ?)}";
//        PreparedStatement smt = cnx.prepareStatement(req);
//        smt.setString(1, article);
//        smt.setInt(2, quantite);
//        smt.setInt(3, PUHT);
//        smt.setInt(4, TTC);
//        smt.executeUpdate();
//        return smt;
//    }
    
    
    public PreparedStatement getAjouterDevis (int dev_numero, LocalDate dev_date, String pos_libelle, int pos_puht, int quantite) throws SQLException {
        String req = "{call ajouter_devis(?,?,?,?,?)}";
        PreparedStatement smt = cnx.prepareStatement(req);
        smt.setInt(1, dev_numero);
        smt.setString(2, dev_date);
        smt.setString(3, pos_libelle);
        smt.setInt(4, pos_puht);
        smt.setInt(5, quantite);        
        smt.executeUpdate();
        return smt;
    }
}
