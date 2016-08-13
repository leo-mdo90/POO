/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio7;

import java.util.Arrays;
import java.util.ArrayList;

/**
 *
 * @author Léo
 */
public class Disciplina extends Aluno implements IAluno{

    public static int i=0;
    protected int n;
    Aluno[] aluno = new Aluno[n];
    ArrayList< AlunoB> list = new ArrayList();
   
    public void adicionar(String nome, double nota,AlunoB alunob) {
        
       
        aluno[i].nome = nome;
        aluno[i].nota = nota;
        i++;
        
       list.add(alunob);
    }
   

    public void Listar(Aluno[] aluno) {
        for (int j = 0; j <= i; j++) {
            System.out.printf("nome[%d]: %s\n nota[%d]: %f ", i, aluno[i].nome, i, aluno[i].nota);
        }
    }

    public void Listar(ArrayList alunob) {
        System.out.println("ArrayList: ");

        for (int count = 0; count < alunob.size(); count++) {
            System.out.println(alunob.get(count));
        }
    }
    
   
   
    
}
