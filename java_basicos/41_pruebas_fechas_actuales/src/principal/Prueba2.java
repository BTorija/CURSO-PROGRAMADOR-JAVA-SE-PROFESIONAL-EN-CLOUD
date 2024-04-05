package principal;


import java.time.LocalDateTime;

public class Prueba2 {

	public static void main(String[] args) {
		// mostrar la fecha y la hora que será dentro de 
		//1 mes, 11 dias, 4 horas
		
		System.out.println(LocalDateTime
				.now()
				.plusMonths(1)
				.plusDays(11)
				.plusHours(4));

	}

}
