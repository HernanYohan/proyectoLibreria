/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectolibreria;

import java.util.List;

/**
 *clase inventario la cual contiene todos los libros
 * @author CamiloAlvarez
 * @version 1.0
 */
public class Inventario{
    /**
     * variable que identifica el inventario
     */
    private int id_inventario;
    /**
     *variable, llave foranea que relaciona la clase libro con inventario
     */
    private int id_libro;
    /**
     *arreglo que contiene todos los libros
     */
    private Libro[] arregloLibros;

    /**
     * constructor que crea un objero del arreglo
     */
    public Inventario() {
        arregloLibros = new Libro[10];
    }
   /**
    * @author CamiloAlvarez
    * funcion que muestra el arreglo de libros
    * @version 1.0
    */
    public void mostrarLibros(){
        
    }
    /**
     * @author CamiloAlvarez
     * funcion que clasifica por genero los libros
     * @version 1.0
     */
    public void clasificarLibros(){
        
    }
    /**
     * @author CamiloAlvarez
     * funcion que busca un libro en especifico
     * @version 1.0
     */
    public void buscarLibro(){
        
    }
    /**
     * @author CamiloAlvarez
     * funcion que selecciona el libro mas caro
     * @version 1.0
     */
    public void libroMasCaro(){
        
    }
     /**
     * @author CamiloAlvarez
     * funcion que selecciona el libro menos caro
     * @version 1.0
     */
    public void libroMenosCaro(){
        
    } 
 /**
     * @author CamiloAlvarez
     * funcion que valida la cantidad minima de cada libro 
     * @version 1.0
     */
    public void libroCantidadMinimo() {
    }

    public int getId_inventario() {
        return id_inventario;
    }

    public void setId_inventario(int id_inventario) {
        this.id_inventario = id_inventario;
    }

    public int getId_libro() {
        return id_libro;
    }

    public void setId_libro(int id_libro) {
        this.id_libro = id_libro;
    }

    public Libro[] getArregloLibros() {
        return arregloLibros;
    }

    public void setArregloLibros(Libro[] arregloLibros) {
        this.arregloLibros = arregloLibros;
    }
    
    
    
}
