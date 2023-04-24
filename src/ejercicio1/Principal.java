package ejercicio1;

import java.util.TreeSet;

import ejercicio1.Archivo;
import ejercicio1.Persona;

public class Principal {
	
	public static void main(String[] args) {
		Archivo archivoEntrada = new Archivo("Personas.txt");
		
		TreeSet<Persona> treeset = archivoEntrada.devolverTreeSet();
		
		Archivo archivoSalida = new Archivo("Resultado.txt");
		archivoSalida.escribirTreeSet(treeset);
	}
}