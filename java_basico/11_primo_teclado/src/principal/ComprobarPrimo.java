package principal;

import java.util.Scanner;

public class ComprobarPrimo {

	public static void main(String[] args) {
		
		int num;
		//leer el número por teclado
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		num= sc.nextInt();
		// Indicará si el número es o no primo
		boolean esPrimo=true;
		
		for(int i=2; i<=num-1;i++) {
			if(num%i==0)   { //si la cumple no es primo
				esPrimo=false;
				
			}
			
		}
		System.out.println("El número " +num+" es un número primo? "+esPrimo);
	}
}
		
	
		
		

	
	



