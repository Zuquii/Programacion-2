import java.util.Scanner;

public class ContadorVocales{ 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingresa una cadena de texto: ");
		String texto = sc.nextLine();
		
		int contadorVocales = 0;
		
		//Convertimos a minuscula para facilitar la comparacion 
		texto = texto.toLowerCase();
		
		for (int i =0; i < texto.length(); i++){
			char c = texto.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
				contadorVocales ++;
			}
		}
		
		System.out.println ("Cantidad de vocales: " +contadorVocales);
		sc.close();
	}
}	