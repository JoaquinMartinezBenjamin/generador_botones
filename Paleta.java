import java.awt.image.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.io.*;

public class Paleta extends JFrame{

    public int ancho=720;
    public int alto=480;
   
    public JTextArea area;
    public JScrollPane barra;
     public JButton crearVentana,text;
     
     
          public String librerias="";
     public String declaracionClase="";
     public String dimensionesVentana="";
     public String declaracionVariables="";
 public String codigoBoton="";
     public String nuevaVariable="";
    // public String texto;
    String codigoBotones="";
     
//declaracionVariables+= "/////aqui van las variables\n";
 public Paleta(String boton){
    this.codigoBoton=boton;
          area = new JTextArea(100,50);
          area.setEditable(false);
          barra     = new JScrollPane(area);

             
                 
                

         crearVentana=new JButton("Crear");
         //crearVentana.setFont(new java.awt.Font("Comic Sans MS",3,30));
        // crearVentana.setBackground(Color.white);
         crearVentana.setBounds(10,20,120,30);

         getContentPane().add (crearVentana);

         Toolkit kit=Toolkit.getDefaultToolkit();
         Dimension tamaniopantalla=kit.getScreenSize();
         int anchopantalla=tamaniopantalla.width;
         int altopantalla=tamaniopantalla.height;
         setTitle("                             CODIGO");
         setLocation((anchopantalla - ancho)/2,(altopantalla - alto)/2 );
         setSize(ancho, alto);
         setResizable(false);
         getContentPane().setLayout(null);
         
          barra.setBounds(300, 20, 500, 510);
          getContentPane().add(barra);
 
            ActionListener accion = new java.awt.event.ActionListener()
       {
         public void actionPerformed(java.awt.event.ActionEvent evento){
                   Object obj=evento.getSource();

                   if (obj== crearVentana){  
                     
                       //area.append(librerias());
                       //area.append(declaracionClase());
                       //area.append(dimensionesVentana());
                       //setDeclaracionVariables();
                       
                       //area.append(getDeclaracionVariables());
                       
                       RecolectorCodigo recolector= new RecolectorCodigo();
                     area.append(codigoBoton);
        area.append(recolector.getBotones()+"hola");
                       
                   
                                    }
                        }
                            
       };
         crearVentana.addActionListener(accion);
         setVisible(true);
          show();
    }
    public String librerias(){
                 librerias= "";
                 librerias+= " * Write a description of class  here.\n"+
                     " * \n"+
                     " * @author (your name) \n"+
                     " * @version (a version number or a date)\n"+
                     " */\n";
                                       librerias+=           "import java.awt.*;\n";
                  librerias+=           "import javax.swing.*;\n";
                  librerias+=           "import java.io.*;\n";
    return librerias;
    }
    
    public String declaracionClase(){
       declaracionClase+=     "public class Prueba extends JFrame{\n";
        return declaracionClase;
    }
    
    public String dimensionesVentana(){
         dimensionesVentana+=   " public int ancho=820;\n";
                  dimensionesVentana+=   " public int alto=580;\n";
                  return dimensionesVentana;
    }
    
    
     public void setDeclaracionVariables(){
        
        declaracionVariables+= nuevaVariable+"\n";
       //System.out.println(nuevaVariable);
      
    }
    public void setCodigoBoton( String cod){this.codigoBoton=cod;}
    public String getCodigoBoton (){System.out.println(codigoBoton);return codigoBoton;}
    
    public String getDeclaracionVariables(){  
        
        return declaracionVariables;}
        
   public static void main(String args[]) {
       // new Paleta().setVisible(true);
                                             }
}
