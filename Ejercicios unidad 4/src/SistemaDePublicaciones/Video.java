package SistemaDePublicaciones;

public class Video extends Publicacion implements Compartible{
    private double duracion;

    public Video(String titulo, String autor, String fecha, double duracion){
        super(titulo,autor,fecha);
        this.duracion = duracion;
    }

    public void mostrarContenido(){
        System.out.println("Nombre del video: "+titulo);
        System.out.println("Autor: "+autor);
        System.out.println("Fecha: "+fecha);
        System.out.println("Duracion: "+duracion);
    }

    public void compartir(String plataforma){
        System.out.println("Compartiendo el video: "+titulo+" en " +plataforma);
    }
}
