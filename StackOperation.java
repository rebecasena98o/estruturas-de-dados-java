import java.util.Scanner;

public class StackOperation {

    private int[] vetor;
    private int capacidade;
    private int topo;

    public StackOperation(int capacidade){
        this.capacidade = capacidade;
        this.vetor = new int[capacidade];
        this.topo = -1;
    }

    public void push(int valor){
        if(cheia()){
            System.out.println("A pilha tá cheia, não dá para colocar mais nada, it's over");
        }
        topo++;
        vetor[topo] = valor;
        System.out.println("Valor inserido na pilha: " + valor);

    }

    public int pop(){
        if(vazia()){
            System.out.println("A pilha tá vazia oxi, tá querendo tirar o que?");
        }
        int aux = vetor[topo];
        topo--;
        return aux;
    }
    public int TOPO(){
        if(vazia()){
            System.out.println("Tá vazia meu(minha) nobre, sem topo pra você");
            return -1;
        }
        return vetor[topo];
    }

    public boolean vazia(){
        return topo == -1;
    }
    public boolean cheia(){
        return topo == capacidade - 1;
    }
    public int tamanho(){
        return topo + 1;

        }
    public void soma() {
        if (tamanho() < 2) {
            System.out.println("Tem que ter pelo menos dois valores pra somar, né?");
            return;
        }
        int a = pop();
        int b = pop();
        int resultado = b + a;
        System.out.println("Resultado da soma: " + resultado);
    }

    public void subtrai() {
        if (tamanho() < 2) {
            System.out.println("Precisa de dois valores pra subtrair, não dá pra fazer milagre!");
            return;
        }
        int a = pop();
        int b = pop();
        int resultado = b - a;
        System.out.println("Resultado da subtração: " + resultado);
    }

    public void multiplica() {
        if (tamanho() < 2) {
            System.out.println("Cadê os dois valores pra multiplicar, jovem?");
            return;
        }
        int a = pop();
        int b = pop();
        int resultado = b * a;
        System.out.println("Resultado da multiplicação: " + resultado);
    }

    public void divide() {
        if (tamanho() < 2) {
            System.out.println("Tem que ter dois valores pra dividir, pô!");
            return;
        }
        int a = pop();
        int b = pop();
        if (a == 0) {
            System.out.println("Divisão por zero não, campeão!");
            push(b); // devolve os valores pra pilha
            push(a);
            return;
        }
        int resultado = b / a;
        System.out.println("Resultado da divisão: " + resultado);
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número de casos: ");
        int casos = sc.nextInt();
        StackOperation p = new StackOperation(casos);
        sc.nextLine();


        for(int i = 0; i < casos; i++){
            System.out.println("Digite o comando: ");
            String comando =  sc.next();

            switch (comando) {
                case "empilha":
                    int x = sc.nextInt();
                    p.push(x);
                    break;
                case "desempilha":
                    p.pop();
                    break;
                case "soma":
                    p.soma();
                    break;
                case "subtrai":
                    p.subtrai();
                    break;
                case "multiplica":
                    p.multiplica();
                    break;
                case "divide":
                    p.divide();
                    break;
                default:
                    System.out.println("Comando inválido, tente de novo!");
                    break;
            }
        }

        sc.close();
    }
}