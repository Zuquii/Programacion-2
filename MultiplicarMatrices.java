import java.util.Random;
public class MultiplicarMatrices{
	public static void main (String [] args ){
		Random ran = new Random();
		int matriz1 [][] = new int [2][3];
		int matriz2 [][] = new int [3][2];
		
		System.out.println ("La matriz 1 es: ");
		for (int i = 0; i < matriz1.length; i++){ 
			for (int j = 0; j<matriz1 [i].length;j++){
				matriz1[i][j]= ran.nextInt(11);
				System.out.print (matriz1[i][j] +" ");
			}
			System.out.println (" ");
		}
		
		System.out.println();
		
		System.out.println ("La matriz 2 es: ");
		for (int i = 0; i < matriz2.length; i++){ 
			for (int j = 0; j<matriz2 [i].length;j++){
				matriz2[i][j]= ran.nextInt(11);
				System.out.print (matriz2[i][j] +" ");
			}
			System.out.println (" ");
		}
		
		System.out.println();
		
		int [][] resultado = new int [2][2];
		
		System.out.println("El resultado de la multiplicacion de las matrices es: "); 
		for (int i = 0; i < resultado.length; i ++){
			for (int j =0; j< resultado[i].length;j++){
				resultado [i][j] = 0;
				for (int k =0; k < matriz1[0].length; k++){
					resultado [i][j] += matriz1[i][k] * matriz2[k][j];
				}
				System.out.print(+resultado[i][j] + " ");
			}
			System.out.println();			
		}

	}	
}
	