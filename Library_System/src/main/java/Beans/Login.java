/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Beans;

import Entidades.user;
import com.alejandro.BD.ConexionAMYSQL;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author COREI5 10TH GEN
 */
public class Login {
    
     ConexionAMYSQL con = new ConexionAMYSQL();
     
     public Boolean Logu(user usu){
         
         Connection conexion = con.getConecction();
         
         Boolean valid = false;
         try{
         CallableStatement cb = conexion.prepareCall("{call SP_S_ROL(?,?)}");
         cb.setString("PUsuario", usu.getUsuario());
         cb.setString("PContrasenia", usu.getContrasenia());
            ResultSet resultado = cb.executeQuery();

         int x = 0;
         while (resultado.next()){
         x+=1;
         }
         switch(x){
         
             case 1 : JOptionPane.showMessageDialog(null, "Bienvenido "+usu.getUsuario()+", con la contraseña xD: "+usu.getContrasenia());
             valid = true;
             break;
             
             case 0 : JOptionPane.showMessageDialog(null, "No se ha encontrado el usuario");
             break;
         }
         
         }catch(SQLException ex){
             JOptionPane.showMessageDialog(null, "error"+ex);
         
         
         
         }
         return valid;
     }
}
