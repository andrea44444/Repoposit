package Tema_3;

public class NumMenor {

	public static void main(String[] args) {
		double alazar= Math.random()*(-100);
		int num=(int) (alazar);
		int menor;
		menor=num;
		for (int vc = 0; vc < 9; vc++) {
			num = (int) (Math.random()*(-100));
			System.out.println(num);
			if (num < menor) {
				menor=num;
			}
		}
		System.out.println("El menor es "+ menor);

	}

}
