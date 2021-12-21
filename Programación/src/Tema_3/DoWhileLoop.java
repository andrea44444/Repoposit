package Tema_3;
import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		int contadorIntentos = 0;
		int J2;
		int NumM = (int) (Math.random() * 100 + 1);
		System.out.println("Escribe un número del 1 al 100 a ver si aciertas");

		do {
			Scanner teclado = new Scanner(System.in);
			J2 = teclado.nextInt();
			contadorIntentos++;

			if (J2 == NumM) {
				System.out.println("Has acertado en el intento " + contadorIntentos + " con el número " + NumM);
				teclado.close();
			} else if (J2 < NumM) {
				System.out.println("No llegaste");
			} else {
				System.out.println("Te pasaste");
			}
		} while (contadorIntentos < 11 && J2 != NumM);
		System.out.println("FIN DEL PROGRAMA");
	}
}
