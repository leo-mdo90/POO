/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio5;

/**
 *
 * @author Léo
 */
public class Profissão  {
    
    protected float carga;
    protected float salario;

    public Profissão(float carga, float salario) {
        this.carga = carga;
        this.salario = salario;
    }

    public float getCarga() {
        return carga;
    }

    public float getSalario() {
        return salario;
    }

    public void setCarga(float carga) {
        this.carga = carga;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "carga=" + carga + ", salario=" + salario;
    }

    
    
}
