/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mitoire.gui;

import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Franco
 */
public class Principal extends JFrame {

    public Principal () {
        super("Principal");
        //pack();
        setSize(350, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout diseño = new FlowLayout();
        setLayout(diseño);
        JButton cargarArticulo = new JButton("Cargar Articulo"); 
        JButton borrarArticulo = new JButton("Borrar Articulo");
        add(cargarArticulo);
        add(borrarArticulo);
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        Principal vent = new Principal();
        
    }
    
}
