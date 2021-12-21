/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import Sleer1.SLeer1;

/**
 *
 * @author laura
 */
public class Trabajador {
    private String nombre;//Guarda el nombre completo del trabajador
    private int nif;//Guarda el NIF del trabajador
    private String nus;//Guarda el numero de la seguridad social del trabjador
    private String grupoProf;//Indica el convenio colectivo al que el trabjadador esta sujeto
    private int grupoCot;//Indica el grupo de coticacion al que pertenece el trabajador dentro de su convenio
    
    /**
     * Constructor que requiere los siguientes parametros y crea un trabajador.
     * Cada uno de los parametros que necesita son los atributos de la clase trabajador solicitados en orden.
     * @param nom Nombre completo del trabajador
     * @param nifT
     * @param nusT
     * @param gProf
     * @param gCot 
     */
    public Trabajador(String nom, int nifT, String nusT, String gProf, int gCot){
        nombre = nom;
        nif = nifT;
        nus = nusT;
        grupoProf = gProf;
        grupoCot = gCot;
    }
    /**
     * Constructor sin parametros.
     * Por defecto crea a la trabajadora Ana Garcia con unos parametros establecidos.
     */
    public Trabajador(){
        nombre = "Ana García";
        nif = 0;
        nus = "03 1258974586";
        grupoProf = "Convenio colectivo estatal de empresas de consultoría, y estudios de\n" +
                    "mercados y de la opinión pública";
        grupoCot = 7;
    }
    /**
     * @return El nombre completo del trabajador.
     */
    public String getNom(){
        return nombre;
    }
    /**
     * @return El NIF del trabajador.
     */
    public int getNIF(){
        return nif;
    }
    /**
     * @return El NUS del trabajador.
     */
    public String getNUS(){
        return nus;
    }
    /**
     * @return El convenio colectivo al que pertenece el trabajador.
     */
    public String getGProf(){
        return grupoProf;
    }
    /**
     * @return El grupo de cotizacion al que pertenece el trabjador dentro de su convenio.
     */
    public int getGCot(){
        return grupoCot;
    }
    /**
     * Establece el nombre completo del trabjador
     * @param mNom Es el mensaje que aparecera cuando se pida el nombre.
     */
    public void setNom(String mNom){
        nombre = SLeer1.datoString(mNom);
    }
    /**
     * Establece el NIF del trabajador.
     * @param mNIF Mensaje que aparece cuando se pide el NIF.
     */
    public void setNIF(String mNIF){  
        do {
                nif = SLeer1.datoInt(mNIF);   
        if ( nif < 1000000 ) { 
                System.out.println(" Has introducido un nif no válido ");
                nif = SLeer1.datoInt(mNIF);}
        }while ( nif < 1000000 );
        }
    /**
     * Establece el NUS del trabajador.
     * @param mNUS Mensaje que parece cuando se pide el NUS.
     */
    public void setNUS(String mNUS){
        nus = SLeer1.datoString(mNUS);
    }
    /**
     * Establece el Convenio colectivo al que pertenece el trabjador.
     * @param mGProf Mensaje que aparece cuando se pide el Grupo Profesional.
     */
    public void setGProf(String mGProf){
        grupoProf = SLeer1.datoString(mGProf);
    }
    /**
     * Establece el grupo de cotizacion al que pertenece el trabajador.
     * @param mGCot Mensaje que aparece cuando se pide el grupo de coctizacion.
     * @param mError Mensaje de error que aparece cuando el grupo de cotizacion es erroneo.
     */
    public void setGCot(String mGCot, String mError){
        do{
        grupoCot = SLeer1.datoInt(mGCot);
        if (grupoCot < 1 || grupoCot > 7){
            System.err.println(mError);
        }
        }while(grupoCot < 1 || grupoCot > 7);
    }
}
