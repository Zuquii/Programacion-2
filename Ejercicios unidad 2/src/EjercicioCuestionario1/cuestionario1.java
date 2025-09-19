//Escribir un programa en Java que sume cada fila de una matriz de enteros e indique cuál contiene el mayor valor (tener presente que la matriz no necesariamente es cuadrada).

package EjercicioCuestionario1;
import java.util.Scanner;
import java.util.Random;

public class cuestionario1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();

        System.out.println("Ingrese la cantidad de filas: ");
        int filas = sc.nextInt();
        System.out.println("Ingrese la cantidad de columnas: ");
        int columnas = sc.nextInt();

        int [][] matriz = new int[filas][columnas];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <matriz[i].length; j++) {
                matriz[i][j] = ran.nextInt(10);
                System.out.print (matriz[i][j]+" ");
            }
            System.out.println();
        }

        int sumaFila = 0;
        int filaMayor = 0;
        int sumaMayor = Integer.MIN_VALUE;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                sumaFila += matriz[i][j];
            }
            System.out.println("Suma de la fila " + i + " = " + sumaFila);
            ;
            // Verificar si esta fila tiene la suma más grande
            if (sumaFila > sumaMayor) {
                sumaMayor = sumaFila;
                filaMayor = i;
            }
        }

        System.out.println("\nLa fila con mayor suma es la fila " + filaMayor + " con un total de " + sumaMayor);
    }
}
