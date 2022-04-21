/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Beans;

import Entidades.DatosEscritor;
import Entidades.Escritor;
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
 * @author Kevin
 */
public class DatosEscritores {

    ConexionAMYSQL con = new ConexionAMYSQL();
    Connection conexion = con.getConecction();

    public ArrayList<DatosEscritor> ListaDatosEscritor() {
        ArrayList<DatosEscritor> lista = null;
        try {
            lista = new ArrayList<DatosEscritor>();

            CallableStatement cb = conexion.prepareCall("{call SP_S_DATOSESCRITOR()}");
            ResultSet resultado = cb.executeQuery();

            while (resultado.next()) {
                DatosEscritor cl = new DatosEscritor();
                cl.setIdDatos_Escritor(resultado.getInt("idDatos_Escritor"));
                cl.setIdEscritor(resultado.getInt("idEscritor"));
                cl.setFecha_Nacimiento(resultado.getString("Fecha_Nacimiento"));
                cl.setLugar_Nacimiento(resultado.getString("Lugar_Nacimiento"));
                cl.setFecha_Deceso(resultado.getString("Fecha_Deceso"));
                cl.setLugar_Deceso(resultado.getString("Lugar_Deceso"));
                cl.setBiografia(resultado.getString("Biografia"));

                lista.add(cl);
            }

        } catch (Exception e) {
            System.out.println("Error man" + e);
        }

        return lista;
    }

    public void AddDatosEscritor(DatosEscritor cl) {

        try {
            CallableStatement cb = conexion.prepareCall("{call SP_I_DATOSESCRITOR(?,?,?,?,?,?)}");
            //Escritor es = new Escritor();
            cb.setInt("PidEscritor", cl.getIdEscritor());
            cb.setString("PFecha_Nacimiento", cl.getFecha_Nacimiento());
            cb.setString("PLugar_Nacimiento", cl.getLugar_Nacimiento());
            cb.setString("PFecha_Deceso", cl.getFecha_Deceso());
            cb.setString("PLugar_Deceso", cl.getLugar_Deceso());
            cb.setString("PBiografia", cl.getBiografia());
            cb.execute();

            JOptionPane.showMessageDialog(null, "Datos del escritor agregado correctamente");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error" + ex);
        }

    }

}
