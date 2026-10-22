package aplicacion;

import java.nio.file.Path;
import java.nio.file.Paths;

import controlador.ControladorVisualizarEmpleado;
import modelo.GestorEmpleado;
import vista.VistaGeneral;

public class UsaNumero4 {

	public static void main(String[] args) {
		
		Path pRuta = Paths.get("C:\\Users\\eduardo.rodrod\\Downloads\\DownloadsEmpresa1.dat");
		
		GestorEmpleado gestor1 = new GestorEmpleado(pRuta);
		VistaGeneral miVista = new VistaGeneral();
		
		ControladorVisualizarEmpleado cveUno = new ControladorVisualizarEmpleado(miVista,gestor1);
		
		miVista.setVisible(true);
	}//main

}//class
