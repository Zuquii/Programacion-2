package SistemaDePublicaciones;

public class Articulo extends Publicacion implements Compartible {
    private String texto;

    public Articulo(String nombre, String autor,String fecha,String texto) {
        super(nombre,autor,fecha);
        this.texto = texto;
    }

    @Override
    public void mostrarContenido() {
        System.out.println("Nombre del articulo: "+autor);
        System.out.println("Autor: "+autor);
        System.out.println("Fecha: "+fecha);
        System.out.println("Informacion: "+texto);
    }

    @Override
    public void compartir (String plataforma) {
        System.out.println("Compartiendo articulo: "+titulo+" En "+plataforma);
    }
}
