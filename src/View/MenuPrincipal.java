package View;


import Control.MenuPrincipal_Control;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class MenuPrincipal extends JFrame {
    
    public JLabel jlFondo;
    public JButton jbModos, jbDescrip, jbSalir, jbDev,jbFondo;
    
    
    public MenuPrincipal(){
        super(" --- TRIQUI --- ");
        setSize(700, 650);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setResizable(false);//para no redimencionar la ventana
        
        crearGUI();
        setVisible(true);
    }
    
    public void crearGUI(){
        getContentPane().setBackground(new Color(1, 78, 148));
        
        //Logo del juego
        Image icono = new ImageIcon(getClass().getResource("../imagenes/battery-icon.png")).getImage();
        setIconImage(icono);
        
         ImageIcon ImgOriginal = new ImageIcon(getClass().getResource("../imagenes/fondoTriqui.png"));
         //ImageIcon ImgScalada = new ImageIcon(ImgOriginal.getImage().getScaledInstance(700, 400, Image.SCALE_DEFAULT));
         jlFondo = new JLabel(ImgOriginal);
         jlFondo.setBounds(100,  50 , 500, 250);
         add(jlFondo);
        
        
        jbModos = new JButton("Modos de juego");
        jbModos.setBounds(150, 370, 400, 40);
        jbModos.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jbModos.setToolTipText("Click aqui para elegir tu modo de juego");
        jbModos.setBackground(new Color(181, 230, 29));

        jbDescrip = new JButton("Descripcion");
        jbDescrip.setBounds(150, 420, 400, 40);
        jbDescrip.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jbDescrip.setToolTipText("Click aqui para ver la descripcion del juego y de los programadores");
        jbDescrip.setBackground(new Color(181, 230, 29));
        
        jbDev = new JButton("Desarrollador");
        jbDev.setBounds(150, 470, 400, 40);
        jbDev.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jbDev.setToolTipText("Click aqui para ver la descripcion del juego y de los programadores");
        jbDev.setBackground(new Color(181, 230, 29));

        jbSalir = new JButton("Salir");
        jbSalir.setBounds(150, 520, 400, 40);
        jbSalir.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jbSalir.setToolTipText("Click aqui para salir");
        jbSalir.setBackground(new Color(181, 230, 29));


        MenuPrincipal_Control mpc = new MenuPrincipal_Control(this);

        jbModos.addActionListener( mpc);
        jbDescrip.addActionListener(mpc);
        jbDev.addActionListener(mpc);
        jbSalir.addActionListener( mpc);

        add(jbModos);
        add(jbDescrip);
        add(jbDev);
        add(jbSalir);
      
    }
    
    
    public static void main(String[] args) {
        MenuPrincipal mp = new MenuPrincipal();
    }
    
}
