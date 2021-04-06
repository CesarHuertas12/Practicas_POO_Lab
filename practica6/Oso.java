package practica6;

public class Oso extends Animal{
	
	public Oso(int edad, String nombre, String color, boolean vacunado) {
		super(edad,nombre,color,vacunado);
	}
	
	public void pescar() {
		System.out.println("Pescando para alimentarse");
	}
	
	public void invernar() {
		System.out.println("Invernando");
	}
	
	public void caminar() {
		System.out.println("Caminando");
	}
	
	public String toString() {
		return "Oso: [Nombre: " + nombre + ", Edad: " + edad + " anios, Color: " + color + ", Vacunado: " + vacunado +"]";
	}
}
