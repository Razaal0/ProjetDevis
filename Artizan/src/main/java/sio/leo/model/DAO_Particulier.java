/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sio.leo.model;

import java.sql.Connection;

/**
 *
 * @author catia
 */
public class DAO_Particulier {
    private Connection cnx;

    public DAO_Particulier() {
        cnx = DAO.getInstance();
    }
    
    
}