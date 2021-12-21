package Cuenta;

public class Cuenta {

	private String titular;
	private int cantidad;

	// Constructores
	public Cuenta(String usuario, int cantidad) {
		this.titular = usuario;
		this.cantidad = cantidad;
	}

	public Cuenta(String titular) {
		this.titular = titular;
	}

	// Getters setters
	public String getTitular() {
		return titular;
	}

	public void setUsuario(String titular) {
		this.titular = titular;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	// Métodos
	
	public String ingresar (double dinero) {
		if(dinero>0) {
			cantidad+=dinero;
			return "operación realizada con éxito, su saldo actual es: "+cantidad;
		}
		return "operación fallida";
	}
	
	public String retirar (double dinero) {
		if((cantidad-dinero)>=0) {
			cantidad-=dinero;
			return "operación realizada con éxito, su saldo actual es: "+cantidad;
		}else {
		System.out.println("operación fallida, no hay saldo suficiente, solo puedes retirar: "+ cantidad);
		cantidad=0;
		return "operación con cuenta a cero";
		}
	}
	
	public String toString() {
		return "titular: "+ titular+ " saldo actual: "+cantidad;
	}

}
