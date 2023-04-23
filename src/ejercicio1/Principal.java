package ejercicio1;

import javax.swing.JOptionPane;

import ejercicio1.DniInvalido;
import ejercicio1.Persona;

public class Principal {

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
