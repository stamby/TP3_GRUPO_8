package ejercicio1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validador {
	private static Pattern pattern;
	
	Validador() {
		pattern = Pattern.compile("^[0-9]$");
	}

	public static void verificarDniInvalido(String dni) throws DniInvalido {
		Matcher matcher = pattern.matcher(dni);
		
		if (matcher.find()) {
			throw new DniInvalido();
		}
	}
}
