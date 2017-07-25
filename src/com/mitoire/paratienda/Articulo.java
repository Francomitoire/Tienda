/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mitoire.paratienda;

/**
 *
 * @author Franco
 */
public class Articulo implements Comparable {
    private String id ;
    private String nombre;
    private double detalle; //detalle es el precio unitario
    private int cantidad;
    private double precio;
    private double descuento;

    public Articulo(String id, String nombre, String detalle, String cantidad) {
        this.id = id;
        this.nombre = nombre;
        this.detalle = Double.parseDouble(detalle);
        this.cantidad = Integer.parseInt (cantidad);
        if (this.cantidad > 10) {
            this.descuento = 0.5;

        }
        else  {
            this.descuento = 0;
        }
        this.precio = this.detalle*(1-this.descuento)*this.cantidad;

            
    }



    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getDetalle() {
        return detalle;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public int compareTo(Object o) {
        Articulo temp = (Articulo) o;
        if (this.precio < temp.precio) 
            return 1;
        else if (this.precio > temp.precio)
            return -1;
        return 0;
       
    }
    
    public void mostrarArticulo() { 
        System.out.println("Id: "+this.id);
        System.out.println("Nombre: " +this.nombre);
        System.out.println("Precio Unitario: " +this.detalle);
        System.out.println("Cantidad: "+this.cantidad);
        System.out.println("Precio total: " +this.precio);
        System.out.println("Descuento: " +this.descuento);
    }
    
    
}
