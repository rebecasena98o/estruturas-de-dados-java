public class FilaDoRecreioFilinha {
        int capacidade;
        int fim, inicio, totalElementos;
        int vetor[];

        public FilaDoRecreioFilinha(int capacidade){
            this.capacidade = capacidade;
            vetor = new int[capacidade];
            inicio = 0;
            fim = 0;
            totalElementos = 0;
        }
        public void inserir(int valor){
            if(totalElementos == capacidade){
                System.out.println("Fila está cheia");
            } else {
                vetor[fim] = valor;
                fim = (fim + 1) % capacidade;
                totalElementos++;
            }
        }
        public void remover(){
            if(totalElementos == 0){
                System.out.println("A fila está vazia");
            } else {
                int remocao = vetor[inicio];
                inicio = (inicio + 1) % capacidade;
                System.out.println("O valor: " + remocao + " foi removido da fila com sucesso");
                totalElementos--;

                }
            }

        public void imprimir(){
            if(totalElementos == 0){
                System.out.println("A fila está vazia");
            } else {
                System.out.println("Elementos da fila: ");
                for(int i = 0; i < totalElementos; i++){
                    System.out.print(vetor[(inicio + i) % capacidade] + " -> ");
                }
                System.out.println();
            }
        }    
        
        public void checagemNotas(){
            if(totalElementos == 0){
                System.out.println("A fila está vazia");
            } else {
                for(int i = 0; i <totalElementos - 1; i++){
                    for(int j = 0; j < totalElementos - 1 - i; j++){
                        int atual = (inicio + j) % capacidade;
                        int proximo = (inicio + j + i) % capacidade;

                        if(vetor[atual] < vetor[proximo]){
                            int temp = vetor[atual];
                            vetor[atual] = vetor[proximo];
                            vetor[proximo] = temp;
                        }
                        }
                    }
                }
            }
        
    public static void main(String[] args){
        FilaDoRecreioFilinha fila = new FilaDoRecreioFilinha(5);
        fila.inserir(100);
        fila.inserir(80);
        fila.inserir(70);
        fila.inserir(90);
        fila.inserir(30);
        fila.imprimir();
        fila.checagemNotas();
        fila.remover();
        fila.checagemNotas();
        fila.imprimir();
    }
    
}
