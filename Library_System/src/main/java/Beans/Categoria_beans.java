/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Beans;

import Entidades.Categoria;
import Services.ICategoria;
import com.alejandro.BD.ConexionAMYSQL;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author veget
 */
public class Categoria_beans implements ICategoria {

    ConexionAMYSQL con = new ConexionAMYSQL();
    Connection conexion = con.getConecction();

    @Override
    public ArrayList<Categoria> MostrarCategoria() {
        ArrayList<Categoria> categoria = new ArrayList<Categoria>();

        try {
            CallableStatement cbt = conexion.prepareCall("select * from Categoria");
            ResultSet rst = cbt.executeQuery();

            while (rst.next()) {
                Categoria ctg = new Categoria();
                ctg.setIdCategoria(rst.getInt("idCategoria"));
                ctg.setCategoria(rst.getString("Categoria"));
                categoria.add(ctg);
            }
        } catch (Exception e) {
        }

        return categoria;
    }

    @Override
    public void AgregarCategoria(Categoria categoria) {
      try {
            CallableStatement statement = conexion.prepareCall("SP_I_CATEGORIA(?)");
            statement.setString("Pcategoria", categoria.getCategoria()); 

            statement.execute();
            conexion.close();
            JOptionPane.showMessageDialog(null, "Datos almacenados");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar datos" + e);

        }  
        

    }

    @Override
    public void ElminarCategoria(Categoria categoria) 
    {
        
        try 
        {
            CallableStatement statement = conexion.prepareCall("SP_D_CATEGORIA(?)");
            statement.setInt("PidCategoria",  categoria.getIdCategoria());
            statement.execute();
            JOptionPane.showMessageDialog(null, "Datos eliminados");
            conexion.close();
        } catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Error al eliminar datos " + e);

        }
    }
    

    @Override
    public void ActualizarCategoria(Categoria categoria) 
    {
        try 
        {
            CallableStatement statement = conexion.prepareCall("SP_U_CATEGORIA(?,?)");
            statement.setString("Pcategoria", categoria.getCategoria());
            statement.setInt("PidCategoria", categoria.getIdCategoria());
 
            statement.execute();
            conexion.close();
            JOptionPane.showMessageDialog(null, "Datos actualizados");
        } catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Error al actualizar");

        }

    }
}


