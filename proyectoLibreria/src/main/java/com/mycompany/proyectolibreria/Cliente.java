/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectolibreria;

    /**
     * Clase Cliente creada para almacenar los datos de los clientes de la libreria.....
     * @author Hernan
     * @version 1.0
     */
public class Cliente {
     /**
        variable que sirve como llave foranea para enlazar con las demas clases
    */
    private int id_cedula;
     
    /**
        variable que aloja el nombre de cada cliente
    */
    private String nombre;
    
    /**
        variable que aloja el apellido de cada cliente
    */
    private String apellido;
    
    /**
        variable que aloja la direccion de residencia de cada cliente
    */
    private String direccion;
    
    /**
        variable que aloja el numero de telefono de cada cliente
    */
    private double telefono;
    
    /**
     *  Constructor de recibe todos los parametros  para ejecutar.
     * @param id_cedula indica la cedula para aliarlo a cada factura
     * @param nombre indica el nombre de cada cliente
     * @param apellido indica el nombre de cada cliente
     * @param direccion indica el apellido de cada cliente
     * @param telefono indica el telefono de cada cliente
     */

    public Cliente(int id_cedula, String nombre, String apellido, String direccion, double telefono) {
        this.id_cedula = id_cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    /**
    * @autor Hernan
    *Funcion que permitira  agregar cada cliente con sus respectivos datos
    * version 1.0
    */
    public void agregarCliente(){
    
    }

    /**
    * @author Hernan
    * *Funcion que permitira  modificar los diferentes datos de  cada cliente 
    * version 1.0
    */    
    public void modificarCliente(){
    
    }
    /**
    * @author Hernan
    * *Funcion que permitira  mostrar los datos de cada cliente 
    * version 1.0
    */    
    public void mostrarCliente(){
    
    }
    /**
   * @author Hernan
   * *Funcion que permitira  eliminar los datos de cada cliente 
   * version 1.0
   */    
    public void eliminarCliente(){
    
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getTelefono() {
        return telefono;
    }

    public void setTelefono(double telefono) {
        this.telefono = telefono;
    }
    
     public int getId_cedula() {
        return id_cedula;
    }

    public void setId_cedula(int id_cedula) {
        this.id_cedula = id_cedula;
    }
   
}
