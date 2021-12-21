package Tema_2;

import java.util.Scanner;

public class DimeTuNota {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime tu nota");
		int nota = teclado.nextInt();
		teclado.close();
		switch (nota) {
		case 0,1,2,3,4:
			System.out.println("Has suspendido :(");
			break;//si no lo pones va a seguir diciendo has suspendido, has aprobado...
		case 5:
			System.out.println("Has aprobado");
			break;
		case 6,7:
			System.out.println("Tienes un bien");
			break;
		case 8:
			System.out.println("Tienes un notable");
			break;
		case 9,10:
			System.out.println("Tienes un sobresaliente :)");
			break;
		default:
			System.out.println("No has puesto una nota válida :/");
		}
		System.out.println("Fin de programa");
	}

}
