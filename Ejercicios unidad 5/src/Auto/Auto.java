package Auto;

public class Auto {
    private String marca;
    private String modelo;
    private int año;
    private Double precioVenta;

    public Auto(){}

    public Auto(String marca, String modelo, int año, Double precioVenta) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.precioVenta = precioVenta;
    }

    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public int getAño() {
        return año;
    }
    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setAño(int año) {
        this.año = año;
    }
    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public String toString(){
        return "Auto[ " + "marca= " +marca + ", modelo= "+modelo+", año= "+año+", precioVenta= "+precioVenta+"]";
    }
}
