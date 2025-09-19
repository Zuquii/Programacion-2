package empresaLogistica;

public class Vehiculo {
    private String patente;
    private int anioFabricacion;
    private double toneladas;

    public Vehiculo(){}

    public Vehiculo(String patente, int anioFabricacion, double toneladas){
        this.patente = patente;
        this.anioFabricacion = anioFabricacion;
        this.toneladas = toneladas;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public double getToneladas() {
        return toneladas;
    }

    public void setToneladas(double toneladas) {
        this.toneladas = toneladas;
    }

    public String toString(){
        return ", Patente: "+patente+", Año fabricacion: "+anioFabricacion +", Toneladas: "+toneladas +"]";
    }
}
