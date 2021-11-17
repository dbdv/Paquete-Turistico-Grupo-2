/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqturistico.vistas;

import java.util.List;
import javax.swing.JOptionPane;
import paqturistico.control.AlojamientoData;
import paqturistico.control.DestinoData;
import paqturistico.modelo.Alojamiento;
import paqturistico.modelo.Conexion;
import paqturistico.modelo.Destino;

/**
 *
 * @author dani
 */
public class VistaActualizarAlojamiento extends javax.swing.JInternalFrame {
    
    DestinoData dd;
    Conexion con;
    AlojamientoData ad;

    /**
     * Creates new form VistaAgregarAlojamiento
     */
    public VistaActualizarAlojamiento() {
        initComponents();
        
        try{
            con = new Conexion();
            dd = new DestinoData(con);
            ad = new AlojamientoData(con);
            llenarAlojamientos();
            llenarDestinos();
        }catch(ClassNotFoundException err){
            System.out.println("Error al cargar la vista carga de alojamiento\n"+err);
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
        jtTipo = new javax.swing.JTextField();
        jtPrecio = new javax.swing.JTextField();
        jcbDestino = new javax.swing.JComboBox<>();
        cbActivo = new javax.swing.JCheckBox();
        btnActualizar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jcbAlojamiento = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jtNombre = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Actualizar alojamiento");

        jtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtPrecioActionPerformed(evt);
            }
        });

        jcbDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccione--" }));

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre:");

        jLabel3.setText("Tipo:");

        jLabel4.setText("Precio:");

        jLabel5.setText("Destino:");

        jLabel6.setText("Activo:");

        jcbAlojamiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccione--" }));
        jcbAlojamiento.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbAlojamientoItemStateChanged(evt);
            }
        });

        jLabel7.setText("Alojamiento:");

        jtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNombreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(145, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(btnLimpiar))
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(jLabel2))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtNombre)
                    .addComponent(cbActivo)
                    .addComponent(jtTipo)
                    .addComponent(jtPrecio)
                    .addComponent(jcbDestino, 0, 170, Short.MAX_VALUE)
                    .addComponent(jcbAlojamiento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(btnActualizar)))
                .addGap(107, 107, 107))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbAlojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbActivo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar)
                    .addComponent(btnActualizar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtPrecioActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
      
        jcbAlojamiento.setSelectedIndex(0);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        Alojamiento alojamiento;
        Destino destino;
        int index = jcbAlojamiento.getSelectedIndex();
        
        if(index == 0 || jtNombre.getText().isEmpty() || jtPrecio.getText().isEmpty() || jtTipo.getText().isEmpty()){
            
            JOptionPane.showMessageDialog(this, "No ha completado todos los datos.");
            
        }else if(!jtPrecio.getText().matches("[+-]?\\d*(\\.\\d+)?")){
            
            JOptionPane.showMessageDialog(this, "El campo precio solo puede contener valores numéricos.");
            
        }else {
            alojamiento = ad.obtenerAlojamiento(jcbAlojamiento.getSelectedItem().toString());
            destino = dd.obtenerDestino(jcbDestino.getSelectedItem().toString());

            alojamiento.setActivo(cbActivo.isSelected());
            alojamiento.setIdDestino(destino);
            alojamiento.setNombre(jtNombre.getText());
            alojamiento.setPrecio(Integer.parseInt(jtPrecio.getText()));
            alojamiento.setTipo(jtTipo.getText());

            ad.actualizarAlojamiento(alojamiento);

            jcbAlojamiento.addItem(alojamiento.getNombre());
            jcbAlojamiento.removeItemAt(index);
            index = 1;
            while (alojamiento.getNombre().compareTo(jcbAlojamiento.getItemAt(index)) != 0) {
                index++;
            }
            jcbAlojamiento.setSelectedIndex(index);
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void jtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNombreActionPerformed

    private void jcbAlojamientoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbAlojamientoItemStateChanged
        // TODO add your handling code here:
        Alojamiento alojamiento;
        int index = jcbAlojamiento.getSelectedIndex();
        
        if(index == 0){
            
            
            cbActivo.setSelected(false);
            jtPrecio.setText("");
            jtTipo.setText("");
            jtNombre.setText("");
            jcbDestino.setSelectedIndex(0);
            
            
        }else{
            
            alojamiento = ad.obtenerAlojamiento(jcbAlojamiento.getSelectedItem().toString());
            
            cbActivo.setSelected(alojamiento.isActivo());
            jtPrecio.setText(""+alojamiento.getPrecio());
            jtTipo.setText(alojamiento.getTipo());
            jtNombre.setText(alojamiento.getNombre());
            
            index = 0;
            
            while(alojamiento.getIdDestino().getNombre().compareTo(jcbDestino.getItemAt(index)) != 0 && index < jcbDestino.getItemCount()){
                index++;
            }
            
            if(index < jcbDestino.getItemCount()){
                jcbDestino.setSelectedIndex(index);
            }else{
                jcbDestino.setSelectedIndex(0);
            }
        }
    }//GEN-LAST:event_jcbAlojamientoItemStateChanged

    private void llenarAlojamientos(){
        List<Alojamiento> alojamientos = ad.obtenerAlojamientos();
        
        for(Alojamiento a: alojamientos){
            jcbAlojamiento.addItem(a.getNombre());
        }
    }
    
    private void llenarDestinos(){
        List<Destino> destinos = dd.obtenerDestinos();
        
        if (!destinos.isEmpty()) {
            for (Destino d : destinos) {
                jcbDestino.addItem(d.getNombre());
            }
        }
    }
    
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JCheckBox cbActivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JComboBox<String> jcbAlojamiento;
    private javax.swing.JComboBox<String> jcbDestino;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtPrecio;
    private javax.swing.JTextField jtTipo;
    // End of variables declaration//GEN-END:variables
}
