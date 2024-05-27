package clases;

public class Test {

	public static void main(String[] args) {
		int s=10;
		Prueba p=new Prueba();
		Prueba p2=new Prueba();
		Prueba p3=p;
		System.out.println(p.toString());
		System.out.println(p.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p.equals(p2));
		System.out.println(p.equals(p3));
		System.out.println(p3.hashCode());
	}

}
