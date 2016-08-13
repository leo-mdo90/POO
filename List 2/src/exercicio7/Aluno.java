/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio7;

/**
 *
 * @author Léo
 */
public class Aluno {
 
    protected String nome;
    protected double nota;

    /**
     *
     * @param nome
     * @param nota
     */
    
    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    
}
