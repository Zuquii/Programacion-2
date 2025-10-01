package DescuentoProductos;

public class TestDescuentos {
    public static void main(String[] args) {
        DescuentoProducto [] productos = new DescuentoProducto[3];
        productos [0] = new DescuentoPorCantidad(1500);
        productos [1] = new DescuentoPorPromocion(1500);
        productos [2] = new DescuentoDeLiquidacion(1500);

        int cantidad = 11;

        for (DescuentoProducto p : productos){
            System.out.println(p.calcularPrecioFinal(cantidad));
        }
    }
}
