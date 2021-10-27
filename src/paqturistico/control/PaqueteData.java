/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqturistico.control;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import paqturistico.modelo.Conexion;
import paqturistico.modelo.Paquete;

/**
 *
 * @author daniel
 */
public class PaqueteData {
    private Connection con;

    public PaqueteData(Conexion conexion) {
        try {
            this.con = conexion.getConexion();
            System.out.println("Conectado");
        } catch (SQLException ex) {
            System.out.println("Error en la conexión");
        }
    }
    
    public void guardarPaquete(Paquete paq) {
        String sql = "INSERT INTO paquete(idCliente, idAlojamiento, idMenu, fechaDesde, fechaHasta, idTransporte, precioFinal, cantidadPersonas, activo) VALUES (?,?,?,?,?,?,?,?,?)";

        try {
            try (PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {  //Prepara la sentencia para SQL
                ps.setInt(1, paq.getIdCliente());
                ps.setInt(2, paq.getIdAlojamiento());
                ps.setInt(3, paq.getIdMenu());
                ps.setDate(4, Date.valueOf(paq.getFechaDesde()));
                ps.setDate(5, Date.valueOf(paq.getFechaHasta()));
                ps.setInt(6, paq.getIdTransporte());
                ps.setInt(7, paq.getPrecioFinal());
                ps.setInt(8, paq.getCantidadPersonas());
                ps.setBoolean(9, paq.isActivo());
                

                ps.executeUpdate(); //NO PONER PARAMETROS
                ResultSet rs = ps.getGeneratedKeys(); //Recupero el ID (idCliente)
                if (rs.next()) {
                    System.out.println("Paquete cargado correctamente.");
                    
                    paq.setIdPaquete(rs.getInt("idPaquete"));
                    System.out.println("id del paquete: " + paq.getIdPaquete());
                    
                }
                
                ps.close();
            }
        } catch (SQLException ex) {
            System.out.println("Error al insertar paquete\n" + ex);
        }
    }
}
