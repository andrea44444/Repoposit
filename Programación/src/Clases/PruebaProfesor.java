package Clases;

public class PruebaProfesor {

	public static void main(String[] args) {
		Profesor n1 = new Profesor ("Andrea","Olcakova",34,true);
		System.out.println(n1.Info());
		Profesor n2 = new Profesor ();
		System.out.println(n2.Info());


	}

}
