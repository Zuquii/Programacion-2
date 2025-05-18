import java.util.Scanner;

public class InvertirNumeroString { 
	public static void main (String [] args){ 
		Scanner sc = new Scanner (System.in);
		
		System.out.print ("Ingrese un numero entero");
		String numero = sc.nextLine();
		
		String invertido = new StringBuilder(numero).reverse().toString();
		
		System.out.println ("Numero invertido: " +invertido);
		sc.close();
	}
}	