package MultiplicacionMatrices;
import java.util.Random;

public class MultiplicacionMatrices {
    public static void main (String [] args) {
        Random ran = new Random();

        int[][] Matriz1 = new int[2][3];
        int[][] Matriz2 = new int[3][2];

        System.out.println("Matriz 1: ");
        for (int i = 0; i < Matriz1.length; i++) {
            for (int j = 0; j < Matriz1[i].length; j++) {
                Matriz1[i][j] = ran.nextInt(11);
                System.out.print(Matriz1[i][j] +" ");
            }
            System.out.println();
        }

        System.out.println("Matriz 2: ");
        for (int i = 0; i < Matriz2.length; i++) {
            for (int j = 0; j < Matriz2[i].length; j++) {
                Matriz2[i][j] = ran.nextInt(11);
                System.out.print(Matriz2[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Matriz 3: ");
        int[][] Matriz3 = new int[2][2];
        //Multiplicacion de matrices.
        for (int i = 0; i < Matriz1.length; i++) {
            for (int j = 0; j < Matriz2[0].length; j++) {
                for (int k = 0; k < Matriz1[0].length; k++) {
                    Matriz3[i][j] += Matriz1[i][k] * Matriz2[k][j];
                    System.out.print(Matriz3[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}
