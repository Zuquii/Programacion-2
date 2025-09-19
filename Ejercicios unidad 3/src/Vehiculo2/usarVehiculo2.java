package Vehiculo2;

public class usarVehiculo2 {
    public static void main (String [] args){
        Vehiculo2 v1 = new Vehiculo2();
        Vehiculo2 v2 = new Vehiculo2("BMW", "GTI", 2004,"auto",true);

        v1.mostrarInfo();
        v2.mostrarInfo();

        v1.estacionar();
        v2.estacionar();
        v1.mostrarInfo();
        v2.mostrarInfo();

        v1.salirDelEstacionamiento();
        v2.salirDelEstacionamiento();
        v1.mostrarInfo();
        v2.mostrarInfo();
    }
}
