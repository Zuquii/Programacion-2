package Figuras;
import Figuras.Triangulo;
import java.util.Random;

public class Figuras {
    public static void main (String [] args){
        Random ran = new Random();
        Triangulo[] arreglo = new Triangulo[10];

        int lado1,lado2,lado3;
        for (int i =0; i < arreglo.length; i++ ){
            do {
                lado1 = ran.nextInt(10) + 1;
                lado2 = ran.nextInt(10) + 1;
                lado3 = ran.nextInt(10) + 1;

            } while (!Triangulo.esTrianguloValido(lado1,lado2,lado3));

            arreglo[i] = new Triangulo(lado1,lado2,lado3);
            System.out.println(arreglo[i].toString());
            System.out.println("Perimetro: "+arreglo[i].getPerimetro());
            System.out.println("Area: "+arreglo[i].getArea());
        }
    }
}
