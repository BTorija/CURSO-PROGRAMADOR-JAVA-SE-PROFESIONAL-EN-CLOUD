package principal;

public class PruebaTexto {

	public static void main(String[] args) {
		String n="hello";
		//n.toUpperCase(); //n no cambia por que es inmutable, no lo modifica, devuelve otra cadena convertida a mayusculas
		n=n.toUpperCase();
		System.out.println(n);
		
		String a=new String("mitexto");
		String b=new String("Mitexto");
		if(a==b) {
			System.out.println("Iguales");
		}else {
			System.out.println("Distintos"); //son distintos apuntan a diferentes direcciones
		}
		if (a.equals(b)) {
			System.out.println("Iguales");
			
		}else {
			System.out.println("Distintos");

		}
	}

}
