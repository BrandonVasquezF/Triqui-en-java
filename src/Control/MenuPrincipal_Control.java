
package Control;


import View.Descripcion;
import View.Modos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import View.MenuPrincipal;
import javax.swing.JOptionPane;


public class MenuPrincipal_Control implements ActionListener {
    
    MenuPrincipal mp;
    
    public MenuPrincipal_Control(MenuPrincipal obj){
        super();
        mp = obj;
    
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
	if (e.getSource().equals(mp.jbModos)) {
            evento_modos();
            //mp.dispose();
	}
        if (e.getSource().equals(mp.jbDescrip)) {
            evento_descrip();
            
	}
        if (e.getSource().equals(mp.jbSalir)) {
            evento_salir();
            
	}
    }
    
    public void evento_modos(){
        Modos m = new Modos(mp);
        mp.setVisible(false);
    }
    
    public void evento_descrip(){
        Descripcion d = new Descripcion(mp);
        mp.setVisible(false);
    }
    
    public void evento_salir(){
        int respuesta = JOptionPane.showConfirmDialog(null, "Desea realmente salir?",
                "CONFIRMACION", JOptionPane.YES_NO_OPTION);
        if(respuesta == JOptionPane.YES_OPTION){
            System.exit(0);
            mp.setVisible(false);
        }
        
    }
    
    
}
