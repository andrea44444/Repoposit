package Arrays;
import java.util.Scanner;

public class Ejer4 {

	public static void main(String[] args) {
		//Rellena un array de 100 casillas con n�meros aleatorios comprendidos entre 1 y 100 (ambos incluidos). 
		//Posteriormente pide un valor al usuario comprendido entre 1 y 100 (insiste en la lectura del valor hasta que 
		//el n�mero sea v�lido y est� comprendido entre 1 y 100) y muestra en pantalla si el valor dado aparece en el 
		//array o no, y si aparece indica en qu� posiciones del array aparece.
		int numeros [] = new int [100];
		int entrada;
		Scanner teclado = new Scanner (System.in);
		for (int i = 0; i < numeros.length; i++) {
			numeros[i]= (int) (Math.random()*100+1);
			}
		System.out.println("Dime un n�mero del 1 al 100");
		
		entrada = teclado.nextInt();
		if(entrada<100 || entrada >1) {
			System.out.println("Has introducido un n�mero v�lido");
		}else {
			System.out.println("No es un n�mero v�lido, vuelve a ejecutar el programa");
			break;
			}
		if (entrada==numeros[i]) {
			System.out.println(entrada + " ");
			}
	}

}
