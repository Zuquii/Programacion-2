package Libro;

public class UsarLibro {
    public static void main (String[] args) {

        Libro l1 = new Libro();
        l1.setTitulo("Titulito");
        l1.setAutor("Autor");
        l1.setPaginas(-399);

        Libro l2 = new Libro("Libraso", "Pedrito", 222);

        Libro l3 = new Libro("Libron", "Eddd", 345);

        System.out.println(l1.toString()+ " El libro tiene mas de 300 paginas: " +l1.esLibroExtenso());
        System.out.println(l2.toString()+ " El libro tiene mas de 300 paginas: " +l2.esLibroExtenso());
        System.out.println(l3.toString()+ " El libro tiene mas de 300 paginas: " +l3.esLibroExtenso());

    }
}
