/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modele;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import static modele.DAO.connect;

/**
 *
 * @author AIT
 */
public class BienDAO {
    
     public void save(Bien BIE) throws SQLException {
        String sql = "INSERT INTO BIEN (BIE_REF, CLI_REF, BIE_DENOMINATION, BIE_DESCRIPTION, BIE_ADRUE, BIE_ADBATIMENT, BIE_CP, BIE_VILLE) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement statement = connect.prepareStatement(sql);
        statement.setString(1, BIE.getREF());
        statement.setString(2, BIE.getCLIREF());
        statement.setString(3, BIE.getDENOMINATION());
        statement.setString(4, BIE.getDESCRIPTION());
        statement.setString(5, BIE.getADRESSE());
        statement.setString(6, BIE.getBATIMENT());
        statement.setString(7, BIE.getCP());
        statement.setString(8, BIE.getVILLE());
        statement.executeUpdate();
    }
    
}
