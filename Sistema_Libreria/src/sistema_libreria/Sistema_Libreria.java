/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistema_libreria;

import Beans.Acceso;
import Model.Cliente;
import java.util.Scanner;

/**
 *
 * @author COREI5 10TH GEN
 */
public class Sistema_Libreria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cliente es = new Cliente();
        Acceso ac = new Acceso();
      //  Scanner sc = new Scanner(System.in);
        es.setUser("Alejandro");
        es.setPassword("123456");
        var logica = ac.Acess(es);
        
        if (logica==0){
            System.out.println("Inicio Correcto");
        }else{
            System.out.println("Incorrecto");
        }
    }
    
}
