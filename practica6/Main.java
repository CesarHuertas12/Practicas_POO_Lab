package practica6;

public class Main {

	public static void main(String[] args) {
		Zoo zoologico = new Zoo();
		Veterinario veterinario = new Veterinario("Cesar",1600);
		Oso oso = new Oso(5,"Oso Polar","Blanco",false);
		Pez pez = new Pez(2,"Marlin","Rosa",4,false);
		
		zoologico.agregarAnimal(oso);
		zoologico.agregarAnimal(pez);
		
		zoologico.mostrarAnimales();
		
		oso.caminar();
		oso.pescar();
		veterinario.vacunar(oso);
		
		System.out.println("\n");
		
		pez.comer();
		pez.nadar();
		veterinario.vacunar(pez);
		
		zoologico.mostrarAnimales();
		
		zoologico.eliminarAnimal();
		zoologico.mostrarAnimales();

	}

}
