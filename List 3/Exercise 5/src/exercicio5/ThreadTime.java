/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio5;

/**
 *
 * @author Léo
 */
class ThreadTime extends Thread implements Runnable {

        public static double contador = 0;
        public long inicio;
        public long tempo;

        @Override
        public void run() {

            long inicio = System.currentTimeMillis();
            contador = 0;

            while (true) {

                try {
                    tempo = System.currentTimeMillis() - inicio;
                    
                } catch (Exception e) {
                    System.out.println("Exception: error");
                    Thread.currentThread().interrupt();

                }
            }
        }
        
        public void PrintaTime() {
        System.out.println("\nTempo de execucao foi: " + tempo + " milisegundos");
    }
} 
        

