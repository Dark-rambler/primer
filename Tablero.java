
package paquete;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;


public class Tablero extends JFrame {
    int alto;
    int ancho;
    Hilo hilo;
    public Tablero(){
      ancho=500;
      alto=500;
      this.setBounds(0, 0,alto , ancho);
      this.setLocationRelativeTo(null);
      this.setVisible(true);
      this.setResizable(false);
      this.setDefaultCloseOperation(EXIT_ON_CLOSE);
      

      
      
      hilo = new Hilo (this);
      hilo.start();
      
    }
            
    public void dibujar(){
      
     Graphics g = this.getGraphics();
     g.setColor(Color.black);
     g.fillRect(0, 0, alto, ancho);
    }
    
    public void actualizar(){}
}
