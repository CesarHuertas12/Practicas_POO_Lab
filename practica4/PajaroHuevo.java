package practica4;
import java.util.Random;

public class PajaroHuevo extends Pajaro{
	
	public PajaroHuevo(String color, String forma, int damage, float peso) {
		super(color, forma, damage, peso);
	}
	
	public void lanzarHuevo() {
		Random ran = new Random();
		System.out.println("Se ha realizado un dano de " + ran.nextInt(100) + " con el lanzamiento del huevo explosivo\n");
	}
}
