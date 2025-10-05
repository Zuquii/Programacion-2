package DispositivosInteligentes;

public class SmartTV extends Dispositivo implements Actualizable {
    private int tamanioPantalla;

    public SmartTV(int id, String marca,int tamanioPantalla){
        super(id,marca);
        this.tamanioPantalla = tamanioPantalla;
    }

    public int getTamanioPantalla() {
        return tamanioPantalla;
    }

    public void setTamanioPantalla(int tamanioPantalla) {
        this.tamanioPantalla = tamanioPantalla;
    }

    @Override
    public void encender(){
        System.out.println("Encendiendo SmartTV: " +marca+" ID: "+id);
    }

    @Override
    public void actualizarFirmware() {
        System.out.println("Actualizando SmartTV: "+marca+" ID: "+id);
    }
}
