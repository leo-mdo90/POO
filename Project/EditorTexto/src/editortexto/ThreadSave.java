/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package editortexto;

/**
 *
 * @author Léo
 */
public class ThreadSave extends Thread implements Runnable {

    public long inicio;
    private static double contador;

    @Override
    public void run() {

        long inicio = System.currentTimeMillis();
        contador = 0;



        while (!this.isInterrupted()) {

            try {
                long tempo = System.currentTimeMillis() - inicio;
                double regs;
                regs = Math.round(tempo / 1000.0);

                if (regs % 3 == 0 && contador != regs) {

                    System.out.println("Saving");
                    contador = regs;

                }
            } catch (Exception e) {
                System.out.println("Exception: error");
                Thread.currentThread().interrupt();

            }
        }
    }
}