import java.util.ArrayList;
import java.util.List;

public class ListaNomes {

    private List<String> nomes; //guarda todos os nomes lidos - ordem de entrada
    private List<String> usados; //guarda os nomes que já foram "impressos"

    public ListaNomes() {
        nomes = new ArrayList<>(); //criação de array list/ lista para nomes
        usados = new ArrayList<>(); //criação de array list/ lista para nomes usados
        //ambos vazios
    }

    public void adicionar(String nome) { //adiciona os nomes conforme entrada
        nomes.add(nome);
    }

    private int tamanhoMin() { //retorna o menor comprimento entre nomes não usados
        int min = 20;
        for (String nome : nomes) { //itera cada nome da lista nomes
            if (!usados.contains(nome) && nome.length() < min) {
                //contains - presença ou ausência de um elemento
                // verificando se uma substring está dentro de
                // uma string maior, quanto para coleções como List ou ArrayList
                min = nome.length();
            }
        }
        return min;
    }

    private int tamanhoMax() {
        int max = 2;
        for (String nome : nomes) {
            if (!usados.contains(nome) && nome.length() > max) {
                max = nome.length();
            }
        }
        return max;
    }

    public boolean temNomesRestantes() {
        return usados.size() < nomes.size();
    }


    // Gera a próxima linha da saída
    public String proximaLinha() {
        List<String> linhaAtual = new ArrayList<>();
        int min = tamanhoMin();
        int max = tamanhoMax();

        for (int tamanho = min; tamanho <= max; tamanho++) {
            for (String nome : nomes) {
                if (!usados.contains(nome) && nome.length() == tamanho) {
                    linhaAtual.add(nome);
                    usados.add(nome);
                    break; // apenas um por tamanho por linha
                }
            }
        }

        // monta a linha final com vírgulas
        String linha = "";
        for (int i = 0; i < linhaAtual.size(); i++) {
            if (i > 0) {
                linha += ", ";
            }
            linha += linhaAtual.get(i);
        }
        return linha;
    }
}
/*
//        // Monta a linha formatada
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < linhaAtual.size(); i++) {
//            sb.append(linhaAtual.get(i));
//            if (i < linhaAtual.size() - 1) sb.append(", ");
//        }
//
//        return sb.toString();


 */




