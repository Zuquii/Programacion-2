package SistemaDeTicketsSoporte;

public abstract class Ticket {
    protected int id;
    protected String descripcion;
    protected String estado;

    public Ticket(int id, String descripcion, String estado) {
        this.id = id;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public abstract void procesar();

    public String toString(){
        return "ID: "+id+" | Descripcion: "+descripcion+" | Estado: "+estado;
    }
}
