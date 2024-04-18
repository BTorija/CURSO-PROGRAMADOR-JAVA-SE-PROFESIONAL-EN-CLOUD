package model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Empleado {
	private String nombre;
	private int edad;
	private LocalDate fechaIngreso;
	private double salario;
	final double BONO=1500;
	
	abstract void incentivar();
}
