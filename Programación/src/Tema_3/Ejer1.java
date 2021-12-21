package Tema_3;

public class Ejer1 {

	public static void main(String[] args) {
		int suma = 0;
		for (int i = 1; i<10; i++) {
			int n1= (int)(Math.random()*100);
			suma += n1;
			System.out.println(n1);
		}	
		
		double resultado = (double)(suma / 20.0);
		System.out.println("La media es: "+ resultado);

	}

}
