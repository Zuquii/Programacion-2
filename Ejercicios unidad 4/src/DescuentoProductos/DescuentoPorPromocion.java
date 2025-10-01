package DescuentoProductos;

public class DescuentoPorPromocion extends DescuentoProducto{
    public DescuentoPorPromocion(double precioOriginal){
        super(precioOriginal);
    }

    public double calcularPrecioFinal(int cantidad){
        return precioOriginal*0.85;
    }

}
