/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio5;

/**
 *
 * @author Léo
 */
public class Pesquisador implements IProfessor,IBolsita{
    
    protected String tema;
    
    Professor prof;
    Bolsista alu;

    public Pesquisador(String tema,int numeromat, float carga, float salario) {
        this.tema = tema;
        prof = new Professor(numeromat,carga,salario);
    }

    public Pesquisador(String tema, int numeroreg, String orgao) {
        this.tema = tema;
        alu = new Bolsista(numeroreg,orgao); 
    }
    
    public Pesquisador(String tema,int numeromat, float carga, float salario,int numeroreg, String orgao) {
        this.tema = tema;
        prof = new Professor(numeromat,carga,salario);
        alu = new Bolsista(numeroreg,orgao); 
    }
    
    public String getTema() {
        return tema;
    }

    /**
     *
     * @return
     */
    @Override
    public int getNumeromat(){
        
        return prof.getNumeromat();
       
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    /**
     *
     * @param numeromat
     */
    @Override
    public void setNumeromat(int numeromat)
    {
        prof.setNumeromat(numeromat);
    }
    
     /**
     *
     * @return
     */
    @Override
    public int getNumeroreg() {
        return alu.getNumeroreg();
    }
    /**
     *
     * @param numeroreg
     */
    @Override
      public void setNumeroreg(int numeroreg)
      {
          alu.setNumeroreg(numeroreg);
      }
    
    /**
     *
     * @param orgao
     */
    @Override
    public void setOrgao(String orgao)
    {
        alu.setOrgao(orgao);
    }
    
    /**
     *
     * @return
     */
    @Override
    public String getOrgao()
    {
        return alu.getOrgao();
        
    }


    public String toStringp() {
        return "Pesquisadorprofessor{" + "tema=" + tema + ", prof=" + prof.toString() + '}';
    }

    
    @Override
    public String toString() {
        return "Pesquisadorambos{" + "tema=" + tema + ", prof=" + prof.toString() + ", alu=" + alu.toString() + '}';
    }

    public String toStringb() {
        return "Pesquisadorbolsista{" + "tema=" + tema + ", alu=" + alu.toString() + '}';
    }
    
    
    
    
}
