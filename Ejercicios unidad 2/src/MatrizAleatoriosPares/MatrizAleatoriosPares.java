package MatrizAleatoriosPares;
import java.util.Random;

public class MatrizAleatoriosPares{
    public static void main(String[] args) {
        Random ran = new Random();
        int [][] matriz = new int [5][5];

        int pares = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j =0; j<matriz[i].length;j++){
                matriz[i][j]= ran.nextInt(10);
                System.out.print(matriz[i][j]+" ");
                if (matriz[i][j]%2 == 0) {
                    pares += 1;
                }
            }
            System.out.println();
        }
        System.out.println("Cantidad de numeros pares: "+pares);
    }
}
