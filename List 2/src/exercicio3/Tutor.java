/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3;

/**
 *
 * @author Léo
 */
public class Tutor {
    
    private String sobrenome;
    private String Area; 

    public Tutor(String sobrenome, String Area) {
        this.sobrenome = sobrenome;
        this.Area = Area;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getArea() {
        return Area;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setArea(String Area) {
        this.Area = Area;
    }

    @Override
    public String toString() {
        return "Tutor{" + "sobrenome=" + sobrenome + ", Area=" + Area + '}';
    }

  
    
    
}
