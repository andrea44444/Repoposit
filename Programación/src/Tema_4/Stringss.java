package Tema_4;

import java.util.Scanner;

public class Stringss {

	public static void main(String[] args) {
		// TODO Esbozo de m�todo generado autom�ticamente
		Scanner teclado= new Scanner (System.in);
		System.out.println("Dime una frase");
		String frase= teclado.nextLine();
		frase=frase.toUpperCase();
		System.out.println(frase);
		String trozo []= frase.split(" ");
		System.out.println();
	}
}
