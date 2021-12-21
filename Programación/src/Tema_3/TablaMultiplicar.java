package Tema_3;
import java.util.Scanner;

public class TablaMultiplicar {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime un número");
		int num = teclado.nextInt();
		teclado.close();
		for (int vc = 0; vc < 10; vc++) {
			System.out.println(num +" x "+vc+" = "+ (num*vc));
		}

	}

}
