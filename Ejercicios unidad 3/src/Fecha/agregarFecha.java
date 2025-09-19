package Fecha;

public class agregarFecha {
    public static void main (String[] args) {
        Fecha f1 = new Fecha();
        f1.setDia(3);
        f1.setMes(3);
        f1.setAnio(2003);

        Fecha f2 = new Fecha(6,6,2006);

        System.out.println(f1.toString());
        System.out.println(f2.toString());

        //Agregar 3 dias, 3 meses, 3 años a la fecha 1:
        System.out.println("Dia 1 + 3 dias + 3 meses + 3 años: ");
        f1.sumarDias(3);
        f1.sumarMes(3);
        f1.sumarAnio(3);
        System.out.println(f1.toString());

        //Agregar 6 dias, 6 meses, 6 años a la fecha 1:
        System.out.println("Dia 2 + 30 dias + 7 meses + 10 años: ");
        f2.sumarDias(30);
        f2.sumarMes(7);
        f2.sumarAnio(10);
        System.out.println(f2.toString());
    }
}
