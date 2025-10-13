package Ventas;
import java.util.List;
import java.util.ArrayList;


public class RegistroVentas {
    private List<Venta> ventas = new  ArrayList<>();

    public void agregarVenta(Venta venta){
        ventas.add(venta);
    }

    public double totalVentas(){
        double total = 0;
        double ventaMasBarata = Double.MAX_VALUE;
        for (Venta v : ventas){
            total += v.getPrecioUnitario();
            if (v.getPrecioUnitario()<ventaMasBarata){
                ventaMasBarata = v.getPrecioUnitario();
                v.getProducto().getDescripcion();
            }
        }
        return total;
    }

    public String ventaMasBarata(){
        Venta ventaMin = ventas.get(0);
        for (Venta v : ventas){
            if (v.getPrecioUnitario()<ventaMin.getPrecioUnitario()){
                ventaMin = v;
            }
        }
            return ventaMin.getProducto().getDescripcion();
    }


}
