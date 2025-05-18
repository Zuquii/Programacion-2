public class SumaDigitos { 
	public static void main (String[] args){
		if (args.length ==0){
			System.out.println ("Por favor, ingresá un número como argumento.");
			return;
		}

		String numero = args[0];
		int suma = 0;
		
		//Si el numero es negativo ignora el signo "-";
		for (int i = 0; i<numero.length(); i++){
			char c = numero.charAt(i);
			if (Character.isDigit(c)) {
				suma += Character.getNumericValue(c);
			}
		}
		
		System.out.println("Suma de los dígitos: " + suma);
    }
}