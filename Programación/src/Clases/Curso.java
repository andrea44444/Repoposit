package Clases;

public class Curso {
	private String nombre;
	private int créditos;
	private boolean llave;
	private Asignatura as;
	
	public Curso () {
		
	}
	
	public Curso (String nombre) {
		this.nombre = nombre;
	}
	
	public Curso (int créditos) {
		this.créditos = créditos;
	}
	
	public Curso (boolean llave) {
		this.llave = llave;
	}
	
	public Curso (Asignatura as) {
		this.as = as;
	}
	
	public Curso(String nombre, int créditos, boolean llave, Asignatura as) { //Asignas el parámetro de la clase a su valor
		super();
		this.nombre = nombre;
		this.créditos = créditos;
		this.llave = llave;
		this.as = as;
	}

	@Override
	public String toString() {
		return "Curso [nombre=" + nombre + ", créditos=" + créditos + ", llave=" + llave + ", as=" + as + "]";
	}
	
	
}
