package Pelicula;

public class usarPelicula {
    public static void main (String[] args) {

        Pelicula p1 = new Pelicula();
        p1.setTitulo("EASDSD");
        p1.setGenero("Aventura");
        p1.setDirector("AAAASDDDDD");
        p1.setAnio(1233);

        Pelicula p2 = new Pelicula("Rookie","Accion","Pedrito",1993);

        System.out.println("Peliculas");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
}
