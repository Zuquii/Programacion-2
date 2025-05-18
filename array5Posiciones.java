/*Dado un array de números de 5 posiciones con los siguiente 
valores {1,2,3,4,5},guardar los valores de este array en otro 
array distinto pero con los valores invertidos, es decir, que el
segundo array deberá tener los valores {5,4,3,2,1}.
*/


public class array5Posiciones {
    public static void main(String args[]){
        int[] array= {1,2,3,4,5};

        int[] invertido= new int[array.length];

        for (int i=0; i < invertido.length; i++){
            invertido[i] = array[array.length -1 -i];
        }

        System.out.println ("Array invertido:");
        for (int valor : invertido) {
            System.out.print (valor + " ");
        }
    }
} 