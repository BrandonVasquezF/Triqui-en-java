/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Control.Descripcion_Control;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.tree.DefaultTreeCellEditor;

/**
 *
 * @author usuario
 */
public class Descripcion extends JFrame{
    
    public JButton jbVolver;
    public JEditorPane jeInfo;
    public MenuPrincipal mp;
    
    
    public Descripcion(MenuPrincipal obj){
        super("DESCRIPCION");
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
        
        jeInfo = new JEditorPane();
        jeInfo.setContentType("text/html");
        jeInfo.setText("<h1><center><b>DESCRIPCION</b></center></h1><br>"
                + "<h2> Este es el clasico juego de tres en raya o tambien conocido -triqui-. "
                + "Cuenta con dos modos de juego, jugador vs jugador ó jugador vs pc. "
                + "Dicho juego se realiza en un tablero 3x3 donde ganara el primer jugador "
                + "que logre hacer una linea recta en cualquier direccion </h2>");
        jeInfo.setEditable(false);
        JScrollPane js = new JScrollPane(jeInfo);
        js.setBounds(75, 25, 350, 270);
        js.setBackground(new Color(109, 88, 67));
        add(js);
        
        jbVolver = new JButton("Volver");
        jbVolver.setBounds(200, 320, 100, 30);
        jbVolver.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jbVolver.setToolTipText("Click aqui para volver al menu principal");
        jbVolver.setBackground(new Color(181, 230, 29));
        
        Descripcion_Control dc = new Descripcion_Control(this);
        jbVolver.addActionListener(dc);
        add(jbVolver);
    }
    
    
    
    
}
