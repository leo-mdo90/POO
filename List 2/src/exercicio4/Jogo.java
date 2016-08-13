/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4;

/**
 *
 * @author Léo
 */
public class Jogo {
    
    public static void main(String[] args)
    {
        Guerreiro kina = new Guerreiro(1,12,8,6);
        Mago sorcer = new Mago(1,6,8,12);
        Elfo legolas = new Elfo(1,9,9,9);
        
        kina.atacar(sorcer);
        kina.ChegarUP();
        System.out.println(sorcer.toString());
        System.out.println(kina.toString());
        kina.atacar(sorcer);
        kina.ChegarUP();
        System.out.println(sorcer.toString());
        System.out.println(kina.toString());
        kina.andar();
        System.out.println(sorcer.toString());
        System.out.println(kina.toString());
        kina.atacar(legolas);
        kina.ChegarUP();
        System.out.println(legolas.toString());
        System.out.println(kina.toString());
        legolas.usarMagia(kina);
        legolas.ChegarUP();
        System.out.println(legolas.toString());
        System.out.println(kina.toString());
        kina.atacar(legolas);
        kina.ChegarUP();
        kina.atacar(legolas);
        kina.ChegarUP();
        System.out.println(legolas.toString());
        System.out.println(kina.toString());
        
        
        
        
    }
    
}
