package ejercicio1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Archivo {
	private String ruta;
	
	public List<Persona>  lee_Archivo() {
		FileReader entrada;
		List<Persona> miArrayList = new ArrayList<>();
		
	
		
		try {
			entrada = new FileReader(ruta);
			BufferedReader miBuffer = new BufferedReader(entrada);
			
		    String linea = "";
			while (linea != null) {
				
				linea = miBuffer.readLine();
				String []cadena = linea.split("-");
				Persona Persona = new Persona(cadena[2], cadena[0], cadena[1]); 
				
				
				miArrayList.add(Persona);
				
				/*
				if(!miArrayList.contains(linea)) {
					miArrayList.add(linea);	 
				}
				System.out.println(linea);
				linea = miBuffer.readLine();*/
			}
			miBuffer.close();
			entrada.close();

		} catch (IOException e) {
			System.out.println("No se encontro el archivo");
			return miArrayList;
		}
		//Collections.sort(miArrayList);
		return miArrayList;
	}
}
