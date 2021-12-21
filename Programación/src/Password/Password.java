package Password;

public class Password {
	private int longitud;
	private String clave;

	public Password(int longitud) {
		this.longitud = longitud;
		this.clave=	GenerarPassword();
	}

	public Password() {
		this.longitud = 8;
		this.clave=	GenerarPassword();
	}

	public String GenerarPassword() {
		final String numeros = "123456789"; // final significa que es constante
		final String especiales = "!|@#$%&/=()?`+";
		final String letras = "abcdefghijklmnñopqrstuvwxyz";
		String cadena = "";
		int num = 0, esp = 0, letr = 0;
		
		// Extraemos 5 números
		for (int i = 0; i < 5; i++) {
			int random = (int) (Math.random() * numeros.length());
			cadena += numeros.substring(random, random+1);
		}
		
		//Extraemos 2 letras mayus
		for (int i = 0; i < 2; i++) {
			int random = (int) (Math.random() * letras.length());
			cadena += letras.substring(random, random +1).toUpperCase();
		}
		
		//Extraemos 2 letras minus
		int random = (int) (Math.random() * letras.length());
		cadena += letras.substring(random, random + 1);
		
		//Extraemos los carácteres especiales que falten para completar la password
		for (int i = 0; i < longitud-8; i++) {
			int random2 = (int) (Math.random() * especiales.length());
			cadena += especiales.substring(random2, random2+1);
		}
		cadena=cadena.substring(0,longitud);
		return cadena;
	}

	@Override
	public String toString() {
		return "Password [longitud=" + longitud + ", clave=" + clave + "]";
	}
	
	
}
