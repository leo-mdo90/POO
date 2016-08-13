/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio7;

/**
 *
 * @author Léo
 */
public class AlunoB implements IAluno{

    protected String nome;
    protected double nota;


    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getNota() {
        return nota;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void setNota(double nota) {
        this.nota = nota;
    }
}
