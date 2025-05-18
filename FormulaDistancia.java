import java.util.Scanner;

class formulaDistancia {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        double x1,x2,y1,y2,d;

        System.out.print("Ingresar punto x1: ");
        x1= sc.nextDouble();
        System.out.print("Ingresar punto y1: ");
        y1= sc.nextDouble();
        System.out.print("Ingrese el punto x2: ");
        x2= sc.nextDouble();
        System.out.print("Ingrese el punto y2: ");
        y2= sc.nextDouble();

        d = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        System.out.print("La distancia entre los dos puntos es: "+d);

    }
}