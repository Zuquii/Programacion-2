package Libro;

public class Libro {
    private String titulo;
    private String autor;
    private int paginas;

    public Libro() {
        this.titulo = "Desconocido";
        this.autor = "Desconocido";
        this.paginas = 0;
    }

    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        if (paginas >= 0) {
            this.paginas = paginas;
        } else {
            this.paginas = 0;
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        if (paginas >= 0) {
            this.paginas = paginas;
        }
    }

    public boolean esLibroExtenso(){
        if (paginas > 300){
            return true;
        } else {
            return false;
        }
    }

    public String toString(){
        return "Titulo : " +titulo+" Paginas: "+paginas+" Autor: "+autor;
    }
}
