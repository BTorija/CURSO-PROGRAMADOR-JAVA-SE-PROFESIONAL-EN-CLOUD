package principal;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		//realizar un programa que solicite una a una, la introducción
		//de 6 notas (double) que serán guardadas en un array
		//Trasa ello, el programa mostrará los siguientes datos:
		//-Nota Media
		//-Nota más alta
		//-Aprobados (cada nota que sea un aprobado)
		
		Scanner sc= new Scanner(System.in);
		double notaMasAlta=0;
		double mediaNotas=0;
		double sumaNotas=0;
		boolean aprobado;
		double [] notas= new double [6];
		for(int i=0; i<notas.length;i++) {
			System.out.println("Introduzca su nota");
			notas[i]=sc.nextDouble();
			sumaNotas+=notas[i];
			if (notas[i]>notaMasAlta) {
				notaMasAlta=notas[i];
		}
		}
		for(double nota:notas) {
			if (nota>5) {
				System.out.println("Enhorabuena ha aprobado con una nota de "+nota);
				
			} else {
				System.out.println("Lo sentimos, usted ha suspendido con una nota de " +nota);
			}
			
			
		}
		System.out.println("La media de las notas es de "+(sumaNotas/notas.length));
		System.out.println("la nota mas alta es "+notaMasAlta);			
		

	}

}
