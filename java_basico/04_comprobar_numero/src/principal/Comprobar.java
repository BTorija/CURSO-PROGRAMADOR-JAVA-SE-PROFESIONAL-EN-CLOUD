package principal;

public class Comprobar {

	public static void main(String[] args) {
		int num=9;
		//si el numero es par nos muestra la mitad de ese numero
		//pero si es impar muestra la mitad del anterior
		/*if (num%2==0) {
			num=num/2;
		}else {
			num=--num/2;
		}
		System.out.println(num);
		*/
		
		System.out.println(num%2==0?num/2:(num-1)/2); //operador ternario
		
		int a=10;
		int b=a++;
		int c=++b;
		System.out.println(a<b?b>c?a--:c++:--b); //12 por cada interrogacion tiene que haber un :

		if(a<b){
			if(b>c){
				a--;
			}else{
				c++;
			}
		}else{
			--b;
		} 

	}

}
