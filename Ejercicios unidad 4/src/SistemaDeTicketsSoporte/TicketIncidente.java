package SistemaDeTicketsSoporte;

public class TicketIncidente extends Ticket implements Priorizable {
    private int severidad; // 1 baja, 5 alta.

    public TicketIncidente(int id, String descripcion, String estado, int severidad) {
        super(id, descripcion, estado);
        this.severidad = severidad;
    }

    public int getSeveridad() {
        return severidad;
    }

    public void setSeveridad(int severidad) {
        if (severidad > 0 && severidad < 6) {
            this.severidad = severidad;
        }else {
                this.severidad = 5;
            }
    }

    @Override
    public int calcularPrioridad(){
        return severidad; //Prioridad igual a la severidad.
    }

    @Override
    public void procesar(){
        System.out.println("Procesando incidente (severidad "+severidad+"): "+descripcion);
    }
}
