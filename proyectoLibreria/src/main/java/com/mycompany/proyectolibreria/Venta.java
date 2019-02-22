/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectolibreria;

import java.sql.Time;

/**
 * @author CamiloAlvarez
 * clase Venta creada para registrar las ventas de cada cliente
 * @version 1.0
 */
public class Venta{
    /**
     * variable, llave primaria que identifica cada venta
     */
    private int id_venta;
    /**
     * variable,llave foranea que relaciona la clase Carrito con Inventario
     */
    private int id_carrito;
    /**
     * variable, llave foranea que relaciona la clase Cliente con Venta
     */
    private int id_cedula;
    /**
     * arreglo que contiene las formas de pago
     */
    private Venta[] formasDePago;
    /**
     * variable que contiene el estado de la venta
     */
    private int estado;
/**
 * Constructor de recibe todos los parametros  para ejecutar.
 * @param id_venta llave primaria para identifiar cada venta
 * @param id_carrito llave foranea para relacionar clases
 * @param id_cedula llave foranea para relacionar clases
 * @param formasDePago arreglo que contiene las formas de pago
 * @param estado  variable que contiene estado de la venta
 */
    public Venta(int id_venta, int id_carrito, int id_cedula, Venta[] formasDePago, int estado) {
        this.id_venta = id_venta;
        this.id_carrito = id_carrito;
        this.id_cedula = id_cedula;
        this.formasDePago = formasDePago;
        this.estado = estado;
    }
   /**
 * @author CamiloAlvarez
 * funcion que seleciona el libro mas vendido
 * @version 1.0
 */
    public void libroMasVendido(){
        
    }
      /**
 * @author CamiloAlvarez
 * funcion que seleciona el libro menos vendido
 * @version 1.0
 */
    
    public void libroMenosVendido(){
        
    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public int getId_carrito() {
        return id_carrito;
    }

    public void setId_carrito(int id_carrito) {
        this.id_carrito = id_carrito;
    }

    public int getId_cedula() {
        return id_cedula;
    }

    public void setId_cedula(int id_cedula) {
        this.id_cedula = id_cedula;
    }

    public Venta[] getFormasDePago() {
        return formasDePago;
    }

    public void setFormasDePago(Venta[] formasDePago) {
        this.formasDePago = formasDePago;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    
}
