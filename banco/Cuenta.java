package banco;

public class Cuenta {
	private String nombre;
	private float saldo;
	private int pin;
	
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public void setPin(int pin) {
		this.pin = pin;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public float getSaldo() {
		return saldo;
	}
	
	public int getPin() {
		return pin;
	}
	
	public boolean esValido() {
		return !nombre.isEmpty();
	}
}
