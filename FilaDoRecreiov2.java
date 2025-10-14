
import java.util.Scanner;

public  class FilaDoRecreiov2 {

    public static void main(String[] args) {
        

        Scanner usuario = new Scanner(System.in);
        
        System.out.println("Digite os casos de teste: ");
        int casosDeTeste = usuario.nextInt();

        

        for(int t = 0; t < casosDeTeste; t++){
            System.out.println("Digite o número de alunos: ");
            int numeroAlunos = usuario.nextInt();

            int [] original = new int[numeroAlunos];
            int [] ordenadak = new int[numeroAlunos];

            System.out.println("Digite as notas dos alunos: ");
            for(int i = 0; i < numeroAlunos; i++){
                original[i] = usuario.nextInt();
                ordenadak[i] = original[i];
            }
        

        for(int i = 0; i < numeroAlunos - 1; i++ ){
            for(int j = 0; j < numeroAlunos - 1 - i; j++){
                if(ordenadak[j] < ordenadak[j + 1]){
                    int temp = ordenadak[j];
                    ordenadak[j] = ordenadak[j + 1];
                    ordenadak[j + 1] = temp;
                }
            }
        }
        int mesmoLugar = 0;
        for(int i = 0; i < numeroAlunos; i++){
            if(original[i] == ordenadak[i]){
                mesmoLugar++;
            }
        }
        
        System.out.println(mesmoLugar);

        
        }
        usuario.close();
    }
}
