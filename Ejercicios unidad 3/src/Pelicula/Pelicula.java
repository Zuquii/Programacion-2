package Pelicula;

public class Pelicula {
    private String titulo;
    private String genero;
    private String director;
    private int anio;

    public Pelicula(){}
    public Pelicula(String titulo, String genero, String director, int anio){
        this.titulo = titulo;
        this.genero = genero;
        this.director = director;
        this.anio = anio;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String toString (){
        return "Titulo: "+titulo + " " +"Genero: " +genero + " " +"Director: " +director + " " +"Año: " +anio;
    }
}
