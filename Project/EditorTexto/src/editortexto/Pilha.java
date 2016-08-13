package editortexto;
// classe da pilha, com 3 atributos, o texto, a posição desse texto, e o modo (0- Insere 1-Retira)

public class Pilha{
    int inicio;
    int fim;
    int tamanho;
    int qtdeElementos;
    public String texto[];
    public int p[]; //posicao
    public int modo[]; //0- Inseriu 1-Retirou

    public Pilha(){
        inicio = fim = -1;
        tamanho = 500;
        p = new int[tamanho];
        texto = new String[tamanho];
        modo = new int[tamanho];
        qtdeElementos = 0;
    }

    public boolean estaVazia(){
        if (qtdeElementos == 0){
            return true;
        }
        return false;
    }

    public boolean estaCheia(){
       if (qtdeElementos == tamanho - 1){
            return true;
       }
        return false;
    }
public boolean estaCheia(int o)
{
    System.out.println("oi");
        return false;
}
    public void adicionar(String nome, int posicao, int mod){
        if (! estaCheia()){
            if (inicio == -1){
                inicio = 0;
            }
            fim++;
            texto[fim] = nome;
            p[fim] = posicao;
            modo[fim] = mod;
            
            qtdeElementos++;
        }
    }
    public void remover(){
        if (! estaVazia() ){
            fim --;
            qtdeElementos --;
        }
    }
    
    public String texto_topo(){
        
        if(estaVazia()){
            return null;
        }
        else{
            return texto[fim];
        }
    }
    
     public int posicao_topo(){
        
        if(estaVazia()){
            return -1;
        }
        else{
            return p[fim];
        }
    }
     
      public int modo_topo(){
        
        if(estaVazia()){
            return -1;
        }
        else{
            return modo[fim];
        }
    }
    
    
    
    public void mostrar(){
        
        for (int i = fim; i>=0; i--) {
            System.out.println(texto[i]);
            System.out.println(p[i]);
            System.out.println(modo[i]);
        }
    }
}