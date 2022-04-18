/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Beans;

import Entidades.Editorial;
import Entidades.formaDePago;
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
public class Formadepago_beans {
     ConexionAMYSQL con = new ConexionAMYSQL();
    Connection conexion = con.getConecction();

    //SELECT
    public ArrayList<formaDePago> ListaFormaDP() {
        ArrayList<formaDePago> lista = null;
        try {
            lista = new ArrayList<formaDePago>();

            CallableStatement cb = conexion.prepareCall("{call SP_S_FORMADEPAGO}");
            ResultSet resultado = cb.executeQuery();

            while (resultado.next()) {
                formaDePago ed = new formaDePago();
                ed.setIdformadepago(resultado.getInt("idForma_De_Pago"));
                ed.setPago(resultado.getString("Pago"));
                lista.add(ed);
            }

        } catch (Exception e) {
            System.out.println("Error man" + e);
        }

        return lista;
    }

    //ADD
    public void AddFormaDP(formaDePago dp) {

        try {
            CallableStatement cb = conexion.prepareCall("{call SP_I_FORMADEPAGO(?)}");
            cb.setString("PPago", dp.getPago());
            cb.execute();

            JOptionPane.showMessageDialog(null, "Metodo de pago agregado");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error" + ex);
        }

    }
}
