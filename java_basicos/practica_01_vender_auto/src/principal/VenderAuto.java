package principal;

import java.util.Scanner;

public class VenderAuto {

	public static void main(String[] args) {
		/* Una compañia de automoviles vende tres tipos de autos (A,B,C), y cada uno
		 * tiene un precio de venta y un porcentaje de comision por venta diferentes.
		 * Elabora un programa que calcule el valor de las comisiones que se
		 * deben pagar a determinado vendedor despues de haber recibido la cantidad y el
		 * tipo de autos que vendió.
		 * 
		 *Tenga en cuenta que:
		 *Comisión por auto tipo A: 24$
		 *Comision por auto tipo B: 33$
		 *Comision por auto tipo C: 38$
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int A=24,B=33,C=38;
		int cantA,cantB,cantC;
		int comision;
		
		System.out.println("Por favor, introduzca la cantidad de autos de tipo A vendidos");
		cantA=sc.nextInt();
		System.out.println("Por favor, introduzca la cantidad de autos de tipo B vendidos");
		cantB=sc.nextInt();
		System.out.println("Por favor, introduzca la cantidad de autos de tipo C vendidos");
		cantC=sc.nextInt();
		
		comision=cantA*A + cantB*+ cantC*C;
		System.out.println(" El total de su comision es de: "+comision+ "$");
		
	}

}
