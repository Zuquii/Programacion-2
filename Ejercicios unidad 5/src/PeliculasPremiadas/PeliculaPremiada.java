package PeliculasPremiadas;


public class PeliculaPremiada {
    private String titulo;
    private String premioObtenido;

    public PeliculaPremiada(){}

    public PeliculaPremiada(String titulo, String premioObtenido) {
        this.titulo = titulo;
        this.premioObtenido = premioObtenido;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPremioObtenido() {
        return premioObtenido;
    }

    public void setPremioObtenido(String premioObtenido) {
        this.premioObtenido = premioObtenido;
    }

    public boolean equals(Object obj){
        if(this == obj) return true;
        if(!(obj instanceof PeliculaPremiada)) return false;
        PeliculaPremiada otra = (PeliculaPremiada) obj;
        return this.titulo.equalsIgnoreCase(otra.titulo);
    }

    public String toString() {
        return titulo + " - " + premioObtenido;
    }
}
