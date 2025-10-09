package Auto;
import Persona.Persona;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class CargarAutos {
    public static void main(String[]args) {
        List<Auto> autos = new ArrayList<Auto>();
        Scanner sc = new Scanner(System.in);
        String marca, modelo;
        int año;
        double precioVenta;
        double sumaPrecios = 0;

        System.out.println("Ingreso de datos. (Si desea FINALIZAR, ingrese UNA MARCA VACIA)");

        do {
            System.out.println("Ingrese la marca del auto: ");
            marca = sc.nextLine();
            if (marca.isEmpty()) {
                break;
            }

            System.out.println("Ingrese el modelo del auto: ");
            modelo = sc.nextLine();

            System.out.println("Ingrese el año del auto: ");
            año = sc.nextInt();
            sc.nextLine();

            System.out.println("Ingrese el precio del auto: ");
            precioVenta = sc.nextDouble();
            sc.nextLine();

            Auto nuevoAuto = new Auto(marca, modelo, año, precioVenta);
            autos.add(nuevoAuto);

            sumaPrecios += precioVenta;
        } while (true);

        System.out.println("Lista de los Autos cargados: ");
        for (Auto a : autos) {
            System.out.println(a);
        }

        double promedioPrecios = sumaPrecios / autos.size();
        System.out.println("El promedio de precios de venta de los autos es: " + promedioPrecios);

        System.out.println("Ingrese el modelo del auto a buscar: ");
        String modeloBuscado = sc.nextLine();

        if (buscarAutoPorModelo(autos, modeloBuscado)) {
            System.out.println("El auto con modelo " + modeloBuscado + " fue encontrado.");
        } else {
            System.out.println("El auto con modelo " + modeloBuscado + " no fue encontrado.");
        }
    }

        public static boolean buscarAutoPorModelo(List<Auto>autos, String modeloBuscado){
            for(Auto a : autos){
                if(a.getModelo().equalsIgnoreCase(modeloBuscado)){
                    return true;
                }
            }
            return false;
        }
}
