package practica8;

import java.util.ArrayList;
import java.util.Scanner;

public class Tournament extends Manager{
	
	String name;
	String region;
	int numTeamsParticiping;
	int matchesPlayed;
	int matchesPending;
	ArrayList<BasketballTeam> teams = new ArrayList<BasketballTeam>();
	
	public void setAllAttributesTournament() {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		
		System.out.print("Ingrese el nombre del Torneo: ");
		name = sc.next();
		
		System.out.print("Ingrese el nombre de la Region: ");
		region = sc.next();
		
		System.out.print("Ingrese el numero de equipos participando: ");
		numTeamsParticiping = sc.nextInt();
		
		System.out.print("Ingrese el total de partidos jugados: ");
		matchesPlayed = sc.nextInt();
		
		System.out.print("Ingrese el numero de partidos pendientes: ");
		matchesPending = sc.nextInt();
		
	}
	
	public void addTeam(BasketballTeam team, String name) {
		boolean comprobation = false;
		team = new BasketballTeam();
		for(int i=0; i < tournaments.size(); i++) {
			if(name.equals(tournaments.get(i).name)) {
				team.setAllTeamAttributes();
				tournaments.get(i).teams.add(team);
				comprobation = true;
				break;
			}
		}
		if(!comprobation) {System.out.println("No existe un Torneo con ese nombre");}
	}
	
	public void removeTeam(BasketballTeam team) {
		teams.remove(team);
	}
	
	public void setPlayedMatches(int matchesPlayed) {
		this.matchesPlayed = matchesPlayed;
	}
	
	public void setPendingMatches(int matchesPending) {
		this.matchesPending = matchesPending;
	}
	
	public void printTeamsList() {
		System.out.println("\n\tLista de los Equipos en el Torneo " + teams.get(0).teamName);
		for(int i=0; i < teams.size(); i++) {
			System.out.println(teams.get(i).toString());
		}
	}
	
	public String toString() {
		return "Nombre: " + name + " [Region: " + region +", Numero de Equipos participando: " + numTeamsParticiping + ", Partidos Jugados: " + matchesPlayed + ", Partidos Pendientes: " + matchesPending +"]";	
	}
}
