package practica6;

public class Animal {
	
	int edad;
	String nombre, color;
	boolean vacunado = false;
	
	public Animal(int edad, String nombre, String color, boolean vacunado) {
		this.nombre = nombre;
		this.edad = edad;
		this.color = color;
		this.vacunado = vacunado;
	}
	
	public void comer() {
		System.out.println("Comiendo");
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isVacunado() {
		return vacunado;
	}

	public void setVacunado(boolean vacunado) {
		this.vacunado = vacunado;
	}
}
