package AlmacenarPalabras;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class AlmacenarPalabras {
    public static void main(String []args){
        List<String> palabras = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese las palabras que desea almacenar en la lista. || Escriba (fin) para terminar ");

        while (true){
            String palabra = sc.nextLine().toLowerCase();
            if (palabra.equals("fin")){
            break;}
            palabras.add(palabra);
        }

        System.out.println("Palabras ingresadas: ");
        for(String p : palabras){
            System.out.println("- " + p);
        }
        sc.close();


    }
}
