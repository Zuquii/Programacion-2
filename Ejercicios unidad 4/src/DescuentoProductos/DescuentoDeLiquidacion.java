package DescuentoProductos;

public class DescuentoDeLiquidacion extends DescuentoProducto{
    public DescuentoDeLiquidacion(double precioOriginal){
        super(precioOriginal);
    }

    public double calcularPrecioFinal(int cantidad){
        return precioOriginal*0.80;
    }
}
