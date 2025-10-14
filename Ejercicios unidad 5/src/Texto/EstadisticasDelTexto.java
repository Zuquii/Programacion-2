package Texto;
import java.util.*;

public class EstadisticasDelTexto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un texto:");
        String texto = sc.nextLine().toLowerCase();

        String[]palabras = texto.split("[\\s,.;:!?]+");

        int cantidadPalabras = palabras.length;
        int cantidadCaracteres = texto.replace(" ", "").length();

        Map<String,Integer> frecuencia = new HashMap<>();
        for (String p : palabras){
            if (p.isEmpty()) continue;
            frecuencia.put(p,frecuencia.getOrDefault(p,0)+1);
        }

        System.out.println("--- Estadisticas ---");
        System.out.println("Cantidad de palabras: " + cantidadPalabras);
        System.out.println("Cantidad de caracteres(Sin espacios): " + cantidadCaracteres);
        System.out.println("Frecuencia de las palabras: ");
        for (Map.Entry<String, Integer> entrada : frecuencia.entrySet()){
            System.out.println(entrada.getKey() + ":"+entrada.getValue());
        }
    }
}
