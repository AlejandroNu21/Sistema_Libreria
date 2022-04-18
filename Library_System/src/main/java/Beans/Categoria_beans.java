/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Beans;

import Entidades.Categoria;
import Entidades.Editorial;
import Entidades.subGeneroLiterario;
import Services.ICategoria;
import com.alejandro.BD.ConexionAMYSQL;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author veget
 */
public class Categoria_beans {

    ConexionAMYSQL con = new ConexionAMYSQL();
    Connection conexion = con.getConecction();

    //SELECT
    public ArrayList<Categoria> ListaCat() {
        ArrayList<Categoria> lista = null;
        try {
            lista = new ArrayList<Categoria>();

            CallableStatement cb = conexion.prepareCall("{call SP_S_CATEGORIA}");
            ResultSet resultado = cb.executeQuery();

            while (resultado.next()) {
                Categoria ct = new Categoria();
                ct.setIdCategoria(resultado.getInt("idCategoria"));
                ct.setCategoria(resultado.getString("Categoria"));
                lista.add(ct);
            }

        } catch (Exception e) {
            System.out.println("Error man" + e);
        }

        return lista;
    }

    //ADD
    public void AddCategoria(Categoria cat) {

        try {
            CallableStatement cb = conexion.prepareCall("{call SP_I_CATEGORIA(?)}");
            cb.setString("PCategoria", cat.getCategoria());
            cb.execute();

            JOptionPane.showMessageDialog(null, "Categoria Agregado");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error" + ex);
        }

    }
    
  
}
