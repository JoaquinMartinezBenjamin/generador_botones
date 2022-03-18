// JColorChooser
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MuestraColores extends JFrame
{
    private JButton cambiaColor;
    private Color color = Color.lightGray;
    private Container c;


    public MuestraColores(){
                    super (" Utilizando JColorChooser");
        c= getContentPane();
        c.setLayout( new FlowLayout () );
        setSize( 400,130);
         //show();
    }// fin del constructor
    
    
    public void elegirColor (){
                color= JColorChooser.showDialog(
                MuestraColores.this, "Elija un color", color);
                
                if (color== null)
                         color = Color.lightGray;
                
                c.setBackground (color);
                c.repaint ();
                setColor(color);
       
    }
    
    public void setColor ( Color color){
        this.color= color;}
        
    public Color getColor (){
        return color;}

      /*  public static void main (String args[]){
        
        MuestraColores app = new MuestraColores();
        
        
        app.addWindowListener(
        new WindowAdapter()
        {
            
            public void WindowClosing ( WindowEvent e)
            {                
                System.exit(0);
            }// fin del método WindowClosing
            
        }// fin de la clase interna anónima
                                ); // fin de  addWindowListener
                                           }//fin de main */
}// fin de la clase
    

