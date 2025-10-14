package RegistroNotas;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class VerEstudiantes {
    public static void main(String[] args) {
        List<Estudiante> estudiantes = new ArrayList<>();

        agregarEstudiantes(estudiantes);
        ordenarPorNota(estudiantes);
        mostrarEstudiantes(estudiantes);
    }

    public static void agregarEstudiantes(List<Estudiante> estudiantes) {
        estudiantes.add(new Estudiante("Agustin", "12345678A", 8.5));
        estudiantes.add(new Estudiante("Baltazar", "23456789B", 6.5));
        estudiantes.add(new Estudiante("Carlos", "34567890C", 9.0));
        estudiantes.add(new Estudiante("Ana", "45678901D", 2));
    }

    public static void ordenarPorNota(List<Estudiante> estudiantes) {
        estudiantes.sort(Comparator.comparingDouble(Estudiante::getNotaFinal).reversed());
    }

    public static void mostrarEstudiantes(List<Estudiante> estudiantes) {
        System.out.println("Estudiantes ordenados:");
        Double suma = 0.0;
        String alumnoConMejorNota = "";
        double notaMayor = Double.MIN_VALUE;
        for (Estudiante e : estudiantes) {
            suma += e.getNotaFinal();
            if(e.getNotaFinal() > notaMayor) {
                notaMayor = e.getNotaFinal();
                alumnoConMejorNota = e.getNombre();
            }
            System.out.println(e);
        }
        double promedio = suma / estudiantes.size();
        System.out.println("Promedio de notas: " + promedio);
        System.out.println("Alumno con mejor nota: "+alumnoConMejorNota);
    }
}


