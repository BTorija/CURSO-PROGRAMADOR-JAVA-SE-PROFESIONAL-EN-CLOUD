package principal;

public class ComprobarNota {

	public static void main(String[] args) {
		int nota=6;
		//a partir de la nota indicará si es un :
		//suspenso: entre 1 y 4;
		//aprobado: 5 o 6
		//notable: 7 u 8
		//sobresaliente: 9 o 10
		
		switch (nota) {
			case 1,2,3,4:	
				System.out.println("Usted ha suspendido");
				break;
			case 5,6:
				System.out.println("Usted ha aprobado");
			break;
			
			case 7,8:
				System.out.println("Usted ha sacado un notable");
			break;
			case 9,10:
				System.out.println("Usted ha sacado un sobresaliente");
			break;
				
				

	}
		//desde Java 14
		String resultado;
		resultado=switch(nota) {
		case 1,2,3,4-> "Suspenso";
		case 5 ,6-> "Aprobado";
		case 7, 8 -> "Notable";
		case 9,10-> "Sobresaliente";
		default->"Nota no válida";
		};
		System.out.println(resultado);
	}	

}
