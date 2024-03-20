package principal;

public class SumarHastaMil {

	public static void main(String[] args) {
		//hasta que número tengo que sumar, empezando por 1 hasta
		//llegar hasta mil o superarlo?
		//bucle n+(n+i)?
		//if >=1000 break?
		int num=0;
		int suma=0;
		
		do {
			num++;
			suma+=num;
			} while (suma<1000);
		System.out.println("Para llegar a 1000 he tenido que sumar hasta "+num);
		
		
	

	}

}
