/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4;

import static exercicio4.ThreadTime.contador;
import java.util.Random;

/**
 *
 * @author Léo
 */
public class Etapa2 extends ThreadTime {

    
    public static int contador = 0;
    Runnable r = new Runnable() {
        int i, j;
        long inicio = System.currentTimeMillis();
        

        public void run() {


            for (j = 0; j < 20; j++) {
                for (i = 0; i < 20; i++) {
                    soma[j] += M[j][i];

                }
                System.out.println(" Soma " + soma[j] + " Linha: " + j);
            }
            terminar = 1;
            tempo = System.currentTimeMillis() - inicio;
            System.out.println("Tempo de execução " + tempo + " milisegundos");

        }
    };
    Thread t = new Thread(r);
    public int[][] M = new int[20][20];
    public int cont;
    public int[] soma = new int[20];
    public static int terminar = 0;
    

    public void setaMatriz2() {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                Random rand = new Random();
                M[i][j] = rand.nextInt(10);

            }
        }
    }

    public void CriarContador2() {
        for (int j = 0; j < 20; j++) {
            soma[j] = 0;
        }
    }

    public void Contar2() {
        t.start();
    }

    public void Parar2() {

        t.stop();


    }

    
}