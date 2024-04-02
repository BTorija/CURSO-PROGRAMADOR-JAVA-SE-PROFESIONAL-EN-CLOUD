package principal;

import java.util.ArrayList;

public class PruebaLista {

	public static void main(String[] args) {
		ArrayList<String>cadenas=new ArrayList<>();
		ArrayList<Integer>numeros=new ArrayList<>();
		var decimales=new ArrayList<Double>();
		cadenas.add("lunes");
		cadenas.add("martes");
		cadenas.add(0,"miercoles");// no sobreescribe el lunes si no que desplaza los elementos
		//cadenas.add(7,"jueves"); // Lanza excepción por que esa posición no existe
		System.out.println(cadenas.get(2));
		
		numeros.add(35); //hace autoboxing para meter el entero como un objeto Integer
		numeros.add(numeros.get(0)); // apuntaría a la misma referencia que el anterior no a un objeto nuevo
		numeros.set(0, 100);
		System.out.println(numeros.get(1));// Sale 35 porque aunque se genera un nuevo objeto (100) al que apunta la posiciçon 0, en la 1 sigue apuntando a 35
		//Con set lo reemplaza con add lo desplaza
		
		cadenas.remove(1);
		System.out.println(cadenas); //la posicion 2 se desplaza hacia atrás ocupando la 1 ahora
		
		if(!cadenas.contains("martes")) {
			cadenas.add("martes");
		}
		for(int i=0;i<cadenas.size();i++) {
			System.out.println(cadenas.get(i));
		}
	}

}
