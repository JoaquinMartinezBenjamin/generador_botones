import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Object.*;
import java.io.*;

public class Boton extends JFrame{

    public int ancho=520;
    public int alto=380;
   
    public JTextArea area;
    public JScrollPane barra;
     public JButton previsualizar;
     public JButton colorBoton;
     public JButton textoBoton;
     public JButton generarCodigo;
     public String librerias;
     public Color color;
     public String codigoB="";
   
     public String color2="";
       public String texto="";

     	public Image image=null;
     	public float trans=0.9f;
     	public Graphics2D g2;
 public Boton(){
  
    
    ImageIcon icon = new ImageIcon("All-mail-48.png");
   //****************************
        previsualizar=new JButton("Previsualizar",icon);

         previsualizar.setBounds(370,150,140,60);
         getContentPane().add (previsualizar);
         //*****************************
           generarCodigo=new JButton("GenerarCodigo");

         generarCodigo.setBounds(370,250,140,60);
         getContentPane().add (generarCodigo);
         //*****************************
         
         colorBoton = new JButton ("CambiarColor");
         colorBoton.setBounds(10,20,120,20);
         getContentPane().add(colorBoton);
         //********************************
         
         textoBoton = new JButton ("Texto del boton");
         textoBoton.setBounds(10,50,120,20);
         getContentPane().add(textoBoton);
         //********************************

         Toolkit kit=Toolkit.getDefaultToolkit();
         Dimension tamaniopantalla=kit.getScreenSize();
         int anchopantalla=tamaniopantalla.width;
         int altopantalla=tamaniopantalla.height;
         setTitle("                                     <BOTONES>");
         setLocation((anchopantalla - ancho)/2,(altopantalla - alto)/2 );
         setSize(ancho, alto);
         setResizable(false);
         getContentPane().setLayout(null);
     
            ActionListener accion = new java.awt.event.ActionListener()
       {
         public void actionPerformed(java.awt.event.ActionEvent evento){
                   Object obj=evento.getSource();
                     
                        
                 /*  if (obj== previsualizar){   
                     (  
                  
                                    }*/
        if( obj==generarCodigo){
        codigoB+=  "//*************Boton****************//"+"\n";
        codigoB+=  texto+"=new JButton(\""+texto+"\");"+"\n";   
        codigoB+=  texto+".setBounds(370,250,140,60);"+"\n";
        //codigo+=  texto+".setBackground("+color2+");"+"\n";
        codigoB+=  texto+".setBackground(new java.awt.Color("+color2+"));"+"\n";
        codigoB+=  "getContentPane().add ("+texto+");"+"\n";
      // declaracionVariables+=texto;
     //   Codigo codigoBoton= new Codigo();
       // codigoBoton.getcompilacionCodigo(codigoB);
       setTexto(texto);
       //System.out.println (codigoB);
       CodigoBoton nuevoBoton= new CodigoBoton(codigoB);
       
       RecolectorCodigo nuevoCodigo= new RecolectorCodigo();
         nuevoCodigo.setCodigoBotones(nuevoBoton.getCodigo());
         nuevoCodigo.getBotones();
      Paleta parametroPaleta= new Paleta(codigoB);
      parametroPaleta.setCodigoBoton(nuevoBoton.getCodigo());
      JOptionPane.showMessageDialog(null,nuevoBoton.getCodigo());
       
      //   BarraHerramientasPaleta BH= new BarraHerramientasPaleta();
        // BH.texto=texto;
       //  BarraHerramientasPaleta.texto=texto;
         dispose();
        }
                                    
        if (obj==colorBoton){
                 MuestraColores eligiendoColor= new MuestraColores();
                 eligiendoColor.elegirColor();
                 previsualizar.setBackground(eligiendoColor.getColor());
                 String color= String.valueOf(eligiendoColor.getColor());
                 getContentPane().repaint ();
                color2= "";
                     int i=1;
            while(i<color.length()){
   
            if(color.charAt(i)==','){color2+=color.charAt(i);}
            if(color.charAt(i)=='0'){color2+=color.charAt(i);}
            if(color.charAt(i)=='1'){color2+=color.charAt(i);}
            if(color.charAt(i)=='2'){color2+=color.charAt(i);}
            if(color.charAt(i)=='3'){color2+=color.charAt(i);}
            if(color.charAt(i)=='4'){color2+=color.charAt(i);}
            if(color.charAt(i)=='5'){color2+=color.charAt(i);}
            if(color.charAt(i)=='6'){color2+=color.charAt(i);}
            if(color.charAt(i)=='7'){color2+=color.charAt(i);}
            if(color.charAt(i)=='8'){color2+=color.charAt(i);}
            if(color.charAt(i)=='9'){color2+=color.charAt(i);}
 
           i++;
        }  
       // System.out.println(color);
       // System.out.println(color2);
      
                    }         
                    
                    if (obj==textoBoton){
                texto= JOptionPane.showInputDialog ("Introduzca el texto del boton");
       
                previsualizar.setText(texto);
                Icon insecto = new ImageIcon("Book Library-48.png");
                previsualizar.setIcon(insecto);
         
                getContentPane().repaint ();
                    }
                    
                    
                    
                        }
                            
       };
         previsualizar.addActionListener(accion);
         colorBoton.addActionListener(accion);
         textoBoton.addActionListener(accion);
          generarCodigo.addActionListener(accion);
          
    }
    public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto= texto;
	}
	public String declaracionBoton(){
	  
	    texto=     "public JButton "+texto;
	   return texto;}
    public void setColor( Color color){ this.color=color;}
    public Color getColor(){ return color;}
    
 
   public static void main(String args[]) {
        new Boton().setVisible(true);
                                             }
}