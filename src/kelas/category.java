/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kelas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author FADHILA
 */
public class category {
    int category_id;
    String category_name;
  private Connection konek;
    
    private PreparedStatement ps;
    private Statement st;
    private ResultSet rs;
    private String Query;
    
      public category() throws SQLException{
        koneksi koneksi = new koneksi();
        konek = koneksi.konekDB();
        
    }
    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }
    
    public void tambahCategory(){
        Query = "INSERT INTO category VALUES (?,?)";
        
        try{
            
            ps = konek.prepareStatement(Query);
            
            ps.setInt(1, category_id);
            
            ps.setString(2, category_name);
            
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, "Category Berhasil Ditambahkan");
        } catch (SQLException sQLException){
            JOptionPane.showMessageDialog(null, "category Gagal Ditambahkan");
        }
    }
    public ResultSet tampilKategori(){
        Query = "SELECT * FROM category";
        
        try {
            st = konek.createStatement();            
            rs = st.executeQuery(Query);
        } catch (SQLException sQLException) {
            JOptionPane.showMessageDialog(null, "Data Gagal Tampil");
        }
        return rs;
    }    
    
    public void hapusKategori(){
        Query = "DELETE FROM category WHERE category_id = ?";
        
        try {
            ps = konek.prepareStatement(Query);
            ps.setInt(1, category_id);
            
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
        } catch (SQLException sQLException) {
            JOptionPane.showMessageDialog(null, "Data Gagal Dihapus");
        }
    }
    public void ubahKategori(){
       
            Query = "UPDATE category SET "
                    + "category_name = ?"
                    + "WHERE category_id = ?";
            
            try {
            ps = konek.prepareStatement(Query);
            ps.setString(1, category_name);
            ps.setInt(2, category_id);
            
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, "Data berhasil Diubah");
            
        } catch (SQLException sQLException) {
            JOptionPane.showMessageDialog(null, "Data Gagal Diubah");
        }
            
    }
    public ResultSet tampilComBox(){
       Query = "SELECT category_name FROM category";
       
        try {
            st = konek.createStatement();            
            rs = st.executeQuery(Query);
        } catch (SQLException sQLException) {
            JOptionPane.showMessageDialog(null, "Data Gagal Tampil");
        }
        return rs;
    }
    public ResultSet Konversi() {
       Query = "SELECT category_id FROM category WHERE category_name = ?";
    
    try {
        ps = konek.prepareStatement(Query);
        ps.setString(1, category_name);

        rs = ps.executeQuery(); 
        System.out.println("data masuk");
    } catch (SQLException sQLException) {
        System.out.println("data tak masuk");
    }
    return rs;
}
    public ResultSet autoID(){
       Query = "SELECT category_id AS ID FROM category ORDER BY category_id DESC LIMIT 1";
       
        try {
            st = konek.createStatement();            
            rs = st.executeQuery(Query);
        } catch (SQLException sQLException) {
            JOptionPane.showMessageDialog(null, "Data Gagal Tampil");
        }
        return rs;
    }
    
}


