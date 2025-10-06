public class PilhaPokemon {

    private static class Pokemons{

        int num; // recebe nosso valor
        Pokemons prox; //ponteiro para o prox

    }

    private Pokemons inicio;

    public void inserirPokemon(int valor){
        Pokemons p = new Pokemons(); //criando nosso nó
        p.num = valor; //recebe o nosso valor
        p.prox = inicio; //guarda o ponteiro do prox
        inicio = p; //atualiza o início
        System.out.println(); //Quebra de linha ao final
        System.out.println("Pokemon inserido na coleção");

    }

    public void removerPokemon(){
        if(inicio == null){
            System.out.println("Sua coleção pokemon está vazia");
        } else {
            System.out.println("Seu pokemon " + inicio.num + " será  removido da coleção");
            inicio = inicio.prox; // porque o .prox guardou o que tinha anteriormente em inicio
        }

    }

    public void imprimirColecao(){
        if(inicio == null) {
            System.out.println("Sua coleção pokemon está vazia");
        } else {
            System.out.println("Consultando coleção: ");
            Pokemons aux =  inicio;

            while(aux != null){
                System.out.print(aux.num + " -> ");
                aux = aux.prox;
            }
        }

    }

    public void esvaziarColecao(){
        if(inicio == null) {
            System.out.println("A coleção já está vazia");
        } else {
            inicio = null;
            System.out.println("A coleção de pokemons ficou vazia");
        }
    }

    public void colecaoVazia(){

        if(inicio == null){
            System.out.println("A coleção de pokemons está vazia");
        } else {
            int quantidadePokemons = 0;
            Pokemons aux = inicio;
            while( aux != null){
                quantidadePokemons++;
                aux = aux.prox;
            }
            System.out.println("A coleção possui " + quantidadePokemons + " pokemons");
        }
    }

}
