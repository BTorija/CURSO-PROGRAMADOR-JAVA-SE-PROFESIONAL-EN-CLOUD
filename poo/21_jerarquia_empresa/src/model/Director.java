package model;

import java.time.LocalDate;
import java.time.Period;

public class Director extends Empleado {
	Director di=new Director();
	private String departamento;
	private int personal;
	@Override
	void incentivar() {
		Period antiguedad=Period.between(di.getFechaIngreso(),LocalDate.now());
		if(antiguedad.getMonths()>=30 && personal>=20) {
			setSalario(getSalario() + BONO * 2);
		} else if(antiguedad.getMonths()>=30 || personal>=20){
			setSalario(getSalario() + BONO );
		}else {
			System.out.println("Este empleado no tiene derecho a BONO");
		}
		
	}
	
}
