package principal;

import java.time.LocalDate;

public class Prueba4 {
	//Escribir método que sirva para mostrar por consola
	//el Hashcode de cualquier objeto Java

	static void printHashcode(Object obj){
	System.out.println(obj.hashCode());
	}
	public static void main(String[] args) {

	printHashcode("helpolo");
	printHashcode(200);
	printHashcode(LocalDate.now());
	}
}
