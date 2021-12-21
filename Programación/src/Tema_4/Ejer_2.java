package Tema_4;

public class Ejer_2 {

	public static void main(String[] args) {
		/*
		 * Realiza un programa que cargue una tabla de 5 filas y 7 columnas con los siguientes
		 * números, para finalmente mostrarla (NOTA: Se debe rellenar con los valores del 1 al 35
		 * controlados mediante un contador, no se debe inicializar la matriz al declararla).
		 */
		int fil= 5, column = 7, num = fil*column;
		int tabla[][] = new int[fil][column];
		for (int columna = 0; columna < column; columna++) {
			for (int filas = 0; filas < fil; filas++) {
				tabla [filas][columna]=num;
				num-- ;
				System.out.print(tabla[columna][filas] + "\t ");
				
			}
		}
	}

}
