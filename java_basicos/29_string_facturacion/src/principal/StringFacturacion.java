package principal;

import java.util.Arrays;
import java.util.Comparator;

public class StringFacturacion {

	public static void main(String[] args) {
		// A partir del siguiente String facilitado, el programa mostrará:
		//Nombre del departamento que más a facturado
		//Nombres de todos los departamentos, ordenados de menos a más facturación
		String facturacion="ventas-20800,administracion-17900,informatica-35000,RRHH-10350";
		
		// Dividimos la cadena en departamentos con el método split
        String[] departamentos = facturacion.split(",");
		//Creamos dos arrays para almacenar o se podria utilizar diccionario?
        String[] nombres = new String[departamentos.length];
        int[] facturaciones = new int[departamentos.length];
        for (int i = 0; i < departamentos.length; i++) {
            String[] partes = departamentos[i].split("-");
            nombres[i] = partes[0];
            facturaciones[i] = Integer.parseInt(partes[1]);
        }
     // Encontrar el departamento con la mayor facturación
        int maxFacturacion = Integer.MIN_VALUE;
        String departamentoMaxFacturacion = "";

        for (int i = 0; i < departamentos.length; i++) {
            if (facturaciones[i] > maxFacturacion) {
                maxFacturacion = facturaciones[i];
                departamentoMaxFacturacion = nombres[i];
            }
        }

        // Construir resultados usando StringBuilder
        StringBuilder resultado = new StringBuilder();
        resultado.append("Departamento que más ha facturado: ").append(departamentoMaxFacturacion).append("\n");

        // Ordenar los departamentos por facturación de menor a mayor
        Arrays.sort(departamentos, Comparator.comparingInt((String depto) -> {
            String[] partes = depto.split("-");
            return Integer.parseInt(partes[1]);
        }));

        // Construir la lista de nombres de departamentos ordenados
        resultado.append("Nombres de los departamentos ordenados por facturación:\n");
        for (String depto : departamentos) {
            resultado.append(depto.split("-")[0]).append("\n");
        }

        // Mostrar resultado
        System.out.println(resultado.toString());
    }
	

}
