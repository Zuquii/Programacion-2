package DescuentoProductos;

public class DescuentoPorCantidad extends DescuentoProducto{
    public DescuentoPorCantidad(double precioOriginal){
        super(precioOriginal);
    }

    public double calcularPrecioFinal(int cantidad){
        if ( cantidad > 10 ){
            return precioOriginal * 0.90;
        } else {
            return precioOriginal * cantidad;
        }
    }

}
