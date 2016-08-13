/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio5;

/**
 *
 * @author Léo
 */
public class Principal {

    public static void main(String[] args) {
        
        
        Pesquisador prof = new Pesquisador("Meio Ambiente", 768895, 8, 7000);
        System.out.println(prof.toStringp());
        
        Pesquisador bols = new Pesquisador("Tecnologia", 234, "ICMC");
        System.out.println(bols.toStringb());
        
        Pesquisador ambos = new Pesquisador("Computacao", 769996, 10, 16000, 254, "ICMC");
        System.out.println(ambos.toString());
        
        Professor girafales = new Professor(01234,2,500);
        System.out.println(girafales.toString());
        
    }
}