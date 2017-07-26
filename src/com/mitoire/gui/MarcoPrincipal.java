/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mitoire.gui;

import java.awt.*;
import javax.swing.*;


/**
 *
 * @author Franco
 */
public class MarcoPrincipal extends JFrame {

    public MarcoPrincipal () {
        super("Principal");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Añadir barra de menu
        /*JMenuBar mb = new JMenuBar();
        JMenu menu1 = new JMenu("Articulos");
        JMenuItem mi1 = new JMenuItem("Cargar Articulo");
        JMenuItem mi2 = new JMenuItem("Borrar Articulo");
        JMenuItem mi3 = new JMenuItem("Cuentas a cobrar");
        JMenuItem mi4 = new JMenuItem("Cuentas a pagar");
        menu1.add(mi1);
        menu1.add(mi2);
        menu1.addSeparator();
        menu1.add(mi3);
        menu1.add(mi4);
        mb.add(menu1);*/
        
       //Añadir componentes a la ventana principal
        setJMenuBar(new Menu().añadirMenu());
        

        setVisible(true);

         

    }
    

    
    public static void main(String[] args) {
        //MarcoPrincipal vent = new MarcoPrincipal();
        CargarArticulo art = new CargarArticulo();
        
        
    }
    
}
