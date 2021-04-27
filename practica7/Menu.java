package practica7;

public class Menu {
	
	static String[] menu = {"1)Robot Chef",
					"2)Robot Cuchillos",
					"3)Robot Manos Calientes",
					"4)Salir"};
	
	static String[] actionsMenu = {"1)Cortar Ingredientes",
							"2)Cocinar",
							"3)Servir Plato"};
	
	public static void printMenu() {
		for(int i = 0; i < menu.length; i++) {
			System.out.println(menu[i]);
		}
	}
	
	public static void printActionsMenu() {
		for(int i = 0; i < actionsMenu.length; i++) {
			System.out.println(actionsMenu[i]);
		}
	}
	
}
