/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mitoire.paratienda;

import java.util.Collections;
import java.util.LinkedList;

/**
 *
 * @author Franco
 */
public class Tienda {
    private LinkedList catalogo = new LinkedList();
 
    public void addArticulo(String id, String nombre, String detalle, String cantidad) {
        Articulo art = new Articulo(id, nombre, detalle, cantidad);
        catalogo.add(art);
    };
    
    public Articulo getArticulo(int i) {
        return (Articulo) catalogo.get(i);
    }
    
    public int getSize () {
        return catalogo.size();
    }
    
    public void sort() {
        Collections.sort(catalogo);
    }
    
    public void mostrarArticulos() {
        Articulo temp;
        sort();
        for (int i = 0; i<this.catalogo.size();i++) {
            temp = (Articulo) catalogo.get(i);
            temp.mostrarArticulo();
        }
    }
}
