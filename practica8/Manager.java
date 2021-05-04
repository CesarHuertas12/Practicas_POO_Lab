package practica8;

import java.util.ArrayList;

public class Manager {
	
	ArrayList<Tournament> tournaments = new ArrayList<Tournament>();
	
	public void addTournament(Tournament tourn) {
		tourn = new Tournament();
		tourn.setAllAttributesTournament();
		tournaments.add(tourn);
	}
	
	public void removeTournament(Tournament tourn) {
		tournaments.add(tourn);
	}
	
	public void printTournamentList() {
		System.out.println("\n\tLista de los Torneos");
		for(int i=0; i < tournaments.size(); i++) {
			System.out.println(tournaments.get(i).toString());
		}
	}
	
	public void printAllTeamsTournaments() {
		System.out.println();
		for(int i=0; i < tournaments.size(); i++) {
			System.out.println("Nombre del Torneo: " + tournaments.get(i).name);
			for(int j=0; j < tournaments.get(i).teams.size(); j++) {
				System.out.println(tournaments.get(i).teams.get(j).toString());
			}
			System.out.println();
		}
	}
	
	public void printAllPlayersTeam() {
		System.out.println();
		for(int i=0; i < tournaments.size(); i++) {
			for(int j=0; j < tournaments.get(i).teams.size(); j++) {
				for(int k=0; k < tournaments.get(i).teams.get(j).players.size(); k++) {
					System.out.println(tournaments.get(i).teams.get(j).players.toString());
				}
				
			}
			System.out.println();
		}
	}
}
