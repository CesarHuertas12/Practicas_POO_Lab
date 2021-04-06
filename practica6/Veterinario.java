package practica6;

public class Veterinario {
	String nombre;
	double salario;
	
	public Veterinario(String nombre, double salario) {
		this.nombre = nombre;
        this.salario = salario;
	}
	
	public void vacunar(Animal animal) {
		animal.setVacunado(true);
		System.out.println(animal.getNombre() + " fue vacunado");
	}
	
	
}