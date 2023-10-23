/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pembayaranspp;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author JUNIARGO
 */
public class KoneksiDB {
    static Connection con;
   public static Connection getConnection() {
       
     try {
          con = DriverManager.getConnection("jdbc:mysql://localhost/ukk_spp","root","");         
     }catch (Exception e) {
         JOptionPane.showMessageDialog(null, "ERROR : Koneksi Gagal!");
         System.exit(0);
     }
       return con;
   }
}
