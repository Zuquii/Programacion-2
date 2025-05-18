import java.util.Scanner;

public class NotasEstudiantes {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);

        //Ingreso del numero de estudiantes 
        System.out.println ("Ingrese la cantidad de estudiantes: ");
        int E = sc.nextInt();

        //Arreglo para almacenar las notas
        double [] notas = new double [E];

        //Variables para calculos 
        double suma = 0;
        double notaMax = Double.MIN_VALUE;
        double notaMin = Double.MAX_VALUE;
        int aprobados = 0;
        int desaprobados = 0;

        //Ingreso de las notas
        for ( int i = 0; i < notas.length; i++){
            System.out.println ("Ingrese la nota del estudiante " +(i + 1) +": " );
            notas[i] = sc.nextDouble();

            //Suma para el promedio 
            suma += notas[i];

            //Notas mas alta y mas baja
            if (notas[i] > notaMax){
                notaMax = notas[i];
            }

            if (notas[i] < notaMin){
                notaMin = notas[i];
            }

            //Aprobados y desaprobados;
            if (notas [i] >= 6){
                aprobados += 1;
            } else { 
                desaprobados += 1;
            }
        }

        //Calcular el promedio
        double promedio = suma / E;

        // Resultados 
        System.out.println ("Resultados: ");
        System.out.println ("Promedio general: "+promedio );
        System.out.println ("Nota mas alta: "+notaMax);
        System.out.println ("Nota mas baja: "+notaMin);
        System.out.println ("Cantidad de estudiantes aprobados: "+aprobados);
        System.out.println ("Cantidad de estudiantes desaprobados: "+desaprobados);

        sc.close();
    }
}