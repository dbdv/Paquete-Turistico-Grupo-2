/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqturistico.vistas;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import paqturistico.control.ClienteData;
import paqturistico.control.PaqueteData;
import paqturistico.modelo.Cliente;
import paqturistico.modelo.Conexion;
import paqturistico.modelo.Paquete;

/**
 *
 * @author Usuario
 */
public class VistaListadoPaquetes extends javax.swing.JInternalFrame {
    private Conexion con;
    private ClienteData cd;
    private PaqueteData pd;
    
    private DefaultTableModel modelo;
    private ArrayList<Paquete> listaPaq;
    private ArrayList<Cliente> listaClientes;
    
    /**
     * Creates new form VistaListadoPaquetes
     */
    public VistaListadoPaquetes() {
        try {
            initComponents();
            con = new Conexion();
            cd = new ClienteData(con);
            pd = new PaqueteData(con);
            listaPaq = (ArrayList<Paquete>) pd.obtenerPaquetes();
            listaClientes = (ArrayList<Cliente>) cd.obtenerClientesActivos();
            modelo= new DefaultTableModel();
            cargarClientes();
            armaCabecera();
            //borrarFilas();
            //cargarTabla();
        } catch (ClassNotFoundException ex) {
            System.out.println("Error al conectar con el listado de paquetes"+ex);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        cbClientes = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Listado de Paquetes");

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        jLabel2.setText("CLIENTE:");

        cbClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbClientesActionPerformed(evt);
            }
        });

        jButton1.setText("Dar de baja");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(297, 297, 297))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel2)
                        .addGap(113, 113, 113)
                        .addComponent(cbClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 774, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(368, 368, 368)
                        .addComponent(jButton1)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jButton1)
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbClientesActionPerformed
        // TODO add your handling code here:
        cargarTabla();
    }//GEN-LAST:event_cbClientesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        darBaja();
    }//GEN-LAST:event_jButton1ActionPerformed
    public void cargarClientes(){        
        for(Cliente c: listaClientes){
            cbClientes.addItem(c);
        }
    }
    public void armaCabecera(){
        ArrayList<Object> columna = new ArrayList<Object>();
        columna.add("Id paquete");
        columna.add("Alojamiento");
        columna.add("Menu");
        columna.add("Desde");
        columna.add("Hasta");
        columna.add("Transporte");
        columna.add("Precio Final");
        for(Object it:columna){
            modelo.addColumn(it);
        }
        tabla.setModel(modelo);
    }
    
    public void borrarFilas(){
        int a = modelo.getRowCount()-1;
        for(int i=a; i>=0; i--){
            modelo.removeRow(i);
        }
    }
    
    public void cargarTabla(){
        borrarFilas();
        
        Cliente c = (Cliente) cbClientes.getSelectedItem();
        ArrayList<Paquete> pqs = (ArrayList<Paquete>) pd.obtenerPaquetesPorCliente(c);
        
        for(Paquete p : pqs){
            if(c.getIdCliente()==p.getIdCliente().getIdCliente()){
                modelo.addRow(new Object[]{p.getIdPaquete(), p.getIdAlojamiento().getNombre(), p.getIdMenu().getTipo(), p.getFechaDesde(), p.getFechaHasta(), p.getIdTransporte().getTipo(), p.getPrecioFinal()});
            }
        }
    }
    
   private void darBaja(){
       int indexR = tabla.getSelectedRow();
       
       if(indexR != -1){
           pd.borrarPaquete(Integer.parseInt(tabla.getValueAt(indexR, 0).toString()));
           cargarTabla();
       }else{
           JOptionPane.showMessageDialog(this, "No ha seleccionado ningún paquete.");
       }
   }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Cliente> cbClientes;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
