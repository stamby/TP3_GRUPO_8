package ejercicio1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Archivo {
	private String ruta;
	
	public boolean existe()
	{
		File archivo = new File(ruta); 
		if(archivo.exists())
		      return true;
		return false;
	}
	
	public boolean creaArchivo()
	{
		FileWriter escritura;
		try {
			escritura = new FileWriter(ruta, true);
			escritura.write("");
			escritura.close();
			return true;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
			
	}
	
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
	
	public void escribe_lineas(String frase) {
		try 
		{	
			FileWriter entrada = new FileWriter(ruta, true);
			BufferedWriter miBuffer = new BufferedWriter(entrada);
			miBuffer.write(frase);
			miBuffer.close();
			entrada.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
