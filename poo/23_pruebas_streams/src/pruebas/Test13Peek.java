package pruebas;

import java.util.List;

public class Test13Peek {

	public static void main(String[] args) {
		List<Integer> nums=List.of(11,4,5,8,2,7,5,8);
		//muestra cada número de la lista, sin contar duplicados, y después el total
		//de estos números
		System.out.println("Total de números "+nums.stream()
			.distinct() 
			.peek(n->System.out.println(n))//Stream<Integer>
			.count()); // a partir de java 11 la combinacion peek+ count sin añadir otra tarea no hace el peek
		//(por eso con el distinct ya si hace el peek)
		
	}

}