package empresaLogistica;

public class Camion extends Vehiculo {
    private int numeroEjes;
    private boolean remolque;

    public Camion(){}

    public Camion(String patente, int anioFabricacion, double toneladas,int numeroEjes, boolean remolque){
        super(patente, anioFabricacion, toneladas);
        this.numeroEjes = numeroEjes;
        this.remolque = remolque;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    public boolean isRemolque() {
        return remolque;
    }

    public void setRemolque(boolean remolque) {
        this.remolque = remolque;
    }

    @Override
    public String toString() {
        return "[Camion: "+" Numero de ejes: "+numeroEjes +", Remolque: "+remolque+ super.toString();
    }
}
