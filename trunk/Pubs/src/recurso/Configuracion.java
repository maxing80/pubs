/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package recurso;

import javax.swing.Icon;

/**
 *
 * @author Luis
 */
public class Configuracion {
    //Nombre completo de la Aplicación
    public static String NOMBRE_APP="GoBox | Sistema de Paquetería y Mensajeria ";
    
    //Nombre de los formularios
    public static String NOMBRE_USUARIOS="Permisos | Catálogo de Usuarios ";
    public static String NOMBRE_PERFILES="Permisos | Catálogo de Perfiles";
    public static String NOMBRE_PERFIL_USUARIO="Permisos | Configuración de la Cuenta";
    
    public static String NOMBRE_CLIENTES="Catálogo | Catálogo de Clientes";
    
    public static String NOMBRE_ORDEN_ENVIO="Movimientos | Ingreso de Paquetes";

    
    public Configuracion(){

    }
    
    //Imagenes
    
    private static final String RUTA_IMAGENES = "/Recursos/Imagenes/";
    private static final String RUTA_IMAGEN_GOBOX = RUTA_IMAGENES + "gobox_mini.png";
  //  public static Image ICONO_APP = new javax.swing.ImageIcon(Configuracion.class.getResource(RUTA_IMAGEN_GOBOX)).getImage();


    
    
    //Espacio para Iconos
    
    //RUTA GENERAL DE ICONOS
     private static final String RUTA_ICONOS = "/recurso/iconos/";
     private static final String RUTA_ICONO_USUARIOS = RUTA_ICONOS + "usuarios.png";
     private static final String RUTA_ICONO_PERFILES = RUTA_ICONOS + "perfiles.png";
     private static final String RUTA_ICONO_NUEVO = RUTA_ICONOS + "nuevo.png";
     private static final String RUTA_ICONO_ELIMINAR = RUTA_ICONOS + "eliminar.png";
     private static final String RUTA_ICONO_CANCELAR = RUTA_ICONOS + "cancelar.png";
     private static final String RUTA_ICONO_GUARDAR = RUTA_ICONOS + "guardar.png";
     private static final String RUTA_ICONO_BUSCAR_TEXT = RUTA_ICONOS + "filtrar.png";
     private static final String RUTA_ICONO_CONEXION_OK = RUTA_ICONOS + "red_ok.png";
     private static final String RUTA_ICONO_CONEXION_OFF = RUTA_ICONOS + "red_off.png";
     private static final String RUTA_ICONO_FUENTE = RUTA_ICONOS + "fuente.png";
     private static final String RUTA_ICONO_AUMENTAR_TXT = RUTA_ICONOS + "aumentar_fuente.png";
     private static final String RUTA_ICONO_DISMINUIR_TXT = RUTA_ICONOS + "disminuir_fuente.png";
     private static final String RUTA_ICONO_REFRESH = RUTA_ICONOS + "refresh.png";
     private static final String RUTA_ICONO_REG_OK = RUTA_ICONOS + "reg_ok.png";
     private static final String RUTA_ICONO_INFO = RUTA_ICONOS + "info.png";
     private static final String RUTA_ICONO_WARNING = RUTA_ICONOS + "warning.png";
     private static final String RUTA_ICONO_VENTANAS = RUTA_ICONOS + "ventanas.png";
     private static final String RUTA_ICONO_CUENTA = RUTA_ICONOS + "cuenta.png";
     
     private static final String RUTA_ICONO_INGRESO = RUTA_ICONOS + "ingreso.png";
     private static final String RUTA_ICONO_MAIL = RUTA_ICONOS + "mail.png";
     private static final String RUTA_ICONO_CLIENTES = RUTA_ICONOS + "clientes.png";
     
     private static final String RUTA_ICONO_MAS = RUTA_ICONOS + "mas.png";
     private static final String RUTA_ICONO_MENOS = RUTA_ICONOS + "menos.png";
     
     //OBJETOS ICON
     
     //Menus
     public static Icon ICONO_USUARIOS = new javax.swing.ImageIcon(Configuracion.class.getResource(RUTA_ICONO_USUARIOS));
     public static Icon ICONO_PERFILES = new javax.swing.ImageIcon(Configuracion.class.getResource(RUTA_ICONO_PERFILES));

     //Acciones
     public static Icon ICONO_NUEVO = new javax.swing.ImageIcon(Configuracion.class.getResource(RUTA_ICONO_NUEVO));
     public static Icon ICONO_ELIMINAR = new javax.swing.ImageIcon(Configuracion.class.getResource(RUTA_ICONO_ELIMINAR));
     public static Icon ICONO_CANCELAR = new javax.swing.ImageIcon(Configuracion.class.getResource(RUTA_ICONO_CANCELAR));
     public static Icon ICONO_GUARDAR = new javax.swing.ImageIcon(Configuracion.class.getResource(RUTA_ICONO_GUARDAR));
     public static Icon ICONO_BUSCAR_TEXT = new javax.swing.ImageIcon(Configuracion.class.getResource(RUTA_ICONO_BUSCAR_TEXT));
     public static Icon ICONO_AUMENTAR_TEXT = new javax.swing.ImageIcon(Configuracion.class.getResource(RUTA_ICONO_AUMENTAR_TXT));
     public static Icon ICONO_DISMINUIR_TEXT = new javax.swing.ImageIcon(Configuracion.class.getResource(RUTA_ICONO_DISMINUIR_TXT));
     public static Icon ICONO_FUENTE = new javax.swing.ImageIcon(Configuracion.class.getResource(RUTA_ICONO_FUENTE));
     public static Icon ICONO_REFRESH = new javax.swing.ImageIcon(Configuracion.class.getResource(RUTA_ICONO_REFRESH));
     public static Icon ICONO_WARNING = new javax.swing.ImageIcon(Configuracion.class.getResource(RUTA_ICONO_WARNING));
     public static Icon ICONO_INFO = new javax.swing.ImageIcon(Configuracion.class.getResource(RUTA_ICONO_INFO));
     public static Icon ICONO_VENTANAS = new javax.swing.ImageIcon(Configuracion.class.getResource(RUTA_ICONO_VENTANAS));
     public static Icon ICONO_CUENTA = new javax.swing.ImageIcon(Configuracion.class.getResource(RUTA_ICONO_CUENTA));
     public static Icon ICONO_MAS = new javax.swing.ImageIcon(Configuracion.class.getResource(RUTA_ICONO_MAS));
     public static Icon ICONO_MENOS = new javax.swing.ImageIcon(Configuracion.class.getResource(RUTA_ICONO_MENOS));
     
     public static Icon ICONO_INGRESO = new javax.swing.ImageIcon(Configuracion.class.getResource(RUTA_ICONO_INGRESO));
     public static Icon ICONO_MAIL = new javax.swing.ImageIcon(Configuracion.class.getResource(RUTA_ICONO_MAIL));
     public static Icon ICONO_CLIENTES = new javax.swing.ImageIcon(Configuracion.class.getResource(RUTA_ICONO_CLIENTES));
     
     
     //mensajes de sistema
     public static Icon ICONO_CONEXION_ON = new javax.swing.ImageIcon(Configuracion.class.getResource(RUTA_ICONO_CONEXION_OK));
     public static Icon ICONO_CONEXION_OFF = new javax.swing.ImageIcon(Configuracion.class.getResource(RUTA_ICONO_CONEXION_OFF));
     public static Icon ICONO_REG_OK = new javax.swing.ImageIcon(Configuracion.class.getResource(RUTA_ICONO_REG_OK));
    
}
