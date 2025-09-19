package Vehiculo;

public class usarVehiculo {
    public static void main (String [] args){

        Vehiculo v1 = new  Vehiculo();
        v1.setMarca("Volkswagen");
        v1.setModelo("Golf");
        v1.setAnio(2018);
        v1.setVelocidad(20);

        Vehiculo v2 = new  Vehiculo("Audio","A1",2012,5);

        v1.mostrarDatos();
        v2.mostrarDatos();

        v1.acelerar();
        v2.acelerar();

        v1.mostrarDatos();
        v2.mostrarDatos();

        v1.frenar();
        v2.frenar();

        v1.mostrarDatos();
        v2.mostrarDatos();
    }
}
