/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqturistico.modelo;

/**
 *
 * @author daniel
 */
public class Destino {
    private int idDestino;
    private String nombre;
    private String pais;

    public Destino(int idDestino, String nombre, String pais) {
        this.idDestino = idDestino;
        this.nombre = nombre;
        this.pais = pais;
    }

    public Destino(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    public Destino() {
    }

    public int getIdDestino() {
        return idDestino;
    }

    public void setIdDestino(int idDestino) {
        this.idDestino = idDestino;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Destino{" + "idDestino=" + idDestino + ", nombre=" + nombre + ", pais=" + pais + '}';
    }
    
    
}
