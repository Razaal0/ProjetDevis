
package sio.leo.applidevis.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import sio.leo.applidevis.model.*;



public class DevisDAO {
    private Connection cnx;
    
    public DevisDAO() {
        cnx = DAO.getConnection();
    }
    
    /**
     * Méthode permettant l'insertion des données de la création d'un devis dans la bdd 
     * @param 
     * @return smt
     * @throws SQLException 
     */
    public PreparedStatement getCreateDevis(String article,int quantite,int unite,int PUHT,int TxTVA,int TTC) throws SQLException {
        String req = "{call getInsertDevis(?, ?, ?, ?, ?, ?)}";
        PreparedStatement smt = cnx.prepareStatement(req);
        smt.setString(1, article);
        smt.setInt(2, quantite);
        smt.setInt(3, unite);
        smt.setInt(4, PUHT);
        smt.setInt(5, TxTVA);
        smt.setInt(6, TTC);
        smt.executeUpdate();
        return smt;
    }
    
    /**
     * Méthode permettant de prendre la date actuel pour la création du numDevis
     * @return dateDevos
     * @throws SQLException 
     */
//    public static LocalDate getDateActuel() throws SQLException {
//       LocalDate dateDevis = LocalDate.now();
//       return dateDevis;
//    }
    
}
