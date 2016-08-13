/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4;

import exercicio4.Etapa2;
import static exercicio4.Etapa2.terminar;

/**
 *
 * @author Léo
 */
public class Main extends Etapa2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ThreadTime t = new ThreadTime();
        t.start();
        Etapa1 etapa = new Etapa1();
        etapa.setaMatriz();
        etapa.CriarContador();
        etapa.Contar();
        t.stop();
        t.PrintaTime();

        Etapa2 etapa2 = new Etapa2();
        etapa2.setaMatriz2();
        etapa2.CriarContador2();
        etapa2.Contar2();




    }
}
