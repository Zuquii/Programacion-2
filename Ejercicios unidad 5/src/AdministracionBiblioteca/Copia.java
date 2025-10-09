package AdministracionBiblioteca;
import java.util.List;
import java.util.ArrayList;

public class Copia {
    private int id;
    private Estado estado;
    private Libro libro;
    private List<Prestamo> prestamos;

    public Copia (){
        this.prestamos = new ArrayList<Prestamo>();
    }

    public Copia(int id, Estado estado, Libro libro,List<Prestamo> prestamos) {
        this.id = id;
        this.estado = estado;
        this.libro = libro;
        this.prestamos = prestamos;
    }

    public int getId() {
        return id;
    }
    public Estado getEstado() {
        return estado;
    }
    public Libro getLibro() {
        return libro;
    }
    public List<Prestamo> getPrestamos() {return prestamos;}

    public void setId(int id) {
        this.id = id;
    }
    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    public void setLibro(Libro libro) {
        this.libro = libro;
    }
    public void setPrestamos(List<Prestamo> prestamos) {this.prestamos = prestamos;}
}
