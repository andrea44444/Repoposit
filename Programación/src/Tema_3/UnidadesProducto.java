package Tema_3;

public class UnidadesProducto {

	public static void main(String[] args) {
		int unid=(int) (Math.random()*10+1);
		double precio = (Math.random()*10+1);
		
		System.out.println(String.format("%.2f", precio));
		System.out.println(unid);
	}

}
