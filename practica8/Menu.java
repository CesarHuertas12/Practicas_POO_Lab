package practica8;

public class Menu {
	
	static String menu[] = {"1)Torneo",
							"2)Equipo",
							"3)Jugador",
							"4)Salir"};
	
	static String subMenuTournament[] = {"1)Crear Torneo",
									     "2)Agregar Equipo",
									     "3)Mostrar Lista de Torneos",
									     "4)Mostrar Equipos por Torneo"};
	
	public static void printMenu() {
		System.out.println("\n\t\tMenu");
		for(int i=0; i < menu.length; i++) {
			System.out.println(menu[i]);
		}
	}
	
	public static void printSubMenuTournament() {
		System.out.println("\n\tMenu Torneos");
		for(int i=0; i < subMenuTournament.length; i++) {
			System.out.println(subMenuTournament[i]);
		}
	}
}
