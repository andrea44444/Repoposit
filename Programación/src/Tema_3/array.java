package Tema_3;
import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		int notas[ ] = new int[5];
		notas [0] = 4;
		notas [1] = 9;
		notas [2] = 3;
		notas [3] = 6;
		System.out.println(notas [3]); //Empieza en 0  pero sigue habiendo 4 huecos

		// int horario[ ] [ ]= new int[6] [7];
		
		int cesta[] = new int [11];
		for (int i = 0; i < cesta.length; i++) {
			cesta[i]=(int) (Math.random()*100);
			System.out.print(cesta[i]+ "\t");
			}
		System.out.println(" ");
		
		boolean tf[] = new boolean [11];
		for (int j = 0; j < tf.length; j++) {
			if (((int)(Math.random()*10))%2!=0){ //Si es impar será true
				tf[j]=true;
			}
			System.out.print(tf[j]+ "\t");
		}
		System.out.println(" ");
		
		
		int tamaño;
		System.out.println("Dime el tamaño que quieres del array");
		Scanner teclado = new Scanner(System.in);
		tamaño= teclado.nextInt();
		int algo[] = new int[tamaño];
		System.out.println(algo [1]);
		
		
		}
	}


