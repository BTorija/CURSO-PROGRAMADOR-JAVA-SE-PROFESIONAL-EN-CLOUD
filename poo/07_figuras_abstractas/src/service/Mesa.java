package service;

public class Mesa implements Operaciones {
	private int ancho;
	private int largo;
	private int alto;

	public Mesa(int ancho, int largo, int alto) {
		super();
		this.ancho = ancho;
		this.largo = largo;
		this.alto = alto;
	}

	@Override
	public void girar(int grados) {
		System.out.println("Le mesa se ha girado "+grados+ "grados");
		
		
	}

	@Override
	public int invertir() {
		System.out.println("Le mesa se ha invertido");
		ancho+=1;
		return ancho+alto;
	}

}
