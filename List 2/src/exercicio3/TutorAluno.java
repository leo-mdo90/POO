/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3;


/**
 *
 * @author Léo
 */
public class TutorAluno extends Tutor implements IAluno {

    private Aluno aluno;
   
    
    public TutorAluno(String nome, String Area,int nota,String sobrenome) {
        super(sobrenome, Area);
        aluno = new Aluno(nota,nome);
    }

    @Override
    public String toString() {
        return "TutorAluno= " + aluno.toString() + super.toString();
    }

    public int getNota() {
        return aluno.getNota();
    }

    public String getNome() {
        return aluno.getNome();
    }

    public void setNota(int nota) {
        aluno.setNota(nota);
    }

    public void setNome(String nome) {
        aluno.setNome(nome);
    }
    
}
