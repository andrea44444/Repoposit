package Tema_4;

public class Array {

	public static void main(String[] args) {
		int mat [][][][]= new int [2][3][4][3];
		mat [1][2][3][2]=-666; //ultimo elemento
		mat [0][0][0][0]= 666; //Primer elemento

		String ciudades []= {"madrid", "berlin", "tokio"};
		for (String ciu :ciudades) {
			System.out.println(ciu);
		}
		
		String ciudadess [][]= {{"España", "madrid"},{"Alemania", "berlin"}};
		for (String []ciuu :ciudadess) {
			System.out.println(ciuu);
		}
	}

}
