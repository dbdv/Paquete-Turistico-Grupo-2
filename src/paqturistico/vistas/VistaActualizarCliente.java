/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqturistico.vistas;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import paqturistico.control.ClienteData;
import paqturistico.modelo.Cliente;
import paqturistico.modelo.Conexion;

/**
 *
 * @author dani
 */
public class VistaActualizarCliente extends javax.swing.JInternalFrame {
    
    private ClienteData cd;
    private Conexion con;

    /**
     * Creates new form VistaActualizarCliente
     */
    public VistaActualizarCliente() {
        initComponents();
        
        try{
            cd = new ClienteData(con = new Conexion());
           
        }catch(ClassNotFoundException cnf){
            System.out.println("error al cargar la vista de actualizar\n"+cnf);
        }
         llenarCampos();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcbCliente = new javax.swing.JComboBox<>();
        jtDni = new javax.swing.JTextField();
        jtMail = new javax.swing.JTextField();
        jtId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jbActualizar = new javax.swing.JButton();
        jcActivo = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        jtNombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jcbCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccione--" }));
        jcbCliente.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbClienteItemStateChanged(evt);
            }
        });
        jcbCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbClienteActionPerformed(evt);
            }
        });

        jtId.setEditable(false);

        jLabel1.setText("Cliente:");

        jLabel2.setText("DNI:");

        jLabel3.setText("Mail:");

        jLabel4.setText("ID:");

        jbActualizar.setText("Actualizar");
        jbActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActualizarActionPerformed(evt);
            }
        });

        jLabel5.setText("Activo:");

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jLabel6.setText("Nombre:");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Actualizar cliente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(btnLimpiar)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jbActualizar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jcbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jtId, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                                .addComponent(jcActivo)
                                .addComponent(jtMail, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                                .addComponent(jtDni, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                                .addComponent(jtNombre)))))
                .addContainerGap(100, Short.MAX_VALUE))
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcActivo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbActualizar)
                    .addComponent(btnLimpiar))
                .addGap(59, 59, 59))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbClienteActionPerformed
        // TODO add your handling code here:
       /* Cliente cliente;
        cliente = cd.buscarClientePorNombre(jcbCliente.getSelectedItem().toString());
        
        jtNombre.setText(cliente.getNombre());
        jtDni.setText(Integer.toString(cliente.getDni()));
        jtMail.setText(cliente.getMail());
        jtId.setText(Integer.toString(cliente.getIdCliente()));
        jcActivo.setSelected(cliente.isActivo());*/
    }//GEN-LAST:event_jcbClienteActionPerformed

    private void jbActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActualizarActionPerformed
        // TODO add your handling code here:
        Cliente cliente;
        int index = jcbCliente.getSelectedIndex();
        
        if (index == 0) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar algún cliente");
        } else {
            cliente = new Cliente();

            cliente.setActivo(jcActivo.isSelected());
            cliente.setDni(Integer.parseInt(jtDni.getText()));
            cliente.setIdCliente(Integer.parseInt(jtId.getText()));
            cliente.setMail(jtMail.getText());
            cliente.setNombre(jtNombre.getText());

            cd.actualizarCliente(cliente);

            jcbCliente.addItem(cliente.getNombre());
            jcbCliente.removeItemAt(index);
            index = 1;
            while (cliente.getNombre().compareTo(jcbCliente.getItemAt(index)) != 0) {
                index++;
            }
            jcbCliente.setSelectedIndex(index);
            
            jtNombre.setText(cliente.getNombre());
            jtDni.setText(Integer.toString(cliente.getDni()));
            jtMail.setText(cliente.getMail());
            jtId.setText(Integer.toString(cliente.getIdCliente()));
            jcActivo.setSelected(cliente.isActivo());
            
           
        }
    }//GEN-LAST:event_jbActualizarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        jcbCliente.setSelectedIndex(0);
        jtDni.setText("");
        jtId.setText("");
        jtMail.setText("");
        jtNombre.setText("");
        jcActivo.setSelected(false);
        
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void jcbClienteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbClienteItemStateChanged
        // TODO add your handling code here:
        
        Cliente cliente;
        
        if (jcbCliente.getSelectedIndex() == 0) {
            jtDni.setText("");
            jtId.setText("");
            jtMail.setText("");
            jtNombre.setText("");
            jcActivo.setSelected(false);
        } else {

            cliente = cd.buscarClientePorNombre(jcbCliente.getSelectedItem().toString());

            jtNombre.setText(cliente.getNombre());
            jtDni.setText(Integer.toString(cliente.getDni()));
            jtMail.setText(cliente.getMail());
            jtId.setText(Integer.toString(cliente.getIdCliente()));
            jcActivo.setSelected(cliente.isActivo());
        }
    }//GEN-LAST:event_jcbClienteItemStateChanged

    private void llenarCampos(){
        
        List<Cliente> clientes = cd.obtenerClientes();
        Cliente cliente;
        for(Cliente c: clientes){
            jcbCliente.addItem(c.getNombre());
        }
       
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton jbActualizar;
    private javax.swing.JCheckBox jcActivo;
    private javax.swing.JComboBox<String> jcbCliente;
    private javax.swing.JTextField jtDni;
    private javax.swing.JTextField jtId;
    private javax.swing.JTextField jtMail;
    private javax.swing.JTextField jtNombre;
    // End of variables declaration//GEN-END:variables
}
