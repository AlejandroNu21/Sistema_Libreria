/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Kevin
 */
public class Editorial {

    private int idEditorial;
    private String CodigoEditorial;
    private String Nombre_Editorial;
    private String Direccion_Editorial;
    private String Telefono_Editorial;

    public Editorial(int Id) {
        this.idEditorial = Id;
    }

    public int getIdEditorial() {
        return idEditorial;
    }
    

    public Editorial(int idEditorial, String CodigoEditorial, String Nombre_Editorial, String Direccion_Editorial, String Telefono_Editorial) {
        this.idEditorial = idEditorial;
        this.CodigoEditorial = CodigoEditorial;
        this.Nombre_Editorial = Nombre_Editorial;
        this.Direccion_Editorial = Direccion_Editorial;
        this.Telefono_Editorial = Telefono_Editorial;
    }

    public Editorial(String CodigoEditorial, String Nombre_Editorial, String Direccion_Editorial, String Telefono_Editorial) {
        this.CodigoEditorial = CodigoEditorial;
        this.Nombre_Editorial = Nombre_Editorial;
        this.Direccion_Editorial = Direccion_Editorial;
        this.Telefono_Editorial = Telefono_Editorial;
    }

    public Editorial() {
    }
    
    

    public void setIdEditorial(int idEditorial) {
        this.idEditorial = idEditorial;
    }

    public String getCodigoEditorial() {
        return CodigoEditorial;
    }

    public void setCodigoEditorial(String CodigoEditorial) {
        this.CodigoEditorial = CodigoEditorial;
    }

    public String getNombre_Editorial() {
        return Nombre_Editorial;
    }

    public void setNombre_Editorial(String Nombre_Editorial) {
        this.Nombre_Editorial = Nombre_Editorial;
    }

    public String getDireccion_Editorial() {
        return Direccion_Editorial;
    }

    public void setDireccion_Editorial(String Direccion_Editorial) {
        this.Direccion_Editorial = Direccion_Editorial;
    }

    public String getTelefono_Editorial() {
        return Telefono_Editorial;
    }

    public void setTelefono_Editorial(String Telefono_Editorial) {
        this.Telefono_Editorial = Telefono_Editorial;
    }
    

}
