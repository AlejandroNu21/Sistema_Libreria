/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Carlos.BD;

import java.sql.*;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author COREI5 10TH GEN
 */
public class ConexionAMYSQL {
    
      private static Connection ConnectionBD = null;
    public Connection getConecction (){
    try {
        
        String url = "jdbc:mysql://localhost:3306/libreriabd";
        String user = "Nuñez";
        String password ="Alexxkr2120sv";
        
        ConnectionBD=DriverManager.getConnection(url,user,password);
        System.out.println("Conexion Exitosa");
        
    }catch (Exception e){
        JOptionPane.showMessageDialog(null, "Error"+e.toString());
        
    } 
        return ConnectionBD;
    }
    
    
}
