package view;

import java.text.ParseException;
import java.util.Scanner;

import model.Ciudad;
import service.CiudadesService;

public class CiudadesMenu {
	static CiudadesService service=new CiudadesService();
	public static void main(String[] args) {
		/*
		 *
		 * Desarrollar un programa para gestión de ciudades.
		 * Una ciudad se caracteriza por nombre, habitantes y pais.

		El programa mostrará el siguiente menú:

		1.- Nueva ciudad
		2.- Ciudad más poblada
		3.- Buscar por pais
		4.- Salir

		1: se piden los datos de la nueva ciudad y se guarda. No puede haber dos ciudades con mismo nombre
		en el mismo pais
		2: muestra directamente los datos de la ciudad más poblada
		3: se pide un nombre de pais y se muestran los datos de todas las ciudades de dicho pais
		 */
		
		Scanner sc=new Scanner(System.in);
		int opcion;
		do {
			presentarMenu();
			opcion=sc.nextInt();
			switch(opcion) {
				case 1:
					agregarCiudad();
					break;
				case 2:
					ciudadMasPoblada();
					break;
				case 3:
					buscarPorPais();
					break;
				case 4:
					System.out.println("Adios!");
					break;
				
				default:
					System.out.println("Opción no válida!");
			}
		}while(opcion!=4);
	}
	static void presentarMenu() {
		System.out.println("""
				1.- Nueva ciudad
				2.- Ciudad más poblada
				3.- Buscar por País
				4.- Salir
				
				""");
	}
		

	static  void agregarCiudad(){
			Scanner sc=new Scanner(System.in);		
			System.out.println("Introduzca el nombre de la Ciudad:");
			String nombre=sc.nextLine();
			System.out.println("Introduzca el número de habitantes:");
			int habitantes=Integer.parseInt(sc.nextLine());
			System.out.println("Introduzca el nombre del Pais:");
			String pais=sc.nextLine();
			Ciudad c=new Ciudad (nombre,habitantes,pais);
			service.agregarCiudad(c);
			sc.close();
	}
	
	static void ciudadMasPoblada() {
		Ciudad c=service.ciudadMasPoblada();
		System.out.print("Nombre: "+c.getNombre()+" ");
		System.out.print("Número de habitantes: "+c.getHabitantes()+" ");
		System.out.println("Pais: "+c.getPais()+" ");
		
	}
	static void buscarPorPais() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduzca el nombre del Pais:");
		String pais=sc.nextLine();
		Ciudad c=service.buscarPorPais();
		sc.close();

		
		
	}

}
