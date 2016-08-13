/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3;


public class Aluno implements IAluno {
    
    private int nota;
    private String nome;
    
    
    public Aluno(int nota, String nome)
    {
        this.nome = nome;
        this.nota = nota;
    }

    public int getNota() {
        return nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nota=" + nota + ", nome=" + nome + '}';
    }
    
    
}
