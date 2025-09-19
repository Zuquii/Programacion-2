package Vehiculo2;

public class Vehiculo2 {
    private String marca;
    private String modelo;
    private int anio;
    private String tipo; // "auto", "moto", "bicicleta"
    private boolean ocupandoEspacio;

    public Vehiculo2() {
        this.marca = "Marca desconocida";
        this.modelo = "Modelo desconocido";
        this.anio = 2024;
        this.tipo = "auto";
        this.ocupandoEspacio = false;
    }

    public Vehiculo2(String marca, String modelo, int anio, String tipo, boolean ocupandoEspacio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        setTipo(tipo); // validación
        this.ocupandoEspacio = ocupandoEspacio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (tipo.equalsIgnoreCase("auto") || tipo.equalsIgnoreCase("moto") || tipo.equalsIgnoreCase("bicicleta")) {
            this.tipo = tipo.toLowerCase();
        } else {
            this.tipo = "auto";
        }
    }

    public boolean isOcupandoEspacio() {
        return ocupandoEspacio;
    }

    public void setOcupandoEspacio(boolean ocupandoEspacio) {
        this.ocupandoEspacio = ocupandoEspacio;
    }

    public void estacionar(){
        if (ocupandoEspacio == false) {
            ocupandoEspacio = true;
        } else {
            System.out.println("El el espacio ya esta ocupado.");
        }
    }

    public void salirDelEstacionamiento(){
        ocupandoEspacio = false;
    }

    public void mostrarInfo() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo +
                ", Año: " + anio + ", Tipo: " + tipo +
                ", Ocupando espacio: " + ocupandoEspacio);
    }
}
