package SistemaDePublicaciones;

public abstract class Publicacion {
    protected String titulo;
    protected String autor;
    protected String fecha;

    public Publicacion(){}

    public Publicacion(String nombre, String autor,String fecha){
        this.titulo = nombre;
        this.autor = autor;
        this.fecha = fecha;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public abstract void mostrarContenido();
}
