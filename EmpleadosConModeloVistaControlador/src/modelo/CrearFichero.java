package modelo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Path;
import java.util.ArrayList;

public class CrearFichero {
	private Path ruta;

	public CrearFichero(Path ruta) {
		this.ruta = ruta;
	}//constructor
	
	public void escribirFichero(ArrayList<Empleado> emp) {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ruta.toFile()));){
			oos.writeObject(emp);
			System.out.println("El fichero ha sido creado");
		} catch (IOException e) {
			e.printStackTrace();
		}//try..catch
	}//escribirFichero
	
	public ArrayList leerFichero(Path ruta) {
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
