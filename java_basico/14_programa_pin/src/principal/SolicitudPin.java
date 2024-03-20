package principal;

import java.util.Scanner;

public class SolicitudPin {

	public static void main(String[] args) {
		//programa que solicite la introduccion de un PIN
		// si es correcto, le muestra un mensaje y el programa termina
		//si es incorrecto informo de ello al usuario y le solicita de nuevo el PIn
		//Si falla 3 veces el PIN le muestra mensaje de error, y el programa termina
		
		final int PIN_VALIDO=1234;
		int pinIntroducido;
		int intentos=3;
		Scanner sc= new Scanner(System.in);
		
			

		while(intentos>0) {
		System.out.println("Por favor, introduzca su pin");
		pinIntroducido=sc.nextInt();
		if (pinIntroducido==PIN_VALIDO) {
			System.out.println("Pin Correcto! Bienvenido!");
			intentos=0; //para que no vuelva a entrar en while
		}else {
			intentos--;
			if (intentos>0) {
				System.out.println("Pin incorrecto, vuelva a intentarlo, le quedar "+intentos+ " intentos");
				
			}else {
				System.out.println("Intruso, no puedes entrar!!!");
			}
		}
			
		}
	}

	

}
