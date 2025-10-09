package AdministracionBiblioteca;
import java.util.List;
import java.util.ArrayList;

public class Autor {
    private String nombre;
    private String nacionalidad;
    private List<Libro>libros;

    public Autor(){
        this.libros = new ArrayList<Libro>();//Inicio lista
    }

    public Autor(String nombre, String nacionalidad,List<Libro>libros) {//Constructor con la lista para poder instanciarla.
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.libros = libros;
    }

    public String getNombre() {
        return nombre;
    }
    public String getNacionalidad() {
        return nacionalidad;
    }
    public List<Libro> getLibros() {
        return libros;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }
}
