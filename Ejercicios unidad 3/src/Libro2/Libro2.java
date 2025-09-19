package Libro2;

public class Libro2 {
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private String estado;

    public Libro2(){
        this.titulo = "Titulo desconocido";
        this.autor = "Autor desconocido";
        this.anioPublicacion = 2024;
        this.estado = "Disponible";
    }

    public Libro2(String titulo, String autor, int anioPublicacion, String estado){
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        setEstado(estado);
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getAutor(){
        return autor;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public int getAnioPublicacion(){
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion){
        this.anioPublicacion = anioPublicacion;
    }

    public String getEstado(){
        return estado;
    }

    public void setEstado(String estado){
        if (estado.equalsIgnoreCase("disponible")|| estado.equalsIgnoreCase("prestado")){
            this.estado = estado.toLowerCase();
        }else{
            this.estado = "Disponible";
        }
    }

    public void prestar() {
        if (estado.equalsIgnoreCase("disponible")) {
            estado = "Prestado";
            System.out.println("El libro: " + titulo + "ahora se encuentra prestado");
        } else {
            System.out.println("El libro: " + titulo+"No se encuentra disponible.");
        }
    }

    public void devolver(){
        if (estado.equals("prestado")){
            estado = "disponible";
            System.out.println("El libro: "+titulo+" fue devuelto");
        } else {
            System.out.println("El libro"+titulo+"ya esta disponible");

        }
    }

    public void mostrarInformacion(){
        System.out.println ("Titulo: "+titulo+" Autor: "+autor+" Anio: "+anioPublicacion+" Estado: "+estado);
    }
}
