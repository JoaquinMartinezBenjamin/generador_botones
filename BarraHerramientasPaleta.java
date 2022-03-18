import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Object.*;
import java.io.*;



public  class  BarraHerramientasPaleta extends JFrame{
    
  public int ancho=820;
    public int alto=580;
   

    
public JTextArea areaNuevaReservacion;
     
    public JMenuItem OpcionCrear;
    public JMenuItem OpcionAltas;
    public JMenuItem OpcionBajas;
    public JMenuItem OpcionCambios;
    public JMenuItem OpcionBorrar;
    public JMenuItem OpcionCrearBoton;
    public JMenuItem OpcionGeneral;
    public JMenuItem OpcionSalir;

    public JMenuBar BarraDeMenus;

    public JMenu menuArchivo;
    public JMenu menuRecuperacion;
    public JMenu menuActualizacion;
    public JMenu menuConsulta;
    public JMenu menuhacercaDe;

    public JToolBar BarraDeHerr;
    
      BarraHerramientasPaleta () {
          
        inicializaComponentes();
                                 }
     
    private void inicializaComponentes()
    {
              Toolkit kit=Toolkit.getDefaultToolkit();
         Dimension tamaniopantalla=kit.getScreenSize();
         int anchopantalla=tamaniopantalla.width;
         int altopantalla=tamaniopantalla.height;
         setTitle("<<<<<Paleta>>>>>");
         setLocation((anchopantalla - ancho)/2,(altopantalla - alto)/2 );
         setSize(ancho, alto);
         setResizable(false);
         getContentPane().setLayout(null);

        
        BarraDeHerr       = new JToolBar();
        BarraDeMenus      = new JMenuBar();
        menuArchivo       = new JMenu();
        menuRecuperacion  = new JMenu();
        OpcionCrear       = new JMenuItem();
        menuActualizacion = new JMenu();
        menuConsulta      = new JMenu();
        menuhacercaDe     = new JMenu();
        OpcionAltas       = new JMenuItem();
        OpcionBajas       = new JMenuItem();
        OpcionCambios     = new JMenuItem();
        OpcionBorrar      = new JMenuItem();
        OpcionCrearBoton  = new JMenuItem();
        OpcionGeneral     = new JMenuItem();
       
        OpcionSalir       = new JMenuItem();
        
        //****************************************
        
               menuRecuperacion.setMnemonic('R');
       menuRecuperacion.setText("Recuperacion");
       menuConsulta.setText("Consulta");
        menuConsulta.setMnemonic('t');

        OpcionCrearBoton.setText("Crear nuevo Boton");
        OpcionCrearBoton.setMnemonic('I');
        OpcionCrearBoton.setToolTipText("Consulta un registro del archivo");
       menuConsulta.add(OpcionCrearBoton);
        OpcionGeneral.setText("General");
        OpcionGeneral.setMnemonic('G');
        OpcionGeneral.setToolTipText("Muestra el contenido del archivo");
        //menuConsulta.add(OpcionGeneral);

        menuRecuperacion.add(menuConsulta);
       
        
        
        
        

        //-------------------Menu Archivo-------------------//
        menuArchivo.setMnemonic('A');
        menuArchivo.setText("Nueva reservación");
        //-------------------Opcion Crear-------------------//
        OpcionCrear.setMnemonic('C');
        OpcionCrear.setText("Ha");
        OpcionCrear.setToolTipText("Registra una nueva reservación");
        menuArchivo.add(OpcionCrear);
        //-------------------Opcion Actualizacion-----------//
        menuActualizacion.setMnemonic('A');
        menuActualizacion.setText("Actualizacion");
        //------------------SubOpcion Altas de Actualizacion-----//
        OpcionAltas.setMnemonic('l');
        OpcionAltas.setText("Altas");
        OpcionAltas.setToolTipText("AÃƒÂ±ade registros al final del archivo");
       menuActualizacion.add(OpcionAltas);
       // ------------------SubOpcion Bajas de Actualizacion-----//
        OpcionBajas.setMnemonic('B');
        OpcionBajas.setText("Bajas");
        OpcionBajas.setToolTipText("Elimina un registro del archivo");
        menuActualizacion.add(OpcionBajas);
        //------------------SubOpcion Cambios de Actualizacion-----//
        OpcionCambios.setMnemonic('C');
        OpcionCambios.setText("Cambios");
        OpcionCambios.setToolTipText("Cambia el contenido de un registro");
      menuActualizacion.add(OpcionCambios);

        menuArchivo.add(menuActualizacion);

        //------------------Opcion Salir---------------------------//
        OpcionBorrar.setMnemonic('o');
        OpcionBorrar.setText("Consultar hechas");
        OpcionBorrar.setToolTipText("Consultar las reservaciones hechas...");
        menuArchivo.add(OpcionBorrar);

        OpcionSalir.setMnemonic('S');
        OpcionSalir.setToolTipText("Termina la aplicacion");
        OpcionSalir.setText("Salir");

        menuArchivo.add(OpcionSalir);

 
        BarraDeMenus.add(menuRecuperacion);
        
         BarraDeMenus.add(menuArchivo);

      
      
        setJMenuBar(BarraDeMenus);
        
        ActionListener accion = new java.awt.event.ActionListener()
        {
               public void actionPerformed(java.awt.event.ActionEvent evento)
               {
                   Object obj=evento.getSource();
                   
                
                   if (obj==OpcionCrear)
                   {
                    
                   }
                   if (obj==OpcionBorrar)
                   { 
                        }
                   if (obj==OpcionAltas)
                   {
                     
                   }
                   if (obj==OpcionBajas)
                   {
                       
                   }
                   if (obj==OpcionCambios)
                   {
                      
                   }
                   if (obj==OpcionCrearBoton)
                   {
                      // Boton nuevoBoton= new Boton();
                    new Boton().setVisible(true);
                   //nuevaVariable+="public JButton "+nuevoBoton.getTexto();
                        // declaracionVariables=Boton.texto;
                   }
                   if (obj==OpcionGeneral)
                   {
                      

                   }
                   if (obj== OpcionSalir){
                       
                         dispose();
                    }
                   
                   
                   
               }
        };
                  
  
        
        
        OpcionCrear.addActionListener(accion);
        OpcionBorrar.addActionListener(accion);
        OpcionAltas.addActionListener(accion);
        OpcionCambios.addActionListener(accion);
        OpcionBajas.addActionListener(accion);
        OpcionSalir.addActionListener(accion);
        OpcionGeneral.addActionListener(accion);
        OpcionCrearBoton.addActionListener(accion);
        
      
       
      
    }
       public static void main(String args[]) {
      new BarraHerramientasPaleta().setVisible(true);
       new Boton().setVisible(false);
       //    Paleta parametroPaleta= new Paleta("");
    
                                             }
         
  
         
    }