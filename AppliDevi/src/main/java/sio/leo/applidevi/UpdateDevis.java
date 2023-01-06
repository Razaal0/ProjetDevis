/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sio.leo.applidevi;

/**
 *
 * @author FOUGERAS
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static sio.leo.applidevi.modele.DAOdevis.getConnection;
public class UpdateDevis {
          private static Connection cnx = getConnection();
    private static Statement smt = null;
    private static ResultSet rs = null;

    /**
     * Méthode permettant la connexion à la BDD
     * @return cnxGsb
     */
    
    public void getDeconnection() throws SQLException{
        cnx.close();
    }
    public ResultSet getTousLesDevis()throws Exception{
        rs=cnx.createStatement().executeQuery("SELECT * FROM devis");
        return rs;
    }
        public static PreparedStatement Update(int id)throws Exception{
 PreparedStatement p=cnx.prepareStatement("UPDATE devis SET Poste/Article= ? WHERE id = ?");
            p.setInt(1,id);
            p.executeUpdate();
            return p;
        }
                public static PreparedStatement Update1(int Qté)throws Exception{
 PreparedStatement p=cnx.prepareStatement("UPDATE devis SET Qté= ? WHERE id = ?");
            p.setInt(1,Qté);
            p.executeUpdate();
            return p;
        }
           public static PreparedStatement Update2(int Unité)throws Exception{
 PreparedStatement p=cnx.prepareStatement("UPDATE devis SET Unité= ? WHERE id = ?");
            p.setInt(1,Unité);
            p.executeUpdate();
            return p;
        }
                           public static PreparedStatement Update3(int PUHT)throws Exception{
 PreparedStatement p=cnx.prepareStatement("UPDATE devis SET PUHT= ? WHERE id = ?");
            p.setInt(1,PUHT);
            p.executeUpdate();
            return p;
        }
                                           public static PreparedStatement Update4(int TxTVA)throws Exception{
 PreparedStatement p=cnx.prepareStatement("UPDATE devis SET TxTVA= ? WHERE id = ?");
            p.setInt(1,TxTVA);
            p.executeUpdate();
            return p;
        }
                                                           public static PreparedStatement Update5(int TTC)throws Exception{
 PreparedStatement p=cnx.prepareStatement("UPDATE devis SET TTC= ? WHERE id = ?");
            p.setInt(1,TTC);
            p.executeUpdate();
            return p;
        }
                                                                   public static PreparedStatement create(int id)throws Exception{
            PreparedStatement p=cnx.prepareStatement("delete from 'devis' where id=?");
            p.setInt(1,id);
            p.executeUpdate();
            return p;
        }
        }

/**
 *
 * @author FOUGERAS
 */