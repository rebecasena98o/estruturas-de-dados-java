public class InverterVetor {

    public static void InverterR(int A[], int i, int j){

        if(i>j){ //condição de parada - i passou do j
            //i - esquerda
            //j - direita
            // i + 1 - para direita - inicio
            // j - 1 - para a esquerda - fim
            return;
        }
        int aux = A[i]; //recebe o indice i - posição
        A[i] = A[j];
        A[j] = aux;

        InverterR(A, i + 1, j - 1); // proximo par mais interno
    }

//    public static void main(String[] args){
//
//        int A[] = {1, 2, 3, 4, 5, 6, 7};
//        InverterR(A, 0, A.length - 1); //primeiro elemento - 0
//        //length - ultimo elemento
//
//        System.out.println("Inverter recursivo: ");
//        for(int i = 0; i < A.length; i++){
//            System.out.println(A[i] + " ");
//        }
//
//    }
//
}
