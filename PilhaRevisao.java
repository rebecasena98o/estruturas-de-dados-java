public class PilhaRevisao {

    //pilha dinâmica

    public static class Pilha{

        private int numero;
        Pilha proximo;

    }

    private Pilha primeiro;


    public void push(int valor){
        Pilha pilhinha = new Pilha();
        pilhinha.numero = valor;
        pilhinha.proximo = primeiro;
        primeiro = pilhinha;

        System.out.println("Número inserido na pilha: " +pilhinha.numero);

    }

    public void pop(){
        if (primeiro == null){
            System.out.println("A pilha está vazia");
        } else {
            int removedor = primeiro.numero;
            primeiro = primeiro.proximo;
            System.out.println("O número " + removedor +  " foi removido");
        }


    }

    public void imprimir(){

        if(primeiro == null){
            System.out.println("A pilha está vazia");
        } else {
            Pilha aux = primeiro;
            while( aux != null){
                System.out.println(aux.numero + " -> ");
                aux = aux.proximo;
            }
            System.out.println();
        }
    }

    public void peek(){
        if( primeiro == null ){
            System.out.println("A pilha está vazia");
        } else {
            Pilha aux = primeiro;
            System.out.println("O topo da pilha é esse: " + aux.numero);
        }


    }
}
