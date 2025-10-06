public class PilhaReb {

    //pilha dinâmica e eu nem sabia

    private static class No{
        int valor; //recebe o valor do Nó
        No prox; //referência do nosso próximo Nó
    }

    private No inicio;//ponteiro do inicio - null - TOPO pilha

    public void push(int valor){
        No no = new No(); //cria o nó da pilha
        no.valor = valor; // pega nosso valor
        no.prox = inicio; //guarda o ponteiro de início em prox
        inicio = no; // nosso início agr aponta para o novo valor
        System.out.println(); //Quebra de linha ao final
        System.out.println("Número inserido na pilha");

    }

    public void imprimir(){
        if(inicio == null){ //caso em que a pilha está vazia
            System.out.println("Pilha vazia");
        } else{
            System.out.println("Consultando pilha: ");
            No aux = inicio; //pega o valor de início sem o perder
            while(aux != null){ //enquanto esse início não for igual o último ponteiro
                System.out.print(aux.valor + " -> "); //ele imprime
                aux = aux.prox; // Avança para o próximo nó abaixo.
            }
//            System.out.println(); Quebra de linha ao final
        }

    }

    public void pop(){

        if(inicio == null){
            System.out.println("Pilha vazia");
        } else {
            System.out.println("Removendo elemento..." + inicio.valor + " da pilha"); //mostra qual elemento
            //será removido
            inicio = inicio.prox; // aponta para o próximo, o antigo inicio fica inalcançável.
        }
    }


    public void esvaziar(){
        if(inicio == null){
            System.out.println("A pilha já está vazia");
        } else {
            inicio = null;
            System.out.println();// Quebra de linha ao final
            System.out.println("A pilha neste momento foi limpa");
        }


    }

    public void peek(){
        if(inicio == null){
            System.out.println("Pilha vazia");
        } else {
             No aux = inicio;
            System.out.println("O topo dessa pilha é: " + aux.valor);
        }
    }

    public boolean vazia(){
        return inicio == null;
    }
}
