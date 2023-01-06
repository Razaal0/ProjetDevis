
package sio.leo.applidevis.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import sio.leo.applidevis.model.*;
import sio.leo.applidevis.controller.*;



public class créationDevisDAO {
    private Connection cnx;
    
    public créationDevisDAO() {
        cnx = DAO.getConnection();
    }
    
    /**
     * Méthode permettant l'insertion des données de la création d'un devis dans la bdd 
     * @param catégorieAAjouter
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
}
