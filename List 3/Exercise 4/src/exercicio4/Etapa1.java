/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4;

import java.util.Random;

/**
 *
 * @author Léo
 */
public class Etapa1 {

    public int[][] M = new int[20][20];
    public int cont;
    public int[] soma = new int[20];
    

    public void setaMatriz() {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                Random rand = new Random();
                M[i][j] = rand.nextInt(10);

            }
        }
    }

    public void CriarContador() {
        for (int j = 0; j < 20; j++) {
           soma[j] = 0;
        }
    }

    public void Contar() {
        for (int j = 0; j < 20; j++) {
            for (int i = 0; i < 20; i++) {
                soma[j] += M[j][i];
            }
            System.out.println("Soma: " + soma[j] + "  linha: " + j);
        }
    }
    
    
}
