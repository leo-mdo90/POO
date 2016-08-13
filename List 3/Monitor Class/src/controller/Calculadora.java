/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author BrunoRamos
 */
public class Calculadora {
    private model.Calculadora model;
    private view.Calculadora view;
    
    public Calculadora() {
        model = new model.Calculadora();
        view = new view.Calculadora();
        defineViewListeners();
    }
    
    public void init() {
        view.setVisible(true);
    }
    
    public void defineViewListeners() {
        view.addBtnCeListener(new BtnCeListener());
        view.addBtnEqualListener(new BtnEqualListener());
        view.addInputListener(new InputListener());
        view.addoneListener(new oneListener());
        view.addtwoListener(new twoListener());
        view.addthreeListener(new threeListener());
        view.addfourListener(new fourListener());
        view.addfiveListener(new fiveListener());
        view.addsixListener(new sixListener());
        view.addsevenListener(new sevenListener());
        view.addeightListener(new eightListener());
        view.addnineListener(new nineListener());
        view.addzeroListener(new zeroListener());
        view.addplusListener(new plusListener());
        view.addminusListener(new minusListener());
        view.addmultListener(new multListener());
        view.adddivListener(new divListener());
        view.addpotListener(new potListener());
        view.addrestListener(new restListener());
        view.addp1Listener(new p1Listener());
        view.addp2Listener(new p2Listener());
        
        
    }
    
    public class BtnCeListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            view.setInput("");
        }
    }
    
     public class oneListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
             view.setInput(view.getButton("1"));
        }
    }
    
     public class twoListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
             
             view.setInput(view.getButton("2"));
        }
    }
     
    public class threeListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
             
             view.setInput(view.getButton("3"));
        }
    } 
    
    public class fourListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
             
             view.setInput(view.getButton("4"));
        }
    }
     
    
    public class fiveListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
             
             view.setInput(view.getButton("5"));
        }
    }
    
    
    public class sixListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
             
             view.setInput(view.getButton("6"));
        }
    }
    
    
    public class sevenListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
             
             view.setInput(view.getButton("7"));
        }
    }
    
    
    public class eightListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
             
             view.setInput(view.getButton("8"));
        }
    }
    
    
    public class nineListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
             
             view.setInput(view.getButton("9"));
        }
    }
    
    public class zeroListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
             
             view.setInput(view.getButton("0"));
        }
    }
    
    public class plusListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
             
             view.setInput(view.getButton("+"));
        }
    }
    
    public class minusListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
             
             view.setInput(view.getButton("-"));
        }
    }
    
    
    public class multListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
             
             view.setInput(view.getButton("*"));
        }
    }
    
    public class divListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
             
             view.setInput(view.getButton("/"));
        }
    }
    
    
    public class potListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
             
             view.setInput(view.getButton("^"));
        }
    }
    
    public class restListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
             
             view.setInput(view.getButton("%"));
        }
    }
    
    public class p1Listener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
             
             view.setInput(view.getButton(")"));
        }
    }
    
    public class p2Listener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
             
             view.setInput(view.getButton("("));
        }
    }
    
    public class BtnEqualListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            processInput();
        }
    }
    
    public class InputListener implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {
            if(e.getKeyChar() == KeyEvent.VK_ENTER)
                processInput();
        }

        @Override
        public void keyPressed(KeyEvent e) {
            
           
            
        }

        @Override
        public void keyReleased(KeyEvent e) {
            
        }
    }
    
    public void processInput() {
        model.setInfix(view.getInput());
        view.setInput(model.processInput());
    }
}
