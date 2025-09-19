package Clima;
import Temperatura.Temperatura;
import java.util.Random;

public class Clima {
    public static void main (String [] args){
        Random rand = new Random();
        if (args.length == 0){
            System.out.println("Ingrese el tamaño por linea de comandos. ");
            return;
        }

        int tam = Integer.parseInt(args[0]);
        Temperatura[] arreglo = new Temperatura[tam];

        for (int i = 0; i < tam; i++){
            double grados = rand.nextDouble(50);
            arreglo[i] = new Temperatura(grados);
            System.out.println("Posicion "+(i+1)+": "+arreglo[i] + " ");
            System.out.println("Posicion "+(i+1)+" en Fahrenheit: "+arreglo[i].toFahrenheit());
            System.out.println("Posicion "+(i+1)+" en Kelvines: "+arreglo[i].toKelvin());
        }
    }
}
