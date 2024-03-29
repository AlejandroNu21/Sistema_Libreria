/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Beans;

import Entidades.Escritor;
import Entidades.Lector;
import com.alejandro.BD.ConexionAMYSQL;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Kevin
 */
public class Lectores {

    ConexionAMYSQL con = new ConexionAMYSQL();
    Connection conexion = con.getConecction();

    //SELECT
    public ArrayList<Lector> ListaLector() {
        ArrayList<Lector> lista = null;
        try {
            lista = new ArrayList<Lector>();

            CallableStatement cb = conexion.prepareCall("{call SP_S_LECTOR}");
            ResultSet resultado = cb.executeQuery();

            while (resultado.next()) {
                Lector le = new Lector();
                le.setIdLector(resultado.getInt("idLector"));
                le.setCodigoLector(resultado.getString("CodigoLector"));
                le.setNombre_Lector(resultado.getString("Nombre_Lector"));
                le.setApellido_Lector(resultado.getString("Apellido_Lector"));
                le.setEdad(resultado.getString("Edad"));
                le.setDireccion(resultado.getString("Direccion"));
                le.setTelefono(resultado.getString("Telefono"));
                lista.add(le);
            }

        } catch (Exception e) {
            System.out.println("Error man" + e);
        }

        return lista;
    }

    //ADD
    public void AddLector(Lector le) {

        try {
            CallableStatement cb = conexion.prepareCall("{call SP_I_LECTOR(?,?,?,?,?,?)}");
            cb.setString("PCodigoLector", le.getCodigoLector());
            cb.setString("PNombre_Lector", le.getNombre_Lector());
            cb.setString("PApellido_Lector", le.getApellido_Lector());
            cb.setString("PEdad", le.getEdad());
            cb.setString("PDireccion", le.getDireccion());
            cb.setString("PTelefono", le.getTelefono());
            cb.execute();

            JOptionPane.showMessageDialog(null, "Lector Agregado");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error" + ex);
        }

    }
     public void UpdateLector(Lector lect) {
     try {
            CallableStatement cb = conexion.prepareCall("{call SP_U_LECTOR(?,?,?,?,?,?,?)}");
            cb.setInt(7,lect.getIdLector());
            cb.setString(1, lect.getCodigoLector());
            cb.setString(2, lect.getNombre_Lector());
            cb.setString(3, lect.getApellido_Lector());
            cb.setString(4, lect.getEdad());
            cb.setString(5,lect.getDireccion());
            cb.setString(6,lect.getTelefono());
            cb.execute();

            JOptionPane.showMessageDialog(null, "Lector Actualizado","Exito",JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error" + ex);
        }
    
    }
     
        public void DeleteLector (Lector lec){
    
    try{
         CallableStatement cb = conexion.prepareCall("delete from lector as esc where esc.idLector=?;");
            cb.setInt(1, lec.getIdLector());
            cb.execute();

            JOptionPane.showMessageDialog(null, "Lector eliminado correctamente");
            
    
    }catch (SQLException ex){
        JOptionPane.showMessageDialog(null, "Error, " + ex);
    }
    }
    
}
