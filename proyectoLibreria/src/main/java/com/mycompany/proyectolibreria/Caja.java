/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectolibreria;

/**
 * Clase Caja creada para levar la contabilidad de la libreria.
 * @author Hernan
 * @version 1.0
 */
public class Caja {
    /**
        variable que sirve como llave primaria para enlazar con las demas clases
    */
    private int id_caja;
    
    /**
        variable que sirve como llave foranea para enlazar con las demas clases
    */
    private int id_venta;
    
    /**
        variable que almacena la base monetaria con la que inicia la caja 
    */
    private double base;
    
    /**
        variable que almacena los ingresos monetarios a la caja
    */
    private double ingresos;
    
    /**
        variable que descuenta lo invertido en la inversion
    */
    private double inversion;
    
    /**
     * Constructor de recibe todos los parametros  para ejecutar.
     * @param id_caja llave primaria de cada caja
     * @param id_venta llave foranea para la clase Venta
     * @param base indica la base con la que inicia la caja
     * @param ingresos indica los ingresos a la caja
     * @param inversion  indica el valor de cada inversion
     */

    public Caja(int id_caja, int id_venta, double base, double ingresos, double inversion) {
        this.id_caja = id_caja;
        this.id_venta = id_venta;
        this.base = base;
        this.ingresos = ingresos;
        this.inversion = inversion;
    }

    
    
    
    /**
    * @autor Hernan
    *Funcion que lleva la contabilidad de la caja menor 
    *@version 1.0
    */
    private void cajamenor(){
    
    }
    
    /**
    *@autor Hernan
    *Funcion que permitira calcular la inversion ideal para hacer la inversion
    *@version 1.0
    */
    private void calcularInversion(){
    
    }
    
    /**
    *@autor Hernan
    *Funcion que permitira hacer la suma de todos los ingresos
    *@version 1.0
    */
    private void calcularIngresos(){
    
    }
    
    

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getIngresos() {
        return ingresos;
    }

    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }

    public double getInversion() {
        return inversion;
    }

    public void setInversion(double inversion) {
        this.inversion = inversion;
    }

    public int getId_caja() {
        return id_caja;
    }

    public void setId_caja(int id_caja) {
        this.id_caja = id_caja;
    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }
    
}
    
    
    
    

