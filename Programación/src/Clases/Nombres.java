package Clases;

public class Nombres {

	private int numMax; // numero maximo de nombres que puede tener la lista
	private String lista[];
	private int actual;

	public Nombres(int max) {
		numMax = max;
		lista = new String[numMax];
		actual = 0;
	}

	public int getNumMax() {
		return numMax;
	}

	public void setNumMax(int max) {
		numMax = max;
	}

	public String[] getLista() {
		return lista;
	}

	public void setLista(String[] list) {
		lista = list;
	}

	public int getActual() {
		return actual;
	}

	public void setActual(int act) {
		actual = act;
	}

	public int agregarNombre(String nuevoNombre) {
		if (actual == numMax) { // Lista llena
			System.out.println("La lista esta llena");
			return -1;
		} else if (actual < numMax) { // Si se puede añadir pero todavía no es seguro
			for (int i = 0; i < actual; i++) {
				if (lista[i].equals(nuevoNombre)) { // Ya estaba en la lista
					System.out.println(nuevoNombre + " ya estaba en la lista");
					return 0;
				}
			}
			lista[actual] = nuevoNombre; // Añadir
			actual++;
			// lista[actual++]=nuevoNombre;

		}
		return 1;
	}

	public void verLista() {
		System.out.println("Lista");
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);
		}
		System.out.println(" ");
	}

	// Eliminar nombre de la lista (Tecnica del centinela(posicion))
	public boolean eliminar(String nombre) {
		int posicion = -1;
		for (int i = 0; i < actual; i++) {
			if (lista[i].equals(nombre)) {
				posicion = i; // Lo has encontrado
				break;
			}

		}
		if (posicion == -1) {
			return false; // Has intentado eliminar un nombre que no estaba
		}
		for (int i = posicion; i > actual--; i--) {
			lista[i] = lista[i++];
		}
		lista[actual - 1] = "";
		actual--;
		return true;
	}

}
