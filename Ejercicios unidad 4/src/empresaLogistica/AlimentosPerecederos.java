package empresaLogistica;

public class AlimentosPerecederos extends Refrigerados{
    private String tipoAlimento;

    public AlimentosPerecederos(String patente, int anioFabricacion, double toneladas,Double temperaturaMinima, String tipoSistemaRefrigeracion, String tipoAlimento) {
        super(patente, anioFabricacion,toneladas,temperaturaMinima,tipoSistemaRefrigeracion);
        setTipoAlimento(tipoAlimento);
    }

    public String getTipoAlimento() {
        return tipoAlimento;
    }

    public void setTipoAlimento(String tipoAlimento) {
        if (tipoAlimento.equalsIgnoreCase("Carne") ||tipoAlimento.equalsIgnoreCase("Lacteos") || tipoAlimento.equalsIgnoreCase("vegetales")) {
            this.tipoAlimento = tipoAlimento;
        } else {
            this.tipoAlimento = "Carne";
        }
    }

    public String toString(){
        return "[Alimento perecederos: "+ " Alimento: "+tipoAlimento+super.toString();
    }
}
