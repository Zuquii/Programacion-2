import java.util.Random;

public class contadorNumeros{
	public static void main (String args[]){
		Random ran = new Random();
		
		int [] numero = new int [15];
		int [] conteo = new int [10];
		
		for (int i=0; i < numero.length; i++){
			numero[i]= ran.nextInt(10)+1;
			System.out.print (+numero[i] + " " );
		}
		
		for (int i = 0; i < numero.length; i++){
			conteo[numero[i] -1]++;
		}
		
		for (int i = 0; i < conteo.length; i ++){
			System.out.println("El numero " +(i+1) + " se repite " + conteo[i] + " veces. ");
		}	
    } 
}