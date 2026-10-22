package aplicacion;

import java.time.LocalDate;

import modelo.Empleado;
import modelo.Jefe;

public class UsaNumero1 {

	public static void main(String[] args) {
		
		Empleado emp[] = {
				new Empleado("Sergio", 1200, LocalDate.of(2025, 5, 15), "CONTABILIDAD"),
				new Empleado("Candela", 1200, LocalDate.of(2025, 5, 15), "VENTAS"),
				new Jefe("Paula", 1500, LocalDate.of(2025, 5, 10), "INFORMATICA", 400)
		};
		
		for(Empleado e: emp) {
			System.out.println(e.toString());
		}//for

	}//main

}//class
