package CuentaDeAhorros;

public class usarCuentaDeAhorro {
    public static void main(String[] args) {
        //Cuentas
        CuentaDeAhorros ahorrador1 = new CuentaDeAhorros(220000);
        CuentaDeAhorros ahorrador2 = new CuentaDeAhorros(80000);

        CuentaDeAhorros.modificarTasaInteres(0.10);

        //Calcular interes mensual y mostrar saldos
        ahorrador1.calcularInteresMensual();
        ahorrador2.calcularInteresMensual();

        System.out.println("Saldo con tasa del 10%");
        System.out.println("Saldo del ahorrador 1: $"+ahorrador1.getSaldoAhorros());
        System.out.println("Saldo del ahorrador 2: $"+ahorrador2.getSaldoAhorros());

        CuentaDeAhorros.modificarTasaInteres(0.12);
        ahorrador1.calcularInteresMensual();
        ahorrador2.calcularInteresMensual();

        System.out.println("Saldo con tasa del 12%");
        System.out.println ("Saldo del ahorrador 1: $"+ahorrador1.getSaldoAhorros());
        System.out.println ("Saldo del ahorrador 2: $"+ahorrador2.getSaldoAhorros());
    }
}
