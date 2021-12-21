package Arrays;
import java.util.Scanner;

public class Ejer8 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int numeros []= new int[10];
		for (int i = 0; i < numeros.length; i++) {
			numeros [i]= teclado.nextInt();
			
		}
		teclado.close();
	}

}
