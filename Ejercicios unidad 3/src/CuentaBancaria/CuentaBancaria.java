package CuentaBancaria;

public class CuentaBancaria {
    private String numeroCuenta;
    private String titular;
    private Double saldo;

    //Constructor que recibe numero de cuenta y titular (Saldo inicial = 0).
    public CuentaBancaria(String numeroCuenta, String titular){
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = 0.0;
    }

    //Constructor que recibe numero de cuenta, titular y saldo inicial.
    public CuentaBancaria(String numeroCuenta, String titular, Double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0.0; //No permite saldo negativo inicial.
        }
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    //Method for deposit money
    public void depositar (double cantidad){
        if (cantidad > 0) {
            saldo += cantidad;
        }
    }

    public void retirar (double cantidad){
        if (saldo - cantidad >= 0) {
            saldo -= cantidad;
        }else{
            System.out.print("Usted no cuenta con saldo suficiente para realizar el retiro. ");
        }
    }

    public String mostrarInformacion (){
        return "Numero de cuenta: " +numeroCuenta +" Titular: " +titular +" Saldo: " +saldo;
    }
}
