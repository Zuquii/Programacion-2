package Nombres;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BorrarNombre {
    public static void main(String []args){
        List<String>nombres = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese los nombres. || Escriba (fin) para terminar ");
        while(true) {
            String nombre = sc.nextLine();
            nombres.add(nombre);
            if (nombre.equals(".")) {
                break;
            }
        }

        System.out.println("Nombres ingresados: " + nombres);

        System.out.println("Ingrese el nombre que desea borrar: ");
        String nombreAborrar = sc.nextLine();
        System.out.println(borrarNombre(nombres, nombreAborrar));

        System.out.println("Nombres actuales: " + nombres);
    }

    public static String borrarNombre(List <String>nombres, String nombreAborrar) {
        if (nombres.contains(nombreAborrar)) {
            nombres.remove(nombreAborrar);
            return "El nombre: " + nombreAborrar + ", fue borrado";
        } else {
            return "El nombre: " + nombreAborrar + ", no se encuentra en la lista";
        }
    }
}
