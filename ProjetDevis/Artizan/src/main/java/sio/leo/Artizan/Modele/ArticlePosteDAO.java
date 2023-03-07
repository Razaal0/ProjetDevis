/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sio.leo.Artizan.Modele;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static sio.leo.Artizan.Modele.DAO.getInstance;

/**
 *
 * @author draperi
 */
public class ArticlePosteDAO {
    private static Connection connx = getInstance();
    
    public ResultSet getArticle() throws SQLException {
        String rqt = "Select POS_ID,POS_LIBELLE,POS_TOTAL,POS_PUHT from POSTE";
        Statement stmt = connx.createStatement();
        ResultSet rs = stmt.executeQuery(rqt);

        return rs;
    }   
}
