import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Persona implements Comparable<Persona>{
	private String nombre;
	private int edad;
	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public int compareTo(Persona p) {
		if(this.nombre.compareTo(p.getNombre())==0){
			return ((Integer)this.edad).compareTo(p.getEdad());
		}else{
			return this.nombre.compareTo(p.getNombre());
		}
	}
	
}
public class Test2 {

	public static void main(String[] args) {
		List<Persona> pers=new ArrayList<Persona>(List.of(new Persona("pepe",30),new Persona("Alicia",50),new Persona("r",19)));
		Collections.sort(pers);

	}

}
