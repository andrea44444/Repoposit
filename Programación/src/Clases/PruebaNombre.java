package Clases;

public class PruebaNombre {

	public static void main(String[] args) {
		Nombres l1 = new Nombres (3);
		
		l1.agregarNombre("Alberto");
		
		int a = l1.agregarNombre("Andrea");
		if (a==1) {
			System.out.println("Agregado");
		}
		
		a = l1.agregarNombre("Eva");
		if (a==1) {
			System.out.println("Agregado");
		}
		
		a = l1.agregarNombre("Andrea");
		if (a==1) {
			System.out.println("Agregado");
		}
		
		a = l1.agregarNombre("Pedro");
		if (a==1) {
			System.out.println("Agregado");
		}
		
		a = l1.agregarNombre("Ana");
		if (a==1) {
			System.out.println("Agregado");
		}
		
		l1.verLista();
		
		l1.eliminar("Andrea");
		
		l1.verLista();
	}

}
