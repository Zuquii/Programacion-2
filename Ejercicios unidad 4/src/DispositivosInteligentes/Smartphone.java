package DispositivosInteligentes;

public class Smartphone extends Dispositivo implements Actualizable {
    private String sistemaOperativo;

    public Smartphone(int id, String marca, String sistemaOperativo){
        super(id, marca);
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    @Override
    public void encender(){
        System.out.println("Encendiendo Smarthphone: "+marca+" ID: "+id);
    }

    @Override
    public void actualizarFirmware(){
        System.out.println("Actualizando Smartphone: "+sistemaOperativo+" ID: "+id);
    }
}
