/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package comun.componentes;

import java.awt.Color;
import java.awt.Component;
import java.util.Date;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author luisramirezmartinez SAMI 2011
 *
 */
public class Tabla extends JTable{
    
   protected Color color=new Color(220,230,240);
    public Tabla() {
      super();
//     
//       TableRowSorter sorter =  new TableRowSorter(this.getModel());
//        this.setRowSorter(sorter);
      //this.setAutoCreateRowSorter(true);
//      this.setDefaultEditor(Date.class, new DateEditor());
//      this.setDefaultRenderer(Date.class, new DateRender());
//      this.setDefaultEditor(Integer.class, new SpinnerEditor());
//      this.setDefaultRenderer(Integer.class, new SpinnerRender());
     // this.setShowVerticalLines(false);
      //this.setShowHorizontalLines(false);
      
    
    }

    @Override
    public Component prepareRenderer(TableCellRenderer renderer, int row, int col) {
        Component c = super.prepareRenderer(renderer, row, col);

        if (row % 2 == 0 && !isCellSelected(row, col)) {
            c.setBackground(getColor());
        } else {
            if (isCellSelected(row, col)) {
                if (this.isEnabled()) {
                    c.setBackground(getSelectionBackground());
                } else {
// Si la tabla no esta habilitada, el color del seleccionado es diferente
                    c.setBackground(new Color(0xC0C0C0));
                }
            } else {
                c.setBackground(getBackground());
            }
        }
        return c;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
