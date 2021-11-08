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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import paqturistico.modelo.Conexion;
import paqturistico.modelo.Destino;
import paqturistico.modelo.Transporte;

/**
 *
 * @author daniel
 */
public class TransporteData {
    private Connection con;
    private Conexion conexion;

    public TransporteData(Conexion conexion) {
        try {
            this.conexion=conexion;
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
                ps.setInt(2, t.getPrecio());
                ps.setInt(3, t.getIdDestino().getIdDestino());
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
    
    public void borrarTransporte(int id){
        String sql = "UPDATE transporte SET activo = 0 WHERE idTransporte = ?";
        
        try{
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            
            ps.executeUpdate();
            ps.close();
            
        }catch(SQLException sqlE){
            System.out.println("Error al borrar\n"+sqlE);
        }
    }
    public List<Transporte> obtenerTransportes (){
        List<Transporte> trans = new ArrayList<>();
        Transporte t = new Transporte();
        Destino d = new Destino(); 
        String sql ="SELECT * FROM transporte WHERE transporte.activo=1;";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                d = buscarDestino(rs.getInt("idDestino"));
                t.setIdTransporte(rs.getInt("idTransporte"));
                t.setTipo(rs.getString("tipo"));
                t.setPrecio(rs.getInt("precio"));
                t.setIdDestino(d);
                t.setActivo(rs.getBoolean("activo"));             
               
                trans.add(t);
            }
            ps.close();
        } catch (SQLException ex) {
            System.out.println("error obteniendo transportes" + ex);
        }
        return trans;
    }
    public List<Transporte> obtenerTransportesPorDestino(String destino){
        List<Transporte> trans = new ArrayList<>();
        Transporte t = new Transporte();
        Destino d = new Destino();        
        String sql ="SELECT * FROM transporte, destino WHERE destino.nombre= ? AND transporte.idDestino = destino.idDestino AND destino.activo = 1 AND transporte.activo=1;";
        
        try{
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, destino);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                d = buscarDestino(rs.getInt("idDestino"));
                t.setIdTransporte(rs.getInt("idTransporte"));
                t.setTipo(rs.getString("tipo"));
                t.setPrecio(rs.getInt("precio"));
                t.setIdDestino(d);
                t.setActivo(rs.getBoolean("activo"));             
               
                trans.add(t);
               
            }
            ps.close();
            
        }catch(SQLException sqlE){
            System.out.println("error obteniendo transportes" + sqlE);
        }  
        return trans;
    }
    
     public Destino buscarDestino (int id) {      
        DestinoData dd = new DestinoData(conexion);         
        return dd.buscarDestino(id);

    }
}
