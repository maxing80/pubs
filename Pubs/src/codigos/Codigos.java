/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package codigos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luis
 */
public class Codigos {
    private  List<String> ciudades = new ArrayList<String>();
    private  List<String> estados = new ArrayList<String>();
    private  List<String> paises = new ArrayList<String>();

    public List<String> getPaises() {
        return paises;
    }

    public void setPaises(List<String> paises) {
        this.paises = paises;
    }
 
    public List<String> getEstados() {
        return estados;
    }

    public void setEstados(List<String> estados) {
        this.estados = estados;
    }
    
    public Codigos() {
        cargarCiudades();
        cargarEstados();
    }
    
    private void cargarCiudades(){
        getCiudades().add("CHIHUAHUA");
        getCiudades().add("CD. JUAREZ");
        getCiudades().add("CUAUHTEMOC");
        getCiudades().add("DELICIAS");
        getCiudades().add("MADERA");
        getCiudades().add("MEOQUI");
        getCiudades().add("PARRAL");
        getCiudades().add("VILLA AHUMADA");
        
    }
    
    private void cargarEstados(){
        getEstados().add("CH");
        getEstados().add("DF");
        getEstados().add("MX");
        getEstados().add("SN");
    }
    
    private void cargarPaises(){
        getPaises().add("MEXICO");
        getPaises().add("ESTADOS UNIDOS");
        getPaises().add("CANADA");  
        getPaises().add("BOLIVIA");
    }

    /**
     * @return the ciudades
     */
    public List<String> getCiudades() {
        return ciudades;
    }

    /**
     * @param ciudades the ciudades to set
     */
    public void setCiudades(List<String> ciudades) {
        this.ciudades = ciudades;
    }
    
    
}
