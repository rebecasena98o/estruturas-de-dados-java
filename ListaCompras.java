import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaCompras {

    private List<String> itens;

    public ListaCompras() {
        this.itens = new ArrayList<>();
    }


    public void adicionar(String item) {
        boolean existe = false;
        for (String existente : itens) {
            if (existente.equals(item)) {
                existe = true;
                break;
            }
        }
        if (!existe) {
            itens.add(item);
        }
    }


    public void ordenar() {
        Collections.sort(itens);
    }

    public String imprimir() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < itens.size(); i++) {
            if (i > 0) sb.append(" ");
            sb.append(itens.get(i));
        }
        return sb.toString();
    }
}

/* código aceito pelo beecrowd:

Scanner us = new Scanner(System.in);
        int quant = us.nextInt();
        us.nextLine(); //quebra de linha

        for (int i = 0; i < quant; i++) {
            String itemDaCompra = us.nextLine();
            String[] itens = itemDaCompra.split("\\s+");  // separa os itens por espaço

            List<String> listaCompras = new ArrayList<>(); //nosso array/lista de compras

            // adiciona apenas itens distintos
            for (String item : itens) {
                boolean existe = false;
                for (String existente : listaCompras) {
                    if (existente.equals(item)) {
                        existe = true;
                        break;
                    }
                }
                if (!existe) {
                    listaCompras.add(item);
                }
            }

            // ordena alfabeticamente
            Collections.sort(listaCompras);

            // imprime a lista
            for (int j = 0; j < listaCompras.size(); j++) {
                if (j > 0) System.out.print(" ");
                System.out.print(listaCompras.get(j));
            }
            System.out.println(); // nova linha entre os casos
        }
    }
}

 */

