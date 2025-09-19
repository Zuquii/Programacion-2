import java.util.Scanner;
import java.util.Random;

public class EliminarIndice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        if (args.length ==0){
            System.out.println ("Ingrese el tamaño del arreglo por linea de comandos. ");
            return;
        }

        int tam = Integer.parseInt(args[0]);
        int [] vector = new int [tam];

        //Llenar el vector con numeros random.
        for (int i = 0; i < tam; i++) {
            vector[i] = rand.nextInt(10);
            System.out.print(vector[i] +" ");
        }

        System.out.println("Ingrese el indice que desea eliminar.");
        int indice = sc.nextInt();

        if (indice < 0 || indice > tam ){
            System.out.println ("Indice fuera de rango. ");
            return;
        }

        //Desplazar elementos.
        System.out.println("Vector con los elementos desplazados. ");
        for (int i = indice; i < tam -1 ; i++){
            vector[i] = vector[i+1];
            System.out.print(vector[i] +" ");
        }
        tam--;
    }
}
