/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio5;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Léo
 */
public class Pesquisar {

    int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
    Random rand = new Random();
    int x = rand.nextInt(20);
    int numThread = 1 + rand.nextInt(4);
   

    public static int ini = 0;
    public static int fim = 0;
    public static int finalizar = 0;
    static ArrayList<Thread> threadList = new ArrayList<>();
    
   
    //
    public void parallelSearch(int x, int A[], int numThread)
    {
        System.out.println(numThread);
        
        int tam = A.length;
        if(numThread > tam)
            {
                System.out.println("Erro valor muito grande");
            }
        fim = (int)tam/numThread;
        for(int i = 0; i< numThread; i++)
        {

            Thread t = new Thread(new ThreadTime(ini,fim));
            threadList.add(t);
            t.start();
            if(i > 0)
            {
                ini += fim;
                fim +=fim;
            }  
        }
    }

    public void encontrou(int x, int i) {
        System.out.println("ACHOU VALOR: " + x + "Posicao" + i);
        finalizar();
    }
    public void finalizar() {
        
        for(int i = 0; i< numThread; i++)
        {
          threadList.get(i).stop();
        }
    }
    public int GetIni() {
        return ini;
    }
    
    public int GetFim(){
        return fim;
    }

    class ThreadTime implements Runnable {

        int ini = 0;
        int fim = 0;
        
        public ThreadTime(int ini, int fim) {
            this.ini=ini;
            this.fim=fim;
        }

        @Override
        public void run() {

            for (int i = ini; i < fim; i++) {

                if (A[i] == x) {
                    encontrou(x,i);
                }
            }
        }
    }
}
