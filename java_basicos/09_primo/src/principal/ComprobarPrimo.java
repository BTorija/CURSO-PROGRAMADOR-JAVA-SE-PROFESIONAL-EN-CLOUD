package principal;

public class ComprobarPrimo {

	public static void main(String[] args) {
		int num = 17;
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
		
	
		
		

	
	



