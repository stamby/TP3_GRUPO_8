package ejercicio1;

import ejercicio1.DniInvalido;
import ejercicio1.Persona;

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
		//orden alfabetico
		return this.getApellido().compareTo(obj.getApellido());
	}

	@Override
	public int hashCode() {
		int result = 0;
		result = result + ((Apellido == null) ? 0 : Apellido.hashCode());
		result = result + ((Dni == null) ? 0 : Dni.hashCode());
		result = result + ((Nombre == null) ? 0 : Nombre.hashCode());
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
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (Apellido == null) {
			if (other.Apellido != null)
				return false;
		} else if (!Apellido.equals(other.Apellido))
			return false;
		if (Dni == null) {
			if (other.Dni != null)
				return false;
		} else if (!Dni.equals(other.Dni))
			return false;
		if (Nombre == null) {
			if (other.Nombre != null)
				return false;
		} else if (!Nombre.equals(other.Nombre))
			return false;
		return true;
	}
	
	
	

}
