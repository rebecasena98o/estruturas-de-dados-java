import java.util.Scanner;

public class PilhaOperacoes {

    private int[] vetor;
    private int capacidade;
    private int topo;

    public PilhaOperacoes(int capacidade){
        this.capacidade = capacidade;
        this.vetor = new int[capacidade];
        this.topo = -1;
    }

    public void push(int valor){
        if(cheia()){
            System.out.println("A pilha está cheia!");
        }
        topo++;
        vetor[topo] = valor;
        System.out.println("Valor inserido na pilha: " + valor);

    }
    public int pop(){
        if(vazia()){
            System.out.println("Não tem nada na pilha, tá tirando o que?");
        }
        int aux = vetor[topo];
        topo--;
        return aux;
    }

    public boolean cheia(){
        return topo == capacidade - 1;
    }

    public boolean vazia(){
        return topo == -1;
    }

    public int tamanho(){
        return topo + 1;
    }

    public void print(){
        if(vazia()){
            System.out.println("Tá vazia amigo(a)! sem print para você");
            return;
        }
        System.out.println("Valor no topo (espiando): " + vetor[topo]);
    }
    public int add(){
        if(tamanho() < 2){
            System.out.println("Tem que ter pelo menos dois valores!");
        }

        int a = pop();
        int b = pop();
        int resultado = b + a;
        System.out.println("Resultado da soma: " + resultado);
        push(resultado);
        return resultado;

    }
    public int mul(){
        if(tamanho() < 2){
            System.out.println("Tem que ter pelo menos dois valores!");
        }
        int a = pop();
        int b = pop();
        int resultado = b * a;
        System.out.println("Resultado da multiplicação: " + resultado);
        push(resultado);
        return resultado;
    }
        public static void main(String[] args){
            Scanner usuario = new Scanner(System.in);
            System.out.println("Digite a quantidade de operações: ");
            int qtdOperation = usuario.nextInt();
            usuario.nextLine();

            PilhaOperacoes pilha = new PilhaOperacoes(qtdOperation);


            for(int i = 0; i < qtdOperation; i++){
                System.out.println("Digite o comando: ");
                String linha = usuario.nextLine();
                String[] partes = linha.split(" ");

                String comando = partes[0];

                switch(comando){
                    case "push":
                        if (partes.length < 2) {
                            System.out.println("Faltou o valor depois do push!");
                            break;
                        }
                        int x = Integer.parseInt(partes[1]);
                        pilha.push(x);
                        break;
                    case "pop":
                        pilha.pop();
                        break;
                    case "add":
                        pilha.add();
                        break;
                    case "mul":
                        pilha.mul();
                        break;
                    case "print":
                        pilha.print();
                        break;
                    default:
                        System.out.println("Comando inválido!");
                        break;
                }
            }

            usuario.close();
        }
}

