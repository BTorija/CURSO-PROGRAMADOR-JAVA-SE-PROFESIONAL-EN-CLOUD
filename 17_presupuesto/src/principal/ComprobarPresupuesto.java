package principal;

import java.util.Iterator;
import java.util.Scanner;

public class ComprobarPresupuesto {

	public static void main(String[] args) {
		//dado una serie de precios de coches, se le pedirá
		//al cliente cual es su presupuesto y el programa
		//le indicará a cuantos coches puede optar
		
		double []precios= {15_500,23_450,17_300,33_500,25_340,41_800};
		double presupuesto;
		int contador=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Por favor, introduzca su presupuesto");
		presupuesto=sc.nextDouble();
		for (int i=0; i<precios.length;i++) {
			if(precios[i]<=presupuesto) {
				contador++;
			}
			
		}
		System.out.println("Usted puede optar por "+ contador+ " modelos de coches");
		sc.close();
	}

}
