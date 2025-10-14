
public class FilaDoRecreio {
    
        int capacidade;
        int vetor[];
        int inicio, fim, totalElementos;

        public FilaDoRecreio(int capacidade) {
            this.capacidade = capacidade;
            vetor = new int[capacidade];
            inicio = 0;
            fim = 0;
            totalElementos = 0;
        }


        public void inserir(int valor){
            if(totalElementos == capacidade){
                System.out.println("Fila cheia");
            } else {
                vetor[fim] = valor;
                fim = (fim + 1) % capacidade; //Fila Circular = "dá a volta"
                //a fila circular apenas move os índices de inicio e fim.
                //fim + 1: estamos tentando mover o índice de inserção para a próxima posição no array.
                //% capacidade: usamos o operador módulo para voltar ao início do array quando fim atingir o final.
                // fim = (4 + 1) % 5 = 5 % 5 = 0 ; para não dar erro de index
                //Resultado: o índice fim volta para o início do array (índice 0), simulando uma fila circular.
                totalElementos++;
            }
        }

        public void remover() {
            if (totalElementos == 0) {
                System.out.println("Fila vazia");
                
            } else {
            int valorRemovido = vetor[inicio];
            inicio = (inicio + 1) % capacidade;
            //Avançar para o próximo índice
            //E "voltar ao início" automaticamente quando atinge o fim do array.
            totalElementos--;
            System.out.println("O valor: " + valorRemovido + " foi removido da fila");
            }
        }

        public boolean estaVazia() {
            return totalElementos == 0;
        }

        public void listarNotas(){
            if (estaVazia()) {
                System.out.println("Fila vazia.");
                return;
            }

        
        // Copiar elementos da fila circular para um array original e ordenável
        int[] original = new int[totalElementos];
        int[] ordenada = new int[totalElementos];

        for (int i = 0; i < totalElementos; i++) {
            int valor = vetor[(inicio + i) % capacidade];
            original[i] = valor;
            ordenada[i] = valor;
        }

        // Ordenar manualmente o array ordenada em ordem decrescente (Bubble Sort)
        for (int i = 0; i < totalElementos - 1; i++) {
            for (int j = 0; j < totalElementos - 1 - i; j++) {
                if (ordenada[j] < ordenada[j + 1]) {
                    int temp = ordenada[j];
                    ordenada[j] = ordenada[j + 1];
                    ordenada[j + 1] = temp;
                }
            }
        }

        // Exibir notas ordenadas
        System.out.println("Notas em ordem decrescente:");
        for (int i = 0; i < totalElementos; i++) {
            System.out.println("Nota: " + ordenada[i]);
        }

        // Verificar quantos alunos mantiveram a posição
        int mesmoLugar = 0;
        for (int i = 0; i < totalElementos; i++) {
            if (original[i] == ordenada[i]) {
                mesmoLugar++;
            }
        }

        System.out.println("Alunos que não precisaram trocar de lugar: " + mesmoLugar);
    }

}
    

