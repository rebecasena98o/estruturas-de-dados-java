import java.util.ArrayList;
import java.util.List;


public class Colecao_Pomekons {

    private List<String> pomekons;

    public Colecao_Pomekons() {
        this.pomekons = new ArrayList<>();
    }

    public void adicionar(String nome) {
        boolean existe = false;
        for (String p : pomekons) {
            if (p.equals(nome)) {
                existe = true;
                break;
            }
        }
        if (!existe) {
            pomekons.add(nome);
        }
    }

    public int faltam() {
        return 151 - pomekons.size();
    }
}

//        int capturasP = us.nextInt();
//        us.nextLine(); //quebra de linha, para pegar as strings
//
//        List<String> pomekons = new ArrayList<>(); //nosso array/pokedex
//
//        for (int i = 0; i < capturasP; i++) {
//            String nomePokemon = us.nextLine(); //adiciona os pokemons
//
//            // verifica se já existe na lista
//            boolean existe = false;
//            for (String p : pomekons) {
//                if (p.equals(nomePokemon)) {
//                    existe = true;
//                    break;
//                }
//            }
//
//            if (!existe) {
//                pomekons.add(nomePokemon);
//            }
//        }
//        int faltam = 151 - pomekons.size();
//        System.out.println("Faltam " + faltam + " pomekons.");

   // }
         //   }

