/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Beans;

import Entidades.Editorial;
import Entidades.Escritor;
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
public class Escritores {

    ConexionAMYSQL con = new ConexionAMYSQL();
    Connection conexion = con.getConecction();

    //SELECT
    public ArrayList<Escritor> ListaEscritor() {
        ArrayList<Escritor> lista = null;
        try {
            lista = new ArrayList<Escritor>();

            CallableStatement cb = conexion.prepareCall("{call SP_S_ESCRITOR}");
            ResultSet resultado = cb.executeQuery();

            while (resultado.next()) {
                Escritor ed = new Escritor();
                ed.setIdEscritor(resultado.getInt("idEscritor"));
                ed.setCodigo_Escritor(resultado.getString("Codigo_Escritor"));
                ed.setNombre_Escritor(resultado.getString("Nombre_Escritor"));
                ed.setApellido_Escritor(resultado.getString("Apellido_Escritor"));
                ed.setPais_Escritor(resultado.getString("Pais_Escritor"));
                lista.add(ed);
            }

        } catch (Exception e) {
            System.out.println("Error man" + e);
        }

        return lista;
    }

    //ADD
    public void AddEscritor(Escritor edi) {

        try {
            CallableStatement cb = conexion.prepareCall("{call SP_I_ESCRITOR(?,?,?,?)}");
            cb.setString("PCodigo_Escritor", edi.getCodigo_Escritor());
            cb.setString("PNombre_Escritor", edi.getNombre_Escritor());
            cb.setString("PApellido_Escritor", edi.getApellido_Escritor());
            cb.setString("PPais_Escritor", edi.getPais_Escritor());
            cb.execute();

            JOptionPane.showMessageDialog(null, "Escritor Agregado");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error" + ex);
        }

    }
    
    public void UpdateEscritor(Escritor escritor) {

        try {
            CallableStatement cb = conexion.prepareCall("{call SP_U_ESCRITORES (?,?,?,?,?)};");
            cb.setInt(5, escritor.getIdEscritor());
            cb.setString(1, escritor.getCodigo_Escritor());
            cb.setString(2, escritor.getNombre_Escritor());
            cb.setString(3, escritor.getApellido_Escritor());
            cb.setString(4, escritor.getPais_Escritor());
            cb.execute();

            JOptionPane.showMessageDialog(null, "Escritor Actualizado");
            //System.out.println(escritor.getCodigo_Escritor()+escritor.getNombre_Escritor()+escritor.getApellido_Escritor()+escritor.getPais_Escritor()+escritor.getIdEscritor());

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error" + ex);
        }

    }
    
         public void DeleteEscritor (Escritor esc) {

        try {
            //System.out.println("Id=" +edi.getIdEditorial());
            CallableStatement cb = conexion.prepareCall("delete from escritor as a where a.idEscritor=?;");
            cb.setInt(1, esc.getIdEscritor());
            cb.execute();

            JOptionPane.showMessageDialog(null, "Escritor eliminado correctamente");
            

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error" + ex);
        }
    }
    
    
}
