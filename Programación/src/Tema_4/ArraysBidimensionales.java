package Tema_4;

public class ArraysBidimensionales {

	public static void main(String[] args) {
		int tabla [] []= new int [3] [2];
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				tabla [i] [j]= (int) Math.random()*100;
			}
		}
		System.out.println(tabla [1] [1]);
	}

}
