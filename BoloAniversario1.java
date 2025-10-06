import java.util.Scanner;

public class BoloAniversario1 {
    public static void main(String args[]) {

        class Amigo implements Comparable<Amigo> {

            public String nome;
            public int tempoAmizade;

            public Amigo(String nome, int tempoAmizade) {
                this.nome = nome;
                this.tempoAmizade = tempoAmizade;
            }

            @Override
            public int compareTo(Amigo outroAmigo) {
                if (this.tempoAmizade < outroAmigo.tempoAmizade) {
                    return -1;
                } else if (this.tempoAmizade > outroAmigo.tempoAmizade) {
                    return 1;
                } else {
                    return 0;
                }
            }
        }

        class ListaVetor {

            private Amigo vetor[];
            private int nElementos;

            public ListaVetor(int tamanho) {
                this.vetor = new Amigo[tamanho];
                this.nElementos = 0;
            }

            public int tamanho() {
                return this.nElementos;
            }

            public void imprime() {

                for (int i = 0; i < 4; i++) {
                    System.out.println("Pedaço " + (i + 1) + ": " + this.vetor[i].nome);
                }
            }

            public boolean estaVazia() {
                return this.nElementos == 0;
            }

            public boolean estaCheia() {
                return this.nElementos == this.vetor.length;
            }

            public void insereFinal(Amigo elemento) {

                if (this.estaCheia()) {
                    System.out.println("Lista cheia! Não é possível inserir.");
                    return;
                }

                this.vetor[this.nElementos] = elemento;

                this.nElementos++;
            }

            public void insereInicio(Amigo elemento) {

                if (this.estaCheia()) {
                    System.out.println("Lista cheia! Não é possível inserir.");
                    return;
                }

                for (int i = this.nElementos; i >= 1; i--) {
                    this.vetor[i] = this.vetor[i - 1];
                }

                this.vetor[0] = elemento;
                this.nElementos++;
            }

            public void inserePosicao(Amigo elemento, int pos) {

                if (this.estaCheia()) {
                    System.out.println("Lista cheia! Não é possível inserir.");
                    return;
                } else if (pos < 0) {
                    System.out.println("Posição negativa. Não é possível inserir.");
                    return;
                } else if (pos > this.nElementos) {
                    System.out.println("Posição inválida. Não é possível inserir");
                    return;
                }

                for (int i = this.nElementos; i > pos; i--) {
                    this.vetor[i] = this.vetor[i - 1];
                }

                this.vetor[pos] = elemento;

                this.nElementos++;
            }

            public void insereOrdenado(Amigo elemento) {

                if (this.estaCheia()) {
                    System.out.println("Lista cheia! Não é possível inserir.");
                    return;
                }

                for (int i = 0; i < this.nElementos; i++) {
                    if (this.vetor[i].tempoAmizade < elemento.tempoAmizade) {
//				    if (this.vetor[i].compareTo(elemento) < 0) { // outra forma de comparar
                        this.inserePosicao(elemento, i);
                        return;
                    }
                }

                this.insereFinal(elemento);
            }

        }

        // Lógica da questão

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        ListaVetor listaAmigos = new ListaVetor(n);

        for (int i = 0; i < n; i++) {
            String nome = s.next();
            int tempoAmizade = s.nextInt();

            Amigo amigo = new Amigo(nome, tempoAmizade);

            listaAmigos.insereOrdenado(amigo);
        }

        listaAmigos.imprime();

        s.close();
    }
}