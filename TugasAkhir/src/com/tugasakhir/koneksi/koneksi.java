/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tugasakhir.koneksi;

/**
 *
 * @author TubagusR
 */
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Aziz_YS
 */
public class koneksi {
    private static Connection con;
    public koneksi(){
    }
    public static Connection getConnection(){
         try{
    con=DriverManager.getConnection("jdbc:mysql://localhost/restoran","root","");
    }
    catch(SQLException e){
        JOptionPane.showMessageDialog(null,"Gagal Koneksi");
    }
return con;
  }
}