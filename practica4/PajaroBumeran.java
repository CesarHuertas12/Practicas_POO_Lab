package practica4;
import java.util.Random;

public class PajaroBumeran extends Pajaro{
	
	public PajaroBumeran(String color, String forma, int damage, float peso) {
		super(color, forma, damage, peso);
	}
	
	public void regreso() {
		Random ran = new Random();
		System.out.println("Se ha realizado un dano de " + ran.nextInt(100) + " con el regreso\n");
	}
}
