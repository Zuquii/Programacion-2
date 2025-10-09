package Persona;

public class Persona {
    String dni;
    String Apellido;
    String Nombre;
    String fechaNacimiento;

    public Persona(String dni, String Apellido, String Nombre, String fechaNacimiento) {
        this.dni = dni;
        this.Apellido = Apellido;
        this.Nombre = Nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String toString(){
        return "Persona( " + "dni= " +dni + ", Apellido= "+Apellido+", Nombre= "+Nombre+", fechaNacimiento= "+fechaNacimiento+")";
    }
}
