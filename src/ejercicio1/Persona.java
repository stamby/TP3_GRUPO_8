package ejercicio1;

import ejercicio1.DniInvalido;

public class Persona implements Comparable<Persona> {
	String Dni;
	String Nombre;
	String Apellido;
	//Constructores
	public Persona() {
		this.Apellido = "";
		this.Nombre = "";
		this.Dni = "";
	}
	public Persona(String dni, String nombre, String apellido) {
		Dni = dni;
		Nombre = nombre;
		Apellido = apellido;
	}
	

	public void setDni(String dni) {
		Dni = dni;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public String getDni() {
		return Dni;
	}

	public String getNombre() {
		return Nombre;
	}

	public String getApellido() {
		return Apellido;
	}
	
	
	@Override
	public String toString() {
		return "Persona [Dni=" + Dni + ", Nombre=" + Nombre + ", Apellido=" + Apellido + "]";
	}
	@Override
	public int compareTo(Persona obj) {
		// TODO Auto-generated method stub
		return this.getApellido().compareTo(obj.getApellido());
		
	}
	
	public int hashCode() {
		int result = 1;
		result += ((Apellido == null) ? 0 : Apellido.hashCode());
		result += ((Nombre == null) ? 0 : Nombre.hashCode());
		result += ((Dni == null) ? 0 : Dni.hashCode());
		return result;	
	}
	
	public static void VerificarDniInvalido(String dni) throws DniInvalido 
	{
		 	for (int i = 0; i < dni.length();i++)
		 	{
		 		if(!dni.matches("^[0-9]*$"))
		 		{
		 			DniInvalido MalDni = new DniInvalido();
		 			throw MalDni;
		 		}			
		 	}
	}
	

}
