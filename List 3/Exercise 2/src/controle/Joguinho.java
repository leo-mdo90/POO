/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Léo
 */
public class Joguinho {
    
    view.Joguinho view;
   

    public Joguinho() {
        view = new view.Joguinho();
        defineViewListeners();
    }
    
    public void defineViewListeners()
    {
        view.addBiniActionListener(new BiniActionListener());
    }

    public void init() {
        view.setVisible(true);
       
    }
    /**
     *
     */
    public class BiniActionListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e) {
            
            view.Setinputinvisible();
        }
    }
}
