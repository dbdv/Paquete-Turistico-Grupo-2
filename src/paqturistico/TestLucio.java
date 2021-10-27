/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqturistico;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class TestLucio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            
            Conexion con = new Conexion();            
            ClienteData cd = new ClienteData(con);
            AlojamientoData ad = new AlojamientoData(con);
            DestinoData dd = new DestinoData(con);
            MenuData md = new MenuData(con);
            TransporteData td = new TransporteData(con);
            PaqueteData pd = new PaqueteData(con);           
            
            
            Cliente c1 = new Cliente("Juan Carlos",17647200,"juancarlos@gmail.com",true);
            cd.guardarCliente(c1);
            
            Destino d1 = new Destino("Mar del Plata","Argentina");
            dd.guardarDestino(d1);
           
            Transporte t1 = new Transporte("Colectivo",5000,1,true);
            //td.guardarTransporte(t1);
            
            Alojamiento a1 = new Alojamiento("Ausonia","Hotel",15000,1,true);
            ad.guardarAlojamiento(a1);
            
            Menu m1 = new Menu("Completo",5000,1,true);
            md.guardarMenu(m1);
            
            //Paquete p1 = new Paquete(1,1,1,1, LocalDate.of(2021, Month.MARCH, 12), LocalDate.of(2021, Month.MARCH, 28), 55000, 4, true);
            //pd.guardarPaquete(p1);
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TestLucio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
