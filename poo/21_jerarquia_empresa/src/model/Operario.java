package model;

import java.time.LocalDate;
import java.time.Period;

import lombok.AllArgsConstructor;
import lombok.Data;

public class Operario extends Empleado{
	Operario op=new Operario(nombre, nivel, fechaIngreso, BONO, op, nivel);
	private int nivel;

	public Operario(String nombre, int edad, LocalDate fechaIngreso, double salario, Operario op, int nivel) {
		super(nombre, edad, fechaIngreso, salario);
		this.op = op;
		this.nivel = nivel;
	}
	@Override
	void incentivar() {
		
		if(op.getEdad()>=30 && nivel>2) {
			setSalario(getSalario() + BONO * 2);
		} else if(op.getEdad()>=30 || nivel>2){
			setSalario(getSalario() + BONO );
		}else {
			System.out.println("Este empleado no tiene derecho a BONO");
		}
	public void actualizarNivel() {
		Period antiguedad=Period.between(op.getFechaIngreso(),LocalDate.now());
		if(antiguedad.getYears()>2 && op.nivel<5) {
			setNivel(op.getNivel()+1);
	}
	
	
	

}
