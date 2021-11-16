/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqturistico.vistas;

import java.util.List;
import javax.swing.JOptionPane;
import paqturistico.control.DestinoData;
import paqturistico.control.TransporteData;
import paqturistico.modelo.Conexion;
import paqturistico.modelo.Destino;
import paqturistico.modelo.Transporte;

/**
 *
 * @author Usuario
 */
public class VistaActualizarTransporte extends javax.swing.JInternalFrame {
    private Conexion con;
    private DestinoData dd;
    private TransporteData td;
    /**
     * Creates new form VistaActualizarTransporte
     */
    public VistaActualizarTransporte() {
        initComponents();
        try {
            con = new Conexion();
            dd = new DestinoData(con);
            td = new TransporteData(con);
            llenarDestinos();
        } catch (ClassNotFoundException ex) {
            System.out.println("Error al cargar la vista carga de Menú\n"+ex);
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
        jcomboDestino = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jcomboTransporte = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtPrecio = new javax.swing.JTextField();
        jcbActivo = new javax.swing.JCheckBox();
        jbActualizar = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Actualizar Transporte");

        jLabel2.setText("Destino:");

        jcomboDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un destino.." }));
        jcomboDestino.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcomboDestinoItemStateChanged(evt);
            }
        });

        jLabel3.setText("Tipo de transporte:");

        jcomboTransporte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un transporte.." }));

        jLabel4.setText("Precio:");

        jLabel5.setText("Activo:");

        jbActualizar.setText("Actualizar");
        jbActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActualizarActionPerformed(evt);
            }
        });

        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        jLabel6.setText("(Si desmarca la casilla el menú sera borrado)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jcomboTransporte, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jcomboDestino, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jcbActivo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6)))
                        .addGap(21, 21, 21))))
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jbLimpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbActualizar)
                .addGap(98, 98, 98))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jcomboDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcomboTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(37, 37, 37)
                        .addComponent(jLabel4))
                    .addComponent(jtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jcbActivo)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbLimpiar)
                    .addComponent(jbActualizar))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcomboDestinoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcomboDestinoItemStateChanged
        // TODO add your handling code here:
        if(jcomboDestino.getSelectedIndex() != 0 && jcomboDestino.getComponentCount() > 1){
            llenarT();
        }
    }//GEN-LAST:event_jcomboDestinoItemStateChanged

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        // TODO add your handling code here:
        jcbActivo.setSelected(false);        
        jtPrecio.setText("");        
        jcomboDestino.setSelectedIndex(0);
        jcomboTransporte.setSelectedIndex(0);
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActualizarActionPerformed
        // TODO add your handling code here:
        Transporte t = new Transporte();
        int index = jcomboTransporte.getSelectedIndex();
        if(jcomboDestino.getSelectedIndex() == 0 || jcomboTransporte.getSelectedIndex()== 0 || jtPrecio.getText().isEmpty()  || !jtPrecio.getText().matches("[+-]?\\d*(\\.\\d+)?")){
            if(!jtPrecio.getText().matches("[+-]?\\d*(\\.\\d+)?")){
                JOptionPane.showMessageDialog(this, "Debe ingresar un valor numérico para el precio.");
            }
            JOptionPane.showMessageDialog(this, "Debe completar los campos.");
        }else{
            t = td.obtenerTransporte(jcomboTransporte.getSelectedItem().toString());
            t.setPrecio(Integer.parseInt(jtPrecio.getText()));
            t.setActivo(jcbActivo.isEnabled());            
            
            td.actualizarTransporte(t);
                       
        }
    }//GEN-LAST:event_jbActualizarActionPerformed

private void llenarDestinos(){
        List<Destino> destinos = dd.obtenerDestinosActivos();
        
        for(Destino d: destinos){
            jcomboDestino.addItem(d.getNombre());
        }
}
private void llenarT(){
        
        if (jcomboDestino.getItemCount() > 1) {
            
            jcomboTransporte.removeAllItems();
            jcomboTransporte.addItem("Seleccione un Transporte");
            
            List<Transporte> transportes = td.obtenerTransportesPorDestino(jcomboDestino.getSelectedItem().toString());          

            if (!transportes.isEmpty()) {
                for (Transporte t : transportes) {
                    jcomboTransporte.addItem(t.getTipo());
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jbActualizar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JCheckBox jcbActivo;
    private javax.swing.JComboBox<String> jcomboDestino;
    private javax.swing.JComboBox<String> jcomboTransporte;
    private javax.swing.JTextField jtPrecio;
    // End of variables declaration//GEN-END:variables
}
