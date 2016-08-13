/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.lang.Comparable;

/**
 *
 * @author Léo
 */
public class Controle extends AlunoB {

    Cadastro reg;
    Tabela tab;
    public static int i = 0;
    static ArrayList<AlunoB> list = new ArrayList<>();
    static ArrayList<AlunoB> listSupport = new ArrayList<>();
    static ArrayList<String> listNome = new ArrayList<>();
    static ArrayList<Double> listNota = new ArrayList<>();
   

    /**
     *
     */
   public Controle(){

        reg = new Cadastro();
        tab = new Tabela();
        defineViewListeners();
    }

    public void defineViewListeners() {
        tab.addCadastrarCeListener(new CadastrarListener());
        reg.addokCeListener(new okListener());
        tab.addOrdNomeListener(new OrdNomeListener());
        tab.addNotListener(new OrdNotaListener());

    }



    public class CadastrarListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            tab.setVisible(false);
            reg.setVisible(true);
        }
    }
    
    public class OrdNotaListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            
            AlunoB aluno = new AlunoB();
            Collections.sort(list);
            
            for(int z=0;z<list.size();z++)
            {
                String nome = list.get(z).nome;
                double nota = list.get(z).nota;
                tab.addJtable2Listener(nome, nota, z);
                
                
            }
        }
    }

    public class OrdNomeListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            AlunoB aluno = new AlunoB();
            int k=0;
            Collections.sort(listNome);
            int y = 0;
            
            for(int z=0;z<list.size();z++)
            {
                if(list.get(z).nome == null ? listNome.get(y) == null : list.get(z).nome.equals(listNome.get(y)))
                {
                    listSupport.add(list.get(z));
                    y++;
                }
            }
                
            //list = listSupport;
            while(k < listSupport.size()){
                aluno = listSupport.get(k);
                String nome = aluno.nome;
                double nota = aluno.nota;
                System.out.println("Tamanha" + listSupport.size());
                System.out.println("Nome " + k + " " + aluno.nome + "Nota" + aluno.nota);
                tab.addJtable2Listener(nome, nota, k);
                k++;
            }
        }
    }


  

   public class okListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            AlunoB aluno = new AlunoB();
            aluno.nome = reg.getInputNome();
            String nota = reg.getInputNota();
            aluno.nota = reg.converttoDouble(nota);
            list.add(aluno);
            listNome.add(aluno.nome);
            listNota.add(aluno.nota);


            tab.setVisible(true);
            reg.setVisible(false);

            tab.addJtable2Listener(aluno.nome, aluno.nota, i);
            
            i++;

        }
    }

  
    @Override
    public String toString() {
        return "Controle{" + "list=" + list + '}';
    }

    public void init() {
        reg.setVisible(false);
        tab.setVisible(true);
    }
}

