import java.util.Scanner;
public class matriz4x4 {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int [][] matriz = new int[4][4]; 
        
        System.out.println("Ingrese los valores: ");
            for (int i =0; i < matriz.length; i++){
                for (int j = 0; j < matriz.length; j++){
                    matriz [i][j]=sc.nextInt();
                }
            } 

            for (int i =0; i < matriz.length; i++){
                for (int j = 0; j < matriz.length; j++){
                    System.out.print(matriz[i][j]+ " ");
                }
                System.out.println(" ");
                 }
        
            int acumuladorFilas, acumuladorColumnas, acumuladorMatriz = 0;    
            int sumaDiagonales=0;
            
        for (int i=0; i < matriz.length; i++){
            acumuladorFilas = 0;
            acumuladorColumnas=0; 
            for (int j=0; j< matriz.length; j++){
                acumuladorFilas= acumuladorFilas + matriz[i][j];
                acumuladorColumnas= acumuladorColumnas + matriz [j][i];
                if (i == j){
                    sumaDiagonales+= matriz[i][j];
                }
            }

            acumuladorMatriz+= acumuladorFilas;
        }
        System.out.println("El promedio de la matriz es: " + (acumuladorMatriz / (matriz.length * matriz[0].length)));
    
        System.out.println("La suma de sus diagonales es: " +sumaDiagonales);
    }


}