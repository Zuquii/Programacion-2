package CuentaDeAhorros;

public class CuentaDeAhorros {
    //Variable estatica para almacenar la T.I.A para todas las cuentas habientes.
    private static double tasaInteresAnual;

    //Variable de instancia private llamada SaldoAhorros
    private double SaldoAhorros;

    //Constructor por defecto.
    public CuentaDeAhorros() {}

    //Constructor parametrizado.
    public CuentaDeAhorros(double saldoInicial) {
        this.SaldoAhorros = saldoInicial;
    }

    //Metodo para calcular interes mensual y sumarlo al saldo
    public void calcularInteresMensual(){
        double interesMensual = SaldoAhorros * (tasaInteresAnual / 12);
        SaldoAhorros += interesMensual;
    }

    //Metodo estatico para modificar la tasa de interes anual.
    public static void modificarTasaInteres(double nuevaTasa){
        tasaInteresAnual = nuevaTasa;
    }

    //Getter de saldo
    public double getSaldoAhorros() {
        return SaldoAhorros;
    }
}

