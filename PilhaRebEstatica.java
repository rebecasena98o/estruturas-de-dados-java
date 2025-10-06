public class PilhaRebEstatica {


        private int[] itens; // vetor fixo que guarda os elementos da pilha
        private int topo; // índice topo da nossa pilha
        private int capacidade; //tamanho máximo da pilha

        public PilhaRebEstatica(int capacidade){
            this.capacidade = capacidade;
            itens = new int[capacidade];
            topo = -1; //começa vazia

        }

        public void push(int valor){
            if(topo == capacidade - 1){
                System.out.println("A pilha está cheia");
            } else {
                topo++;
                itens[topo] = valor;
                System.out.println("Número " + valor + " inserido na pilha");
            }
        }

        public void pop(){
            if(topo == -1){
                System.out.println("A pilha está vazia");
            } else {
                topo--;
                System.out.println("Número " + itens[topo] + " removido da pilha");
            }
        }

        public void imprimir(){
            if(topo == -1){
                System.out.println("A pilha está vazia");
            } else {
                System.out.println("Consultando pilha: ");
                for (int i = topo; i >= 0; i--) {
                    System.out.print(itens[i] + " -> ");
                }
                System.out.println();
            }


        }

        public void esvaziar(){
            topo = -1;
            System.out.println("A pilha foi esvaziada");
        }

        public boolean checagemVazia(){
            if(topo == -1){
                return true;
            } else {
                return false;
            }
        }

}
