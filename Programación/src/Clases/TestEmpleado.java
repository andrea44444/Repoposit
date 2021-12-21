package Clases;

public class TestEmpleado {

	public static void main(String[] args) {
		Empleado e1= new Empleado(7007);
		System.out.println(e1);
		Empleado e2 = new Empleado ("Marta", 4353);
		System.out.println("El teléfono de "+ e2.getNombre()+ " es "+ e2.getTelefono());
		System.out.println(e2);
		System.out.println("En la empresa hay "+ Empleado.getNumEmpleados() + " empleados");
		if (e2.sonIguales(e1));
	}

}
