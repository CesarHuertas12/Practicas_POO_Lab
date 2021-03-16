package practica4;
import java.util.Scanner;

public class Pajaro {
	String color;
	String forma;
	int damage; 
	float peso;
	
	public Pajaro(String color, String forma, int damage, float peso) {
		this.color = color;
		this.forma = forma;
		this.damage = damage;
		this.peso = peso;
	}

	public void fuerzaDisparo() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese la fuerza de disparo: ");
		float fuerza = sc.nextFloat();
		System.out.println("El tiro ha sido exitoso con una fuerza de: " + fuerza);
	}
	
	public void imprimirAtributos() {
		System.out.println("\n\tCaracteristicas del Pajaro");
		System.out.println("Color: " + color);
		System.out.println("Forma: " + forma);
		System.out.println("Damage: " + damage);
		System.out.println("Peso: " + peso);
	}
}
