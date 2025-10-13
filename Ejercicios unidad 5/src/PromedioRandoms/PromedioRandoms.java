package PromedioRandoms;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class PromedioRandoms {
    public static void main(String [] args){
        List<Integer>enteros = new ArrayList<>();
        Random ran = new Random();

        for (int i = 0; i < 10; i++){
            enteros.add(ran.nextInt(1,101));
        }
        System.out.println("Numeros generados: "+enteros);

        double promedio = calcularPromedio(enteros);
        System.out.println("Promedio: "+promedio);
    }

    public static double calcularPromedio(List<Integer> enteros){
        int suma = 0;
        for (int n : enteros){
            suma += n;
        }
        return (double) suma / enteros.size();
    }
}
