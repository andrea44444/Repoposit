package Tema_1;

public class pruebalong {

	public static void main(String[] args) {
			long ci;
			long im; 
			im = 52809999 * 12; 
			ci = im * im * im; 
			System.out.println("Hay " + ci + " metros cúbicos en una milla cúbica");
            //prueba paquete matemáticas que diga un número del 0 al 100
			System.out.println("Pones Math.");
			double entero=Math.random()*100+5;
			int alazar=(int) (entero);
			System.out.println(alazar);
			int positivo=Math.abs(-5);
			System.out.println(positivo);
			int maximo=100;
			int minimo=0;
			int aleatorio = (int) (Math.random()*(maximo-minimo+1)+(minimo)); 
			System.out.println(aleatorio);
			
			//Ejercicio pag 4
			final double tiempo= 7.2;
		    final int velocidad= 340;
		    System.out.println("El rayo está a " + tiempo*velocidad + " metros");
		    //char
		    char a='a';
		    System.out.println(a);
		    //char y los números, código unicode
		    char ch= 'r', cj= 't';
		    System.out.println(ch+cj);
		    System.out.println((int) ch);
		    
	}
	

}
