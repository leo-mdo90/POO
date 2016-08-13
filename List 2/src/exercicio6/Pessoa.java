/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio6;

/**
 *
 * @author Léo
 */
public class Pessoa implements java.io.Serializable,Cloneable{
    
    private int idade;
    private String nome;
    private int dia;
    private int mes;
    private int ano;
    private String profissao;

   
    public enum Estado{SOLTEIRO, CASADO, DIVORCIADO} 
    
    Estado state;

    public Pessoa(int idade, String nome, int dia, int mes, int ano, String profissao, Estado state) {
        this.idade = idade;
        this.nome = nome;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.profissao = profissao;
        this.state = state;
    }
   
   public Pessoa(Estado state)
   {
       this.state = state;
   }
   
    public String getProfissao() {
        return profissao;
    }
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
    
    public void setIdade(int idade)
    {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }
    
     @Override
    public Object clone() {
        try {
            return super.clone();
        } catch(CloneNotSupportedException e) {
            return null;
        }
     }
    

    
    @Override
    public String toString() {
        return "Pessoa{" + "idade=" + idade + ", nome=" + nome + ", dia=" + dia + ", mes=" + mes + ", ano=" + ano + ", profissao=" + profissao + ", state=" + state + '}';
    } 
    
}

