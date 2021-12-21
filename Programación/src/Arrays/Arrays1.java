package Arrays;
import java.util.Scanner;

public class Arrays1 {

	public static void main(String[] args) {
		//Realiza un programa que lea desde teclado 10 números enteros, para posteriormente mostrarlos en el orden inverso 
		//al que fueron introducidos.
		int numeros [] = new int [10];
		Scanner teclado = new Scanner (System.in);	
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Dime un número entero");
			numeros [i]= teclado.nextInt();
		}
		for (int i = numeros.length -1; i > -1; i--) {
			System.out.print(numeros [i] + " ");
		}
		teclado.close();
	}

}
