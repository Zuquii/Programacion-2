package Temperatura;

public class usarTemperatura {
    public static void main(String[] args) {
        Temperatura t1 = new Temperatura(13.0);

        System.out.println(t1.toString());
        System.out.println(t1.toFahrenheit());
        System.out.println(t1.toKelvin());
    }
}
