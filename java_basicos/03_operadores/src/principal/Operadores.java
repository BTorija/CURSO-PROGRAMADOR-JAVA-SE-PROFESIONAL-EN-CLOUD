package principal;

public class Operadores {

	public static void main(String[] args) {
		int a=3;
		int b=5;
		System.out.println(b/a); // al dividir entre enteros da enteros
		b++;
		--a;
		System.out.println(b);
		System.out.println(a);
		int c=10;
		System.out.println(c++); //sería 10 por que el incremento se realiza despues de imprimir el 10 (despues del método)
		int n=--c;
		System.out.println(n); //sería 10 por que el decremento lo realiza antes de imprimir
		
		
		double r=3-5;
		r++;
		
		int x= 5;
		int y =4;
		int z=8;
		//System.out.println(x==y++);//false
		boolean rs= x>y||++z>2;
		System.out.println(z);
	}

}
