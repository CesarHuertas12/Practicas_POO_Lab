package practica6;
import java.util.ArrayList;
import java.util.Scanner;

public class Zoo {
	
	ArrayList<Animal> arregloAnimales = new ArrayList<Animal>();
	
	public void agregarAnimal(Animal animal) {
		arregloAnimales.add(animal);
	}
	
	public void eliminarAnimal() {
		boolean verificar = false;
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese el nombre del Animal: ");
		String nombre = sc.nextLine();
		
		for(int i = 0; i < arregloAnimales.size(); i++) {
			if(arregloAnimales.get(i).getNombre().equals(nombre)) {
				arregloAnimales.remove(i);
				verificar = true;
				break;
			}
		}
		if(!verificar) {
			System.out.println("No se ha encontrado un animal con ese nombre");
		}
	}
	
	public void mostrarAnimales() {
		for(int i=0; i < arregloAnimales.size(); i++) {
			System.out.println(arregloAnimales.get(i).toString());
		}
	}
}
