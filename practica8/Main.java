package practica8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Tournament tournament = new Tournament();
		BasketballTeam team = new BasketballTeam();
		BasketballPlayer player = new BasketballPlayer();
		
		String aux;
		
		boolean auxTourn = false;
		boolean auxTeam = false;
		
		boolean loop = true;
		Scanner sc = new Scanner(System.in);
		int opt;
		
		while(loop) {
			Menu.printMenu();
			System.out.print("Ingrese la opcion a realizar: ");
			opt = sc.nextInt();
			
			switch(opt) {
			case 1:
				Menu.printSubMenuTournament();
				System.out.print("Ingrese la opcion a realizar: ");
				opt = sc.nextInt();
				if(opt == 1) {
					tournament.addTournament(tournament);
					auxTourn = true;
				}
				else if(opt == 2 && auxTourn) {
					System.out.print("Nombre del torneo al que se unira: ");
					aux = sc.next();
					tournament.addTeam(team,aux);
					auxTeam = true;
				}
				
				else if(opt == 3 && auxTourn) {
					tournament.printTournamentList();
				}
				else if(opt == 4 && auxTourn) {
					tournament.printAllTeamsTournaments();
				}else {System.out.println("Crear un Torneo Primero.");}
				break;

			}
		}
	}
}
