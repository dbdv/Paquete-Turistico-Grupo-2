/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqturistico.control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import paqturistico.modelo.Conexion;
import paqturistico.modelo.Transporte;

/**
 *
 * @author daniel
 */
public class TransporteData {
    private Connection con;

    public TransporteData(Conexion conexion) {
        try {
            this.con = conexion.getConexion();
            System.out.println("Conectado");
        } catch (SQLException ex) {
            System.out.println("Error en la conexión");
        }
    }
    
    public void guardarTransporte(Transporte t) {
        String sql = "INSERT INTO transporte(tipo, precio, idDestino, activo) VALUES (?,?,?,?)";

        try {
            try (PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {  //Prepara la sentencia para SQL
                ps.setString(1, t.getTipo());
                ps.setInt(1, t.getPrecio());
                ps.setInt(3, t.getIdDestino());
                ps.setBoolean(4, t.isActivo());
                
                

                ps.executeUpdate(); //NO PONER PARAMETROS
                ResultSet rs = ps.getGeneratedKeys(); //Recupero el ID (idCliente)
                if (rs.next()) {
                    System.out.println("Transporte tipo: " + t.getTipo() + ", cargado correctamente.");
                    
                    t.setIdTransporte(rs.getInt("tipo"));
                    System.out.println("id del transporte: " + t.getIdTransporte());
                    
                }
                
                ps.close();
            }
        } catch (SQLException ex) {
            System.out.println("Error al insertar transporte\n" + ex);
        }
    }
}
