import java.util.Random;
import java.util.Scanner;

public class numSolicitado{
	public static void main (String [] args){
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		int matriz[][] = new int [4][4]; 
		
		System.out.println("La matriz 4x4 es: ");
		for (int i = 0 ; i<matriz.length;i++){
			for (int j = 0; j < matriz[i].length;j++){
				matriz [i][j] = ran.nextInt(99)+1;
			System.out.print(matriz[i][j] + " ");
			}	
			System.out.println(" ");
		}
		
		System.out.println("Ingrese el numero que busca en la matriz");
		int numPresente = sc.nextInt();
		boolean encontrado = false;
		
		for (int i = 0 ; i<matriz.length;i++){
			for (int j = 0; j < matriz[i].length;j++){
				if (matriz [i][j] == numPresente){
					System.out.println("EL numero que busca esta en la matriz en la posicion: "+i + j);
					encontrado=true;
				}	
			}
		}
		
		if (!encontrado) {
			System.out.println("El numero que busca no esta en la matriz");
		}	
	}	
}	