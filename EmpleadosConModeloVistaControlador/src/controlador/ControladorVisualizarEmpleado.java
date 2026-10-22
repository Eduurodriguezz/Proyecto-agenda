package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import modelo.Empleado;
import modelo.GestorEmpleado;
import modelo.Jefe;
import vista.VistaGeneral;

public class ControladorVisualizarEmpleado implements ActionListener{

	private VistaGeneral miVista;
	private GestorEmpleado miModelo;
	
	private ArrayList<Empleado> listaCompleta;
	private int indiceActual;
	
	private ArrayList<Empleado> listaFiltrada;
	private DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public ControladorVisualizarEmpleado(VistaGeneral miVista, GestorEmpleado miModelo) {
		this.miVista = miVista;
		this.miModelo = miModelo;
		
		this.miVista.conectarControlador(this);
		
		listaCompleta = miModelo.leerFichero();
		refrescarVista();
	}//constructor
	
	public void refrescarVista() {
		/*Empleado e = listaCompleta.get(indiceActual);
		
		//Pasamos a string los datos
		String nombre = e.getNombre();
		String sueldo = String.valueOf(e.getSueldo());
		String contrato = String.valueOf(e.getContrato().format(formatoFecha));
		String departamento = e.getDepartamento();
		
		//si es jefe
		boolean esJefe = e instanceof Jefe;
		String incentivo = "0.0";
		if (esJefe) {
			Jefe jJefe = (Jefe) e;
			incentivo = String.valueOf(jJefe.getIncentivo());
		}//if
		
		//JLabel de la navegacion
		int actual = indiceActual + 1;
		int total = listaCompleta.size();
		
		//llamamos al método de miVista para mostrar los empleados
		miVista.mostrarEmpleado(nombre, sueldo, contrato, departamento, incentivo, actual, total );
		*/

			/*if (listaFiltrada.isEmpty()) {
			( miVista).mostrarSinEmpleados();
			return;
			}*/
			Empleado e = listaFiltrada.get(indiceActual);

			boolean esJefe = e instanceof Jefe;
			String incentivo = esJefe
			? String.valueOf(((Jefe) e).getIncentivo())
			: "";

			miVista.mostrarEmpleado(
			e.getNombre(),
			String.valueOf(e.getSueldo()),
			e.getContrato().format(formatoFecha),
			e.getDepartamento(),
			esJefe,
			incentivo,
			indiceActual,
			listaFiltrada.size()
			);
			actualizarBotones();
	}//Refrescar vista
		
	private void actualizarBotones() {
		// TODO Auto-generated method stub
		
	}

	/*Limpiar filtros*/
	
	private void limpiarFiltros() {
		
	}
	/*Aplicar filtro*/
	
	private void aplicarFiltros() {
		listaFiltrada.clear();
		
		for(Empleado e : listaCompleta) {
			if(!filtraPorDepartamento(e))continue;
			if(!filtraPorTipo(e))continue;
			
			listaFiltrada.add(e);
			
		}
	}
	/*Filtra por departamento*/
	private boolean filtraPorDepartamento(Empleado e) {return true;}
	
	/*filtraPorTipo*/
	private boolean filtraPorTipo(Empleado e) {
		boolean esJefe = e instanceof Jefe;
		
		return(esJefe && miVista.getChkJefes().isSelected())
				|| (!esJefe && miVista.getChkEmpleados().isSelected());
	}
	
	// ===== ACTIONLISTENER =====
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == miVista.getBtnPrimero()) {
			indiceActual = 0;
		} else if (e.getSource() == miVista.getBtnAnterior()) {
			if (indiceActual > 0) {
				indiceActual--;
			}//if
		} else if (e.getSource() == miVista.getBtnSiguiente()) {
			indiceActual++;
		} else if (e.getSource() == miVista.getBtnUltimo()) {
			indiceActual = listaCompleta.size() - 1;
		}//else...if
		refrescarVista();
	}//actionListener
	
}//class
