/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Hilo extends Thread {
    Tablero tablero;
    public Hilo(Tablero tablero){
    this.tablero = tablero;
    }
    
    @Override
    public void run(){
        
        tablero.actualizar();
        tablero.dibujar();
    
        try {
            sleep(30);
        } catch (InterruptedException ex) {
            Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
        }
                
                
        
    }
}
