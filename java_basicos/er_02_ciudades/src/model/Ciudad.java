package model;

public class Ciudad {
	/*
	 *
	 * Desarrollar un programa para gestión de ciudades.
	 * Una ciudad se caracteriza por nombre, habitantes y pais.

	El programa mostrará el siguiente menú:

	1.- Nueva ciudad
	2.- Ciudad más poblada
	3.- Buscar por pais
	4.- Salir

	1: se piden los datos de la nueva ciudad y se guarda. No puede haber dos ciudades con mismo nombre
	en el mismo pais
	2: muestra directamente los datos de la ciudad más poblada
	3: se pide un nombre de pais y se muestran los datos de todas las ciudades de dicho pais
	 */
	
	private String nombre;
	private int habitantes;
	private String pais;
	
	public Ciudad(String nombre, int habitantes, String pais) {
		super();
		this.nombre = nombre;
		this.habitantes = habitantes;
		this.pais = pais;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getHabitantes() {
		return habitantes;
	}
	public void setHabitantes(int habitantes) {
		this.habitantes = habitantes;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	
}