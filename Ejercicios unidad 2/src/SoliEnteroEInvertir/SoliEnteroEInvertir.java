package SoliEnteroEInvertir;
import java.util.Scanner;

public class SoliEnteroEInvertir{
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);

        System.out.println("Ingrese un numero entero el cual quiera invertir: ");
        String numero = sc.nextLine();

        System.out.println("Numero invertido: ");
        String invertido = new StringBuilder(numero).reverse().toString();

        System.out.println("Numero invertido: " + invertido);
    }
}
