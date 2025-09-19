package MetodoPago;

public class PagoConTarjetaCredito extends MetodoPago {

    public PagoConTarjetaCredito(Double montoBase) {
        super (montoBase);
    }

    @Override
    public double calcularMontoFinal() {
        return montoBase * 1.10;
    }
}
