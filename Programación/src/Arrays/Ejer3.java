package Arrays;

public class Ejer3 {

	public static void main(String[] args) {
		//Solicita las 20 notas con decimales de los alumnos de una clase. Calcula y muestra la nota media obtenida por el grupo. 
		//Muestra después cuántos alumnos tienen una nota superior o igual a la media. 
		//Ayuda para redondear Math.rint(numero*cifras)/cifras; 
		double notas []= new double [20];
		double x=0;
		double media;
		int numA = 0;
		for (int i = 0; i < notas.length; i++) {
			notas [i]= Math.random()*10;
			x=x+notas[i];
			if (notas[i]>= x / notas.length) {
				numA= numA +1;
			}
		}
		media = x / notas.length;
		System.out.println(media);
		media =  Math.rint(media*5)/5;
		System.out.println("La media de la clase es " + media+ " y la han superado " + numA + " alumnos");
	}

}
