/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio6;

/**
 *
 * @author Léo
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Léo
 */
public class Principal implements Cloneable {

    public static void main(String[] args) {
        Pessoa p;
        p = new Pessoa(18, "Pedro", 2, 12, 1997, "Pedreiro", Pessoa.Estado.CASADO);
        Pessoa p2;
        Pessoa p3 = null;
        p2 = (Pessoa) p.clone();

        try {
            FileOutputStream fileOut = new FileOutputStream("Pessoa.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(p2);
            out.writeObject(p2);
            out.close();
            fileOut.close();
        } catch (IOException i) {
            i.printStackTrace();
        }
       try
      {
         FileInputStream fileIn =  new FileInputStream("Pessoa.ser");
         ObjectInputStream in = new ObjectInputStream(fileIn);
         p3 = (Pessoa) in.readObject();
         in.close();
         fileIn.close();
      }catch(IOException i)
      {
         i.printStackTrace();
         return;
      }catch(ClassNotFoundException c)
      {
         return;
      }
        

        System.out.println(p.toString());
        System.out.println(p3.toString());


    }
}
