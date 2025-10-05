package SistemaDeTicketsSoporte;
import java.util.ArrayList;
import java.util.Comparator;

public class AbroTicket {
    public static void main(String [] args){
        ArrayList<Ticket> tickets = new ArrayList<>();

        tickets.add(new TicketIncidente(1,"No puedo acceder a mi cuenta","Abierto",4));
        tickets.add(new TicketConsulta(2,"¿Como cambio mi contraseña?",")Pendiente","alta"));
        tickets.add(new TicketIncidente(3,"Falla critica en el servidor","Abierto",6)); //Severidad fuera de rango, se ajusta a 5.
        tickets.add(new TicketConsulta(4,"Solicitud de nueva funcionalidad","Cerrado","media"));

        //Ordenar por prioridad descendente.
        tickets.sort((a,b) -> {
            int pa = ((Priorizable)a).calcularPrioridad();
            int pb = ((Priorizable)b).calcularPrioridad();
            return Integer.compare(pb,pa);
        });

        for(Ticket t:tickets){
            System.out.println(t);
            t.procesar();
            System.out.println();
        }

    }
}
