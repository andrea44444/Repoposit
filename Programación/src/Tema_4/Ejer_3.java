package Tema_4;

public class Ejer_3 {

	private static void verArrayBi(int[][] mat) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// Crea una tabla bidimensional de 5 * 5, rellénala con los números del 1 al 25 y muestra
		// su contenido en pantalla. Posteriormente, guarda sobre la misma matriz y sin utilizar
		// una matriz auxiliar, el resultado de su matriz transpuesta. Vuelve a mostrar su
		// contenido en pantalla:
		int x = 1, filas = 5;
		int aux;
		int matriz[][] = new int[filas][filas];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) { // no ponemos matriz [i].length por que es una matriz cuadrada
				aux = matriz[i][j];
				matriz[i][j] = x;
				x++;
			}
		}
		verArrayBi(matriz);
		for (int i = 0; i < matriz.length; i++) {
			for (int j = i+1; j < matriz.length; j++) {
				aux = matriz[i][j];
				matriz[i][j] = matriz[j][i];
				matriz[j][i] = aux;
			}
		}
		System.out.println("-------------después--------------");
		verArrayBi(matriz);
	}
}
