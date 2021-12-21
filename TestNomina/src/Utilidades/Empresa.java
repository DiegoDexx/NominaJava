/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilidades;

import Sleer1.SLeer1;

/**
 *
 * @author Dani
 */
public class Empresa {

    private String nombre;
    private String domicilio;
    private String cif;
    private String ccc;

    public Empresa() {
    }

    public Empresa(String nombre, String domicilio, String cif, String ccc) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.cif = cif;
        this.ccc = ccc;
    }

    public String getNom() {
        return nombre;
    }

    public void setNom(String mensaje) {
        nombre = SLeer1.datoString(mensaje);
    }

    public String getDom() {
        return domicilio;
    }

    public void setDom(String mensaje) {
        domicilio = SLeer1.datoString(mensaje);
    }

    public String getCIF() {
        return cif;
    }

    public void setCIF(String mensaje) {
        cif = SLeer1.datoString(mensaje);
    }

    public String getCCC() {
        return ccc;
    }

    public void setCCC(String mensaje) {
        ccc = SLeer1.datoString(mensaje);
    }
}