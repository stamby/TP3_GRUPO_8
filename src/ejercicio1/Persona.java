package ejercicio1;

public class Persona implements Comparable<Persona>  {
	String dni;
	String nombre;
	String apellido;

	public Persona(String dni, String nombre, String apellido) throws DniInvalido {
		this.setDni(dni);
		this.setNombre(nombre);
		this.setApellido(apellido);
	}

	public void setDni(String dni) throws DniInvalido {
		verificarDniInvalido(dni);
		this.dni = dni;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}
	
	public static void verificarDniInvalido(String dni) throws DniInvalido {		
		if (!dni.matches("^[0-9]+$")) {
			throw new DniInvalido();
		}
	}
	
	@Override
	public int compareTo(Persona p) {
	    return (apellido + nombre + dni).compareTo(p.getApellido() + p.getNombre() + p.getDni());
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null)
			return false;
		if (getClass() != o.getClass())
			return false;
		Persona p = (Persona) o;
		return this.toString() == p.toString();
	}

	@Override
    public String toString() {
		return apellido + ", " + nombre + ", " + dni;
	}
}
