/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import View.MenuPrincipal;
import View.Modos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


/**
 *
 * @author usuario
 */
public class Modos_Control implements ActionListener{
    
    Modos m;
    MenuPrincipal mp;
    
    public Modos_Control(Modos obj){
        m = obj;
        
    }
    
    @Override
	public void actionPerformed(ActionEvent e) {
                if (e.getSource().equals(m.jbJCJ)) {
                       evento_jugadorContraJugador(); 
		}
                if (e.getSource().equals(m.jbVolver)) {
			evento_volver();
		}
	}
        
        public void evento_volver(){
            m.setVisible(false);
            m.dispose();
            m.mp.setVisible(true);
        }

        public void evento_jugadorContraJugador(){
            JOptionPane.showMessageDialog(null, "Juegador contra jugador", "MODO DE JUEGO", JOptionPane.YES_NO_CANCEL_OPTION);
			if(JOptionPane.YES_OPTION == 0){
                m.setVisible(false);
			    m.dispose();
                m.mp.setVisible(true);
            }
            else{
                //i
            }
            
        }
}
