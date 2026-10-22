package modelo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Path;
import java.util.ArrayList;

public class GestorEmpleado {
	private Path ruta;

	public GestorEmpleado(Path ruta) {
		this.ruta = ruta;
	}//constructor

	public ArrayList leerFichero() {
		ArrayList<Empleado> empleados = new ArrayList<>();
		
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ruta.toFile()));){
			empleados = (ArrayList<Empleado>) ois.readObject();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}//try..catch
		
		return empleados;
	}//leerFichero
	
}//class
