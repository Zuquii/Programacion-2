package Circulo;
import java.lang.Math;

public class Circulo {
    private double radio;

    public Circulo(){
        this.radio =1.0;
    }

    public Circulo (double radio){
        if (radio > 0 && radio < 50) {
            this.radio = radio;
        }
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        if (radio >0 && radio < 50) {
            this.radio = radio;
        }else{
            System.out.println("Error: El radio debe ser mayor a 0 y menor a 50.");
            this.radio = 1.0;
        }
    }

    public double calcularCircunferencia(){
        return 2 * Math.PI * this.radio;
    }

    public double calcularArea(){
        return Math.PI * (Math.pow(this.radio, 2));
    }
}
