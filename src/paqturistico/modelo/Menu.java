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
public class Menu {
    private int idMenu;
    private String tipo;
    private int precio;
    private int idAlojamiento;
    private boolean activo;

    public Menu(int idMenu, String tipo, int precio, int idAlojamiento, boolean activo) {
        this.idMenu = idMenu;
        this.tipo = tipo;
        this.precio = precio;
        this.idAlojamiento = idAlojamiento;
        this.activo = activo;
    }

    public Menu(String tipo, int precio, int idAlojamiento, boolean activo) {
        this.tipo = tipo;
        this.precio = precio;
        this.idAlojamiento = idAlojamiento;
        this.activo = activo;
    }
    
    public Menu () {        
    }

    public int getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(int idMenu) {
        this.idMenu = idMenu;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getIdAlojamiento() {
        return idAlojamiento;
    }

    public void setIdAlojamiento(int idAlojamiento) {
        this.idAlojamiento = idAlojamiento;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Menu{" + "idMenu=" + idMenu + ", tipo=" + tipo + ", precio=" + precio + ", idAlojamiento=" + idAlojamiento + ", activo=" + activo + '}';
    }
    
    
}
