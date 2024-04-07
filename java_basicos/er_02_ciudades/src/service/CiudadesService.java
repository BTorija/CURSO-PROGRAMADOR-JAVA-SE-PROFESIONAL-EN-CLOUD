package service;

import java.util.HashSet;

import model.Ciudad;



public class CiudadesService {
	HashSet<Ciudad> ciudades=new HashSet<>();
	
	public void nuevaCiudad(Ciudad ciudad) {
		ciudades.add(ciudad);
	}
	
	
	
}
