package Vehiculo;

public class Camion extends Vehiculo {
    private double consumoBase = 0.5;

    public Camion(double velocidadMaxima,String color){
        super(velocidadMaxima,color);
    }

    @Override
    public double calcularConsumo(double km){
        return km * consumoBase *1.15;
    }

}
