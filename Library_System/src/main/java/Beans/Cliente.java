/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Beans;

import Entidades.clientes;
import com.alejandro.BD.ConexionAMYSQL;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Vkaiido
 */
public class Cliente {
        ConexionAMYSQL con = new ConexionAMYSQL();
    Connection conexion = con.getConecction();
 public ArrayList<clientes> ListaClientes(){
  ArrayList<clientes> lista = null;
   try {
            lista = new ArrayList<clientes>();

            CallableStatement cb = conexion.prepareCall("{call SP_S_CLIENTES()}");
            ResultSet resultado = cb.executeQuery();
            
            
            while (resultado.next()) {    
                clientes cl = new clientes();
                cl.setCodigoCliente(resultado.getString("CodigoCliente"));
                cl.setNombreCliente(resultado.getString("NombreCliente"));
                cl.setApellidoCliente(resultado.getString("ApellidoCliente"));
                cl.setEdad(resultado.getString("Edad"));
                cl.setDireccion(resultado.getString("Direccion"));
                cl.setTelefono(resultado.getString("Telefono"));
                
                
                lista.add(cl);
            }
            
        } catch (Exception e) {
            System.out.println("Error man"+e);
        }

        return lista;
 }
 
 public void AddCliente(clientes cl){
    
        try {
            CallableStatement cb = conexion.prepareCall("{call SP_I_CLIENTES(?,?,?,?,?,?)}");
            cb.setString("PCodigoCliente", cl.getCodigoCliente());
            cb.setString("PNombreCliente", cl.getNombreCliente());
            cb.setString("PApellidoCliente", cl.getApellidoCliente());
            cb.setString("PEdad", cl.getEdad());
            cb.setString("PDireccion", cl.getDireccion());
            cb.setString("PTelefono", cl.getTelefono());
            cb.execute();
            
            JOptionPane.showMessageDialog(null, "Persona Agregada");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error"+ex);
        }
    
    }
    
}
