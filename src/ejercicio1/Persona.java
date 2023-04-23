package ejercicio1;

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
	public int compareTo(Persona obj) {
		// TODO Auto-generated method stub
		return this.getApellido().compareTo(obj.getApellido());
		
	}

	

}
