package practica7;

public abstract class Robot {
	
	protected int batteryLevel;
	protected String name;
	protected int ID;
	protected String lastAction;
	
	public abstract boolean cutVegetables();
	public abstract boolean cook();
	public abstract boolean serveFood();
}
