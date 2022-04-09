/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import Entidades.formaDePago;
import java.util.ArrayList;

/**
 *
 * @author veget
 */
public interface IFormadepago {
        public ArrayList<formaDePago> MostrarFormadepago();
    public void AgregarFormadepago(formaDePago formaDePago);
    public void ElminarFormadepago (formaDePago formaDePago);
    public void ActualizarFormadepago (formaDePago formaDePago);
    
}
