/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.absensikuy.GUI;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.*;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 
 */
public class Koneksi {
    private static Connection KoneksiDatabase;
    public static Connection KoneksiDB() throws SQLException{
        try{
            String DB = "jdbc:mysql://localhost:3306/absensikuy";
            String username = "root";
            String password = "";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            KoneksiDatabase =(Connection) DriverManager.getConnection(DB,username,password);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Tidak Ada koneksi", "Error",JOptionPane.INFORMATION_MESSAGE);
            System.out.println(e.getMessage());
            System.exit(0);
        }
        return KoneksiDatabase;
    }
    
    public static void main(String[] args) {
    
    }

}
