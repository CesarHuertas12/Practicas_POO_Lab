package practica6;

public class Pez extends Animal {
	
	int numBranqueas;
	
	public Pez(int edad, String nombre, String color, int numBranqueas, boolean vacunado) {
		super(edad,nombre,color,vacunado);
		this.numBranqueas = numBranqueas;
	}
	
	public void velocidadNado(float velocidad) {
		System.out.println(velocidad + " m/s es la velocidad maxima");
	}
	
	public void transformarOxigeno() {
		System.out.println("Transformando");
	}
	
	public void nadar() {
		System.out.println("Nadando");
	}
	
	public String toString() {
		return "Pez: [Nombre: "+nombre+", Edad: "+edad+" anios, Color: "+color+", No.Branqueas: "+numBranqueas+", Vacunado: "+vacunado+"]";
	}
}
