package principal;

public class Sumador {

	public static void main(String[] args) {
		int n1=20;
		int n2=11;
		int suma=0;
		int menor,mayor;
		
		
		//Calcular la suma entre todos los números comprendidos entre el mayor 
		//y el menor, no incluidos los extremos
		
		/*for(int i=11+1;i<20;i++) {
				
			suma+=i;	
			}
		System.out.println(suma);*/
		
		if(n1<n2) {
			menor=n1;
			mayor=n2;
			
		} else {
			menor=n2;
			mayor=n1;
			
		}
		for(int i=menor+1;i<mayor;i++) {
			
			suma+=i;	
			}
		System.out.println(suma);
		

	}

}
