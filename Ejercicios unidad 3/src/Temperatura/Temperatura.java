package Temperatura;

public class Temperatura {
    private double gradosCelcius;

    public Temperatura(){
        this.gradosCelcius = 0;
    }

    public Temperatura(double gradosCelcius){
        this.gradosCelcius = gradosCelcius;
    }

    public double getGradosCelcius() {
        return gradosCelcius;
    }

    public void setGradosCelcius(double gradosCelcius) {
        this.gradosCelcius = gradosCelcius;
    }

    public String toString(double gradosCelcius){
        String gradosCelciusString = Double.toString(gradosCelcius);
        return gradosCelciusString;
    }

    public double toFahrenheit(){
        double fahrenheit = (gradosCelcius * 1.8) + 32;
        return fahrenheit;
    }

    public double toKelvin(){
        double kelvin =  (gradosCelcius + 273.15);
        return kelvin;
    }
}
