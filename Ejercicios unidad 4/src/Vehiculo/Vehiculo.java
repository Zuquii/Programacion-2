package Vehiculo;

public abstract class Vehiculo {
    private Double velocidadMaxima;
    private String color;

    public Vehiculo(){}

    public Vehiculo(Double velocidadMaxima, String color) {
        this.velocidadMaxima = velocidadMaxima;
        this.color = color;
    }

    public Double getVelocidadMaxima() {}

    public String getColor() {}

    public abstract Double calcularConsumo();
}
