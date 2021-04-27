package extra;

public class Triangulo implements Poligono, Dibujo{

	private int base;
	private int height;
	
	public void paint() {
		System.out.println(calculateArea() + " m2");
	}

	public void setSides(int base, int height) {
		this.base = base;
		this.height = height;
	}

	private int calculateArea() {
		return (base * height) / 2;
	}
}
