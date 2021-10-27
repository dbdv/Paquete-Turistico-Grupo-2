/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqturistico;

import java.util.logging.Level;
import java.util.logging.Logger;
import paqturistico.control.ClienteData;
import paqturistico.modelo.Cliente;
import paqturistico.modelo.Conexion;

/**
 *
 * @author Usuario
 */
public class TestLucio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            
            Conexion con = new Conexion();            
            ClienteData cd = new ClienteData(con);
            Cliente c1 = new Cliente("Juan Carlos",17647200,"juancarlos@gmail.com",true);
            
            cd.guardarCliente(c1);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TestLucio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
