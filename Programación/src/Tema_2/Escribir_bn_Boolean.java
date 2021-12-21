package Tema_2;

import java.util.Scanner;

public class Escribir_bn_Boolean {

	public static void main(String[] args) {
		/*
		 * Scanner teclado= new Scanner(System.in);
		 * System.out.println("Teclea un número entero"); int r1= teclado.nextInt(); int
		 * sumado= r1++; System.out.println("Tu número sumado uno es "+ r1);
		 */

		Scanner teclado2 = new Scanner(System.in);
		System.out.println("Teclea un boolean");
		boolean r2 = teclado2.nextBoolean();
		teclado2.close();
		if (r2) {
			System.out.println("Has escrito un boolean correctamente");
		} else {
			System.out.println("Has escrito un boolean incorectamente");
		}

	}

}
