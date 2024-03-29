/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion.catalogos;

import acciones.*;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.beans.Beans;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.RollbackException;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Luis
 */
public class CatcPublishers extends JPanel {

    private NuevoEditor nuevoAction = new NuevoEditor();
    private EliminarEditor eliminarAction = new EliminarEditor();
    private NuevoPubInfo nuevoDetailAction = new NuevoPubInfo();
    private EliminarPubInfo eliminarDetailAction = new EliminarPubInfo();
    private RefrescarPubInfo refrescarDetailAction = new RefrescarPubInfo();
    private GuardarPubInfo guardarDetailAction = new GuardarPubInfo();
    private List<String> ciudades;
    private List<String> estados;

    public List<String> getEstados() {
        return estados;
    }

    public void setEstados(List<String> estados) {
        this.estados = estados;
    }

    public List<String> getPaises() {
        return paises;
    }

    public void setPaises(List<String> paises) {
        this.paises = paises;
    }
    private List<String> paises;

    public CatcPublishers() {
        this.ciudades = new codigos.Codigos().getCiudades();
        this.estados = new codigos.Codigos().getEstados();
        this.paises = new codigos.Codigos().getPaises();
        initComponents();
        if (!Beans.isDesignTime()) {
            entityManager.getTransaction().begin();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("PubsPU").createEntityManager();
        query = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT P FROM Publishers P");
        list = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(query.getResultList());
        panelRedondo1 = new codigos.desing.PanelRedondo();
        masterScrollPane = new javax.swing.JScrollPane();
        masterTable = new javax.swing.JTable();
        newButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        panelRedondo2 = new codigos.desing.PanelRedondo();
        detailScrollPane = new javax.swing.JScrollPane();
        detailTable = new javax.swing.JTable();
        refreshButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        deleteDetailButton = new javax.swing.JButton();
        newDetailButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, list, masterTable);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${pub}"));
        columnBinding.setColumnName("Publicación");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${pubName}"));
        columnBinding.setColumnName("Nombre");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${city}"));
        columnBinding.setColumnName("Ciudad");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${state}"));
        columnBinding.setColumnName("Estado");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${country}"));
        columnBinding.setColumnName("País");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        masterScrollPane.setViewportView(masterTable);

        newButton.setAction(nuevoAction);

        deleteButton.setAction(eliminarAction);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), deleteButton, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        org.jdesktop.layout.GroupLayout panelRedondo1Layout = new org.jdesktop.layout.GroupLayout(panelRedondo1);
        panelRedondo1.setLayout(panelRedondo1Layout);
        panelRedondo1Layout.setHorizontalGroup(
            panelRedondo1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panelRedondo1Layout.createSequentialGroup()
                .add(10, 10, 10)
                .add(panelRedondo1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, masterScrollPane, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, panelRedondo1Layout.createSequentialGroup()
                        .add(397, 397, 397)
                        .add(newButton, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(5, 5, 5)
                        .add(deleteButton, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .add(5, 5, 5))
        );
        panelRedondo1Layout.setVerticalGroup(
            panelRedondo1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panelRedondo1Layout.createSequentialGroup()
                .add(10, 10, 10)
                .add(masterScrollPane, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                .add(5, 5, 5)
                .add(panelRedondo1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(newButton, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(deleteButton, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .add(5, 5, 5))
        );

        org.jdesktop.beansbinding.ELProperty eLProperty = org.jdesktop.beansbinding.ELProperty.create("${selectedElement.pubInfoCollection}");
        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, eLProperty, detailTable);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${prInfo}"));
        columnBinding.setColumnName("Pr Info");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${logo}"));
        columnBinding.setColumnName("Logo");
        columnBinding.setColumnClass(java.io.Serializable.class);
        jTableBinding.setSourceUnreadableValue(java.util.Collections.emptyList());
        bindingGroup.addBinding(jTableBinding);

        detailScrollPane.setViewportView(detailTable);

        refreshButton.setAction(refrescarDetailAction);

        saveButton.setAction(guardarDetailAction);

        deleteDetailButton.setAction(eliminarDetailAction);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, detailTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), deleteDetailButton, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        newDetailButton.setAction(nuevoDetailAction);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), newDetailButton, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        org.jdesktop.layout.GroupLayout panelRedondo2Layout = new org.jdesktop.layout.GroupLayout(panelRedondo2);
        panelRedondo2.setLayout(panelRedondo2Layout);
        panelRedondo2Layout.setHorizontalGroup(
            panelRedondo2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panelRedondo2Layout.createSequentialGroup()
                .add(panelRedondo2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, panelRedondo2Layout.createSequentialGroup()
                        .add(10, 10, 10)
                        .add(detailScrollPane, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, panelRedondo2Layout.createSequentialGroup()
                        .add(247, 247, 247)
                        .add(newDetailButton, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(5, 5, 5)
                        .add(deleteDetailButton, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(5, 5, 5)
                        .add(refreshButton, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(5, 5, 5)
                        .add(saveButton, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .add(5, 5, 5))
        );
        panelRedondo2Layout.setVerticalGroup(
            panelRedondo2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panelRedondo2Layout.createSequentialGroup()
                .add(10, 10, 10)
                .add(detailScrollPane, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 91, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(5, 5, 5)
                .add(panelRedondo2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(refreshButton, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(saveButton, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(deleteDetailButton, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(newDetailButton, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .add(5, 5, 5))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(5, 5, 5)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(panelRedondo1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(panelRedondo2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .add(5, 5, 5))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(5, 5, 5)
                .add(panelRedondo1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(5, 5, 5)
                .add(panelRedondo2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(5, 5, 5))
        );

        bindingGroup.bind();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton deleteDetailButton;
    private javax.swing.JScrollPane detailScrollPane;
    private javax.swing.JTable detailTable;
    private javax.persistence.EntityManager entityManager;
    private java.util.List<modelos.Publishers> list;
    private javax.swing.JScrollPane masterScrollPane;
    private javax.swing.JTable masterTable;
    private javax.swing.JButton newButton;
    private javax.swing.JButton newDetailButton;
    private codigos.desing.PanelRedondo panelRedondo1;
    private codigos.desing.PanelRedondo panelRedondo2;
    private javax.persistence.Query query;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton saveButton;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    public static void main(String[] args) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CatcPublishers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CatcPublishers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CatcPublishers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CatcPublishers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame();
                frame.setContentPane(new CatcPublishers());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });
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

    public class NuevoEditor extends NuevoAction {

        public NuevoEditor() {
            super();
        }

        @Override
        public void actionPerformed(ActionEvent ae) {
            modelos.Publishers a = new modelos.Publishers();
            entityManager.persist(a);
            list.add(a);
            int row = list.size() - 1;
            masterTable.setRowSelectionInterval(row, row);
            masterTable.scrollRectToVisible(masterTable.getCellRect(row, 0, true));
        }
    }

    public class EliminarEditor extends EliminarAction {

        public EliminarEditor() {
            super();
        }

        @Override
        public void actionPerformed(ActionEvent ae) {
            int[] selected = masterTable.getSelectedRows();
            List<modelos.Publishers> toRemove = new ArrayList<modelos.Publishers>(selected.length);
            for (int idx = 0; idx < selected.length; idx++) {
                modelos.Publishers a = list.get(masterTable.convertRowIndexToModel(selected[idx]));
                toRemove.add(a);
                entityManager.remove(a);
            }
            list.removeAll(toRemove);
        }
    }

    public class NuevoPubInfo extends NuevoAction {

        public NuevoPubInfo() {
            super();
        }

        @Override
        public void actionPerformed(ActionEvent ae) {
            int index = masterTable.getSelectedRow();
            modelos.Publishers P = list.get(masterTable.convertRowIndexToModel(index));
            Collection<modelos.PubInfo> ps = P.getPubInfoCollection();
            if (ps == null) {
                ps = new LinkedList<modelos.PubInfo>();
                P.setPubInfoCollection((List) ps);
            }
            modelos.PubInfo p = new modelos.PubInfo();
            entityManager.persist(p);
            p.setPubId2(P);
            ps.add(p);
            masterTable.clearSelection();
            masterTable.setRowSelectionInterval(index, index);
            int row = ps.size() - 1;
            detailTable.setRowSelectionInterval(row, row);
            detailTable.scrollRectToVisible(detailTable.getCellRect(row, 0, true));
        }
    }

    public class EliminarPubInfo extends EliminarAction {

        public EliminarPubInfo() {
            super();
        }

        @Override
        public void actionPerformed(ActionEvent ae) {
            int index = masterTable.getSelectedRow();
            modelos.Publishers P = list.get(masterTable.convertRowIndexToModel(index));
            Collection<modelos.PubInfo> ps = P.getPubInfoCollection();
            int[] selected = detailTable.getSelectedRows();
            List<modelos.PubInfo> toRemove = new ArrayList<modelos.PubInfo>(selected.length);
            for (int idx = 0; idx < selected.length; idx++) {
                selected[idx] = detailTable.convertRowIndexToModel(selected[idx]);
                int count = 0;
                Iterator<modelos.PubInfo> iter = ps.iterator();
                while (count++ < selected[idx]) {
                    iter.next();
                }
                modelos.PubInfo p = iter.next();
                toRemove.add(p);
                entityManager.remove(p);
            }
            ps.removeAll(toRemove);
            masterTable.clearSelection();
            masterTable.setRowSelectionInterval(index, index);
        }
    }

    public class RefrescarPubInfo extends RefrescarAction {

        public RefrescarPubInfo() {
            super();
        }

        @Override
        public void actionPerformed(ActionEvent ae) {
            entityManager.getTransaction().rollback();
            entityManager.getTransaction().begin();
            java.util.Collection data = query.getResultList();
            for (Object entity : data) {
                entityManager.refresh(entity);
            }
            list.clear();
            list.addAll(data);
        }
    }

    public class GuardarPubInfo extends GuardarAction {

        public GuardarPubInfo() {
            super();
        }

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                entityManager.getTransaction().commit();
                entityManager.getTransaction().begin();
            } catch (RollbackException rex) {
                rex.printStackTrace();
                entityManager.getTransaction().begin();
                List<modelos.Publishers> merged = new ArrayList<modelos.Publishers>(list.size());
                for (modelos.Publishers P : list) {
                    merged.add(entityManager.merge(P));
                }
                list.clear();
                list.addAll(merged);
            }
        }
    }
}
