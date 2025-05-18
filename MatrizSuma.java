public class MatrizSuma{
	public static void main (String [] args){
		int [] [] matriz = {{1,2,3},{4,5,6},{7,8,9} };
		
		int total = 0; 
		
		for (int i = 0; i < matriz.length; i++){
			for (int j = 0; j <matriz.length; j++){
				total += matriz [i][j];
			}
		}	
		
		System.out.println("La suma total de sus elementos es: " +total);
	}		
}		
