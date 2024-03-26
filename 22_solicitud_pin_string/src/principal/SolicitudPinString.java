package principal;

import java.util.Scanner;

public class SolicitudPinString {

	public static void main(String[] args) {
		//programa que solicite la introduccion de un PIN
		// si es correcto, le muestra un mensaje y el programa termina
		//si es incorrecto informo de ello al usuario y le solicita de nuevo el PIn
		//Si falla 3 veces el PIN le muestra mensaje de error, y el programa termina

		final String PIN_VALIDO="1234";
		String pinIntroducido;
		int intentos=3;
		Scanner sc= new Scanner(System.in);

		while(intentos>0) {
			System.out.println("Por favor, introduzca su pin");
			pinIntroducido=sc.nextLine();
			if (pinIntroducido.equals(PIN_VALIDO)) {
				System.out.println("Pin Correcto! Bienvenido!");
				//intentos=0; //para que no vuelva a entrar en while
				break; //ya no necesita seguir preguntando
			}else {
				intentos--;
				if (intentos>0) {
					System.out.println("Pin incorrecto, vuelva a intentarlo, le quedan "+intentos+ " intentos");

				}else {
					System.out.println("Intruso, no puedes entrar!!!");
				}
			}

		}
	}

	

}
