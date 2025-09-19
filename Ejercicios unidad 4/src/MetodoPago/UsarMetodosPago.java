package MetodoPago;

public class UsarMetodosPago {
    public static void main(String[] args) {
        double monto = 15000.0;
        MetodoPago[] pagos = {
                new PagoConTarjetaCredito(monto),
                new PagoConDebito(monto),
                new PagoConTransferencia(monto),
                new PagoConTarjetaCredito(monto),
                new PagoConDebito(monto),
                new PagoConTransferencia(monto),
                new PagoConTarjetaCredito(monto),
                new PagoConDebito(monto),
                new PagoConTransferencia(monto)
        };

        for (MetodoPago p : pagos) {
            System.out.println(p.getClass().getSimpleName()+", Monto final: "+ p.calcularMontoFinal());
        }
    }
}