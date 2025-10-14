package Estudiantes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main (String[] args) {
        List<Estudiante>estudiantes = new ArrayList<>();

        cargarEstudiantes(estudiantes);
        ordenarPorNombre(estudiantes);
        mostrarEstudiantes(estudiantes);
    }

    public static void cargarEstudiantes(List<Estudiante> estudiantes){
        estudiantes.add(new Estudiante("Agustin",20));
        estudiantes.add(new Estudiante("Baltazar",30));
        estudiantes.add(new Estudiante("Carlos",40));
        estudiantes.add(new Estudiante("Ana",40));
        estudiantes.add(new Estudiante("Ariana",40));
    }

    public static void ordenarPorNombre(List<Estudiante> estudiantes){
        Collections.sort(estudiantes);
    }

    public static void mostrarEstudiantes(List<Estudiante> estudiantes){
        for (Estudiante e : estudiantes){
            System.out.println(e);
        }
    }
}
