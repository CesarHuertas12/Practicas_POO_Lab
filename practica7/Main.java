package practica7;

import java.util.Scanner;

public class Main {
	
	static boolean[] activities = {false,false,false};
	static boolean[] steps = {true,false,false};

	public static void main(String[] args) {
		int opt = 0;
		Scanner sc = new Scanner(System.in);
		RobotChef robotChef = new RobotChef(95,"Chef",123456);
		RobotKnife robotKnife = new RobotKnife(95,"Knife",12346789);
		RobotWarmHand robotWarmHand = new RobotWarmHand(95,"Hands",123);
		
		int finishPlate = 0;
		
		while(opt != 4) 
		{
			System.out.println();
			Menu.printMenu();
			System.out.print("Que robot utilizara: ");
			opt = sc.nextInt();
			
			
			switch(opt) {
			case 1:
				System.out.println();
				Menu.printActionsMenu();
				System.out.print("Que accion realizara: ");
				opt = sc.nextInt();
				if(checkActionRealized(opt) == false) 
				{
					if(checkStep(opt) == true) {
						if(robotChef.realizeAction(opt)) {finishPlate++;}
						activities[opt-1] = true;
						if(opt < 3) {steps[opt] = true;}
					}else {
						System.out.println("Realizar los demas pasos antes");
					}
				}
				else {System.out.println("\nEsta Accion ya fue realizada");}
				break;
			
			case 2:
				System.out.println();
				Menu.printActionsMenu();
				System.out.print("Que accion realizara: ");
				opt = sc.nextInt();
				if(checkActionRealized(opt) == false)
				{
					if(robotKnife.realizeAction(opt)) {
						if(checkStep(opt) == true) {
							if(robotChef.realizeAction(opt)) {finishPlate++;}
							activities[opt-1] = true;
							if(opt < 3) {steps[opt] = true;}
						}else {
							System.out.println("Realizar los demas pasos antes");
						}
					}
					else {System.out.println("\nEl Robot Cuchillos no puede realizar esta accion :(");}
				}
				else {System.out.println("Esta accion ya fue realizada");}
				break;
			case 3:
				System.out.println();
				Menu.printActionsMenu();
				System.out.print("Que accion realizara: ");
				opt = sc.nextInt();
				if(checkActionRealized(opt) == false)
				{
					if(robotWarmHand.realizeAction(opt)) {
						if(checkStep(opt) == true) {
							if(robotChef.realizeAction(opt)) {finishPlate++;}
							activities[opt-1] = true;
							if(opt < 3) {steps[opt] = true;}
						}else {
							System.out.println("Realizar los demas pasos antes");
						}
					}
					else {System.out.println("\nEl Robot Manos Calientes no puede realizar esta accion :(");}
				}
				else {System.out.println("Esta accion ya fue realizada");}
				break;
			case 4: break;
			default: System.out.println("Favor de ingresar una opcion correcta"); break;
			}
			
			if(finishPlate == 3) {
				System.out.println("¡Hurra!, El plato estaba delicioso");
				finishPlate = 0;
				activities[0] = false;
				activities[1] = false;
				steps[1] = false;
				steps[2] = false;
			}
		}
	}
	
	private static boolean checkActionRealized(int opt) 
	{
		if(opt == 1) {return activities[opt-1];}
		if(opt == 2) {return activities[opt-1];}
		if(opt == 3) {return activities[opt-1];}
		
		return true;
	}
	
	private static boolean checkStep(int opt) {
		if(opt == 1) {return steps[opt-1];}
		if(opt == 2) {return steps[opt-1];}
		if(opt == 3) {return steps[opt-1];}
		
		return false;
	}
}
