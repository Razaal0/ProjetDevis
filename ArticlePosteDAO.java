/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sio.leo.model;

import java.sql.Connection;
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
}
