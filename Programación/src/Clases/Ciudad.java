package Clases;

public class Ciudad {
	private String nombre;
	private double[] temperaturaMaxima = new double [12];
	private double[] temperaturaMinima = new double [12];
	
	public Ciudad (String nombre){
		this.nombre=nombre;
	}
	
	public Ciudad(String nombre,double max1,double min1) {
		this.nombre=nombre;
		for (int i = 0; i < temperaturaMaxima.length; i++) {
			temperaturaMaxima[i]=Math.random()*(max1);
			temperaturaMinima[i]=Math.random()*(min1);
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public void registrarTemperatura(int mes, double temperatura) {	//Registrará la temperatura pasada por parámetro como máx o mín al mes correspondiente si lo es.
		if (temperaturaMaxima[mes] < temperatura) {
			temperaturaMaxima[mes] = temperatura;
		}
		if (temperaturaMinima[mes] > temperatura) {
			temperaturaMinima[mes] = temperatura;
		}
	}
	
	public double minimaGeneral() {	//Devuelve la temperatura mínima histórica de la ciudad
		double mediaMin = 0;
		for (int i = 0; i < temperaturaMinima.length; i++) {
			mediaMin+=temperaturaMinima[i];
		}
		mediaMin= mediaMin/ temperaturaMinima.length;
		return mediaMin;
	}
	
	public double maximaGeneral() {	//Devuelve la temperatura máxima histórica de la ciudad
		double mediaMax = 0;
		for (int i = 0; i < temperaturaMaxima.length; i++) {
			if (temperaturaMaxima [i] > mediaMax) {
				
			}
		}
		mediaMax= mediaMax / temperaturaMaxima.length;
		return mediaMax;
	}
	
	public double[ ] getMaximas() {	//Devuelve un array con las temperaturas máximas.
		for (int i = 0; i < temperaturaMaxima.length; i++) {
			System.out.println(i + "º mes: " + temperaturaMaxima[i]);
		}
	return 
	}
	
}
