package Vehiculo;

class Coche extends Vehiculo{
    private double consumoBase = 0.5;

    public Coche(Double velocidadMaxima, String color){
        super(velocidadMaxima, color);
    }

    @Override
    public double calcularConsumo(double km){
        return km * (consumoBase + 0.2);
    }
}
