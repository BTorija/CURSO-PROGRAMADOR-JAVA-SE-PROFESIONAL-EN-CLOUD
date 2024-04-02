package principal;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayNumsAleatorios {

	public static void main(String[] args) {
		/* Realizar un programa que genere 100 números aleatorios entre 1 y 20 y los guarde
		en un array. Después, el programa solicita al usuario la introducción de un número
		entre 1 y 20. A continuación el programa nos mostrará los siguientes datos:

		- Número de veces que el número solicitado aparece en el array
		-Total de números que hay en el array (sin contar duplicados)
		 que sean más pequeños que el número solicitado*/

		int tamanoArray=100;
		int[] numsAleatorios=new int[tamanoArray];
		int numero;
		int numUsuario;
		//Solicitar número al usuario
		Scanner sc=new Scanner(System.in);
		System.out.println("Por favor, ingrese un número entre 1 y 20");
		numUsuario=sc.nextInt();
		
		//Generamos el array de números aleatorios
		for(int i=0;i<numsAleatorios.length;i++) {
			numero=(int)(Math.random()*20+1);
			numsAleatorios[i]=numero;
		}
		//Para revisar que imprime el array(no para el ejercicio)
		for (int n:numsAleatorios) {
			System.out.println(n);
			
		}
		//Imprimimos el resultado de los métodos
		
		System.out.println("El número introducido se repite "+contadorRepeticiones(numsAleatorios,numUsuario)+" veces");
		System.out.println("Hay "+numsSinDuplicados(numsAleatorios,numUsuario)+" números más pequeños que el que ha introducido");
	}
	
	//Métodos:
	static int contadorRepeticiones (int[]numsAleatorios,int numUsuario) {
		int contRepetidos=0;
		for(int i=0;i<numsAleatorios.length;i++) {
			if (numUsuario==numsAleatorios[i]) {
				contRepetidos++;
			}
		}
		return contRepetidos;
		}
	
	static int numsSinDuplicados (int[]numsAleatorios,int numUsuario) {
		int numsSinDuplicados=0;
		for(int i=0;i<numsAleatorios.length-1;i++) {
			if(numsAleatorios[i]!=numsAleatorios[i+1] && numsAleatorios[i]< numUsuario) {
				numsSinDuplicados++;
			}
	}
		return numsSinDuplicados;
		
	}
}
