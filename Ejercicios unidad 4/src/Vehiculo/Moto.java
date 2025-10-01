package Vehiculo;

class Moto extends Vehiculo {
    private double consumoBase = 0.2;

    public Moto(double velocidadMaxima, String color){
        super(velocidadMaxima,color);
    }

    @Override
    public double calcularConsumo(double km){
        return km * (consumoBase + 0.2);
    }
}
