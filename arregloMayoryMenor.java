import java.util.Scanner;
public class arregloMayoryMenor {
    public static void main (String args[]){
        int vectorEnteros[];
        Scanner teclado = new Scanner (System.in);

        System.out.print("Ingrese el tamaño del arreglo: ");
        int tam = teclado.nextInt();

        vectorEnteros = new int [tam];

        System.out.println("Ingrese los valores: ");
        for(int i=0; i<vectorEnteros.length; i++){
            vectorEnteros[i] = teclado.nextInt();
        }  
        
        int mayor = vectorEnteros[0];
        int menor = vectorEnteros[0];
        
        for (int i=1; i<vectorEnteros.length;i++){
            if (vectorEnteros[i]>mayor){
                mayor = vectorEnteros[i];
            }
            if (vectorEnteros[i]<menor){
                menor = vectorEnteros[i];
            }
        }
        
        System.out.println ("El mayor numero es: " + mayor);
        System.out.println ("El menor numero es: " +menor);
            

    }   
}