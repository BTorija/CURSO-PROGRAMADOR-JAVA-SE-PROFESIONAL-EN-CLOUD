package principal;

import java.util.Scanner;

public class CalculaPrecio {

	public static void main(String[] args) {
		/* Pide el precio de un producto sin IVA y calcula su precio con IVA.
		 * El IVA es del 21%
		 * Formatea el resultado para que se muestre con dos decimales
		 */
		Scanner sc= new Scanner(System.in);
		sc.useLocale(.us);
		double precio;
		double IVA=0;
		
		System.out.println("Introduzca el precio del producto");
		precio=sc.nextDouble();
		IVA =precio*0.21;
		double precioIVA= precio+IVA;
		System.out.println("El precio con IVA es de " +/precioIVA);
		
		

	}

}
