package PeliculasPremiadas;

public class UsoListaPeliculasPremiadas {
    public static void main(String[] args) {
        ListaPeliculasPremiadas lista = new ListaPeliculasPremiadas();

        PeliculaPremiada p1 = new PeliculaPremiada("Inception", "Oscar a Mejor Fotografía");
        PeliculaPremiada p2 = new PeliculaPremiada("The Dark Knight", "Oscar a Mejor Actor de Reparto");
        PeliculaPremiada p3 = new PeliculaPremiada("Inception", "Oscar a Mejor Edición de Sonido");

        lista.agregarPelicula(p1);
        lista.agregarPelicula(p2);
        lista.agregarPelicula(p3); // Este no se debería agregar porque ya existe

        lista.mostrarPeliculas();
    }
}
