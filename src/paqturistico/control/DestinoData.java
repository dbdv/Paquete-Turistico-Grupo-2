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
import paqturistico.modelo.Destino;

/**
 *
 * @author daniel
 */
public class DestinoData {
    private Connection con;

    public DestinoData(Conexion conexion) {
        try {
            this.con = conexion.getConexion();
            System.out.println("Conectado");
        } catch (SQLException ex) {
            System.out.println("Error en la conexión");
        }
    }
    
    public void guardarDestino(Destino dest) {
        String sql = "INSERT INTO destino(nombre, pais) VALUES (?,?)";

        try {
            try (PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {  //Prepara la sentencia para SQL
                ps.setString(1, dest.getNombre());
                ps.setString(2, dest.getPais());
                
                

                ps.executeUpdate(); //NO PONER PARAMETROS
                ResultSet rs = ps.getGeneratedKeys(); //Recupero el ID (idCliente)
                if (rs.next()) {
                    System.out.println("Destino " + dest.getNombre() + ", cargado correctamente.");
                    
                    dest.setIdDestino(rs.getInt("idDestino"));
                    System.out.println("id del destino: " + dest.getIdDestino());
                    
                }
                
                ps.close();
            }
        } catch (SQLException ex) {
            System.out.println("Error al insertar destino\n" + ex);
        }
    }
    
    //BORRADO LOGICO, habría que agregar un atributo activo
    public void borrarDestino(int id){
        String sql = "UPDATE destino SET activo = 0 WHERE idDestino = ?";
        
        try{
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            
            ps.executeUpdate();
            ps.close();
            
        }catch(SQLException sqlE){
            System.out.println("Error al borrar\n"+sqlE);
        }
    }
    
    //borradoFisico
    public void eliminarDestino(int id){
        String sql = "DELETE FROM destino WHERE idDestino = ?";
        
        try{
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            
            ps.execute();
            ps.close();
            
        }catch(SQLException sqlE){
            System.out.println("Error al borrar\n"+sqlE);
        }
    }

}
