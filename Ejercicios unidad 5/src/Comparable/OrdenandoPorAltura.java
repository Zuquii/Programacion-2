package Comparable;
import java.util.List;
import java.util.ArrayList;

public class OrdenandoPorAltura {
    public static void main(String[] args) {
        List<Persona>personas = new ArrayList<Persona>();

        Persona p1,p2,p3;
        p1 = new Persona(1, "Juan", 175);
        p2 = new Persona(2, "Ana", 160);
        p3 = new Persona(3, "Luis", 180);

        personas.add(p1);
        personas.add(p2);
        personas.add(p3);

        System.out.println("Sin ordenar:");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        java.util.Collections.sort(personas, new OrdenarPersonaPorAltura());

        System.out.println("\nDespués de ordenar por altura:");
        for (Persona p : personas) {
            System.out.println(p);
        }
    }
}
