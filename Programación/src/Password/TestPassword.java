package Password;

public class TestPassword {

	public static void main(String[] args) {
		Password p1= new Password(); // Habrá 8 caractéres por que usa el segundo constructor 
		System.out.println(p1);
		
		Password p2= new Password (13);
		System.out.println(p2);
	}

}
