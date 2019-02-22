/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectolibreria;

    /**
     * Clase carro creada para almacenar los datos de los clientes de la libreria.....
     * @author Hernan
     * @version 1.0
     */

public class Carro {
    /**
        variable que sirve como llave primaria para enlazar con las demas clases
    */
    private int id_carrito;
    
    /**
        variable que sirve como llave foranea para enlazar con las demas clases
    */
    private int id_venta;
    
    /**
        variable que sirve para elegir la cantidad de ejemplares que quiere comprar cada cliente
    */
    private int cantidad;
    
    /**
     * Constructor de recibe todos los parametros  para ejecutar.
     * @param id_carrito llave primaria
     * @param id_venta llave foranea para enlazar con la clase Venta
     * @param cantidad  indica que cantidad de ejemplares quiere comprar cada cleinte
     */
    public Carro(int id_carrito, int id_venta, int cantidad){
        this.id_carrito = id_carrito;
        this.id_venta = id_venta;
        this.cantidad = cantidad;
    
    } 

    /**
     * @autor Hernan
     *Funcion que permitira  agregar cada articulo al carrito
     *@version 1.0
     */
    public void agregarAlCarrito() {
    }

    /**
    * @autor Hernan
    *Funcion que permitira  editar cada articulo al carrito
    *@version 1.0
    */
    public void editarAlCarrito(){
    
    }
    /**
    * @autor Hernan
    *Funcion que permitira eliminar cada articulo al carrito
    *@version 1.0
    */
    public void eliminarAlCarrito(){
    
    }
    /**
    * @autor Hernan
    *Funcion que permitira mostrar cada articulo al carrito
    *@version 1.0
    */
    public void mostrarElCarrito(){
    
    }

    public int getId_carrito() {
        return id_carrito;
    }

    public void setId_carrito(int id_carrito) {
        this.id_carrito = id_carrito;
    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
   
    
}
  

