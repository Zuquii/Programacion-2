package PeliculasPremiadas;
import java.util.List;
import java.util.ArrayList;

public class ListaPeliculasPremiadas {
    private List<PeliculaPremiada>listaPeliculasPremiadas = new ArrayList<>();

    public void agregarPelicula(PeliculaPremiada p){
        if(!listaPeliculasPremiadas.contains(p)){
            listaPeliculasPremiadas.add(p);
        }else{
            System.out.println("La pelicula: "+p +", ya existe");
        }
    }

    public void mostrarPeliculas(){
        for (PeliculaPremiada p : listaPeliculasPremiadas){
            System.out.println(p);
        }
    }

}
