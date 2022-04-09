/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import Entidades.generoLiterario;
import java.util.ArrayList;

/**
 *
 * @author veget
 */
public interface IGenero {
     public ArrayList<generoLiterario> MostrargeneroLiterario();
    public void AgregarGeneroLiterario(generoLiterario generoLiterario);
    public void ElminarGeneroLiterario(generoLiterario generoLiterario);
    public void ActualizarGeneroLiterario (generoLiterario generoLiterario);
}
