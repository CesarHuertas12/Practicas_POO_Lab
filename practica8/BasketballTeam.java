package practica8;

import java.util.ArrayList;
import java.util.Scanner;

public class BasketballTeam extends Manager{

	String teamName;
	String division;
	String couchName;
	int participationTournaments;
	int wonTournaments;
	int lostTournaments;
	ArrayList<BasketballPlayer> players = new ArrayList<BasketballPlayer>();
	
	public void setAllTeamAttributes() {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		
		System.out.print("Ingrese el nombre del equipo: ");
		teamName = sc.next();
		
		System.out.print("Ingrese la division: ");
		division = sc.next();
		
		System.out.print("Ingrese el nombre del entrenador: ");
		couchName = sc.next();
		
		System.out.print("Ingrese la cantidad de torneos en los que participo: ");
		participationTournaments = sc.nextInt();
		
		System.out.print("Ingrese la cantidad de torneos ganados: ");
		wonTournaments = sc.nextInt();
		
		System.out.print("Ingrese la cantidad de torneos perdidos: ");
		lostTournaments = sc.nextInt();
	}
	
	public void removePlayer(BasketballPlayer player) {
		players.remove(player);
	}
	
	public void totalTeamScore() {
		int sum = 0;
		for(int i=0; i < players.size(); i++) {
			sum += players.get(i).score;
		}
		System.out.println("Score Total: " + sum);
	}
	
	public void printPlayersList() {
		for(int i=0; i < players.size(); i++) {
			System.out.println(players.get(i).toString());
		}
	}
	
	public String toString() {
		return "Nombre del Equipo: " + teamName + " [Division: " + division + ", Nombre del Entrenador: " + couchName + 
				", Participacion en torneos: " + participationTournaments + ", Partidos Ganados: " + wonTournaments + ", Partidos Perdidos: " +
				lostTournaments + "]";
	}
}
