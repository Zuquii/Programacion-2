package Comparable;
import java.util.Comparator;

public class Persona implements Comparable<Persona>{
    private int idPersona;
    private String nombre;
    private int altura;

    public Persona(int idPersona, String nombre, int altura) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.altura = altura;
    }

    public String toString() {
        return "Persona [idPersona=" + idPersona + ", nombre=" + nombre + ", altura=" + altura + "]";
    }

    public int compareTo(Persona o){
        return this.nombre.compareTo(o.nombre);
    }

    public int getIdPersona() {
        return idPersona;
    }
    public String getNombre() {
        return nombre;
    }
    public int getAltura() {
        return altura;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }

}




