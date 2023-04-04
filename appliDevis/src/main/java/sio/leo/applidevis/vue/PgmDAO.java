/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sio.leo.applidevis.vue;

import java.sql.SQLException;
import sio.leo.applidevis.model.DevisDAO;
import sio.leo.applidevis.model.DAO;

public class PgmDAO {

    
    public static void main(String[] args) throws SQLException {
        DAO.getConnection();
        DevisDAO devis = new DevisDAO();
        devis.getCreateDevis("Sacha",200,1000,800,545,700);
    }
    
}
