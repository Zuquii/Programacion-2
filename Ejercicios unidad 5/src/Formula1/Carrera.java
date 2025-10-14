package Formula1;
import java.util.*;

public class Carrera {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Piloto>pilotos = new ArrayList<>();

        agregarPilotos(pilotos);
        OrdenarPilotos(pilotos);
        mostrarResultados(pilotos);

    }

    public static void agregarPilotos(List<Piloto>pilotos){
        pilotos.add(new Piloto("Verstappen", "Red Bull", 1, 120.5));
        pilotos.add(new Piloto("Leclerc", "Ferrari", 3, 123.8));
        pilotos.add(new Piloto("Norris", "McLaren", 2, 122.1));
        pilotos.add(new Piloto("Hamilton", "Mercedes", 4, 125.2));
    }

    public static void OrdenarPilotos(List<Piloto>pilotos) {
        pilotos.sort(Comparator.comparingInt(Piloto::getPosicion));
    }

    public static void mostrarResultados(List<Piloto>pilotos){
        System.out.println("Resultados de la carrera: ");
        for (Piloto p : pilotos){
            System.out.println(p);
        }
    }
}
