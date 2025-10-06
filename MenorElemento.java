//import java.util.Scanner;
//
//public class MenorElemento {
//
//
//    private static class MenorElemRec {
//        public int quantidade; //define o numero que o vetor precisa ter
//        private int[] vetor; //recebe os numeros e a quantidade
//        public int n_elementos; // capacidade do vetor
//
//        public int MenorElemRec(int quantidade, int vetor[], int n_elementos, int n) {
//            //valor que vamos receber = n
//            this.quantidade = quantidade;
//            this.n_elementos = 0;
//            this.vetor = new int[quantidade];
//        }
//
//        public void RetornaAe(int n) {
//            for (int i = n_elementos; i <= quantidade; i++) {
//                if (n <= n_elementos) {
//                    System.out.println("Número inválido ou pequeno demais para a operação!");
//                } else if (n >= 100) {
//                    System.out.println("Número grande demais para a operação! ");
//                } else if (n < i) {
//                    System.out.println("O menor número da lista de " + quantidade + "elementos é: " + i);
//                }
//                for (int j = n_elementos; j <= quantidade; j--) {
//                    if (n >= j) {
//                        return j;
//                    }
//                }
//            }
//        }
//
//        public static void main(String[] args) {
//
//            MenorElemento teste = new MenorElemento();
//            Scanner us = new Scanner(System.in);
//            System.out.println("Digite a quantidade de elementos do vetor: ");
//            int quantidade = us.nextInt();
//
//
//            System.out.println("");
//            System.out.println("Digite os elementos à serem comparados: ");
//            int n = us.nextInt();
//
//            System.out.println("O menor elemento do vetor é: " + MenorElemRec(us,quantidade, n));
//            //System.out.println("O menor elemento do vetor é: " + MenorElemRec(n)); -- usuario
//        }
//
//    }
//}

//for (int i = 0; i < vetor; i++) {
//    if (vetor[i] < vetor[i  + 1]) {
//        menor = vetor[i];
//        }
//        }

import java.util.Scanner;

public class MenorElemento {

    // Classe interna que lida com os dados e a lógica
    private static class MenorElemRec {
        private int[] vetor; // vetor com os elementos
        private int quantidade; // número de elementos

        // Construtor que recebe a quantidade de elementos
        public MenorElemRec(int quantidade) {
            this.quantidade = quantidade;
            this.vetor = new int[quantidade];
        }

        // Método para preencher o vetor com os números fornecidos pelo usuário
        public void preencherVetor(Scanner scanner) {
            for (int i = 0; i < quantidade; i++) {
                System.out.print("Digite o elemento " + (i + 1) + ": ");
                vetor[i] = scanner.nextInt();
            }
        }

        // Método recursivo para encontrar o menor valor a partir de uma posição
        public int encontrarMenorRec(int posicao) {
            // Caso base: se for o último elemento
            if (posicao == quantidade - 1) {
                return vetor[posicao];
            }

            // Chamada recursiva para o restante do vetor
            int menorDoResto = encontrarMenorRec(posicao + 1);

            // Retorna o menor entre o atual e o menor do restante
            return Math.min(vetor[posicao], menorDoResto);
        }
    }
}
//    // Método principal
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Digite a quantidade de elementos do vetor: ");
//        int quantidade = scanner.nextInt();
//
//        // Verificação de entrada
//        if (quantidade <= 0 || quantidade > 100) {
//            System.out.println("Quantidade inválida! Deve ser entre 1 e 100.");
//            return;
//        }
//
//        // Criar o objeto e preencher o vetor
//        MenorElemRec obj = new MenorElemRec(quantidade);
//        obj.preencherVetor(scanner);
//
//        // Encontrar o menor elemento usando recursão
//        int menor = obj.encontrarMenorRec(0);
//
//        System.out.println("O menor elemento do vetor é: " + menor);
//    }
//}




