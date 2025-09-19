package empresaLogistica;

public class ProductosFarmaceuticos extends Refrigerados {
    private String autorizacionSanitaria;

    public ProductosFarmaceuticos(String patente, int anioFabricacion, double toneladas,Double temperaturaMinima, String tipoSistemaRefrigeracion, String autorizacionSanitaria) {
        super(patente, anioFabricacion,toneladas,temperaturaMinima,tipoSistemaRefrigeracion);
        setAutorizacionSanitaria(autorizacionSanitaria);
    }

    public String getAutorizacionSanitaria() {
        return autorizacionSanitaria;
    }

    public void setAutorizacionSanitaria(String autorizacionSanitaria) {
        this.autorizacionSanitaria = autorizacionSanitaria;
    }

    public String toString(){
        return "[Productos farmaceuticos: " + "Autorizacion sanitaria: "+autorizacionSanitaria+super.toString();
    }
}
