package presentacion;

import comun.Dialog;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import presentacion.catalogos.CatcAuthors;
import presentacion.catalogos.CatcPublishers;
import presentacion.catalogos.CatcStores;
import presentacion.catalogos.CatcTitles;

/**
 *
 * @author Luis
 */
public class Pubs extends javax.swing.JFrame {

    /**
     * Creates new form Pubs
     */
    public Pubs() {
        initComponents();
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        generarMenu();
    }
    
    private void generarMenu(){
        makeElementoItem(new CatcAuthors(), "Autores");
        makeElementoItem(new CatcPublishers(), "Editores");
        makeElementoItem(new CatcStores(), "Tiendas");
        makeElementoItem(new CatcTitles(), "Titulos");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        helpMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pubs: Venta de Libros");

        jDesktopPane1.setBackground(new java.awt.Color(121, 137, 167));
        jDesktopPane1.setAutoscrolls(true);

        fileMenu.setMnemonic('f');
        fileMenu.setText("Catálogos");
        menuBar.add(fileMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Ayuda");
        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Pubs().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables


private void makeElementoItem(JPanel pnl, String nombre){
      
        JMenuItem item = new JMenuItem(new ejecutarDialogo(nombre, pnl));
        fileMenu.add(item);
}

private class ejecutarDialogo extends AbstractAction{
        private JPanel d;
        private String nombre;
        
        public ejecutarDialogo(String nombre, JPanel d) {
            putValue(NAME, nombre);
            this.d=d;
            this.nombre = nombre;
        }
    
        

        @Override
        public void actionPerformed(ActionEvent ae) {
             EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Dialog frame = new Dialog();
                frame.setContentPane(d);
                frame.pack();
                frame.setTitle(nombre);
                jDesktopPane1.add(frame);
                frame.setVisible(true);
            }
        });
        }


}

}
