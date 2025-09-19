package empresaLogistica;

public class Refrigerados extends Vehiculo {
    private Double temperaturaMinima;
    private String tipoSistemaRefrigeracion;

    public Refrigerados(String patente, int anioFabricacion, double toneladas, Double temperaturaMinima, String tipoSistemaRefrigeracion) {
        super(patente, anioFabricacion, toneladas);
        this.temperaturaMinima = temperaturaMinima;
        setTipoSistemaRefrigeracion(tipoSistemaRefrigeracion);
    }

    public Double getTemperaturaMinima() {
        return temperaturaMinima;
    }

    public void setTemperaturaMinima(Double temperaturaMinima) {
        this.temperaturaMinima = temperaturaMinima;
    }

    public String getTipoSistemaRefrigeracion() {
        return tipoSistemaRefrigeracion;
    }

    public void setTipoSistemaRefrigeracion(String tipoSistemaRefrigeracion) {
        if (tipoSistemaRefrigeracion.equalsIgnoreCase("Electrico") || tipoSistemaRefrigeracion.equalsIgnoreCase("Gas") || tipoSistemaRefrigeracion.equalsIgnoreCase("Mixto")) {
            this.tipoSistemaRefrigeracion = tipoSistemaRefrigeracion;
        } else {
            this.tipoSistemaRefrigeracion = "Electrico";
        }
    }

    public String toString(){
        return "[Refrigerado: "+"Temperatura minima: " +temperaturaMinima + ", Tipo de sistema de refrigeracion: "+tipoSistemaRefrigeracion+super.toString();
    }
}
