/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JTextPane;

/**
 *
 * @author Léo
 */
public class Joguinho extends javax.swing.JFrame {

    public static int acabou = 0;
    Random rand = new Random();
    int num;
    ThreadTime r1 = new ThreadTime();

    /**
     * Creates new form Joguinho
     */
    public Joguinho() {
        initComponents();
        input.setEditable(false);
        Go.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        input = new javax.swing.JTextPane();
        Bfechar = new javax.swing.JButton();
        Bini = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        input1 = new javax.swing.JTextPane();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Go = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(input);

        Bfechar.setText("Fechar");
        Bfechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BfecharActionPerformed(evt);
            }
        });

        Bini.setText("Iniciar");
        Bini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BiniActionPerformed(evt);
            }
        });

        jLabel1.setText("Bem vindo ao jogo ");

        jLabel2.setText("Adivinhe o número de 0 a 10");

        jScrollPane2.setViewportView(input1);

        jLabel3.setText("Digite o número");

        jLabel4.setText("Dica");

        Go.setText("Go");
        Go.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(156, 156, 156))
            .addGroup(layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(Go)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(Bini, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(Bfechar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel3))
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                        .addComponent(jScrollPane2))
                    .addComponent(Go, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bfechar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bini, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BfecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BfecharActionPerformed
        // TODO add your handling code here:
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_BfecharActionPerformed

    private void BiniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BiniActionPerformed

        Bini.setVisible(false);
        Go.setVisible(true);
        num = rand.nextInt(10);
        input.setEditable(true);
        setInput("");
        setInput1("");

        
        if(acabou == 0)
            r1.start();
       

    }//GEN-LAST:event_BiniActionPerformed

    public void finalizar() {
        Go.setVisible(false);
        Bini.setVisible(true);
        input.requestFocus(false);
        input.setEditable(false);
        
        setInput("");
        setInput1("PERDEU");
        r1.stop();
        
    }

    private void GoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoActionPerformed
        String texto;
        texto = new String(input.getText());
        System.out.println(texto);
        r1.stop();
        r1 = new ThreadTime();
        r1.start();
        
        try {
            int adv = Integer.parseInt(texto);
            if (adv < num) {
                setInput1("MENOR");
                setInput("");
                input.requestFocus();

            } else if (adv > num) {
                setInput1("MAIOR");
                setInput("");
                input.requestFocus();
            } else {
                setInput1("GANHOU");
                r1.stop();
                acabou = 1;
                Go.setVisible(false);
                Bini.setVisible(true);
            }
        } catch (NumberFormatException e) {
            setInput1("Digite numeros");
        }



    }//GEN-LAST:event_GoActionPerformed

    /**
     * @param args the command line arguments
     */
    public void display() {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Joguinho().setVisible(true);

            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bfechar;
    private javax.swing.JButton Bini;
    private javax.swing.JButton Go;
    private javax.swing.JTextPane input;
    private javax.swing.JTextPane input1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    public void addBiniActionListener(ActionListener e) {
        Bini.addActionListener(e);
    }

    public void Setinputinvisible() {
        input.setEditable(true);
        input.requestFocus();

    }

    public String getInput() {
        return input.getText();
    }

    public void setInput(String str) {
        input.setText(str);
    }

    public void setInput1(String str) {
        input1.setText(str);
    }
    private static double contador;

    class ThreadTime extends Thread implements Runnable {

        public long inicio;

        @Override
        public void run() {

            long inicio = System.currentTimeMillis();
            contador = 0;

            while (true) {

                try {
                    long tempo = System.currentTimeMillis() - inicio;
                    double regs;
                    regs = Math.round(tempo / 1000.0);

                    if (regs % 3 == 0 && contador != regs) {
                        acabou = 1;
                        finalizar();
                        contador = regs;

                    }
                } catch (Exception e) {
                    System.out.println("Exception: error");
                    Thread.currentThread().interrupt();

                }
            }
        }
    }
}
