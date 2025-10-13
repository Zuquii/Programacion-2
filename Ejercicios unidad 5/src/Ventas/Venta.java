package Ventas;

public class Venta {
    private Producto producto;
    private int cantidad;
    private double precioUnitario;

    public Venta(){}

    public Venta(Producto producto, int cantidad, double precioUnitario){
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }
    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public double getPrecioUnitario() {
        return precioUnitario;
    }
    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public String toString(){
        return  (super.toString())+cantidad + precioUnitario;
    }
}
