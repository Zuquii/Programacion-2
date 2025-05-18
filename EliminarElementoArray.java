import java.util.Scanner;

public class EliminarElementoArray{ 
	public static void main (String [] args) { 
		Scanner sc = new Scanner (System.in);
		
		//Leer tamaño del arreglo desde la linea de comandos
		System.out.println ("Ingrese el tamaño del arreglo");
		int tamaño = sc.nextInt();
		
		int[] arreglo = new int[tamaño];
		
		//Llenar el arreglo con valores ingresados por el usuario
		System.out.println ("Ingrese los valores del arreglo: ");
		for (int i = 0; i < arreglo.length; i++){
			arreglo[i] = sc.nextInt();
		}

		//Mostrar el arreglo original
		System.out.println ("Arreglo original: ");
		mostrarArreglo(arreglo); 
		
		//Ingresar el indice a eliminar 
		System.out.println ("Ingrese el indice que desea eliminar: ");
		int indice = sc.nextInt();
		
		// Validar indice
		if (indice < 0 || indice >= tamaño){ 
			System.out.println ("Indice fuera de rango.");
			return;
		}	
		
		//Crear nuevo arreglo con un tamaño menor
		int [] NuevoArreglo = new int[tamaño - 1];
		
		//Copiar los elementos, omitiendo el indice a eliminar
		for (int i = 0, j = 0; i < tamaño; i++) {
			if (i != indice) { 
				NuevoArreglo[j] = arreglo [i];
				j++;
			}
		}
		
		//Mostrar nuevo arreglo 
		System.out.println ("Arreglo despues de eliminar el indice " +indice+ ":");
		mostrarArreglo(NuevoArreglo);
	}	
	
	public static void mostrarArreglo(int[] arreglo) { 
		for (int valor : arreglo){
			System.out.print (valor + " ");
		}	
			System.out.println();
	}
}	