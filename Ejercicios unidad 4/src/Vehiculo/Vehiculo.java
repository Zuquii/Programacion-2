package Vehiculo;

public abstract class Vehiculo {
    protected Double velocidadMaxima;
    protected String color;

    public Vehiculo(){}

    public Vehiculo(Double velocidadMaxima, String color) {
        this.velocidadMaxima = velocidadMaxima;
        this.color = color;
    }

    public Double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public String getColor() {
        return color;
    }

    public abstract double calcularConsumo(double km);
}
