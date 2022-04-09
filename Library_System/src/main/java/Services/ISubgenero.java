/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import Entidades.subGeneroLiterario;
import java.util.ArrayList;

/**
 *
 * @author veget
 */
public interface ISubgenero {
    public ArrayList<subGeneroLiterario> MostrarSubGeneroLiterario();
    public void AgregarSubGeneroLiterario(subGeneroLiterario subGeneroLiterario);
    public void ElminarSubGeneroLiterario(subGeneroLiterario subGeneroLiterario);
    public void ActualizarSubGeneroLiterario (subGeneroLiterario subGeneroLiterario);
}
