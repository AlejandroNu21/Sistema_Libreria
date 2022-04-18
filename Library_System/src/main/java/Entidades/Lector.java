/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Kevin
 */
public class Lector {

    private int idLector;
    private String CodigoLector;
    private String Nombre_Lector;
    private String Apellido_Lector;
    private String Edad;
    private String Direccion;
    private String Telefono;
    
    public Lector(int Id) {
        this.idLector = Id;
    }
    
        public int getIdLector() {
        return idLector;
    }

    public Lector(int idLector, String CodigoLector, String Nombre_Lector, String Apellido_Lector, String Edad, String Direccion, String Telefono) {
        this.idLector = idLector;
        this.CodigoLector = CodigoLector;
        this.Nombre_Lector = Nombre_Lector;
        this.Apellido_Lector = Apellido_Lector;
        this.Edad = Edad;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
    }

    public Lector(String CodigoLector, String Nombre_Lector, String Apellido_Lector, String Edad, String Direccion, String Telefono) {
        this.CodigoLector = CodigoLector;
        this.Nombre_Lector = Nombre_Lector;
        this.Apellido_Lector = Apellido_Lector;
        this.Edad = Edad;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
    }

    public Lector() {
    }
    


    public void setIdLector(int idLector) {
        this.idLector = idLector;
    }

    public String getCodigoLector() {
        return CodigoLector;
    }

    public void setCodigoLector(String CodigoLector) {
        this.CodigoLector = CodigoLector;
    }

    public String getNombre_Lector() {
        return Nombre_Lector;
    }

    public void setNombre_Lector(String Nombre_Lector) {
        this.Nombre_Lector = Nombre_Lector;
    }

    public String getApellido_Lector() {
        return Apellido_Lector;
    }

    public void setApellido_Lector(String Apellido_Lector) {
        this.Apellido_Lector = Apellido_Lector;
    }

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
}
