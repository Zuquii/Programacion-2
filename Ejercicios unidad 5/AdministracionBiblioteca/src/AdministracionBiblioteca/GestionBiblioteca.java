package AdministracionBiblioteca;

import java.util.ArrayList;
import java.util.List;

public class GestionBiblioteca {
    // 1. Libro con mas de dos autores.
    public static List<Libro>librosConMasDeDosAutores(List<Libro>libros){
        List<Libro>resultado = new ArrayList<Libro>();
        for (Libro l : libros){
            if(l.getAutores().size()>2){
                resultado.add(l);
            }
        }
        return resultado;
    }

    // 2. Lector con mayor cantidad de prestamos con multa.
    public static Lector lectorConMasMultas(List<Lector>lectores){
        Lector LectorMaxMultas = null;
        int maxMultas = 0;

        for(Lector l : lectores){
            int multas = 0;
            for (Prestamo p : l.getPrestamos()){
                if(p.Multa()) multas++;
            }
            if (multas > maxMultas){
                maxMultas = multas;
                LectorMaxMultas = l;
            }
        }
        return LectorMaxMultas;
    }

    // 3. Libro con mayor cantidad de copias prestadas.
    public static Libro LibroConMasCopiasPrestadas(List<Libro>libros){
        Libro LibroMasPrestado = null;
        int maxPrestamos = 0;

        for (Libro l : libros){
            int prestamos = 0;
            for (Copia c : l.getCopias()){
                for (Prestamo p : c.getPrestamos()){
                    prestamos++;
                }
            }
            if (prestamos > maxPrestamos){
                maxPrestamos = prestamos;
                LibroMasPrestado = l;
            }
        }
        return LibroMasPrestado;
    }

    //4. Prestamos con multa en fecha determinada.
    public static int prestamosConMultaEnFecha(List<Prestamo>prestamos, String fecha){
         int contador = 0;
         for (Prestamo p : prestamos){
             if (p.Multa() && p.getFechaEntrega().equals(fecha)){
                 contador++;
             }
         }
         return contador;
    }
}
