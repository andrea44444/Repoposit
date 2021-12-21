package Clases;

public class Numeros {	//Recursividad
	
	public static int calculaPotencia (int base, int exp) {
		int sol;
		if (exp==0) {
			return 1;
		}
		sol=base*calculaPotencia (base, exp-1);
		return sol;
	}
	
	public static String inversoR (String pal) {
		String sol= "";
		String aux;
		if (pal.length()==0 || pal.length()==1) {
			sol=pal;
		} else {
			aux= pal
		}
		return sol;
	}
}
