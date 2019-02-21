/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectolibreria;

/**
 *
 * @author CamiloAlvarez
 */
public class Cliente {
    
    private String nombre;
    private String apellido;
    private String direccion;
    private double telefono;

    public Cliente(String nombre, String apellido, String direccion, double telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
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
    
    
    
    
    
    
 /**
 *
 * @author Hernan
 */
    
    public void agregarCliente(){
    
    }

 /**
 *
 * @author Hernan
 */    
    public void modificarCliente(){
    
    }
 /**
 *
 * @author Hernan
 */   
    public void mostrarCliente(){
    
    }
 /**
 *
 * @author Hernan
 */   
    public void eliminarCliente(){
    
    }
    
}
