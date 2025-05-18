import java.util.Scanner;
public class invertirFrase {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.print("Ingrese una palabra o una frase: ");
        String texto = sc.nextLine();
        int i;

        for (i=texto.length() -1; i >= 0; i--){
            System.out.print(texto.charAt(i));
        }

        System.out.println (" ");
        

        
    }   
}