package Circulo;

public class ProbarCirculo {
    public static void main(String[] args) {
        Circulo c1 = new Circulo();
        c1.setRadio(4.0);

        Circulo c2 = new Circulo(49.0);

        System.out.println("Circunferencia del primer circulo: "+c1.calcularCircunferencia());
        System.out.println("Area del primer circulo: "+c1.calcularArea());

        System.out.println("Circunferencia del segundo circulo: "+c2.calcularCircunferencia());
        System.out.println("Area del segundo circulo: "+c2.calcularArea());

    }
}
