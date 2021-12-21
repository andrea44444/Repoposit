package Clases;

// Define una clase Profesor considerando los siguientes atributos de clase: nombre (String), apellidos (String), edad (int),  especialista 
// (boolean). Define un constructor que reciba los parámetros necesarios para la inicialización y otro constructor que no reciba parámetros. 
// El nombre de los parámetros debe ser el mismo que el de los atributos y usar this para asignar los parámetros recibidos a los campos del objeto. 
// Crea los métodos para poder establecer y obtener los valores de los atributos, con sobrecarga de nombres y uso de this en los métodos setters 
// (los que sirven para establecer el valor de los atributos). Compila el código para comprobar que no presenta errores, crea un objeto usando el 
// constructor con sobrecarga. Comprueba que se inicializa correctamente consultando el valor de sus atributos después de haber creado el objeto. 
// Usa los métodos setters y comprueba que funcionen correctamente.

public class Profesor {
	private String nombre;
	private String apellidos;
	private int edad;
	private boolean especialista;

	// Constructor
	public Profesor(String nombre, String apellidos, int edad, boolean especialista) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.especialista = especialista;
	}

	public Profesor() {
		nombre = "Andrea";
		apellidos = "Cabrera";
		edad = 18;
		especialista = false;
	}
	
	public Profesor(String nombre, String apellidos, int edad) {
		this.nombre=nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		especialista=false;
	}
	
	// Con este constructor todos los profesores de apellidarán Rubio y serán especialistas
	public Profesor(String nombre, int edad) {
		this.nombre=nombre;
		apellidos = "Rubio";
		this.edad = edad;
		especialista=true;
	}
	
	// Método
	public String Info () {
		String aux= "NO";
		
		return "nombre del profesor: "+ nombre + ", apellido: "+ apellidos + ", edad: "+ edad+ ", especialista: "+ aux;
	}
	
	public void setEspecialista(boolean especialista){
		this.especialista= especialista; 
	}
}
