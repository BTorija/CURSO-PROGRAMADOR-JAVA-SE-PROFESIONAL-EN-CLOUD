package principal;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Primitiva {

	public static void main(String[] args) {
		//Programa que muestre seis números aleatorios, no repetidos, entre 1 y 49, 
		//ordenados de menor a mayor
		int[] generados=new int[6];
		int numero,totales=0;
		//Hay que generar un número aleatorio entre 1 y 49
		//hasta conseguir 6 diferentes
		do {
			//genero número y si no está repetido, lo guardamos
			numero=(int)(Math.random()*49+1);
			if(!repetido(generados,numero,totales)) {
				generados[totales]=numero;
				totales++;
			}
		}while(totales<6);
		Arrays.sort(generados);//ordena array de menor a mayor
		for(int n:generados) {
			System.out.print(n+",");
		}
	}
	static boolean repetido(int[] numeros, int num, int totales) {
		boolean resultado=false;
		for(int i=0;i<totales;i++) {
			if(numeros[i]==num) {//repetido
				resultado=true;
				break;
			}
		}
		return resultado;
	}

}


