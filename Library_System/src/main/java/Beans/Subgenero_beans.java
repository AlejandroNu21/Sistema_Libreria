/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Beans;

import Entidades.subGeneroLiterario;
import Services.ISubgenero;
import com.alejandro.BD.ConexionAMYSQL;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author veget
 */
public class Subgenero_beans implements ISubgenero{
    ConexionAMYSQL con = new ConexionAMYSQL();
    Connection conexion = con.getConecction();

    @Override
    public ArrayList<subGeneroLiterario> MostrarSubGeneroLiterario() {
        ArrayList<subGeneroLiterario> subgenero = new ArrayList<subGeneroLiterario>();

        try {
            CallableStatement cbt = conexion.prepareCall("select * from subgenero_literario");
            ResultSet rst = cbt.executeQuery();

            while (rst.next()) {
                subGeneroLiterario subG = new subGeneroLiterario();
                subG.setIdSugeneroLiterario(rst.getInt("idSubgenero_Literario"));
                subG.setSubgenero_Literario(rst.getString("Subgenero_Literario"));
                subgenero.add(subG);
            }
        } catch (Exception e) {
        }

        return subgenero;
    }

    @Override
    public void AgregarSubGeneroLiterario(subGeneroLiterario subGeneroLiterario) {
        try {
            CallableStatement statement = conexion.prepareCall("SP_I_SUBGENEROS(?)");
            statement.setString("PSubgenero", subGeneroLiterario.getSubgenero_Literario()); 

            statement.execute();
            conexion.close();
            JOptionPane.showMessageDialog(null, "Datos almacenados");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar datos" + e);

        }  
        
    }

    @Override
    public void ElminarSubGeneroLiterario(subGeneroLiterario subGeneroLiterario) {
        try 
        {
            CallableStatement statement = conexion.prepareCall("SP_D_SUBGENERO(?)");
            statement.setInt("PIdSubgenero",  subGeneroLiterario.getIdSugeneroLiterario());
            statement.execute();
            JOptionPane.showMessageDialog(null, "Datos eliminados");
            conexion.close();
        } catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Error al eliminar datos " + e);

        }
    }

    @Override
    public void ActualizarSubGeneroLiterario(subGeneroLiterario subGeneroLiterario) {
         try 
        {
            CallableStatement statement = conexion.prepareCall("SP_U_SUBGENERO(?,?)");
            statement.setString("Pcategoria", subGeneroLiterario.getSubgenero_Literario());
            statement.setInt("PidCategoria", subGeneroLiterario.getIdSugeneroLiterario());
 
            statement.execute();
            conexion.close();
            JOptionPane.showMessageDialog(null, "Datos actualizados");
        } catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Error al actualizar");

        }
    }
}
