/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqturistico;

import java.time.LocalDate;
import java.time.Month;
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
 * @author Belen
 */
public class TestBelen {
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
     try {            
            Conexion c = new Conexion();
            ClienteData cd = new ClienteData(c);
            AlojamientoData ad = new AlojamientoData(c);
            DestinoData dd = new DestinoData(c);
            MenuData md = new MenuData(c);
            TransporteData td = new TransporteData(c);
            PaqueteData pd = new PaqueteData(c);
            
            
            Destino d1= new Destino("Neuquen", "Argentina", true);
            dd.guardarDestino(d1);
            
            Alojamiento a1= new Alojamiento("Alojamiento 1", "Hotel", 4500, d1, true);
            ad.guardarAlojamiento(a1);
            
            Menu m1= new  Menu( " m/p ", 2000,a1, true );
               md.guardarMenu(m1);
               
            Transporte t1= new Transporte("Avion",8000,d1, true );
            td.guardarTransporte(t1);
            Cliente c1= new Cliente( "Juana Perez", 20654987, "juana@gmail.com", true);
            cd.guardarCliente(c1);
            
            Paquete p1= new Paquete(c1,a1,m1,t1,LocalDate.of(2022, Month.JANUARY, 20), LocalDate.of(2022, Month.JANUARY, 30), 2, true);
            Paquete p2= new Paquete(c1,a1,m1,t1,LocalDate.of(2022, Month.DECEMBER, 20), LocalDate.of(2022, Month.DECEMBER, 30), 2, true);
            Paquete p3= new Paquete(c1,a1,m1,t1,LocalDate.of(2022, Month.JUNE, 20), LocalDate.of(2022, Month.JUNE, 30), 2, true);
           
            pd.guardarPaquete(p1);
            pd.guardarPaquete(p2);
            
       System.out.println("Precio: "+p1.calcularPrecioFinal());
          System.out.println("Precio: "+p1.getPrecioFinal());
           //Paquete p2= new Paquete(1,c1,a1,m1,t1,LocalDate.of(2022, Month.DECEMBER, 20), LocalDate.of(2022, Month.DECEMBER, 30), 2, true);
          System.out.println("Precio: "+p2.calcularPrecioFinal());
          System.out.println("Precio: "+p3.calcularPrecioFinal());
           System.out.println(dd.obtenerDestino("Neuquen"));
            
           // System.out.println(ad.obtenerAlojamiento("Alojamiento 1"));
           System.out.println(ad.obtenerAlojPorDestino("Neuquen"));
           
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TestBelen.class.getName()).log(Level.SEVERE, null, ex);
        }
        
}
}
