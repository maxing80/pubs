/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package codigos;

/**
 *
 * @author Luis
 */
public enum eCity {
    DELICIAS("DEL", "DELICIAS"),
    FING("CH", "CHIHUAHUA"),
    FCA("CUAH", "CUAHUTEMOC");
    
     private String idFacultad;
     private String  nombre;

    private eCity() {
    }

    private eCity(String idFacultad, String nombre) {
        this.idFacultad = idFacultad;
        this.nombre = nombre;
    }
    
    public static eCity valorDe(Integer codigo) {
        eCity result = eCity.DELICIAS; // Default
        if (codigo != null) {
            for(eCity ft: eCity.values()) {
                if (codigo.equals(ft.getIdFacultad())) {
                    result = ft;
                    break;
                }
            }
        }
        return result;
    }
  
     
    /**
     * @return the idFacultad
     */
    public String getIdFacultad() {
        return idFacultad;
    }

    /**
     * @param idFacultad the idFacultad to set
     */
    public void setIdFacultad(String idFacultad) {
        this.idFacultad = idFacultad;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
      @Override
    public String toString() {
        return getNombre();
    } 
    
}
