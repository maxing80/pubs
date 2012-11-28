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

    public Codigos() {
        cargarCiudades();
    }
    
    private void cargarCiudades(){
        getCiudades().add("DELICIAS");
        getCiudades().add("CHIHUAHUA");
        getCiudades().add("CUAUHTEMOC");
        getCiudades().add("MADERA");
        getCiudades().add("MEOQUI");
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
