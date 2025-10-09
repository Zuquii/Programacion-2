package AdministracionBiblioteca;
import java.util.List;
import java.util.ArrayList;

public class Libro {
    private String titulo;
    private String editorial;
    private int anio;
    private long ISBN;
    private List<Autor> autores;
    private List<Copia>copias;

    public Libro(){
        this.autores = new ArrayList<Autor>();
        this.copias = new ArrayList<Copia>();
    }

    public Libro(String titulo, String editorial, int anio,List<Autor>autores,List<Copia>copias) {
        this.titulo = titulo;
        this.editorial = editorial;
        this.anio = anio;
        this.autores = autores;
        this.copias = copias;
    }

    //Agregar
    public void agregarAutor(Autor autor){
        this.autores.add(autor);
    }

    public void agregarCopia(Copia copia){
        this.copias.add(copia);
    }


    public String getTitulo() {
        return titulo;
    }
    public String getEditorial() {
        return editorial;
    }
    public int getAnio() {
        return anio;
    }
    public long getISBN() {
        return ISBN;
    }
    public List<Autor> getAutores() {
        return autores;
    }
    public List<Copia> getCopias() {
        return copias;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
    public void setISBN(long ISBN) {
        this.ISBN = ISBN;
    }
    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }
    public void setCopias(List<Copia> copias) {
        this.copias = copias;
    }
}
