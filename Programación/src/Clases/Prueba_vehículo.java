package Clases;

import java.util.Scanner;

public class Prueba_vehículo {

	public static void main(String[] args) {
		Vehiculo v1; // no llega a ser un objeto
		Vehiculo moto = new Vehiculo(2,80,200);
		Vehiculo coche = new Vehiculo(4,130,400);
		Vehiculo camion = new Vehiculo (10,120,700);
		
		// llamada a método
		moto.Info();
		coche.Info();
		camion.Info();
		

		if (moto.esigual(camion)) {
			System.out.println("Me quedo con la moto");
		} else {
			System.out.println("Me quedo con el camión");
		}
		
		Vehiculo avion = moto.copia3();
		avion.setNumruedas(4);
		avion.Info();
		
		// coste del viaje en moto
		System.out.println("¿Cuántos km has recorrido?");
		Scanner teclado = new Scanner(System.in);
		int km_recorridos = teclado.nextInt();
		double precioG = 1.22;
		System.out.println(moto.Coste(precioG, km_recorridos) + " euros");
		double costeMoto = moto.Coste(precioG, km_recorridos);
		costeMoto=Math.round(costeMoto);
		System.out.println(costeMoto + " euros");
		teclado.close();
	}
	

}
