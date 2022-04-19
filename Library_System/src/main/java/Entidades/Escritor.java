/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Kevin
 */
public class Escritor {

    private int idEscritor;
     private String Codigo_Escritor;
    private String Nombre_Escritor;
    private String Apellido_Escritor;
    private String Pais_Escritor;

    public Escritor() {
    }
    
    public Escritor(int Id) {
        this.idEscritor = Id;
    }
    
    
    

    public Escritor(String Codigo_Escritor, String Nombre_Escritor, String Apellido_Escritor, String Pais_Escritor) {
        this.Codigo_Escritor = Codigo_Escritor;
        this.Nombre_Escritor = Nombre_Escritor;
        this.Apellido_Escritor = Apellido_Escritor;
        this.Pais_Escritor = Pais_Escritor;
    }

    
    
    
    public Escritor(int idEscritor, String Codigo_Escritor, String Nombre_Escritor, String Apellido_Escritor, String Pais_Escritor) {
        this.idEscritor = idEscritor;
        this.Codigo_Escritor = Codigo_Escritor;
        this.Nombre_Escritor = Nombre_Escritor;
        this.Apellido_Escritor = Apellido_Escritor;
        this.Pais_Escritor = Pais_Escritor;
    }
    
    
    

    public int getIdEscritor() {
        return idEscritor;
    }

    public void setIdEscritor(int idEscritor) {
        this.idEscritor = idEscritor;
    }

    public String getCodigo_Escritor() {
        return Codigo_Escritor;
    }

    public void setCodigo_Escritor(String Codigo_Escritor) {
        this.Codigo_Escritor = Codigo_Escritor;
    }

    public String getNombre_Escritor() {
        return Nombre_Escritor;
    }

    public void setNombre_Escritor(String Nombre_Escritor) {
        this.Nombre_Escritor = Nombre_Escritor;
    }

    public String getApellido_Escritor() {
        return Apellido_Escritor;
    }

    public void setApellido_Escritor(String Apellido_Escritor) {
        this.Apellido_Escritor = Apellido_Escritor;
    }

    public String getPais_Escritor() {
        return Pais_Escritor;
    }

    public void setPais_Escritor(String Pais_Escritor) {
        this.Pais_Escritor = Pais_Escritor;
    }

}
