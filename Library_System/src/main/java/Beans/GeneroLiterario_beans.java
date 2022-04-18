/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Beans;

import Entidades.Editorial;
import Entidades.generoLiterario;
import Entidades.subGeneroLiterario;
import Services.IGenero;
import com.alejandro.BD.ConexionAMYSQL;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author veget
 */
public class GeneroLiterario_beans {

    ConexionAMYSQL con = new ConexionAMYSQL();
    Connection conexion = con.getConecction();

    //SELECT
    public ArrayList<generoLiterario> ListaGenero() {
        ArrayList<generoLiterario> lista = null;
        try {
            lista = new ArrayList<generoLiterario>();

            CallableStatement cb = conexion.prepareCall("{call SP_S_GENEROLITERARIO}");
            ResultSet resultado = cb.executeQuery();

            while (resultado.next()) {
                generoLiterario ge = new generoLiterario();
                ge.setIdGenero_Literario(resultado.getInt("idGenero_Literario"));
                ge.setGenero_Literario(resultado.getString("Genero_Literario"));
                lista.add(ge);
            }

        } catch (Exception e) {
            System.out.println("Error man" + e);
        }

        return lista;
    }

    //ADD
    public void AddGenero(generoLiterario gen) {

        try {
            CallableStatement cb = conexion.prepareCall("{call SP_I_GENEROLITERARIO(?)}");
            cb.setString("PGenero", gen.getGenero_Literario());
            cb.execute();

            JOptionPane.showMessageDialog(null, "Genero Literario Agregado");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error" + ex);
        }

    }

    public void UpdateEditorial(Editorial edi) {
        try {
            CallableStatement cb = conexion.prepareCall("{call SP_U_EDITORIAL(?,?,?,?,?)}");
            cb.setInt(5, edi.getIdEditorial());
            cb.setString(1, edi.getCodigoEditorial());
            cb.setString(2, edi.getNombre_Editorial());
            cb.setString(3, edi.getDireccion_Editorial());
            cb.setString(4, edi.getTelefono_Editorial());
            cb.execute();

            JOptionPane.showMessageDialog(null, "Editorial Actualizado", "Exito", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error" + ex);
        }

    }
}
