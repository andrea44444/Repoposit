package Tema_3;
import java.util.Scanner;

public class Divisoress {
	
	//Programa que muestra todos los divisores de un n�mero introducido. 
	//Entre los divisores no se incluir� el propio n�mero.

	public static void main(String[] args) {
		
		System.out.println("Dime un n�mero");
		
		Scanner teclado = new Scanner(System.in);
		int n1 = teclado.nextInt();
		teclado.close();
		
		for (int i=n1; i>0; i--) {
			
			{
				System.out.println(i);
			}
					
		}

	}

}
