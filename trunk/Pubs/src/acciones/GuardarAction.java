/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package acciones;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.KeyStroke;
import recurso.Configuracion;

/**
 *
 * @author Luis
 */
public class GuardarAction extends AbstractAction{
    public static String NOMBRE="Guardar";
    public static String DESCRIPCION="Confirma todos los Cambios Realizados.";
    protected static int KEVENT=KeyEvent.VK_S;
   
    

    public GuardarAction() {
            putValue(NAME, NOMBRE);
            putValue(SHORT_DESCRIPTION, DESCRIPCION);
            putValue(MNEMONIC_KEY, new Integer(KEVENT));
            putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KEVENT, 
                    Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()));
            putValue(SMALL_ICON, Configuracion.ICONO_GUARDAR);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
    }
    
}
