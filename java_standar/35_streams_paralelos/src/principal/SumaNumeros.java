package principal;


import java.time.Duration;
import java.time.LocalTime;
import java.util.stream.LongStream;

public class SumaNumeros {

	public static void main(String[] args) {
		//Programa que sume los numeros entre 1 y 100 millones
		LocalTime t1= LocalTime.now();
		System.out.println(LongStream.rangeClosed(1, 60_000_000_000L)
				.parallel() //genera el mismo stream pero en versión paralela (no usar en situaciones que no hayan una cifra muy alta de datos, ya que 
				.sum());
		LocalTime t2= LocalTime.now();
		Duration p=Duration.between(t1, t2);
		System.out.println(p);

	}

}
