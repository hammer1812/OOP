package wuerfeln;

import java.util.Scanner;

import Wuerfel.Wuerfel;

public class WuerfelTest {
	/**
	 * Testprogramm mit Nutzerabfrage
	 * @param args
	 */
	public static void main(String[] args){
		boolean exec = true;
		int min = 1;
		Scanner sc = new Scanner(System.in);
		while(exec){
			System.out.println("Legen sie die maximale Augenzahl des Würfels fest: ");
			int max = sc.nextInt();
			System.out.println("Wie oft soll gewuerfelt werden?");
			int anzahlVersuche = sc.nextInt();
			Wuerfel dice = new Wuerfel(min, max);
			Haeufigkeiten stats = new Haeufigkeiten(max, anzahlVersuche);
			//Fehler fehl = new Fehler(stats);
			
			for(int i = 0; i < anzahlVersuche; i++){
				stats.addAugenzahl(dice.wuerfeln());
			}
			
			//fehl.Fehlerberechnung();
			System.out.println(stats.toString());
			//System.out.println(fehl.toString());
			
			System.out.println("Neue Berechnung durchführen?(y/n)");
			if(sc.next().charAt(0) == 'y')
				exec = true;
			else
				exec = false;
			
		}
		sc.close();
	}
}