package MetodoPago;

public abstract class MetodoPago {
    protected double montoBase;

    public MetodoPago(double montoBase) {
        this.montoBase = montoBase;
    }

    protected double getMontoBase() {
        return montoBase;
    }

    public abstract  double calcularMontoFinal();
}
