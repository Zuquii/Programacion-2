package empresaLogistica;

public class ProductosTecnologicos extends Refrigerados  {
    private String nivelDeSensibilidad;
    private Boolean proteccionHumedad;

    public ProductosTecnologicos(String patente, int anioFabricacion, double toneladas, Double temperaturaMinima, String tipoSistemaRefrigeracion, String nivelDeSensibilidad, Boolean proteccionHumedad) {
        super(patente, anioFabricacion,toneladas, temperaturaMinima,tipoSistemaRefrigeracion);
        setNivelDeSensibilidad(nivelDeSensibilidad);
        this.proteccionHumedad = proteccionHumedad;
    }

    public String getNivelDeSensibilidad() {
        return nivelDeSensibilidad;
    }

    public void setNivelDeSensibilidad(String nivelDeSensibilidad) {
        if (nivelDeSensibilidad.equalsIgnoreCase("Bajo") || nivelDeSensibilidad.equalsIgnoreCase("Medio") || nivelDeSensibilidad.equalsIgnoreCase("Alto")) {
            this.nivelDeSensibilidad = nivelDeSensibilidad;
        } else {
            this.nivelDeSensibilidad = "Bajo";
        }
    }

    public Boolean getProteccionHumedad() {
        return proteccionHumedad;
    }

    public void setProteccionHumedad(Boolean proteccionHumedad) {
        this.proteccionHumedad = proteccionHumedad;
    }

    public String toString(){
        return "[Productos tecnologicos: " + " Nivel de sensibilidad: "+nivelDeSensibilidad+", Proteccion de humedad: "+proteccionHumedad+super.toString();
    }
}
