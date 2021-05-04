package practica8;

import java.util.Scanner;

public class BasketballPlayer {

	String name;
	String position;
	int uniformNumber;
	int score;
	double height;
	
	public void setAllPlayerAttributes() {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		
		System.out.print("Nombre del jugador: ");
		name = sc.next();
		
		System.out.print("Posicion: ");
		position = sc.next();
		
		System.out.print("Numero del jugador: ");
		uniformNumber = sc.nextInt();
		
		System.out.print("Goles Anotados: ");
		score = sc.nextInt();
		
		System.out.print("Estatura: ");
		height = sc.nextDouble();
	}
	
	public String toString() {
		return "Nombre: " + name + " [Posicion: " + position +", Numero Uniforme: " + uniformNumber + ", Score: " + score + ", Estatura: " + height +"m ]";	
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public void setUniformNumber(int uniformNumber) {
		this.uniformNumber = uniformNumber;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
}
