/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqturistico.modelo;

import java.time.LocalDate;

/**
 *
 * @author daniel
 */
public class Paquete {
    private int idPaquete;
    private int idCliente;
    private int idAlojamiento;
    private int idMenu;
    private int idTransporte;
    LocalDate fechaDesde;
    LocalDate fechaHasta;
    private int precioFinal;
    private int cantidadPersonas;
    private boolean activo;

    public Paquete(int idPaquete, int idCliente, int idAlojamiento, int idMenu, int idTransporte, LocalDate fechaDesde, LocalDate fechaHasta, int precioFinal, int cantidadPersonas, boolean activo) {
        this.idPaquete = idPaquete;
        this.idCliente = idCliente;
        this.idAlojamiento = idAlojamiento;
        this.idMenu = idMenu;
        this.idTransporte = idTransporte;
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
        this.precioFinal = precioFinal;
        this.cantidadPersonas = cantidadPersonas;
        this.activo = activo;
    }

    public Paquete(int idCliente, int idAlojamiento, int idMenu, int idTransporte, LocalDate fechaDesde, LocalDate fechaHasta, int precioFinal, int cantidadPersonas, boolean activo) {
        this.idCliente = idCliente;
        this.idAlojamiento = idAlojamiento;
        this.idMenu = idMenu;
        this.idTransporte = idTransporte;
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
        this.precioFinal = precioFinal;
        this.cantidadPersonas = cantidadPersonas;
        this.activo = activo;
    }
    
    public Paquete(){
    }

    public int getIdPaquete() {
        return idPaquete;
    }

    public void setIdPaquete(int idPaquete) {
        this.idPaquete = idPaquete;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdAlojamiento() {
        return idAlojamiento;
    }

    public void setIdAlojamiento(int idAlojamiento) {
        this.idAlojamiento = idAlojamiento;
    }

    public int getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(int idMenu) {
        this.idMenu = idMenu;
    }

    public int getIdTransporte() {
        return idTransporte;
    }

    public void setIdTransporte(int idTransporte) {
        this.idTransporte = idTransporte;
    }

    public LocalDate getFechaDesde() {
        return fechaDesde;
    }

    public void setFechaDesde(LocalDate fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    public LocalDate getFechaHasta() {
        return fechaHasta;
    }

    public void setFechaHasta(LocalDate fechaHasta) {
        this.fechaHasta = fechaHasta;
    }

    public int getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(int precioFinal) {
        this.precioFinal = precioFinal;
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Paquete{" + "idPaquete=" + idPaquete + ", idCliente=" + idCliente + ", idAlojamiento=" + idAlojamiento + ", idMenu=" + idMenu + ", idTransporte=" + idTransporte + ", fechaDesde=" + fechaDesde + ", fechaHasta=" + fechaHasta + ", precioFinal=" + precioFinal + ", cantidadPersonas=" + cantidadPersonas + ", activo=" + activo + '}';
    }
    
    
}
