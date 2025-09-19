package Fecha;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha(){}

    public Fecha (int dia, int mes, int anio){
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String toString(){
        return "Dia: "+dia+"/"+"Mes: "+mes+"/"+"Año: "+anio;
    }

    public void sumarDias(int cantidad){
        dia+=cantidad;
        if (dia > 30){
            dia = dia %30;//Vuelve a empezar desde 1.
            if (dia == 0){
                dia =30;
            }
        }
    }

    public void sumarMes(int cantidad){
        mes+=cantidad;
        if (mes > 12){
            mes = mes % 12;
            if (mes == 0){
                mes = 12;
            }
        }
    }

    public void sumarAnio(int cantidad){
        anio+=cantidad;
    }

}
