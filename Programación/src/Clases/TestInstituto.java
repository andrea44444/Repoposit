package Clases;

public class TestInstituto {

	public static void main(String[] args) {
		String [] enses= {"grado superior", "grado medio"};
		Instituto i1= new Instituto ("ies paloma","p�blico", enses, "fd", 2000);
		System.out.println(i1.toString());
		Instituto i2= new Instituto ("leonardo", "p�blico", enses, "fbfb",1000);
		System.out.println(i2);	
		Instituto i3=new Instituto ("de la Paz", "p�blico", "fb fb f");
		System.out.println(i3);	
		i3.setNumAlum(727);
		System.out.println(i3);
		System.out.println(i3.toString("ppp"));

	}

}
