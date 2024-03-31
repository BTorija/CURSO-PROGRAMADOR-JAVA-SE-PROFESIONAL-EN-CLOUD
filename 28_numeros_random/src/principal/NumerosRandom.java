package principal;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class NumerosRandom {

	public static void main(String[] args) {
		//Programa que muestre seis números aleatorios, no repetidos, entre 1 y 49, 
		//ordenados de menor a mayor
		// Conjunto para almacenar números aleatorios
        Set<Integer> numerosAleatorios = new HashSet<>();

        // Generar números aleatorios no repetidos
        Random random = new Random();
        while (numerosAleatorios.size() < 6) {
            int numero = random.nextInt(49) + 1; // Números entre 1 y 49
            numerosAleatorios.add(numero);
        }

        // Convertir el conjunto en un conjunto ordenado (TreeSet)
        TreeSet<Integer> numerosOrdenados = new TreeSet<>(numerosAleatorios);

        // Imprimir los números ordenados
        System.out.println("Números aleatorios no repetidos, ordenados de menor a mayor:");
        for (int numero : numerosOrdenados) {
            System.out.print(numero + " ");
        }
    }

}
