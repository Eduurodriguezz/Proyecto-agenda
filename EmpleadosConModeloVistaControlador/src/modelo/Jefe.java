package modelo;

import java.io.Serializable;
import java.time.LocalDate;

public class Jefe extends Empleado implements Serializable{
	private double incentivo;

	public Jefe(String nombre, double sueldo, LocalDate contrato, String departamento, double incentivo) {
		super(nombre, sueldo, contrato, departamento);
		this.incentivo = incentivo;
	}//constructor

	// ===== Getters y setters
	public double getIncentivo() {
		return incentivo;
	}

	public void setIncentivo(double incentivo) {
		this.incentivo = incentivo;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + ", incentivo = " + incentivo;
	}//toString

}//class
