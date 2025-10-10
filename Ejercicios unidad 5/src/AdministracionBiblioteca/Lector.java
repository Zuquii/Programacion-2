package AdministracionBiblioteca;
import java.util.List;
import java.util.ArrayList;

public class Lector {
    private int codigo;
    private int dni;
    private String nombre;
    private List<Prestamo> prestamos;

    public Lector(){}

    public Lector(int codigo, int dni, String nombre,List<Prestamo> prestamos) {
        this.codigo = codigo;
        this.dni = dni;
        this.nombre = nombre;
        this.prestamos = prestamos;
    }

    public void agregarPrestamo(Prestamo p){
        this.prestamos.add(p);
    }

    public int getCodigo() {
        return codigo;
    }
    public int getDni() {
        return dni;
    }
    public String getNombre() {
        return nombre;
    }
    public List<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPrestamos(List<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }
}
