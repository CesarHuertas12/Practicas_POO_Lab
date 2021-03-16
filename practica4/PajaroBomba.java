package practica4;
import java.util.Random;

public class PajaroBomba extends Pajaro{

	public PajaroBomba(String color, String forma, int damage, float peso) {
		super(color, forma, damage, peso);
	}
	
	public void explosion() {
		Random ran = new Random();
		System.out.println("La explosion ha causado un dano de: " + ran.nextInt(100) + "\n");
	}

}
