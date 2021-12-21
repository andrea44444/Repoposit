package Arrays;
import java.util.Scanner;

public class cuadradoDibujo {
	public static void dibujaRectangulo (int altura, int base) {
		for (int i = 0; i < altura; i++) {
			for (int j = 0; j < base; j++) {
				System.out.print("<3");
			}
			System.out.println();
		}}

	public static void main(String[] args) {
		System.out.println("Dime la altura del rectángulo");
		Scanner teclado = new Scanner (System.in);
		int altura= teclado.nextInt();
		System.out.println("Dime la base del rectángulo");
		int base= teclado.nextInt();
		dibujaRectangulo(altura,base);
		teclado.close();
	}

}
