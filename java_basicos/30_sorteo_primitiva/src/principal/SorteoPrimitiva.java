package principal;

import java.util.Arrays;
import java.util.Scanner;

public class SorteoPrimitiva {

	public static void main(String[] args) {
		// Introduce tu combinacion (6 números separados por una coma)
		// esta es tu combinación:....
		//esta es la combinación ganadora:...
		//has tenido ---- aciertos
		//generar array combinacion ganadora
		int[] combiGanadora=new int[6];
		int numero,totales=0;
		int aciertos=0;
		do {
		
			numero=(int)(Math.random()*49+1);
			if(!repetido(combiGanadora,numero,totales)) {
				combiGanadora[totales]=numero;
				totales++;
			}
		}while(totales<6);
		Arrays.sort(combiGanadora);
		for(int n:combiGanadora) {
			System.out.print(n+",");
		}
		
		Scanner sc=new Scanner(System.in);
		//Solicitar combinacion al jugador
		System.out.println("Introduce tu combinación de 6 números separados por comas");
		String combJugador=sc.nextLine();
		//Pasar a array de enteros con ParseInt
		int[] combiJugador=new int[combJugador.length()];
		for(int i=0;i<combJugador.length();i++) {
		
				combiJugador[i]=Integer.parseInt(combJugador.split(",")[i]);

		}
		
	
							
		
		//comparar aciertos
		
		System.out.println("Esta es tu combinacción: "+ combiJugador);
		System.out.println("Esta es la combinación ganadora: "+ combiGanadora);
		System.out.println("Has tenido " +aciertos+ "aciertos");
	}
	static boolean repetido(int[] numeros, int num, int totales) {
		boolean resultado=false;
		for(int i=0;i<totales;i++) {
			if(numeros[i]==num) {
				resultado=true;
				break;
			}
		}
		return resultado;
	}

		

}
