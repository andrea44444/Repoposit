package Clases;

import java.util.Arrays;

public class Instituto {
	private String nombre;
	private String tipo;
	private String ense�anza [];
	private String direccion;
	
	

	//Constructor
	public Instituto(String nombre, String tipo, String[] ense, String direccion, int numAlum) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.ense�anza = ense;
		this.direccion = direccion;
		this.numAlum = numAlum;
	}
	//Para hacer otro constructor hay que cambiar el n�mero de los par�metros
	public Instituto(String nombre, String tipo, String direccion) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.ense�anza = new String [3];
		this.direccion = direccion;
		this.numAlum = 700;
	}
	
	//Setters y getters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String[] getEnse() {
		return ense�anza;
	}
	public void setEnse(String[] ense) {
		this.ense�anza = ense;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getNumAlum() {
		return numAlum;
	}
	public void setNumAlum(int numAlum) {
		this.numAlum = numAlum;
	}
	private int numAlum;
	
@Override
	public String toString() {
		return "Instituto [nombre=" + nombre + ", tipo=" + tipo + ", ense=" + Arrays.toString(ense�anza) + ", direccion="
				+ direccion + ", numAlum=" + numAlum + "]";
	}

}

