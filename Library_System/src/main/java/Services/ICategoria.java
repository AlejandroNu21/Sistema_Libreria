/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import Entidades.Categoria;
import java.util.ArrayList;

/**
 *
 * @author veget
 */
public interface ICategoria {
    public ArrayList<Categoria> MostrarCategoria();
    public void AgregarCategoria(Categoria categoria);
    public void ElminarCategoria (Categoria categoria);
    public void ActualizarCategoria (Categoria categoria);
}
