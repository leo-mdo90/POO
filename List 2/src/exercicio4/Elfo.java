/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4;

import java.util.Random;


public class Elfo extends Personagem implements IGuerreiro,IMago {

    /**
     *
     * @param nivel
     * @param forca
     * @param des
     * @param inteligencia
     */
    public Elfo(int nivel, int forca, int des, int inteligencia) {
        super(nivel, forca, 2*des, 2*inteligencia);
    }
    
     /**
     *
     */
    @Override
    public void andar()
    {
        this.passos += 2;
    }
    
    /**
     *
     */
    @Override
    public void Upar()
    {
        this.nivel+= 1;
        this.forca += 1;
        this.inteligencia += 1;
        this.des += 1.5 ;
        this.exp = 0;
        this.HP = (int) (nivel*(2*forca + 0.5*inteligencia +0.3*des));
        this.MP = (int) (nivel*(0.5*forca+2*inteligencia+0.3*des));
    }
    
     public void atacar(Personagem defensor)
    {
        float Dr = this.des / defensor.des;
        Random R = new Random();
        int r = R.nextInt(1);
        if(Dr > r)
        {
            defensor.HP -= this.forca/2;
        }
        if(Dr == 2*r)
        {
           defensor.HP -= this.forca; 
        }
        if(defensor.HP <= 0)
        {
            this.exp += (defensor.nivel/2 - this.nivel)*100;
            this.exp = Math.abs(this.exp);
        }
    }
     
     public void usarMagia(Personagem defensor)
    {
        float Dr = this.inteligencia / defensor.inteligencia;
        Random R = new Random();
        int r = R.nextInt(1);
        if(Dr > r && this.MP > 0)
        {
            defensor.HP -= this.inteligencia/2;
            this.MP -= this.MP*1/20;
        }
        if(Dr == 2*r && this.MP > 0)
        {
           defensor.HP -= this.inteligencia; 
           this.MP -= this.MP*1/20;
        }
         if(defensor.HP <= 0)
        {
            this.exp += (defensor.nivel/2 - this.nivel)*100;
            this.exp = Math.abs(this.exp);
        }
    }
     
     @Override
    public String toString() {
        return "Elfo" + super.toString();
    }
}
