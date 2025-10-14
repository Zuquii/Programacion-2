package Eventos;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class RegistrarEventos {
        List<Evento> eventos = new ArrayList<>();

        public void agregarEvento(String nombre, int dia){
            eventos.add(new Evento(nombre, dia));
        }

        public void ListarEventos(List<Evento>eventos){
            eventos.sort(Comparator.comparing(Evento::getDia));
        }

        public void eliminarEvento(List<Evento>eventos, String nombre){
            for (Evento e : eventos){
                if (e.getNombre().contains(nombre)){
                    eventos.remove(e);
                }
            }
        }

        public void listarEventosDia(List<Evento>eventos, int dia){
            for (Evento e : eventos){
                if (e.getDia() == dia){
                    System.out.println(e);
                }
            }
        }
}

