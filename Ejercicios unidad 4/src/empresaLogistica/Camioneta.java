package empresaLogistica;

public class Camioneta extends Vehiculo {
    private String tipoCaja;
    private Boolean dobleTraccion;

    public Camioneta(){}

    public Camioneta(String patente, int anioFabricacion, double toneladas, String tipoCaja, Boolean dobleTraccion){
        super(patente, anioFabricacion, toneladas);
        setTipoCaja(tipoCaja);
        this.dobleTraccion = dobleTraccion;
    }

    public String getTipoCaja() {
        return tipoCaja;
    }

    public void setTipoCaja(String tipoCaja) {
        if (tipoCaja.equalsIgnoreCase("cerrada") || tipoCaja.equalsIgnoreCase("abierta")) {
            this.tipoCaja = tipoCaja;
        }else{
            this.tipoCaja = "abierta";
        }
    }

    public Boolean getDobleTraccion() {
        return dobleTraccion;
    }

    public void setDobleTraccion(Boolean dobleTraccion) {
        this.dobleTraccion = dobleTraccion;
    }

    public String toString(){
        return "[Camioneta: "+ " Tipo de caja: "+tipoCaja+", Doble traccion: "+dobleTraccion+super.toString();
    }
}
