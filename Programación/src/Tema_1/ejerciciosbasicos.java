package Tema_1;

public class ejerciciosbasicos {

	public static void main(String[] args) {
		//1
		double km= Math.random()*100;
		double combustible= Math.random()*100;
		System.out.println(km +" km ha recorrido");
		System.out.println(combustible+ " litros de combustible ha consumido");
		double gastado= combustible/km;
		double gastador= Math.round(gastado*100);
		System.out.println("Por cada kilómetro has consumido "+ gastador/100 + " litros de gasolina");
		System.out.println("---------------------------------------------");
		
		//2
		double alazar3= Math.random()*100;
		int n1=(int) (alazar3);
		System.out.println(n1);
		double alazar4= Math.random()*100;
		int n2=(int) (alazar4);
		System.out.println(n2);
		int solucion= n1+n2;
		System.out.println("El resultado de la suma es " + solucion);
		System.out.println("---------------------------------------------");

          
		//3
		double n= Math.random();
		System.out.println(n + " es el primer número en decimal");
		double nredondeado= Math.round(n*1000);
		System.out.println(nredondeado/1000 + " es el primer número decimal redondeado");
		double nn= Math.random()*100;
		System.out.println(nn);
		int nne= (int) nn;
		System.out.println(nne);
		double solucion2 =nne+n;
		System.out.println(solucion2);
		
	}
	}