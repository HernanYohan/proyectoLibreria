/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectolibreria;

/**
 *
 * @author Hernan
 */
public class Factura {
    
    private String fechaFactura;
    private String descripcion;
    private double valorTotal;

    public Factura(String fechaFactura, String descripcion, double valorTotal) {
        this.fechaFactura = fechaFactura;
        this.descripcion = descripcion;
        this.valorTotal = valorTotal;
    }

    public String getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(String fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    
 /**
 *
 * @author Hernan
 */
    
    public void imprimirFactura(){
    
    }
    
    
    
    
    
}
