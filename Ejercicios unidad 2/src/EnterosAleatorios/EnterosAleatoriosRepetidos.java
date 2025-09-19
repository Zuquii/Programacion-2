package EnterosAleatorios;
import java.util.Random;

public class EnterosAleatoriosRepetidos {
    public static void main (String[] args){
            Random random = new Random();
            int [] numeros = new int [15];
            //Asignamos un numero random a cada posicion.
            for (int i = 0; i < numeros.length; i++){
                numeros[i] = random.nextInt(10)+1;
            }
            //Array contador para cada numero.
            int [] contador = new int[11];
            for (int num : numeros) {
                contador[num]++;
            }

            //Mostrar en pantalla el array generado.
            System.out.println("Array de 15 posiciones con numeros random: ");
            for (int num : numeros){
                System.out.print(num + " ");
            }
            System.out.println();

            //Mostrar por pantalla las veces que aparece cada numero
            for (int i = 0; i < contador.length; i++){
                if (contador[i] > 1){
                    System.out.println (i + " Aparece " + contador[i] + " veces. ");
                } else if (contador[i] == 1){
                    System.out.println (i + " Aparece " + contador[i] + " vez. ");
                }
            }
    }
}
