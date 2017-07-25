
import com.mitoire.paratienda.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Franco
 */
public class Regalos {

    public Regalos() {
    }
    
    
    public static void main( String[ ] arguments) {
        Tienda kiosco = new Tienda();
        kiosco.addArticulo("A1", "gaseosa", "15", "10");
        kiosco.addArticulo("B2", "Lechita", "20", "50");
        kiosco.addArticulo("A1", "jh", "8", "1");
        kiosco.addArticulo("B2", "Lejhghchita", "5", "34");
        kiosco.mostrarArticulos();
       
        
    
    }
}
