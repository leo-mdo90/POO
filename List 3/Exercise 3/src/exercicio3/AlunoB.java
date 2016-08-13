/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3;

/**
 *
 * @author Léo
 */
public class AlunoB implements IAluno,Comparable{

    public String nome;
    public double nota;

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getNota() {
        return nota;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    
    public AlunoB() {
        this.nome = nome;
        this.nota = nota;
    }

    //@Override
    public int compareTo(Object o) {
        AlunoB obj = (AlunoB)o;
        return (int)((this.nota - obj.getNota()));
        
         }
}
