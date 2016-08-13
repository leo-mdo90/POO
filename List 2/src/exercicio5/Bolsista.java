/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio5;

/**
 *
 * @author Léo
 */
public class Bolsista {
    
    protected int numeroreg;
    protected String orgao;

    public Bolsista(int numeroreg, String orgao) {
        this.numeroreg = numeroreg;
        this.orgao = orgao;
    }

    public int getNumeroreg() {
        return numeroreg;
    }

    public String getOrgao() {
        return orgao;
    }

    public void setNumeroreg(int numeroreg) {
        this.numeroreg = numeroreg;
    }

    public void setOrgao(String orgao) {
        this.orgao = orgao;
    }

    @Override
    public String toString() {
        return "Bolsista{" + "numeroreg=" + numeroreg + ", orgao=" + orgao + '}';
    }

       
    
}
