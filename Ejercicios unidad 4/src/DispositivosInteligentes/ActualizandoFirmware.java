package DispositivosInteligentes;

public class ActualizandoFirmware {
    public static void main(String[] args) {
        Dispositivo[] dispositivos = new Dispositivo[2];

        dispositivos[0] = new SmartTV(356890,"Samsung", 60);
        dispositivos[1] = new Smartphone(900465,"Apple","IOS");

        for (Dispositivo d : dispositivos) {
            d.encender();

            if(d instanceof Actualizable a){
                a.actualizarFirmware();
            }
        }
    }
}
