package DescuentoProductos;

public abstract class DescuentoProducto {
    protected double precioOriginal;

    public DescuentoProducto(){}

    public DescuentoProducto(double precioOriginal){
        this.precioOriginal = precioOriginal;
    }

    public double getPrecioOriginal() {
        return precioOriginal;
    }

    public abstract double calcularPrecioFinal(int cantidad);

    public String toString(){
        return "Precio Original: " + precioOriginal;
    }
}
