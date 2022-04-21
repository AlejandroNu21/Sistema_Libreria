/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Kevin
 */
public class DatosEscritor extends Escritor{

    public int getIdDatos_Escritor() {
        return idDatos_Escritor;
    }

    public void setIdDatos_Escritor(int idDatos_Escritor) {
        this.idDatos_Escritor = idDatos_Escritor;
    }

    public String getFecha_Nacimiento() {
        return Fecha_Nacimiento;
    }

    public void setFecha_Nacimiento(String Fecha_Nacimiento) {
        this.Fecha_Nacimiento = Fecha_Nacimiento;
    }

    public String getLugar_Nacimiento() {
        return Lugar_Nacimiento;
    }

    public void setLugar_Nacimiento(String Lugar_Nacimiento) {
        this.Lugar_Nacimiento = Lugar_Nacimiento;
    }

    public String getFecha_Deceso() {
        return Fecha_Deceso;
    }

    public void setFecha_Deceso(String Fecha_Deceso) {
        this.Fecha_Deceso = Fecha_Deceso;
    }

    public String getLugar_Deceso() {
        return Lugar_Deceso;
    }

    public void setLugar_Deceso(String Lugar_Deceso) {
        this.Lugar_Deceso = Lugar_Deceso;
    }

    public String getBiografia() {
        return Biografia;
    }

    public void setBiografia(String Biografia) {
        this.Biografia = Biografia;
    }

    private int idDatos_Escritor;
    private String Fecha_Nacimiento;
    private String Lugar_Nacimiento;
    private String Fecha_Deceso;
    private String Lugar_Deceso;
    private String Biografia;
}
