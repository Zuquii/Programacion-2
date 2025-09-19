package MetodoPago;

public class PagoConDebito extends MetodoPago {
    public PagoConDebito(Double montoBase){
        super(montoBase);
    }

    public double calcularMontoFinal(){
        return montoBase;
    }
}
