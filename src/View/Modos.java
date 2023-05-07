
package View;

import Control.Modos_Control;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.JButton;
import javax.swing.JFrame;


/**
 *
 * @author usuario
 */
public class Modos extends JFrame{
    
    public JButton jbJCJ, jbJCM, jbVolver;
    public MenuPrincipal mp;
    
    public Modos(MenuPrincipal obj){
        super("Modos de juego");// creacion del JFrame
        
        mp = obj;
        setSize(500, 400); 
	setLocationRelativeTo(null);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null); // asignar un diseño libre
        setResizable(false);
	crearGUI();
        
        setVisible(true);
    }
    
    public void crearGUI(){
        getContentPane().setBackground(new Color(1, 78, 148));
        
        jbJCJ = new JButton("Jugador contra Jugador");
        jbJCJ.setBounds(150, 100,200,30);
        jbJCJ.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jbJCJ.setToolTipText("Click aqui para jugar en este modo de juego");
        jbJCJ.setBackground(new Color(181, 230, 29));
        
        
        jbJCM = new JButton("Jugador contra Maquina");
        jbJCM.setBounds(150, 150,200,30);
        jbJCM.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jbJCM.setToolTipText("Click aqui para jugar en este modo de juego");
        jbJCM.setBackground(new Color(181, 230, 29));
        
        jbVolver = new JButton("Volver");
        jbVolver.setBounds(150, 200,200,30);
        jbVolver.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jbVolver.setToolTipText("Click aqui para volver al menu principal");
        jbVolver.setBackground(new Color(181, 230, 29));
        
        Modos_Control mc = new Modos_Control(this);
        jbJCJ.addActionListener(mc);
        jbJCM.addActionListener(mc);
        jbVolver.addActionListener(mc);
        
        add(jbJCJ);
        add(jbJCM);
        add(jbVolver);
    }
}
