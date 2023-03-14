/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sio.leo.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author varela tavares
 */
public class DAO_Client {

    private Connection cnx;

    public DAO_Client() {
        cnx = DAO.getInstance();
    }

    public ResultSet getClient() throws SQLException {
        String rqt = "Select * from CLIENT ";
        Statement psmt = cnx.createStatement();
        ResultSet rs = psmt.executeQuery(rqt);
        return rs;
    }

    public PreparedStatement ajoutclients(Client client) throws SQLException {
        String rqt = "Insert into personne(firstName,lastName,street,postalCode,city,birthday) values(?,?,?,?,?,?)";
        PreparedStatement psmt = cnx.prepareStatement(rqt);
        psmt.setString(1, client.getClient_cli_adRue());
        psmt.setString(2, client.getClient_cli_adBatiment());
        psmt.setString(3, client.getClient_cli_CP());
        psmt.setString(4, client.getClient_cli_Ville());
        psmt.setString(5, client.getClient_cli_mail());
        psmt.executeUpdate();
        return psmt;
    }
}
