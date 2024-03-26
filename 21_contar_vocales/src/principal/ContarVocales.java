package principal;

public class ContarVocales {

	public static void main(String[] args) {
		String cad="Esto es un texto nuevo";
		//¿Cuantas vocales tiene este texto?
		int contador=0;
		cad=cad.toLowerCase();
		for(int i=0; i<cad.length();i++) {
		
			switch (cad.charAt(i)) {
			case 'a','e','i','o','u':	
				contador++;
			}
			
		}
		System.out.println("Total vocales " +contador);



	}

}
