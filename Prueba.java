import java.awt.image.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.io.*;

public class Prueba extends JFrame{
    public int ancho=820;
    public int alto=580;

     
 public Prueba(){
    
  
         Toolkit kit=Toolkit.getDefaultToolkit();
         Dimension tamaniopantalla=kit.getScreenSize();
         int anchopantalla=tamaniopantalla.width;
         int altopantalla=tamaniopantalla.height;
         setTitle("<<<<<CLASE DE PRUEBA>>>>>");
         setLocation((anchopantalla - ancho)/2,(altopantalla - alto)/2 );
         setSize(ancho, alto);
         setResizable(false);
         getContentPane().setLayout(null);
         
       ActionListener accion = new java.awt.event.ActionListener()
       {
         public void actionPerformed(java.awt.event.ActionEvent evento){
                   Object obj=evento.getSource();

              //
              
              //
                        }
                            
       };
       
       //aqui se anaden los eventos
       
          
    }
   public static void main(String args[]) {
        new Prueba().setVisible(true);
                                             }
}
