package SistemaDePublicaciones;

public class CompartiendoPublicaciones {
    public static void main(String[] args) {
        Publicacion[] publicaciones = new Publicacion[2];

        publicaciones[0] = new Articulo("Nota periodistica", "Estudiantes de Sistemas", "01/10/25", "Impacto de IA en la programacion");
        publicaciones[1] = new Video("Goles de Messi", "Fc Barcelona", "15/06/16", 4.30);

        for (Publicacion p : publicaciones) {
            p.mostrarContenido();

            if (p instanceof Compartible) {
                ((Compartible) p).compartir("X");
                ((Compartible) p).compartir("Instagram");
            }
            System.out.println("-------");
        }
    }
}