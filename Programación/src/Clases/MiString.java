package Clases;

public class MiString {
	public static String alReves(String cadena) {
		String nuevaCadena="";
		
		for (int i = cadena.length()-1; i < -1; i--) {
			nuevaCadena+=cadena.charAt(i);
		}
		return nuevaCadena;
	}
	
	public static String limpiaCaracteres(String cadena, String exp) {
		String[] salida= cadena.split(exp);
		String sol="";
		for (int i = 0; i < salida.length; i++) {	//Para pegar los trozos
			sol+=salida[i];
		}
		return sol;
	}
	
	public static String quitaTilde(String cadena) {
		cadena= cadena.toLowerCase();
		String conTildes="αινσϊ";
		String sinTildes= "aeiou";
		String cadenaLimpiaTildes="";
		int pos;
		for (int i = 0; i < cadena.length(); i++) {
			pos=conTildes.indexOf(cadena.charAt(i));
			if (pos>-1) {
				cadenaLimpiaTildes+=sinTildes.charAt(pos);
			} else {
				cadenaLimpiaTildes+=cadena.charAt(i);
			}
		}
		return cadenaLimpiaTildes;
	}
	
	public static boolean esPalindromo (String cadena) {
		if (cadena.equals(alReves(cadena))) {
			return true;
		}
		return false;
	}
	
	public static boolean esNumero (String cadena) {
		char c;
		for (int i = 0; i < cadena.length(); i++) {	//Recorre la cadena caracter a caracter
			c=cadena.charAt(i);
			if(i==0 && c!=45 && c!=43 && c!=46 &&(c<=47 || c>=58)) {
				return false;
			}else if (i!=0){
				if(c>47 && c<58 || c==45 || c==43 || c==46) {
					return false;
				}
			}
		}
			
		
		return true;
	}
		
}
	
	
	

