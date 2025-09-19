package Matriz3x3Total;
import java.util.Random;

public class totalMatriz {
    public static void main (String args[]){
        //Definicion de matriz 3x3 y creacion de instancia Random.
        int [][]matriz = new int [3][3];
        Random ran = new Random();

        int suma = 0;
        for (int i  = 0; i < matriz.length; i++){
            for (int j  = 0; j < matriz[i].length; j++){
                matriz[i][j] = ran.nextInt(10);
                System.out.print(matriz[i][j] +" ");
                suma += matriz[i][j];
            }
            System.out.println();
        }
        System.out.println("\nSuma: " + suma);

    }
}
