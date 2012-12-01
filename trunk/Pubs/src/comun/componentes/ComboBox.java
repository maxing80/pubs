/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package comun.componentes;

import javax.swing.JComboBox;

/**
 *
 * @author Luis
 */
public class ComboBox extends JComboBox {

    public ComboBox() {
        this.setEditable(true);
        AutoCompletion autoCompletion = new AutoCompletion(this);
    }
    
    
}
