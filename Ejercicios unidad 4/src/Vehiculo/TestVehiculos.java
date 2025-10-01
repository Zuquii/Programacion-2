package Vehiculo;

public class TestVehiculos {
    public static void main(String[] args) {
        Vehiculo [] vehiculos = new Vehiculo[3];
        vehiculos[0] = new Coche(230.0,"Negro");
        vehiculos[1] = new Moto(180.0,"Naranja");
        vehiculos[2] = new Camion(130.0,"Blanco");

        double km = 100;

        for (Vehiculo v : vehiculos){
            System.out.println(v.getClass().getSimpleName() + " Consumio en: " + km + " km: " +v.calcularConsumo(km) + " litros");
        }
    }
}
