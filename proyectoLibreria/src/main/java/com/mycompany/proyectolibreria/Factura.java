/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectolibreria;

/**
 * Clase Factura creada para mostrar al cliente su compra.....
 * @author Hernan
 * @version 1.0
 */
public class Factura {
    /**
    variable que sirve como llave foranea para enlazar con las demas clases
    */
    private int id_factura;
    
    /**
        Variable que tiene almacenada la fecha en que se realizo la factura
    */
    private String fechaFactura;
    
     /**
     Variable que describe lo que se compro en la factura
     */
    private String descripcion;
    
    /**
    Variable que suma las ventas y muestra el valor final 
    */
    private double valorTotal;
    
    /**
     * Constructor de recibe todos los parametros  para ejecutar.
     * @param id_factura indica el numero de registro de la factura
     * @param fechaFactura indica e dia que se hizo la factura
     * @param descripcion indica uno a uno los libros comprados
     * @param valorTotal  indica el calor absoluto de la venta 
     */

    public Factura(int id_factura, String fechaFactura, String descripcion, double valorTotal) {
        this.id_factura = id_factura;
        this.fechaFactura = fechaFactura;
        this.descripcion = descripcion;
        this.valorTotal = valorTotal;
    }
    
    /**
     * Funcion que permitira imprimir factura describiendo la serie, la fecha, la descripcion  y el valor total
     */
    public void imprimirFactura(){
    
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
    
    public int getId_factura() {
        return id_factura;
    }

    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }
   
}
