/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqturistico.vistas;

import java.util.List;
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbActualizar)
                    .addComponent(jcActivo)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jcbCliente, 0, 205, Short.MAX_VALUE)
                        .addComponent(jtDni)
                        .addComponent(jtMail)
                        .addComponent(jtId)))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
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
                    .addComponent(jLabel5)
                    .addComponent(jcActivo))
                .addGap(42, 42, 42)
                .addComponent(jbActualizar)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbClienteActionPerformed
        // TODO add your handling code here:
                 Cliente cliente;
        cliente = cd.buscarClientePorNombre(jcbCliente.getSelectedItem().toString());
        
        jtDni.setText(Integer.toString(cliente.getDni()));
        jtMail.setText(cliente.getMail());
        jtId.setText(Integer.toString(cliente.getIdCliente()));
        jcActivo.setSelected(cliente.isActivo());
    }//GEN-LAST:event_jcbClienteActionPerformed

    private void jbActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActualizarActionPerformed
        // TODO add your handling code here:
        Cliente cliente = new Cliente();
        cliente.setActivo(jcActivo.isSelected());
        cliente.setDni(Integer.parseInt(jtDni.getText()));
        cliente.setIdCliente(Integer.parseInt(jtId.getText()));
        cliente.setMail(jtMail.getText());
        cliente.setNombre(jcbCliente.getSelectedItem().toString());
        
        cd.actualizarCliente(cliente);
    }//GEN-LAST:event_jbActualizarActionPerformed

    private void llenarCampos(){
        
        List<Cliente> clientes = cd.obtenerClientes();
        Cliente cliente;
        for(Cliente c: clientes){
            jcbCliente.addItem(c.getNombre());
        }
       
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jbActualizar;
    private javax.swing.JCheckBox jcActivo;
    private javax.swing.JComboBox<String> jcbCliente;
    private javax.swing.JTextField jtDni;
    private javax.swing.JTextField jtId;
    private javax.swing.JTextField jtMail;
    // End of variables declaration//GEN-END:variables
}
