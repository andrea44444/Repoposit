package Clases;

/**
 * Definimos las propiedades de Vehiculo
 * 
 * @since 3-12-21
 * @author Andrea
 */
public class Vehiculo { // si es public se accede tambn desde fuera de la clase
	// propiedades de la clase
	/**
	 * Definimos el número de ruedas
	 */
	private int numRuedas;
	/**
	 * Definimos la velocidad máxima
	 */
	private int velMax;
	/**
	 * Definimos el peso
	 */
	private int peso;

	// Constructor (firma del método)
	/**
	 * Crea el vehiculo
	 * 
	 * @param num numero de ruedas del vehiculo
	 * @param v   velocidad máxima del vehiculo
	 * @param kg  peso del vehiculo
	 */
	public Vehiculo(int num, int v, int kg) {
		numRuedas = num;
		velMax = v;
		peso = kg;
	}

	// setters y getters (nombre en Mayus)
	/**
	 * Obtiene el número de ruedas
	 * 
	 * @return retorna el número de ruedas
	 */
	public int getNumRuedas() {
		return numRuedas;
	}

	/**
	 * Asigna el valor a ruedas
	 * 
	 * @param num número de ruedas
	 */
	public void setNumruedas(int num) { // num es un nombre que puede elegir el programasdor
		numRuedas = num;
	}

	/**
	 * Obtiene la velocidad máxima
	 * 
	 * @return retorna la velocidad máxima
	 */
	public int getVelMax() {
		return velMax;
	}

	/**
	 * Asigna el valor velocidad máxima
	 * 
	 * @param v velocidad máxima del vehiculo
	 */
	public void setVelMax(int v) {
		velMax = v;
	}

	/**
	 * Obtiene el peso del vehiculo
	 * 
	 * @return retorna el peso del vehiculo
	 */
	public int getPeso() {
		return peso;
	}

	/**
	 * Asigna el peso al vehiculo
	 * 
	 * @param kg peso del vehiculo
	 */
	public void setPeso(int kg) {
		peso = kg;
	}

	// Métodos
	public boolean esigual(Vehiculo n2) { // n2 es un obj de la clase Vehiculo
		if (numRuedas == n2.numRuedas && velMax == n2.velMax && peso == n2.peso) {
			return true;
		}
		return false;
	}

	/**
	 * De n2 copiamos al original, los dos quedan con datos de n2
	 * 
	 * @param n2 otro vehiculo
	 */
	public void copia(Vehiculo n2) { // de n2 copiamos al original, los dos quedan con datos de n2
		numRuedas = n2.numRuedas;
		velMax = n2.velMax;
		peso = n2.peso;
	}

	/**
	 * Muestra toda la información del vehiculo
	 */
	public void Info() { // void significa que no devuelve nada
		System.out.println("Tu vehículo tiene " + numRuedas + " ruedas");
		System.out.println("Tiene una velocidad máxima de: " + velMax + " km/h");
		System.out.println("Pesa " + peso + " kg");
		System.out.println(" ");
	}

	/**
	 * 
	 * @param precioG       precio de la gasolina
	 * @param km_recorridos kilómetros que se ha recorrido en el vieje
	 * @return precio que le ha costado el viaje
	 */
	public double Coste(double precioG, int km_recorridos) {
		double solucion = peso * km_recorridos * precioG;
		return solucion;
	}

	/**
	 * 
	 * @return retorna la info del nuevo vehiculo
	 */
	public Vehiculo copia3() {
		return new Vehiculo(numRuedas, velMax, peso);
	}
}
