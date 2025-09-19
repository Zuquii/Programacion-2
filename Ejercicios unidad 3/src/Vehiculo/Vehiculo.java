package Vehiculo;

public class Vehiculo {
    private String marca;
    private String modelo;
    private int anio;
    private int velocidad;

    public Vehiculo(){
        this.marca = "Desconocido";
        this.modelo = "Desconocido";
        this.anio = 0;
        this.velocidad = 0;
    }

    public Vehiculo(String marca, String modelo, int anio, int velocidad){
        this.marca = marca;
        this.modelo = modelo;
        setAnio(anio);
        setVelocidad(velocidad);
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public int getAnio(){
        return anio;
    }

    public void setAnio(int anio){
        if (anio > 1886){
            this.anio = anio;
        } else {
            this.anio = 0;
        }
    }

    public int getVelocidad(){
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        if (velocidad >= 0) {
            this.velocidad = velocidad;
        } else {
            this.velocidad = 0;
        }
    }

    public void acelerar (){
        this.velocidad += 10;
    }

    public void frenar(){
        if (velocidad >= 10) {
            this.velocidad -= 10;
        } else {
            this.velocidad = 0;
        }
    }

    public void mostrarDatos(){
        System.out.println("Marca: "+ marca+", Modelo: "+modelo+", Año: "+anio+", Velocidad: "+velocidad);
    }


}
