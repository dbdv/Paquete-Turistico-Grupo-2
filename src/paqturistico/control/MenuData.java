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
import paqturistico.modelo.Menu;

/**
 *
 * @author daniel
 */
public class MenuData {
    private Connection con;

    public MenuData(Conexion conexion) {
        try {
            this.con = conexion.getConexion();
            System.out.println("Conectado");
        } catch (SQLException ex) {
            System.out.println("Error en la conexión");
        }
    }
    
    public void guardarMenu(Menu menu) {
        String sql = "INSERT INTO menu(tipo, precio, idAlojamiento, activo) VALUES (?,?,?,?)";

        try {
            try (PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {  //Prepara la sentencia para SQL
                ps.setString(1, menu.getTipo());
                ps.setInt(2, menu.getPrecio());
                ps.setInt(3, menu.getIdAlojamiento());
                ps.setBoolean(4, menu.isActivo());
                
                

                ps.executeUpdate(); //NO PONER PARAMETROS
                ResultSet rs = ps.getGeneratedKeys(); //Recupero el ID (idCliente)
                if (rs.next()) {
                    System.out.println("Menu tipo: " + menu.getTipo() + ", cargado correctamente.");
                    
                    menu.setIdMenu(rs.getInt("idMenu"));
                    System.out.println("id del menú: " + menu.getIdMenu());
                    
                }
                
                ps.close();
            }
        } catch (SQLException ex) {
            System.out.println("Error al insertar menu\n" + ex);
        }
    }
    
    public void borrarMenu(int id){
        String sql = "UPDATE menu SET activo = 0 WHERE idMenu = ?";
        
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
