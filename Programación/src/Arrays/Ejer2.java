package Arrays;

public class Ejer2 {

	public static void main(String[] args) {
		//Rellena un array de 100 casillas con números aleatorios comprendidos entre 1 y 100 (ambos incluidos). 
		//Muestra posteriormente los valores almacenados en las casillas impares del array.
		int numeros [] = new int [100];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i]= (int) (Math.random()*100+1);
			}
		for (int i = 1; i < numeros.length; i=i+2) {
			System.out.println(numeros[i]);
		}
		
	}

}
