
package Control;

import View.Descripcion;
import View.MenuPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author usuario
 */
public class Descripcion_Control implements ActionListener {
    
    MenuPrincipal mp;
    Descripcion d;
    
    public Descripcion_Control(Descripcion obj){
        d = obj;
    }
    
    @Override
	public void actionPerformed(ActionEvent e) {
                if (e.getSource().equals(d.jbVolver)) {
                        evento_volver();
		}
	}
        
        public void evento_volver(){
            d.setVisible(false);
            d.dispose();
            d.mp.setVisible(true);
        }
}
