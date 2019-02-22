/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectolibreria;

/**
 * Clase libro creada para generar libros.
 *@author CamiloAlvarez
 *@version 1.0
*/
public class Libro {
    
     /**
     *variable que sirve para identificar el libro 
     */
    private int id_libro;
    /**
     *variable que sirve para indicar el nombre del libro 
     */
    private String nombre;
    /**
     *variable que sirve para indicar el autor del libro 
     */
    private String autor;
    /**
     *variable que sirve para indicar la editorial del libro 
     */
    private String editorial;
     /**
     *variable que sirve para indicar la version del libro 
     */
    private String version;
     /**
     *variable que sirve para indicar el genero del libro 
     */
    private String genero;
     /**
     *variable que sirve para indicar el costo del libro 
     */
    private double costo;
     /**
     *variable que sirve para indicar la cantidad de libros iguales que hay 
     */
    private int cantidad;

    /**
     * Constructor que recibe todos los parametros  para ejecutar.
     * @param id_libro indica el identificador del libro
     * @param nombre indica el nombre del libro
     * @param autor indica el autor del libro
     * @param editorial indica la editorial del libro
     * @param version indica la version del libro
     * @param genero indica el genero del libro
     * @param costo indica el costo del libro
     * @param cantidad indica la cantidad de libros iguales que hay
     */
    public Libro(int id_libro, String nombre, String autor, String editorial, String version, String genero, double costo, int cantidad) {
        this.id_libro = id_libro;
        this.nombre = nombre;
        this.autor = autor;
        this.editorial = editorial;
        this.version = version;
        this.genero = genero;
        this.costo = costo;
        this.cantidad = cantidad;
    }
     /**
      * @author CamiloAlvarez
      * funcion que agrega todas las caracteristicas del libro
      * @version 1.0
     */
    private void agregarLibro(){
        
    }
    /**
     * @author CamiloAlvarez
     * funcian que modifica las caracteristicas del libro
     * @version 1.0
     */
    private void modificarLibro(){
        
    }
    /**
     * @author CamiloAlvarez
     * funcion que elimina un libro
     * @version 1.0
     */
    private void eliminarLibro(){
        
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
}
