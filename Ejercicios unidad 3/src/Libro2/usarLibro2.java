package Libro2;

public class usarLibro2 {
    public static void main(String [] args){
        Libro2 l1 = new Libro2();
        Libro2 l2 = new Libro2("ASDASD","asdasd", 2334,"disponible");

        l1.mostrarInformacion();
        l2.mostrarInformacion();

        l1.prestar();
        l2.prestar();
        l1.mostrarInformacion();
        l2.mostrarInformacion();

        l1.devolver();
        l2.devolver();
        l1.mostrarInformacion();
        l2.mostrarInformacion();

    }
}
