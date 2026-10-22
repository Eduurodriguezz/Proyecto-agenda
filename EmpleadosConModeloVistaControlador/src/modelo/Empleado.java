package modelo;

import java.io.Serializable;
import java.time.LocalDate;

public class Empleado implements Serializable{
	private String nombre;
	private double sueldo;
	private LocalDate contrato;
	private String departamento;
	
	public Empleado(String nombre, double sueldo, LocalDate contrato, String departamento) {
		this.nombre = nombre;
		this.sueldo = sueldo;
		this.contrato = contrato;
		this.departamento = departamento;
	}//constructor

	// ===== Getters y setters =====
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public LocalDate getContrato() {
		return contrato;
	}

	public void setContrato(LocalDate contrato) {
		this.contrato = contrato;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "Empleado .. Nombre = " + nombre + ", Sueldo = " + sueldo + ", Contrato = " + contrato + ", Departamento = "
				+ departamento;
	}
	
	
	
}//class
