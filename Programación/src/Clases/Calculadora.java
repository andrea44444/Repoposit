package Clases;

public class Calculadora {
	private int op0; //No es accesible fuera de esta clase
	int op1;	//op de operador
	int op2;

	public Calculadora(int o1, int o2) {
		op1 = o1;
		op2 = o2;
	}

	public int Suma() {
		return op1 + op2;
	}

	public int Resta() {
		return op1 - op2;
	}

	public int Multiplicación() {
		return op1 * op2;
	}
}
