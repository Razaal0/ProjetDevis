/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sio.leo.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author draperi
 */
public class ArticlePosteDAO {
    private Connection cnx;

    public ArticlePosteDAO() {
        cnx = DAO.getInstance();
    }
    
    public ResultSet getArticle() throws SQLException {
        String rqt = "Select POS_ID,POS_LIBELLE,POS_TOTAL,POS_PUHT from POSTE";
        Statement stmt = cnx.createStatement();
        ResultSet rs = stmt.executeQuery(rqt);
        return rs;
    }   

    public void modifPoste(Poste poste) throws SQLException {
        String rqt = "Update poste set POS_ID=?,POS_LIBELLE=?,POS_PUHT,POS_TOTAL=? where POS_ID=?";
        PreparedStatement psmt = cnx.prepareStatement(rqt);
        psmt.setInt(1, poste.getPoste_pos_id());
        psmt.setString(2, poste.getPoste_pos_libelle());
        psmt.setInt(3, poste.getPostePUHT());
        psmt.setInt(4, poste.getPosteTotal());
        psmt.executeUpdate();
    }
}
