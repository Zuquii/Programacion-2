package empresaLogistica;

public class EmpresaTransporte {
    public static void main (String[] args) {

        Camion camion = new Camion("ABC123", 2015, 20.0, 4, true);
        Camioneta camioneta = new Camioneta("XYZ789", 2018, 2.5, "Cerrada", true);
        AlimentosPerecederos refAlimentos = new AlimentosPerecederos("ALM456", 2020, 10.0, -18.0, "Eléctrico", "Carne");
        ProductosFarmaceuticos refFarm = new ProductosFarmaceuticos("FAR789", 2021, 8.0, -10.0, "Gas", "MSAL-12345");
        ProductosTecnologicos refTec = new ProductosTecnologicos("TEC111", 2022, 5.0, 2.0, "Mixto", "Alto", true);

        System.out.println(camion.toString());
        System.out.println(camioneta.toString());
        System.out.println(refAlimentos.toString());
        System.out.println(refFarm.toString());
        System.out.println(refTec.toString());
    }
}
