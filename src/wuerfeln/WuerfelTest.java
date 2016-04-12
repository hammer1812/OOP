package wuerfeln;

import java.util.Scanner;

import Wuerfel.Wuerfel;

public class WuerfelTest {

	public static void main(String[] args){
		boolean exec = true;
		int min = 1;
		while(exec){
			System.out.println("Legen sie die maximale Augenzahl des Würfels fest: ");
			Scanner sc = new Scanner(System.in);
			int max = sc.nextInt();
			System.out.println("Wie oft soll gewuerfelt werden?");
			int anzahlVersuche = sc.nextInt();
			Wuerfel dice = new Wuerfel(min, max);
			Haeufigkeiten stats = new Haeufigkeiten(max, anzahlVersuche);
			//würfeln und in Array eintragen
			for(int i = 0; i < anzahlVersuche; i++){
				stats.addAugenzahl(dice.wuerfeln());
			}
		
		
			//HIER kannst du mal schauen wie es dann aussieht 1 ist quasi die veränderliche Variable
			/*
			System.out.println("Häufigkeit, dass 1 auftritt");
			System.out.println("absolut: " + stats.getAbsHaeufigkeit(1));
			System.out.println("relativ: " + stats.getRelHaeufigkeit(1));
			*/
		
			//Fehler fail = new Fehler(stats); //stats wird übergeben und somit auch die private Variablen in ihr
			//TO-DO in Fehler die Variablen aus stats im Konstruktor in den Variablen aus Fehler speichern (bsp.: "anzahlVersuche = stats.getAnzahlVersuche;")
			//
			
			//Abfrage zur Wiederholung des Programms
			System.out.println("Neue Berechnung durchführen?(y/n)");
			if(sc.next().charAt(0) == 'y')
				exec = true;
			else
				exec = false;
		}
	}
}