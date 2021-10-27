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
import paqturistico.modelo.Cliente;
import paqturistico.modelo.Conexion;

/**
 *
 * @author daniel
 */
public class ClienteData {
    private Connection con;

    public ClienteData(Conexion conexion) {
        try {
            this.con = conexion.getConexion();
            System.out.println("Conectado");
        } catch (SQLException ex) {
            System.out.println("Error en la conexión");
        }
    }
    public void guardarCliente(Cliente cliente) {
        String sql = "INSERT INTO cliente(nombre, dni, mail, activo) VALUES (?,?,?,?)";

        try {
            try (PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {  //Prepara la sentencia para SQL
                ps.setString(1, cliente.getNombre());
                ps.setInt(2, cliente.getDni());
                ps.setString(3, cliente.getMail());
                ps.setBoolean(4, cliente.isActivo());

                ps.executeUpdate(); //NO PONER PARAMETROS
                ResultSet rs = ps.getGeneratedKeys(); //Recupero el ID (idCliente)
                if (rs.next()) {
                    System.out.println("Cliente " + cliente.getNombre() + ", cargado correctamente.");
                    //cliente.setIdCliente(1);
                    cliente.setIdCliente(rs.getInt("idCliente"));
                    System.out.println("id del cliente: " + cliente.getIdCliente());
                    
                }
                
                ps.close();
            }
        } catch (SQLException ex) {
            System.out.println("Error al insertar cliente\n" + ex);
        }
    }
    
    public void borrarCliente(int id){
        String sql = "UPDATE cliente SET activo = 0 WHERE idCliente = ?";
        
        try{
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            
            ps.executeUpdate();
            ps.close();
            
        }catch(SQLException sqlE){
            System.out.println("Error al borrar\n"+sqlE);
        }
    }

}
