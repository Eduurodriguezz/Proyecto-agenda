package aplicacion;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;

import modelo.CrearFichero;
import modelo.Empleado;
import modelo.Jefe;

public class UsaNumero2 {

	public static void main(String[] args) {
		Path pRuta = Paths.get("C:\\Users\\eduardo.rodrod\\Downloads\\DownloadsEmpresa1.dat\\");
		
		//Creación de empleados
		ArrayList<Empleado> emp = new ArrayList<>();
		emp.add(new Empleado("Sergio", 1200, LocalDate.of(2025, 5, 15), "CONTABILIDAD"));
		emp.add(new Empleado("Lucia", 1200, LocalDate.of(2025, 5, 10), "CONTABILIDAD"));
		emp.add(new Jefe("Marta", 1200, LocalDate.of(2025, 5, 11), "CONTABILIDAD", 400));
		
		emp.add(new Empleado("Patricia", 1200, LocalDate.of(2025, 5, 15), "VENTAS"));
		emp.add(new Empleado("Rocio", 1200, LocalDate.of(2025, 5, 10), "VENTAS"));
		emp.add(new Jefe("Miguel Angel", 1200, LocalDate.of(2025, 5, 11), "VENTAS", 400));
		
		emp.add(new Empleado("Cristina", 1500, LocalDate.of(2025, 5, 15), "INFORMATICA"));
		emp.add(new Empleado("Jose Esteban", 1500, LocalDate.of(2025, 5, 10), "INFORMATICA"));
		emp.add(new Jefe("Paula", 1500, LocalDate.of(2025, 5, 11), "INFORMATICA", 400));
		
		emp.add(new Empleado("Ainara", 1500, LocalDate.of(2025, 5, 15), "RECURSOS HUMANOS"));
		emp.add(new Empleado("Fernando", 1500, LocalDate.of(2025, 5, 15), "RECURSOS HUMANOS"));
		emp.add(new Jefe("Iker", 1500, LocalDate.of(2025, 5, 15), "RECURSOS HUMANOS", 400));
		
		CrearFichero cfFichero1 = new CrearFichero(pRuta);
		cfFichero1.escribirFichero(emp);
		
		ArrayList<Empleado> empFichero = cfFichero1.leerFichero(pRuta);
		for(Empleado e: empFichero) {
			System.out.println(e.toString());
		}
	}//main

}//class
