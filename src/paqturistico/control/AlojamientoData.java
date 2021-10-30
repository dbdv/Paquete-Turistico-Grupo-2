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
import paqturistico.modelo.Alojamiento;
import paqturistico.modelo.Conexion;

/**
 *
 * @author daniel
 */
public class AlojamientoData {
    private Connection con;

    public AlojamientoData(Conexion conexion) {
        try {
            this.con = conexion.getConexion();
            System.out.println("Conectado");
        } catch (SQLException ex) {
            System.out.println("Error en la conexión");
        }
    }
    
    public void guardarAlojamiento(Alojamiento alojamiento) {
        String sql = "INSERT INTO alojamiento(nombre, tipo, precio, idDestino, activo) VALUES (?,?,?,?,?)";

        try {
            try (PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {  //Prepara la sentencia para SQL
                ps.setString(1, alojamiento.getNombre());
                ps.setString(2, alojamiento.getTipo());
                ps.setInt(3, alojamiento.getPrecio());
                ps.setInt(4,alojamiento.getIdDestino());
                ps.setBoolean(5, alojamiento.isActivo());
                

                ps.executeUpdate(); //NO PONER PARAMETROS
                ResultSet rs = ps.getGeneratedKeys(); //Recupero el ID (idCliente)
                if (rs.next()) {
                    System.out.println("Alojamiento " + alojamiento.getNombre() + ", cargado correctamente.");
                    //cliente.setIdCliente(1);
                    alojamiento.setIdAlojamiento(rs.getInt("idAlojamiento"));
                    System.out.println("id del alojamiento: " + alojamiento.getIdAlojamiento());
                    
                }
                
                ps.close();
            }
        } catch (SQLException ex) {
            System.out.println("Error al insertar alojamiento\n" + ex);
        }
    }
    
    public void borrarAlojamiento(int id){
        String sql = "UPDATE alojamiento SET activo = 0 WHERE idAlojamiento = ?";
        
        try{
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            
            ps.executeUpdate();
            ps.close();
            
        }catch(SQLException sqlE){
            System.out.println("Error al borrar\n"+sqlE);
        }
    }
    
    public void actualizarAlojamiento(Alojamiento alojamiento){
        
        String sql = "UPDATE alojamiento SET nombre = ?, tipo = ?, precio = ?, activo = ? WHERE idAlojamiento = ?";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, alojamiento.getNombre());
            ps.setString(2, alojamiento.getTipo());
            ps.setInt(3, alojamiento.getPrecio());
            ps.setBoolean(4, alojamiento.isActivo());
            ps.setInt(5, alojamiento.getIdAlojamiento());

            ps.executeUpdate();
            
        }catch(SQLException sqlE){
            System.out.println("error al actualizar + sqlE");
        }
    }
    
    public Alojamiento obtenerAlojamiento(String nombre){
        String sql = "SELECT * FROM alojamiento WHERE nombre = ?";
        Alojamiento alojamiento = new Alojamiento();
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, nombre);
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                
                alojamiento.setIdAlojamiento(rs.getInt("idAlojamiento"));
                alojamiento.setNombre(rs.getString("nombre"));
                alojamiento.setTipo(rs.getString("tipo"));
                alojamiento.setActivo(rs.getBoolean("activo"));
                alojamiento.setPrecio(rs.getInt("precio"));
                alojamiento.setIdDestino(rs.getInt("idDestino"));
                
            }else{
                System.out.println("No se pudo obtener el alojamiento pero no hubo exception");
            }
            
        }catch(SQLException sqlE){
            System.out.println("error al obtener alojamiento" + sqlE);
        }
        
        return alojamiento;
    }

}
