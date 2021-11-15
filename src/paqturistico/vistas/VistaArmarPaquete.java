/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqturistico.vistas;


import java.sql.Date;
import java.time.LocalDate;



import java.util.List;
import javax.swing.JOptionPane;
import paqturistico.control.AlojamientoData;
import paqturistico.control.ClienteData;
import paqturistico.control.DestinoData;
import paqturistico.control.MenuData;
import paqturistico.control.PaqueteData;
import paqturistico.control.TransporteData;
import paqturistico.modelo.Alojamiento;
import paqturistico.modelo.Cliente;
import paqturistico.modelo.Conexion;
import paqturistico.modelo.Destino;
import paqturistico.modelo.Menu;
import paqturistico.modelo.Paquete;
import paqturistico.modelo.Transporte;

/**
 *
 * @author Usuario
 */
public class VistaArmarPaquete extends javax.swing.JInternalFrame {
    
    private Conexion con;
    private DestinoData dd;
    private AlojamientoData ad;
    private MenuData md;
    private TransporteData td;
    private ClienteData cd;
    private PaqueteData pd;
  

    /**
     * Creates new form VistaArmarPaquete
     */
    public VistaArmarPaquete() {
        initComponents();
        
        try{
            con = new Conexion();
            dd = new DestinoData(con);
            ad = new AlojamientoData(con);
            md = new MenuData(con);
            td = new TransporteData(con);
            cd = new ClienteData(con);
            pd = new PaqueteData(con);
            
            cargarDestinos();
            cargarClientes();
            
        }catch(ClassNotFoundException error){
            System.out.println("No se pudo realizar la conexion en la vista armar paquete\n" + error);
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
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jDateDesde = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jDateHasta = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jbCalcular = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jbCrearPaquete = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();
        jcbDestino = new javax.swing.JComboBox<>();
        jcbTransporte = new javax.swing.JComboBox<>();
        jcbMenu = new javax.swing.JComboBox<>();
        jcbAlojamiento = new javax.swing.JComboBox<>();
        jcbCantPersonas = new javax.swing.JComboBox<>();
        jtCostoTotal = new javax.swing.JTextField();
        jcbCliente = new javax.swing.JComboBox<>();
        jtId = new javax.swing.JTextField();
        jtDni = new javax.swing.JTextField();
        jtMail = new javax.swing.JTextField();

        setClosable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Paquete turístico");

        jLabel2.setText("Destino");

        jLabel3.setText("Alojamiento");

        jLabel4.setText("Transporte");

        jLabel5.setText("Menú");

        jLabel6.setText("Cantidad de personas");

        jLabel7.setText("Fecha");

        jLabel8.setText("Desde:");

        jLabel9.setText("Hasta:");

        jLabel10.setText("Costo Total:");

        jbCalcular.setText("Calcular");
        jbCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCalcularActionPerformed(evt);
            }
        });

        jLabel11.setText("CLIENTE:");

        jLabel12.setText("ID:");

        jLabel13.setText("DNI:");

        jLabel14.setText("Mail:");

        jbCrearPaquete.setText("CREAR PAQUETE");
        jbCrearPaquete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCrearPaqueteActionPerformed(evt);
            }
        });

        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        jcbDestino.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbDestinoItemStateChanged(evt);
            }
        });

        jcbAlojamiento.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbAlojamientoItemStateChanged(evt);
            }
        });

        jcbCantPersonas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        jcbCliente.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbClienteItemStateChanged(evt);
            }
        });

        jtId.setEditable(false);

        jtDni.setEditable(false);

        jtMail.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtId, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtMail, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jcbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(jbLimpiar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jbCalcular)
                                .addGap(75, 75, 75)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtCostoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel2)
                                                .addComponent(jLabel3)
                                                .addComponent(jLabel4)
                                                .addComponent(jLabel5))
                                            .addGap(39, 39, 39)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jcbDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jcbAlojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jcbTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jcbMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jcbCantPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel7)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(jDateDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(35, 35, 35)
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(jDateHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(46, 46, 46)
                        .addComponent(jbCrearPaquete))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jcbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jtMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbLimpiar))
                .addGap(33, 33, 33)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbAlojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbCantPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateDesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jDateHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCalcular)
                    .addComponent(jLabel10)
                    .addComponent(jtCostoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbCrearPaquete))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCalcularActionPerformed
        // TODO add your handling code here:  
        Cliente c;
      
        Alojamiento a;
        Menu m;
        Transporte t;
        int cp;
    
        
         
            a = ad.obtenerAlojamiento(jcbAlojamiento.getSelectedItem().toString());
            t = td.obtenerTransporte(jcbTransporte.getSelectedItem().toString());
            m= md.obtenerMenu(jcbMenu.getSelectedItem().toString());
            cp= jcbCantPersonas.getSelectedIndex();
            c= cd.buscarClientePorNombre(jcbCliente.getSelectedItem().toString());
          LocalDate FD= new java.sql.Date(jDateDesde.getDate().getTime()).toLocalDate();
           LocalDate FH= new java.sql.Date(jDateHasta.getDate().getTime()).toLocalDate();
            
            Paquete p= new Paquete(c,a,m,t,FD,FH,cp,true);
            
         jtCostoTotal.setText(p.calcularPrecioFinal()+"");
         
            
            
            
    }//GEN-LAST:event_jbCalcularActionPerformed

    private void jcbDestinoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbDestinoItemStateChanged
        // TODO add your handling code here:
        Destino destino;
        Transporte transporte;
        List<Alojamiento> alojamientos;
        List<Transporte> transportes;
                
        if(jcbDestino.getSelectedIndex() == 0){
            
            
            jcbAlojamiento.removeAllItems();
            jcbMenu.removeAllItems();
            jcbTransporte.removeAllItems();
            
            jcbAlojamiento.addItem("Seleccione un alojamiento");
            jcbMenu.addItem("Seleccione un menu");
            jcbTransporte.addItem("Seleccione un transporte");
        }else{
            
            jcbAlojamiento.removeAllItems();
            jcbTransporte.removeAllItems();
            
             jcbAlojamiento.addItem("Seleccione un alojamiento");
            jcbTransporte.addItem("Seleccione un transporte");
            
            destino = dd.obtenerDestino(jcbDestino.getSelectedItem().toString());
            alojamientos = ad.obtenerAlojPorDestino(destino.getNombre());
            transportes = td.obtenerTransportesPorDestino(destino.getNombre());
            
            if (!alojamientos.isEmpty()) {
                for (Alojamiento a : alojamientos) {
                    jcbAlojamiento.addItem(a.getNombre());
                }
            }
            
            if(!transportes.isEmpty()){
                for(Transporte t: transportes){
                    jcbTransporte.addItem(t.getTipo());
                }
            }
        }
    }//GEN-LAST:event_jcbDestinoItemStateChanged

    private void jcbAlojamientoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbAlojamientoItemStateChanged
        // TODO add your handling code here:
        if(jcbAlojamiento.getSelectedIndex() != 0 && jcbAlojamiento.getComponentCount() > 1){
            cargarMenus();
        }
    }//GEN-LAST:event_jcbAlojamientoItemStateChanged

    private void jbCrearPaqueteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCrearPaqueteActionPerformed
        // TODO add your handling code here:
        Cliente c;

        Alojamiento a;
        Menu m;
        Transporte t;
        int cp;

        if(jcbAlojamiento.getSelectedIndex() == 0 || jcbCliente.getSelectedIndex()== 0 || jcbDestino.getSelectedIndex() == 0 || jcbMenu.getSelectedIndex() == 0 ||
         jcbTransporte.getSelectedIndex() == 0) {

            JOptionPane.showMessageDialog(this, "No ha seleccionado todos los datos necesarios");
        } else {
            a = ad.obtenerAlojamiento(jcbAlojamiento.getSelectedItem().toString());
            t = td.obtenerTransporte(jcbTransporte.getSelectedItem().toString());
            m = md.obtenerMenu(jcbMenu.getSelectedItem().toString());
            cp = jcbCantPersonas.getSelectedIndex();
            c = cd.buscarClientePorNombre(jcbCliente.getSelectedItem().toString());
            LocalDate FD = new java.sql.Date(jDateDesde.getDate().getTime()).toLocalDate();
            LocalDate FH = new java.sql.Date(jDateHasta.getDate().getTime()).toLocalDate();

            Paquete p = new Paquete(c, a, m, t, FD, FH, cp, true);

            pd.guardarPaquete(p);
            JOptionPane.showMessageDialog(this, "Paquete creado con éxito");

        }
        
        
    }//GEN-LAST:event_jbCrearPaqueteActionPerformed

    private void jcbClienteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbClienteItemStateChanged
        // TODO add your handling code here:
        Cliente cliente;
        
        if(jcbCliente.getSelectedIndex() == 0){
            jtId.setText((""));
            jtDni.setText("");
            jtMail.setText("");
        }else{
            cliente = cd.buscarClientePorNombre(jcbCliente.getSelectedItem().toString());
            
            jtDni.setText(""+cliente.getDni());
            jtId.setText(""+cliente.getIdCliente());
            jtMail.setText(cliente.getMail());
        }
    }//GEN-LAST:event_jcbClienteItemStateChanged

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        // TODO add your handling code here:
        jcbCliente.setSelectedIndex(0);
    }//GEN-LAST:event_jbLimpiarActionPerformed
    
    private void cargarDestinos(){
        
        List<Destino> destinos = dd.obtenerDestinosActivos();
        
        jcbDestino.addItem("Seleccione un destino");
        jcbAlojamiento.addItem("Seleccione un alojamiento");
        jcbCliente.addItem("Seleccione un cliente");
        jcbMenu.addItem("Seleccione un menu");
        jcbTransporte.addItem("Seleccione un transporte");
        
        if (!destinos.isEmpty()) {
            for (Destino d : destinos) {
                jcbDestino.addItem(d.getNombre());
            }
        }
        
        
    }
    
    private void cargarClientes(){
        
      
        List<Cliente> clientes = cd.obtenerClientes();
        Cliente cliente; 
        for(Cliente c: clientes){
            jcbCliente.addItem(c.getNombre());
        
        
    }
    }
    
    
    
    private void cargarMenus(){
        
        if (jcbAlojamiento.getItemCount() > 1) {
            
            jcbMenu.removeAllItems();
            jcbMenu.addItem("Seleccione un menu");

            List<Menu> menus = md.obtenerMenuPorAlojamiento(jcbAlojamiento.getSelectedItem().toString());

            if (!menus.isEmpty()) {
                for (Menu m : menus) {
                    jcbMenu.addItem(m.getTipo());
                }
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser jDateDesde;
    private com.toedter.calendar.JDateChooser jDateHasta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbCalcular;
    private javax.swing.JButton jbCrearPaquete;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JComboBox<String> jcbAlojamiento;
    private javax.swing.JComboBox<String> jcbCantPersonas;
    private javax.swing.JComboBox<String> jcbCliente;
    private javax.swing.JComboBox<String> jcbDestino;
    private javax.swing.JComboBox<String> jcbMenu;
    private javax.swing.JComboBox<String> jcbTransporte;
    private javax.swing.JTextField jtCostoTotal;
    private javax.swing.JTextField jtDni;
    private javax.swing.JTextField jtId;
    private javax.swing.JTextField jtMail;
    // End of variables declaration//GEN-END:variables
}
