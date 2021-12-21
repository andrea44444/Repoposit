package Clases;

public class TestCurso {

	public static void main(String[] args) {
		
		Curso c1= new Curso ();
		System.out.println(c1);
		
		Curso c2 = new Curso("1wem");
		System.out.println(c2);
		
		Curso c3 = new Curso(new Asignatura("programación", "informática",8));
		System.out.println(c3);
		
		Curso c4 = new Curso(true);
		System.out.println(c4);
	}

}
