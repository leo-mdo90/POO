/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio5;

/**
 *
 * @author Léo
 */
public class PesquisaSeq extends Pesquisar{
    
    public void parallelSearch(int x, int A[])
    {
        for(int i = 0; i <  A.length; i++)
        {
            if(A[i] == x)
            {
                System.out.println("ACHOU VALOR: " + x + " Posicao: " + i);
            }
        }
    }
}
