package Clases;

public class TestMiString {

	public static void main(String[] args) {
		String cadena="-564";
		String nuevaCadena= MiString.alReves(cadena);
		System.out.println(cadena);
		System.out.println(nuevaCadena);
		System.out.println(MiString.limpiaCaracteres(cadena, "a"));
		System.out.println(MiString.quitaTilde(cadena));
		System.out.println("Es un número? "+ MiString.esNumero(cadena));
	}

}
