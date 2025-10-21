import java.util.Scanner;

    class Voo {

    private String id;

    public Voo(String id){
        this.id = id;
    }

    public String getId(){
        return id;
    }

}

    class FilaEstatica {

    private Voo[] voos;
    private int capacidade;
    private int n_elementos;
    private int inicio;
    private int fim;

        public FilaEstatica(int capacidade){
            this.capacidade = capacidade;
            this.voos = new Voo[capacidade];
            this.inicio = 0;
            this.fim = 0;
            this.n_elementos = 0;
        }

        public void enfileirar(Voo id) throws Exception{
            if(cheia()){
                throw new Exception("Está cheia! não dá mais!");
            }
            voos[fim] = id;
            fim = (fim + 1) % capacidade;
            n_elementos++;

        }

        public Voo desenfileirar() throws Exception{
            if(vazia()){
                throw new Exception("Está cheia! não dá mais!");
            }
            Voo removido = voos[inicio];
            inicio = (inicio + 1) % capacidade;
            n_elementos--;
            return removido;
        }

        public boolean cheia(){
            return n_elementos == capacidade;
        }

        public boolean vazia(){
            return n_elementos == 0;
        }

        public Voo TOPO() throws Exception{
            if(vazia()){
                throw new Exception("Não há topo, tá sem nada!");
            }
            return voos[inicio];
        }

        public void Imprimir() throws Exception{
            if(vazia()){
                throw new Exception("Não há nada, então por que imprimir?");
            }

            for(int i = 0; i < n_elementos; i++){
                int index = (inicio + i) % capacidade;
                Voo v = voos[index];
                System.out.println(v.getId());
            }
        }
}

    class Main {
        public static void main(String[] args) throws Exception {
            Scanner s1 = new Scanner(System.in);
            int n1 = s1.nextInt();
            s1.nextLine();

            FilaEstatica f1 = new FilaEstatica(n1);
            FilaEstatica f2 = new FilaEstatica(n1);
            for (int i = 0; i < n1; i++){
                String n2 = s1.next();
                String n3 = s1.next();
                if(n2.equals("1")){
                    Voo v = new Voo(n3);
                    f1.enfileirar(v);
                }
                if(n2.equals("2")){
                    Voo v = new Voo(n3);
                    f2.enfileirar(v);
                }
            }
            f2.Imprimir();
            f1.Imprimir();
        }
    }
