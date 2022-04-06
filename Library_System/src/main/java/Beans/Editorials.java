/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Beans;

import Entidades.Categoria;
import Entidades.Editorial;
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
public class Editorials {

    ConexionAMYSQL con = new ConexionAMYSQL();
    Connection conexion = con.getConecction();

    //SELECT
    public ArrayList<Editorial> ListaEditorial() {
        ArrayList<Editorial> lista = null;
        try {
            lista = new ArrayList<Editorial>();

            CallableStatement cb = conexion.prepareCall("{call SP_S_EDITORIAL}");
            ResultSet resultado = cb.executeQuery();

            while (resultado.next()) {
                Editorial ed = new Editorial();
                ed.setCodigoEditorial(resultado.getString("CodigoEditorial"));
                ed.setNombre_Editorial(resultado.getString("Nombre_Editorial"));
                ed.setDireccion_Editorial(resultado.getString("Direccion_Editorial"));
                ed.setTelefono_Editorial(resultado.getString("Telefono_Editorial"));
                lista.add(ed);
            }

        } catch (Exception e) {
            System.out.println("Error man" + e);
        }

        return lista;
    }

    //ADD
    public void AddEditorial(Editorial edi) {

        try {
            CallableStatement cb = conexion.prepareCall("{call SP_I_EDITORIAL(?,?,?,?)}");
            cb.setString("PCodigoEditorial", edi.getCodigoEditorial());
            cb.setString("PNombre_Editorial", edi.getNombre_Editorial());
            cb.setString("PDireccion_Editorial", edi.getDireccion_Editorial());
            cb.setString("PTelefono_Editorial", edi.getTelefono_Editorial());
            cb.execute();

            JOptionPane.showMessageDialog(null, "Editorial Agregado");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error" + ex);
        }

    }

}
