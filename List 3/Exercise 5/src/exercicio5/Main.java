/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio5;

import java.util.Random;

/**
 *
 * @author Léo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        Random rand = new Random();
        int x = rand.nextInt(20);
        int numThread = 1 + rand.nextInt(5);
        
        
        Pesquisar p = new Pesquisar();
        ThreadTime t1 = new ThreadTime();
        t1.start();
        p.parallelSearch(x, A, numThread);
        t1.stop();
        System.out.println("Metodo Threads");
        t1.PrintaTime();
        
        t1 = new ThreadTime();
        PesquisaSeq p1 = new PesquisaSeq();
        t1.start();
        p1.parallelSearch(x, A);
        t1.stop();
        System.out.println("Metodo sequencial");
        t1.PrintaTime();

    }
}
