package practica7;

public class RobotWarmHand extends Robot{

	public RobotWarmHand(int batteryLevel, String name, int ID) {
		this.batteryLevel = batteryLevel;
		this.name = name;
		this.ID = ID;
	}


	public boolean cutVegetables() {
		return false;
	}

	public boolean cook() {
		return true;
	}

	public boolean serveFood() {
		return false;
	}
	
	public void setLastAction(String lastAction) {
		this.lastAction = lastAction;
	}
	
	public boolean realizeAction(int opt) {
		if(opt == 1) {return cutVegetables();}
		if(opt == 2) {return cook();}
		if(opt == 3) {return serveFood();}
		
		return false;
	}
}
