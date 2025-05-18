import java.util.Scanner; 
public class usoCadenaCaracteres{ 
	public static void main (String args[]) {
		Scanner teclado = new Scanner (System.in); 
	
	System.out.print("Ingrese una cadena de caracteres: ");
	String cadena = scanner.nextLine();
	
	System.out.println ("El largo de la cadena es :" + cadena.length() );
	
	int cantidad = 0;
	for (int i = 0; i < cadena.length() ; i++) {
		if (cadena.charAt(i) == 'a') {
			cantidad++;
		}	
	}
	
	System.out.println("Cantidad de veces que aparece la letra 'a':" +cantidad);
	
	scanner.close();
	}
}	