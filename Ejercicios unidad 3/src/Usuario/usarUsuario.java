package Usuario;
import java.util.Scanner;

public class usarUsuario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Usuario[] usuarios = new Usuario[5];

        for (int i = 0; i < usuarios.length; i++) {
            System.out.println("Ingrese los datos del usuario: " + (i + 1));
            System.out.print("Apellido: ");
            String apellido = sc.nextLine();
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Documento: ");
            String documento = sc.nextLine();
            System.out.print("Nombre usuario: ");
            String nombreusuario = sc.nextLine();
            System.out.print("Contraseña: ");
            String contrasenia = sc.nextLine();

            usuarios[i] = new Usuario(apellido, nombre, documento, nombreusuario, contrasenia);
        }

        System.out.println("Lista de usuarios: ");
        for (Usuario u : usuarios) {
            System.out.println(u);
        }
    }
}
