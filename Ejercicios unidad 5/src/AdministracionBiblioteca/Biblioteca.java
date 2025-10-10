package AdministracionBiblioteca;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Biblioteca {
    public static void main(String[] args){
        List<Libro>libros = new ArrayList<Libro>();
        List<Autor>autores = new ArrayList<Autor>();
        List<Copia>copias = new ArrayList<Copia>();
        List<Lector>lectores = new ArrayList<Lector>();
        List<Prestamo>prestamos = new ArrayList<Prestamo>();


        Autor a1 = new Autor("Borges","Argentino",libros);
        Autor aa1 = new Autor("Otro","Argentino",libros);
        Autor a2 = new Autor("Cortazar","Argentino",libros);
        Autor a3 = new Autor("Sabato","Argentino",libros);

        Libro l1 = new Libro("El Aleph","Editorial X",1945,123456,autores,copias);
        Libro l2 = new Libro("Rayuela","Editorial Y",1963,654321,autores,copias);
        Libro l3 = new Libro("El Túnel","Editorial Z",1948,111222,autores,copias);
        l1.agregarAutor(a1);
        l1.agregarAutor(aa1);
        l2.agregarAutor(a2);
        l3.agregarAutor(a3);

        Lector lector1 = new Lector(1,12345678,"Juan",prestamos);

        Copia c1 = new Copia(1,Estado.En_Biblioteca,l1,prestamos);
        l1.agregarCopia(c1);

        Prestamo p1 = new Prestamo("2025-10-01","2025-10-10",true,c1,lector1);
        lector1.agregarPrestamo(p1);
        c1.agregarPrestamo(p1);


        System.out.println("Libros con mas de 2 autores: ");
            for (Libro l : GestionBiblioteca.librosConMasDeDosAutores(libros)){
                System.out.println("- " + l.getTitulo());
            }

        Lector maxLector = GestionBiblioteca.lectorConMasMultas(lectores);
        System.out.println("Lector con mas multas: "+maxLector.getNombre());

        Libro maxLibro = GestionBiblioteca.LibroConMasCopiasPrestadas(libros);
        System.out.println("Libro con mas copias prestadas: "+maxLibro.getTitulo());

        int multasEnFecha = GestionBiblioteca.prestamosConMultaEnFecha(prestamos,"2025-10-15");
        System.out.println("Prestamos con multa en 2025-10-15: "+multasEnFecha);
    }
}
