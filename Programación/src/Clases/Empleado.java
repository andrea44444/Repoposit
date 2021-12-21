package Clases;

public class Empleado {
	private String nombre;
	private int telefono;
	private static int numEmpleados;
	
	public Empleado(String nombre, int telefono) {
		this.nombre=nombre;
		this.telefono=telefono;
		numEmpleados++;
	}
	
	public Empleado(int telefono) {
		super();
		this.nombre = "Pepe";
		this.telefono = telefono;
		numEmpleados++;
	}


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	public static int getNumEmpleados() {
		return numEmpleados;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", telefono=" + telefono + "]";
	}
	
	public boolean sonIguales(Empleado Otro) { //cuando tienen mismo nombre y mismo teléfono
		if(this.nombre.equals(Otro.getNombre())&& this.telefono==Otro.getTelefono()) {
			return true;
		}
	return false; 
	}
	
}
