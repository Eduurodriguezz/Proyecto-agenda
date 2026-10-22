package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import modelo.Empleado;

public class VistaGeneral extends JFrame{

	private JLabel lblPosicion;
	private JPanel datos, navegacion ,pFiltros;
	private JCheckBox chkContabilidad,chkInformatica,chkRRHH,chkVentas,chkJefes,chkEmpleados;
	//panel de navegacion
	private JButton btnPrimero, btnAnterior, btnSiguiente, btnUltimo;
	
	//panel de datos
	private JTextField txtNombre, txtSueldo, txtFechaContrato, txtDepartamento, txtIncentivo;
	
	public VistaGeneral() throws HeadlessException {
		setSize(300, 200);
		setTitle("Paula - Ventana General - Empresa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		iniciarComponentes();
	}//constructor
	
	public void mostrarEmpleado(String nombre, String sueldo, String fecha, String departamento, boolean esJefe, String incentivo, int posicion, int total) {
		txtNombre.setText(nombre);
		txtSueldo.setText(sueldo);
		txtFechaContrato.setText(fecha);
		txtDepartamento.setText(departamento);
		txtIncentivo.setText(incentivo);
		lblPosicion.setText(String.valueOf(posicion) + "/" + String.valueOf(total));
	}//mostrarEmpleado
	
	private void crearPanelNavegacion() {
		navegacion = new JPanel();
		navegacion.setLayout(new FlowLayout());
		navegacion.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLUE), "Navegación"));
		
		navegacion.add(btnPrimero);
		navegacion.add(btnAnterior);
		navegacion.add(lblPosicion);
		navegacion.add(btnSiguiente);
		navegacion.add(btnUltimo);
	}//crearPanelNavegacion
	
	private JTextField crearCampo(JPanel datos, String campo) {
		JLabel lbl = new JLabel(campo);
		
		JTextField txtField = new JTextField(15);
		
		datos.add(lbl);
		datos.add(txtField);
		
		return txtField;
	}//crearCampo
	
	private void crearPanelDatos() {
		//creación del panel
		datos = new JPanel();
		datos.setLayout(new GridLayout(6,2)); //dos columnas, seis filas
		datos.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLUE),"Datos")); //linea de borde con titulo
				
		//creacion de los campos
		txtNombre = crearCampo(datos, "Nombre: ");
		txtSueldo = crearCampo(datos, "Sueldo: ");
		txtFechaContrato = crearCampo(datos, "Fecha contrato: ");
		txtDepartamento = crearCampo(datos, "Departamento: ");
		
		//radio button
		
		txtIncentivo = crearCampo(datos, "Incentivo: ");
		
	}//crearPanelDatos
	/*Panel filtros*/
	private void crearPanelFiltros() {
		pFiltros = new JPanel();
		pFiltros.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLUE),"Filtros")); 
		chkContabilidad= new JCheckBox ("Contabilidad");
		chkInformatica= new JCheckBox ("Informatica");
		chkRRHH= new JCheckBox ("RRHH");
		chkVentas= new JCheckBox("Ventas");
		chkJefes= new JCheckBox("Jefes");
		chkEmpleados= new JCheckBox("Empleados");
		
		pFiltros.add(chkContabilidad);
		pFiltros.add(chkEmpleados);
		pFiltros.add(chkInformatica);
		pFiltros.add(chkJefes);
		pFiltros.add(chkRRHH);
		pFiltros.add(chkVentas);
	}//panelfiltros
	
	
	public void iniciarComponentes() {
		// ===== ETIQUETAS =====
		lblPosicion = new JLabel();
		
		// ===== BOTONES =====
		btnPrimero = new JButton("◀◀");
		btnSiguiente = new JButton("▶");
		btnAnterior = new JButton("◀");
		btnUltimo = new JButton("▶▶");
		
		// ===== JPANEL =====
		// --- datos
		crearPanelDatos();
		
		// --- navegación
		crearPanelNavegacion();
		
		// ===== JFRAME =====
		add(datos, BorderLayout.CENTER);
		add(navegacion, BorderLayout.SOUTH);
	}//iniciarComponentes

	// =============== GETTERS Y SETTERS DE LOS BOTONES ============
	public JButton getBtnPrimero() {
		return btnPrimero;
	}

	public void setBtnPrimero(JButton btnPrimero) {
		this.btnPrimero = btnPrimero;
	}

	public JButton getBtnAnterior() {
		return btnAnterior;
	}

	public void setBtnAnterior(JButton btnAnterior) {
		this.btnAnterior = btnAnterior;
	}

	public JButton getBtnSiguiente() {
		return btnSiguiente;
	}

	public void setBtnSiguiente(JButton btnSiguiente) {
		this.btnSiguiente = btnSiguiente;
	}

	public JButton getBtnUltimo() {
		return btnUltimo;
	}

	public void setBtnUltimo(JButton btnUltimo) {
		this.btnUltimo = btnUltimo;
	}
	
	public JCheckBox getChkContabilidad() {
		return chkContabilidad;
	}

	public void setChkContabilidad(JCheckBox chkContabilidad) {
		this.chkContabilidad = chkContabilidad;
	}

	public JCheckBox getChkInformatica() {
		return chkInformatica;
	}

	public void setChkInformatica(JCheckBox chkInformatica) {
		this.chkInformatica = chkInformatica;
	}

	public JCheckBox getChkRRHH() {
		return chkRRHH;
	}

	public void setChkRRHH(JCheckBox chkRRHH) {
		this.chkRRHH = chkRRHH;
	}

	public JCheckBox getChkVentas() {
		return chkVentas;
	}

	public void setChkVentas(JCheckBox chkVentas) {
		this.chkVentas = chkVentas;
	}

	public JCheckBox getChkJefes() {
		return chkJefes;
	}

	public void setChkJefes(JCheckBox chkJefes) {
		this.chkJefes = chkJefes;
	}

	public JCheckBox getChkEmpleados() {
		return chkEmpleados;
	}

	public void setChkEmpleados(JCheckBox chkEmpleados) {
		this.chkEmpleados = chkEmpleados;
	}

	//conectar botones con el controlador
	public void conectarControlador(ActionListener listener) {
		btnPrimero.addActionListener(listener);
		btnSiguiente.addActionListener(listener);
		btnAnterior.addActionListener(listener);
		btnUltimo.addActionListener(listener);
	}//conectarControlador
	
}//class
