/* Crear un programa que permita introducir por línea de comandos 10 elementos de 
tipo entero en un arreglo, el programa deberá mostrar impreso el arreglo en orden
inverso.
*/

import java.util.Scanner; 
public class array10Enteros {
	public static void main(String args[]){
		Scanner scanner = new Scanner (System.in);
		int [] elemento = new int [10];
		System.out.println("Ingrese 10 elementos enteros:");
		
		for (int i = 0; i<elemento.length; i++){
			elemento[i] = scanner.nextInt();
		}
	
		for (int i = elemento.length -1; i>=0; i--){
			System.out.println("Elemento en la posicion: " + i +" es " + elemento[i]);
		}
	}
	
}	
	