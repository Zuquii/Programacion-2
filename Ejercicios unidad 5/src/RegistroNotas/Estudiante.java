package RegistroNotas;

public class Estudiante {
    private String nombre;
    private String dni;
    private double notaFinal;

    public Estudiante(String nombre, String dni, double notaFinal) {
        this.nombre = nombre;
        this.dni = dni;
        this.notaFinal = notaFinal;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getNotaFinal() {
        return notaFinal;
    }
    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    public String toString() {
        return "Nombre: " + nombre + ", DNI: " + dni + ", Nota Final: " + notaFinal;
    }
}
