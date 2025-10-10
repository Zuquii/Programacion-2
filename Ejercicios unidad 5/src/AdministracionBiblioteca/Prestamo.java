package AdministracionBiblioteca;

public class Prestamo {
    private String fechaEntrega;
    private String fechaDevolucion;
    private boolean multa;
    private Copia copia;
    private Lector lector;

    public Prestamo(){}

    public Prestamo(String fechaEntrega, String fechaDevolucion, boolean multa,Copia copia, Lector lector) {
        this.fechaEntrega = fechaEntrega;
        this.fechaDevolucion = fechaDevolucion;
        this.multa = multa;
        this.copia = copia;
        this.lector = lector;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }
    public String getFechaDevolucion() {
        return fechaDevolucion;
    }
    public boolean Multa() {
        return multa;
    }
    public Copia getCopia() {
        return copia;
    }
    public Lector getLector() {
        return lector;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }
    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
    public void setMulta(boolean multa) {
        this.multa = multa;
    }
    public void setCopia(Copia copia) {
        this.copia = copia;
    }
    public void setLector(Lector lector) {
        this.lector = lector;
    }
}
