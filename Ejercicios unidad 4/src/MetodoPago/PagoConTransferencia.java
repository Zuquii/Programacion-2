package MetodoPago;
public class PagoConTransferencia extends MetodoPago {
    public PagoConTransferencia(Double montoBase) {
        super (montoBase);
    }

    public double calcularMontoFinal(){
        return montoBase * 0.95;
    }

}
