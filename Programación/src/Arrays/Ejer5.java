package Arrays;
import java.util.Scanner;

public class Ejer5 {
	public static void mostrarArray(int miArray[]) {
		for (int i = 0; i < miArray.length; i++) {
			System.out.println(miArray[i]+ " ");
		}
	}
	public static int devuelveMenor (int[] miAarray) {
		int menor = miArray [0];
		for (int i = 1; i < miAarray.length; i++) {
			if (miArray[i]<)
		}
	}
	public static void main(String[] args) {
		//Dado un array de 10 casillas relleno con n�meros aleatorios comprendidos entre 1 y 10 (ambos incluidos). 
		//Muestra su contenido en una l�nea de pantalla. 
		//Intercambia el valor de la primera casilla con el valor de la �ltima casilla
		//Muestra el contenido actual del array en una l�nea de pantalla.
		Scanner teclado = new Scanner (System.in);
		int tam=10;
		int datos []= new int [tam];
		for (int i = 0; i < datos.length; i++) {
			datos [i] = (int) (Math.random()*10 +1);
		}
		System.out.println("antes");
		mostrarArray (datos);
		System.out.println();
		aux=datos[0];
		datos[0]= datos [tam-1];
		datos [tam-1]=aux;
		System.out.println("despu�s");
		mostrarArray (datos);
		System.out.println();
		System.out.println("el valor menor del array es "+ );
		System.out.println("fin");
	}

}
