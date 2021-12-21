package Clases;

public class staticc {
	private int x;
	static private int y;
	
	//Constructor
	public staticc(int x) {
		this.x = x;
		y++; //y está inicializado en 0
	}

	//Setter y getter
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public static int getY() {
		return y;
	}
	
	public int suma() { //no puedes poner static entre public e int por que x no es estático
		return x+y;
	}

	@Override
	public String toString() {
		return "staticc [x=" + x + "]";
	}
	
	
	
}
