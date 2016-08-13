/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio5;


/**
 *
 * @author Léo
 */
public class Professor extends Profissão{
    
    protected int numeromat;

    public Professor(int numeromat, float carga, float salario) {
        super(carga, salario);
        this.numeromat = numeromat;
    }

    public int getNumeromat() {
        return numeromat;
    }

    public void setNumeromat(int numeromat) {
        this.numeromat = numeromat;
    }

    @Override
    public String toString() {
        return "Professor{" + "numeromat=" + numeromat + super.toString() + '}';
    }

    
    
    
    
}
