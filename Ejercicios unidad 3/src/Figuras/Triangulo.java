package Figuras;
import java.lang.Math;

public class Triangulo {
    private int lado1;
    private int lado2;
    private int lado3;

    //Metodo privado que valida la desigualdad triangular.
    public static boolean esTrianguloValido(int a, int b, int c) {
        return (a > 0 && b > 0 && c > 0 &&
                a < b+c &&
                b < a+c &&
                c < a+b);
    }

    //Constructor por defecto.
    public Triangulo(){
        lado1 = 1;
        lado2 = 1;
        lado3 = 1;
    }

    //Constructor parametrizado con validacion.
    public Triangulo(int lado1, int lado2, int lado3){
        if(esTrianguloValido(lado1,lado2,lado3)) {
            this.lado1 = lado1;
            this.lado2 = lado2;
            this.lado3 = lado3;
        }else{
            //Si no forman un triangulo, asigno valores por defecto.
            this.lado1 = lado1;
            this.lado2 = lado2;
            this.lado3 = lado3;
        }
    }

    public int getLado1() {return lado1;}
    public int getLado2() {return lado2;}
    public int getLado3() {return lado3;}

    public void setLado1(int lado1) {
        if (esTrianguloValido(lado1, lado2, lado3)) {
            this.lado1 = lado1;
        }
    }

    public void setLado2(int lado2) {
        if (esTrianguloValido(lado1, lado2, lado3)) {
            this.lado2 = lado2;
        }
    }

    public void setLado3(int lado3) {
        if (esTrianguloValido(lado1, lado2, lado3)) {
            this.lado3 = lado3;
        }
    }

        public double getPerimetro(){
            return lado1+lado2+lado3;
        }

        public double getArea(){
            double s = getPerimetro()/2; //semiperimetro
            return Math.sqrt(s*(s-lado1)*(s-lado2)*(s-lado3));
        }

        @Override
        public String toString(){
            return "Triangulo: ["+"Lados: (1,2,3) "+lado1+", "+lado2+", "+lado3+", perimetro= "
                    +getPerimetro() +" area= "+getArea()+"]";
        }
}