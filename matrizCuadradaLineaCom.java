import java.util.Random;
import java.util.Scanner;

public class matrizCuadradaLineaCom{
	public static void main (String [] args){
		Scanner sc = new Scanner (System.in);
		Random ran = new Random();
		
		int tamanio = Integer.parseInt(args[0]);
		int matriz [][] = new int [tamanio] [tamanio];
		
		System.out.println("La matriz original es: ");
		for (int i=0;i<matriz.length;i++){
			for (int j=0;j<matriz[i].length;j++){
				matriz[i][j] = ran.nextInt(100);
				
				System.out.print(matriz[i][j] + " " );
			}
			System.out.println(" ");	
		}	
		
		System.out.println("Su traspuesta es: ");
		for (int i = 0; i<matriz.length; i ++){
			for (int j = 0; j <matriz[i].length;j++){
				System.out.print(matriz[j][i] + " ");
			}
			System.out.println(" ");
		}			
	}
}	