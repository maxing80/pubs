/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package comun;

import java.awt.Dimension;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import javax.swing.JInternalFrame;


public class Dialog extends JInternalFrame{
     public  Properties propiedades = new Properties();
     protected Boolean cambio=false;

    public Dialog() {
        super();
        this.setClosable(true);
        this.setIconifiable(true);
        this.setResizable(true);
        this.setMaximizable(true);
        propiedades=ObtenerPropiedades();
        this.setLocation(Integer.parseInt(propiedades.getProperty("PosX", "50")), Integer.parseInt(propiedades.getProperty("PosY", "30")));
       
    }
    

    @Override
    public void setSize(Dimension dmnsn) {
        Dimension frameSize = new Dimension(Integer.parseInt(propiedades.getProperty("Alto", "695")), Integer.parseInt(propiedades.getProperty("Ancho", "575")));
        super.setSize(frameSize);
        
        
    }
    
    public final Properties ObtenerPropiedades(){
        File fileProperties = new File(System.getProperty("user.dir")+"/src/recurso/propiedades");
        if(!fileProperties.isDirectory()) if(fileProperties.mkdirs());         
        File  archivo = new File(System.getProperty("user.dir")+"/src/recurso/propiedades",this.getClass().getSimpleName().toLowerCase() + ".properties"); 
            try {
                if(!archivo.exists()) archivo.createNewFile();
                String DirPropiedades = System.getProperty("user.dir")+"/src/recurso/propiedades/" + this.getClass().getSimpleName().toLowerCase() + ".properties";
                fileProperties = new File(DirPropiedades);
                fileProperties.createNewFile(); 
                FileInputStream in = new FileInputStream(fileProperties);
                propiedades.load(in);
                in.close();
            } catch (IOException ex) { 
                System.out.println("No he podido Leer el archivo"); 
            }
          return propiedades;
         }
        
        
        
     public final void GuardarPropiedad(String NombrePropiedad, String Propiedad) {
        try {
            File  archivo = new File(System.getProperty("user.dir")+"/src/recurso/propiedades",this.getClass().getSimpleName().toLowerCase() + ".properties"); 
            FileOutputStream out = new FileOutputStream(archivo);
             propiedades.setProperty(NombrePropiedad,Propiedad);
             propiedades.store(out, "Propiedades de "+this.getClass().getSimpleName().toLowerCase());
        } catch (FileNotFoundException ex) {
            
        }catch (IOException ex) { 
                System.out.println("No he podido Guadar el archivo"); 
            }
           
     }
         
     @Override
    public void dispose() {
        GuardarPropiedad("Nombre", getTitle());
        GuardarPropiedad("PosX", ""+getX());
        GuardarPropiedad("PosY", ""+getY());
        GuardarPropiedad("Alto", ""+getWidth());
        GuardarPropiedad("Ancho", ""+getHeight());
     
      //  super.dispose();
    }
    
    
}
