import java.util.Scanner;
public class ingresar2Enteros {
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Introduzca dos numeros enteros:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (b%a==0){
            System.out.println("El segundo numero es multiplo del primero.");
        } else {
            System.out.println("El segundo numero no es multiplo del primero.");
        }

    }
}