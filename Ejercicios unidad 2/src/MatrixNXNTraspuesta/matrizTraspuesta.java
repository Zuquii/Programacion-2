package MatrixNXNTraspuesta;
import java.util.Scanner;
import java.util.Random;
public class matrizTraspuesta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Ingrese el numero de filas: ");
        int filas = sc.nextInt();

        System.out.println("Ingrese el numero de columnas: ");
        int columnas = sc.nextInt();

        int[][] Matriz = new int[filas][columnas];

        System.out.println("La matriz original es: ");
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {
                Matriz[i][j] = rand.nextInt(10) + 1;
                System.out.print(Matriz[i][j] + " ");
            }
            System.out.println();
        }

        //Matriz traspuesta.
        System.out.println("La traspuesta es: ");
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {
                System.out.print(Matriz[j][i] + " ");
            }
            System.out.println();
        }
    }
}
