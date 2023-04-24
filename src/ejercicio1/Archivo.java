package ejercicio1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeSet;


public class Archivo {
	private String ruta;

	Archivo(String ruta) {
		this.ruta = ruta;
	}
	
	public TreeSet<Persona> devolverTreeSet() {
		FileReader entrada;
		TreeSet<Persona> treeset = new TreeSet<Persona>();
		
		try {
			entrada = new FileReader(ruta);
			BufferedReader buffer = new BufferedReader (entrada);
			
			String linea = "";
			String[] lineaSplit;
			
			while (linea != null) {
				System.out.println(linea);
				linea = buffer.readLine();
				
				lineaSplit = linea.split("-");
				
				if (lineaSplit.length != 3) {
					continue;
				}
				
				try {
					treeset.add(new Persona(lineaSplit[2], lineaSplit[0], lineaSplit[1]));
				}
				catch (DniInvalido d) {
					continue;
				}
			}
			
			buffer.close();
			entrada.close();
		}
		catch (IOException e) {
			System.out.println("No se encontro el archivo");
		}
		
		return treeset;
	}
	
	public void escribirTreeSet(TreeSet<Persona> treeset) {
		FileWriter escritura = null;
		
		try {
			escritura = new FileWriter(ruta, true);
			
			for (Persona p : treeset) {
				escritura.write(p.toString() + System.lineSeparator());
			}
			
			escritura.close();	
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
