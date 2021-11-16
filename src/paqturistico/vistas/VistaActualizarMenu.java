/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqturistico.vistas;

import java.util.List;
import javax.swing.JOptionPane;
import paqturistico.control.AlojamientoData;
import paqturistico.control.MenuData;
import paqturistico.modelo.Alojamiento;
import paqturistico.modelo.Conexion;
import paqturistico.modelo.Menu;

/**
 *
 * @author Usuario
 */
public class VistaActualizarMenu extends javax.swing.JInternalFrame {
    private Conexion con;
    private MenuData md;
    private AlojamientoData ad;
    /**
     * Creates new form VistaActualizarMenu
     */
    public VistaActualizarMenu() {
        initComponents();
        try{
            con = new Conexion();
            md = new MenuData(con);
            ad = new AlojamientoData(con);           
            llenarAloj();
        }catch(ClassNotFoundException err){
            System.out.println("Error al cargar la vista de actualizar de Menú\n"+err);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jbGuardar = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();
        jcAloj = new javax.swing.JComboBox<>();
        jcMenu = new javax.swing.JComboBox<>();
        jcbActivo = new javax.swing.JCheckBox();
        jtPrecio = new javax.swing.JTextField();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Actualizar o Borrar Menú");

        jLabel2.setText("Alojamiento:");

        jLabel3.setText("Tipo de Menú:");

        jLabel4.setText("Precio:");

        jLabel5.setText("Activo:");

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        jcAloj.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un Alojamiento..." }));
        jcAloj.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcAlojItemStateChanged(evt);
            }
        });

        jcMenu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un Menú..." }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(125, 125, 125))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(117, 117, 117)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcAloj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(157, 157, 157)
                                .addComponent(jcbActivo))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(155, 155, 155)
                                .addComponent(jtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(135, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jbLimpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbGuardar)
                .addGap(109, 109, 109))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcAloj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jcMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jcbActivo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardar)
                    .addComponent(jbLimpiar))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcAlojItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcAlojItemStateChanged
        // TODO add your handling code here:
        if(jcAloj.getSelectedIndex() != 0 && jcAloj.getComponentCount() > 1){
            llenarMenu();
        }
    }//GEN-LAST:event_jcAlojItemStateChanged

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        // TODO add your handling code here:
        jcbActivo.setSelected(false);        
        jtPrecio.setText("");        
        jcAloj.setSelectedIndex(0);
        jcMenu.setSelectedIndex(0);
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        // TODO add your handling code here:
        //Alojamiento alojamiento = new Alojamiento();
        Menu menu = new Menu();
        int index = jcMenu.getSelectedIndex();
        if(!jtPrecio.getText().matches("[+-]?\\d*(\\.\\d+)?")){
                JOptionPane.showMessageDialog(this, "Debe ingresar un valor numérico para el precio.");
        }else{
            menu = md.obtenerMenu(jcMenu.getSelectedItem().toString());
            //alojamiento = ad.obtenerAlojamiento(jcAloj.getSelectedItem().toString()); 
            
            menu.setPrecio(Integer.parseInt(jtPrecio.getText()));
            menu.setActivo(jcbActivo.isEnabled());            
            md.actualizarMenu(menu);           
        }
            
            
    }//GEN-LAST:event_jbGuardarActionPerformed
    private void llenarAloj(){
        List<Alojamiento> alojamientos = ad.obtenerAlojamientosActivos();
        
        for(Alojamiento a: alojamientos){
            jcAloj.addItem(a.getNombre());
        }
    }
    private void llenarMenu(){
        
        if (jcAloj.getItemCount() > 1) {
            
            jcMenu.removeAllItems();
            jcMenu.addItem("Seleccione un menu");

            List<Menu> menus = md.obtenerMenuPorAlojamiento(jcAloj.getSelectedItem().toString());

            if (!menus.isEmpty()) {
                for (Menu m : menus) {
                    jcMenu.addItem(m.getTipo());
                }
            }
        }
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JComboBox<String> jcAloj;
    private javax.swing.JComboBox<String> jcMenu;
    private javax.swing.JCheckBox jcbActivo;
    private javax.swing.JTextField jtPrecio;
    // End of variables declaration//GEN-END:variables
}
