package Formula1;

public class Piloto{
    private String nombre;
    private String escuderia;
    private int posicion;
    private double tiempo;

    public Piloto(String nombre, String escuderia, int posicion, double tiempo) {
        this.nombre = nombre;
        this.escuderia = escuderia;
        this.posicion = posicion;
        this.tiempo = tiempo;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEscuderia() {
        return escuderia;
    }
    public void setEscuderia(String escuderia) {
        this.escuderia = escuderia;
    }
    public int getPosicion() {
        return posicion;
    }
    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
    public double getTiempo() {
        return tiempo;
    }
    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return nombre + " - " + escuderia+"- Posicion: "+posicion+ "- Tiempo: "+tiempo;
    }
}
