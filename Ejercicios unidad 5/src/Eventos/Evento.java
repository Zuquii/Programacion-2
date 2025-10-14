package Eventos;

public class Evento {
    private String nombre;
    private int dia;

    public Evento(String nombre, int dia) {
        this.nombre = nombre;
        setDia(dia);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if (dia >0 && dia <32) {
            this.dia = dia;
        }else{
            this.dia = 1;
        }
    }

    public String toString(){
        return nombre + " " + dia;
    }
}