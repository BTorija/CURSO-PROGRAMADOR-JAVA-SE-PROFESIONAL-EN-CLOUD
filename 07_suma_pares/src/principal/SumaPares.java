package principal;

public class SumaPares {

	public static void main(String[] args) {
		//Calcula la suma de todos los números pares comprendidos entre 1 y 10
		
		int suma=0;
		//Recorremos todos los números del 1 al 10
		// y para cada número comprobamos si es par
		// y si lo es lo sumamos a suma
		for(int i=1;i<=10;i++) {
			if(i%2==0)   {
				suma=suma+i;
				/*suma+=i;*/	
			}
		}
		System.out.println(suma);
	}

}
