package Tema_2;

import java.util.Scanner;

public class EntradaTeclado {

	public static void main(String[] args) {
		/*
		 * Scanner x= new Scanner(System.in);
		 * System.out.println("Teclea un n�mero entero"); int r1= x.nextInt(); if
		 * (r1%2==0){ System.out.println("El n�mero es par"); }else
		 * {System.out.println("El n�mero es impar"); } x.close();
		 * 
		 * System.out.println("�Como te llamas?"); Scanner s = new Scanner(System.in);
		 * String nombre = s.nextLine(); System.out.println("Hola " + nombre);
		 * s.close();
		 */
		/*
		 * System.out.println("Dime un n�mero entero"); Scanner z = new
		 * Scanner(System.in); int numero = z.nextInt(); z.close(); if ((numero - 1) % 3
		 * == 0 || (numero + 1) % 3 == 0) {
		 * System.out.println("su n�mero mayor o menos es m�ltiplo de 3"); } else {
		 * System.out.println("el n�mero mayor o menor no es m�ltiplo de 3"); }
		 */
		System.out.println("Dime un valor boolean");
		Scanner uno = new Scanner(System.in);
		boolean r1 = uno.nextBoolean();
		System.out.println("Dime otro valor boolean");
		boolean r2 = uno.nextBoolean();
		uno.close();
		if (r1 != r2) {
			System.out.println("siguen la secuencia");
		} else {
			System.out.println("No siguen la secuencia");
		}
	}
}
