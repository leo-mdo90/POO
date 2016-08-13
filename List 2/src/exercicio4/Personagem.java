/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4;

/**
 *
 * @author Léo
 */
public class Personagem {
    
    protected int nivel;
    protected int HP;
    protected int MP;
    protected int exp;
    protected float forca;
    protected float des;
    protected float inteligencia;
    protected int passos;

    /**
     *
     * @param nivel
     * @param HP
     * @param MP
     * @param exp
     * @param forca
     * @param des
     * @param inteligencia
     * @param passos
     */
    public Personagem(int nivel, int forca, int des, int inteligencia) {
        this.nivel = nivel;
        this.HP = (int) (nivel*(2*forca + 0.5*inteligencia +0.3*des));
        this.MP = (int) (nivel*(0.5*forca+2*inteligencia+0.3*des));
        this.exp = 0;
        this.forca = forca;
        this.des = des;
        this.inteligencia = inteligencia;
        this.passos = 0;
    }

    
    public void andar()
    {
        this.passos += 0; 
    }
    
    
    public void ChegarUP()
    {
        if(this.exp == 100*this.nivel)
        {
            this.Upar();
        }
    }
    public void Upar()
    {
        this.forca = this.forca;
        this.des = this.des;
        this.inteligencia=this.inteligencia;
        
        
    }
    
    public int getNivel() {
        return nivel;
    }

    public int getHP() {
        return HP;
    }

    public int getMP() {
        return MP;
    }

    public int getExp() {
        return exp;
    }

    public float getForca() {
        return forca;
    }

    public float getDes() {
        return des;
    }

    public float getInteligencia() {
        return inteligencia;
    }

    public int getPassos() {
        return passos;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public void setMP(int MP) {
        this.MP = MP;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public void setDes(int des) {
        this.des = des;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public void setPassos(int passos) {
        this.passos = passos;
    }

    
    public String toString() {
        return "{ nivel=" + nivel + ", HP=" + HP + ", MP=" + MP + ", exp=" + exp + ", forca=" + forca + ", des=" + des + ", inteligencia=" + inteligencia + ", passos=" + passos + '}';
    }
    
    
    
}
