package Clases;

public class Curso {
	private String nombre;
	private int cr�ditos;
	private boolean llave;
	private Asignatura as;
	
	public Curso () {
		
	}
	
	public Curso (String nombre) {
		this.nombre = nombre;
	}
	
	public Curso (int cr�ditos) {
		this.cr�ditos = cr�ditos;
	}
	
	public Curso (boolean llave) {
		this.llave = llave;
	}
	
	public Curso (Asignatura as) {
		this.as = as;
	}
	
	public Curso(String nombre, int cr�ditos, boolean llave, Asignatura as) { //Asignas el par�metro de la clase a su valor
		super();
		this.nombre = nombre;
		this.cr�ditos = cr�ditos;
		this.llave = llave;
		this.as = as;
	}

	@Override
	public String toString() {
		return "Curso [nombre=" + nombre + ", cr�ditos=" + cr�ditos + ", llave=" + llave + ", as=" + as + "]";
	}
	
	
}
