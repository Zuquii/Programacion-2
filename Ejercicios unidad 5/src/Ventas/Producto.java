package Ventas;

public class Producto {
    private String descripcion;
    private int id;

    public Producto(){}

    public Producto(String descripcion, int id){
        this.descripcion = descripcion;
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }
    public int getId(){
        return id;
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    public void setId(int id){
        this.id = id;
    }

    public String toString(){
        return descripcion + id;
    }
}
