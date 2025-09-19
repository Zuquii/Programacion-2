package matriz4x4busqueda;
import java.util.Random;
import java.util.Scanner;

public class Matriz4x4Buscar {
    public static void main (String [] args){
        Random ran = new Random();
        Scanner sc = new Scanner (System.in);
        int [][] matriz = new int [4][4];

        //Matriz generada con numeros random entre 1 y 100.
        for (int i = 0; i< matriz.length; i++){
            for (int j = 0; j<matriz[i].length; j++) {
                matriz[i][j] = ran.nextInt(100)+1;
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Ingrese el numero que desea buscar.");
        int numero = sc.nextInt();
        for (int i = 0; i< matriz.length; i++){
            for (int j = 0; j<matriz[i].length; j++) {
                if (matriz[i][j] == numero){
                    System.out.println("El numero: "+numero+" Se encuentra en la matriz.");
                } else {
                    System.out.println("El numero: "+numero+" No se encuentra en la matriz.");
                }
            }
        }
    }
}
