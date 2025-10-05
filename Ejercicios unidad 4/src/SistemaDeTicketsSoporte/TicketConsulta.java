package SistemaDeTicketsSoporte;

public class TicketConsulta extends Ticket implements Priorizable{
    private String categoria;

    public TicketConsulta(int id, String descripcion, String estado,String categoria) {
        super(id,descripcion,estado);
        this.categoria=categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public int calcularPrioridad(){
        //Prioridad segun tipo de categoria
        return switch (categoria.toLowerCase()){
            case "solicitud" -> 1;
            case "baja" -> 2;
            case "media" -> 3;
            case "alta " -> 4;
            case "critica " -> 5;
            default -> 5; //Prioridad por defecto para valores desconocidos.
        };
    }

    @Override
    public void procesar(){
        System.out.println("Procesando consulta (categoria "+categoria+"): "+descripcion);
    }
}
