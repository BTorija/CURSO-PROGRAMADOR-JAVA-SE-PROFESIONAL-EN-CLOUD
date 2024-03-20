package principal;

import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {
		//Hacer un programa que solicite dos Números
		//y nos diga cuantos multiplos de 5
		//hay entre ambos números
		// Si alguno de los números es negativo se vuelve a pedir
		int num1, num2;
		int numMayor, numMenor;

		int contadorMultiplos=0;
		Scanner sc= new Scanner(System.in);
		do {
			System.out.println("Por favor, introduzca el primer número");
			num1=sc.nextInt();
		}while(num1<0);
		do {
			System.out.println("Por favor, introduzca el segundo número");
			num2=sc.nextInt();
		}while(num2<0);

		if(num1<num2) {
			numMenor=num1;
			numMayor=num2;

		} else {
			numMenor=num2;
			numMayor=num1;

		}
		for(int i=numMenor;i<numMayor;i++) {
			if (i%5==0) {
				contadorMultiplos++;
			}

		}
		System.out.println("Entre los números " +numMayor+ " y " +numMenor+ " hay " +contadorMultiplos + " múltiplos de 5.");





	}

}
