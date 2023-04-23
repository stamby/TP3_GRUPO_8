package ejercicio1;

import javax.swing.JOptionPane;

import ejercicio1.DniInvalido;
import ejercicio1.Persona;
import ejercicio1.Archivo;

public class Principal {
	
	Archivo archivo = new Archivo();
	archivo.setRuta("Personas.txt");
	
	if(archivo.existe())
	{
		System.out.println("Existe archivo");
	}
	else
	{
		System.out.println("No existe archivo entonces lo creo");
		archivo.creaArchivo();
	}

	public static void main(String[] args) {
		String Dni = JOptionPane.showInputDialog("Ingrese el DNI:");
		
		try 
		{
		    Persona.VerificarDniInvalido(Dni);
			System.out.println("DNI es Valido");
		}
		catch (DniInvalido e) 
		{
			e.printStackTrace();
			System.out.println("DNI NO ES VALIDO");
		}
	}

}
