package principal;



public class Prueba6 {
	static int numEntero (Number n){
		return n.intValue();
	}
	/*
	 * Escribe un método que nos muestre la parte entera
		de cualquier objeto numérico de envoltorio:

		Double d=2.3;
		Integer integ=7;
		Float ft=3.4f;

		metodo(d) -> 2
		metodo(integ) ->7
		metodo(ft) -> 3 
	 */

	public static void main(String[] args) {

		double a=2.5;
		System.out.println(numEntero(a)); 

	}

}
