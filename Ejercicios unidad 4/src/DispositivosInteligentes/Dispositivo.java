package DispositivosInteligentes;

public abstract class Dispositivo {
    protected int id;
    protected String marca;

    public Dispositivo(int id, String marca) {
        this.id = id;
        this.marca = marca;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public abstract void encender();

}
