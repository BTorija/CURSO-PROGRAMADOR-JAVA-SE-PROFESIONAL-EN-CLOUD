package view;

import java.util.Scanner;

import service.ContactosService;

public class MenuContactos {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int opcion;
		do {
			mostrarMenu();
			opcion=sc.nextInt();//lee la opción elegida
			switch(opcion) { //evaluamos
				case 1:
					nuevoContacto();
					break;
				case 2:
					eliminarContacto();
					break;
				case 3:
					actualizarContacto();
					break;				
				case 4:
					System.out.println("---Adios---");
			}
		}while(opcion!=4);	
	}


}
